package cn.jbolt.index;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.jfinal.render.JsonRender;

import cn.jbolt.common.model.Files;
import cn.jbolt.common.model.Results;
import cn.jbolt.common.model.Resultscount;
import parser.JavaLexer;
import parser.JavaParser;
import parser.MyListener;
import parser.Scorer;

public class DetectController extends Controller
{

	public void index()
	{
	}

	public static String createId()
	{
		return UUID.randomUUID().toString();
	}

	/**
	 * 文件两两查重
	 * 
	 */
	public void twoContrast(Files fileA, Files fileB,double lowScore)
	{
		Scorer scorer = new Scorer();
		String rid = createId();
		double p = 0;
		try
		{
			String fpathA = fileA.getFilePath() + "\\" + fileA.getFileName();
			String fpathB = fileB.getFilePath() + "\\" + fileB.getFileName();
			String s1 = parse(file2String(fpathA));
			String s2 = parse(file2String(fpathB));
			
			//输出语法树序列
			System.out.println(s1);
			System.out.println(s2);
			
			p = scorer.score(s1, s2);

//			if(p > 0) {
//				 转化为百分数
//				NumberFormat nFromat = NumberFormat.getPercentInstance();
//				b = nFromat.format(p);
//			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 结果存进数据库 result
		if(p >= lowScore)
		Results.dao.saveResults(rid, fileA.getFileName(), fileB.getFileName(), p);
		
		
	}

	public void codeDetect()
	{

		Files fileA, fileB;
		String params;
		//	获取前台参数
		String classes = getPara("classes");
		String lesson = getPara("lesson");
		double lowScore = Double.valueOf(getPara("lowScore"));
		
		List<Files> fileslist = Files.dao.getFilesList(classes,lesson);

		if(fileslist.isEmpty()) {
			params = "{\"ifSuccess\":\"error\"}";
			render(new JsonRender(params).forIE());
		}
		  
		//更新results表
		Results.dao.deleteResultsList();
		
		for (int i = 0; i < fileslist.size() - 1; i++)
		{

			for (int j = i + 1; j < fileslist.size(); j++)
			{

				fileA = fileslist.get(i);

				fileB = fileslist.get(j);

				twoContrast(fileA, fileB,lowScore);
			}
		}
	
		
		int allCount = fileslist.size();
		List<Results> lstResults = Results.dao.getResultsList(lowScore);
		if(lstResults.isEmpty()) {
			Resultscount.dao.deleteResultsList();
			Resultscount.dao.saveResults(0, allCount, 0);
		}
		
		int bridgeCount = getBridgeCount(lstResults);
		double percent = getPercent(allCount-bridgeCount,allCount);
		//更新计算结果表
		Resultscount.dao.deleteResultsList();
		Resultscount.dao.saveResults(bridgeCount, allCount, percent);
		
		params = "{\"ifSuccess\":\"success\"}";
		render(new JsonRender(params).forIE());
	
	
	
	}

	// 提取代码 语法树 序列

	private String parse(String code) throws IOException
	{
		final Reader reader = new StringReader(code);

		final ANTLRInputStream input = new ANTLRInputStream(reader);

		final JavaLexer lexer = new JavaLexer(input);

		final CommonTokenStream tokens = new CommonTokenStream(lexer);

		final JavaParser parser = new JavaParser(tokens);

		final ParserRuleContext tree = parser.compilationUnit();

		final ParseTreeWalker walker = new ParseTreeWalker();

		final MyListener listener = new MyListener(parser);

		walker.walk(listener, tree);

		return listener.getSignature();
	}

	
	
	
	// 读取代码文件

	public static String file2String(String filePath)
	{
		String result = "";
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
			String s = null;
			while ((s = br.readLine()) != null)
			{// 使用readLine方法，一次读一行
				result = result + "\n" + s;
			}
			br.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		// System.out.println(result);
		return result;
	}

	
	
	
	
	
	//获取结果表格
	public void getResults(int limit, int offset, String classes, String lesson)
	{
		try
		{
			List<Results> lstResults = Results.dao.getResultsList();

			JSONArray jsonData = new JSONArray();

			JSONObject jo = null;
			
			for (Results r : lstResults)

			{
				jo = new JSONObject();

				jo.put("id", r.getId());
				
				jo.put("fileA", r.getFileA());

				jo.put("fileB", r.getFileB());

				jo.put("score", r.getScore());

				jsonData.add(jo);
				
			}
			int total = lstResults.size();

			JSONObject jsonObject = new JSONObject();

			jsonObject.put("rows", jsonData);

			jsonObject.put("total", total);

			render(new JsonRender(jsonObject).forIE());

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
	//获取结果表格2  
	public void getResults2(int limit, int offset)
	{
		try
		{
			List<Resultscount> lstResults = Resultscount.dao.getResultsList();

			JSONArray jsonData = new JSONArray();

			JSONObject jo = null;
			
			for (Resultscount r : lstResults)

			{
				jo = new JSONObject();

				jo.put("id", r.getId());
				
				jo.put("badPeopleNum", r.getBadPeopleNum());
				
				jo.put("allPeopleNum", r.getAllPeopleNum());

				jo.put("percent", r.getPercent());


				jsonData.add(jo);
				
			}
			int total = lstResults.size();

			JSONObject jsonObject = new JSONObject();

			jsonObject.put("rows", jsonData);

			jsonObject.put("total", total);

			render(new JsonRender(jsonObject).forIE());

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	//根据Results，计算去除重复后的有效份数
	//无向连通图 并查集
	public int getBridgeCount(List<Results> lstResults){
		
		int badcount = 0;
		//记录桥点
		List<String> badPeopleName = new ArrayList<String>();
		
		for(Results results : lstResults){
			String nameA = results.getFileA();
			String nameB = results.getFileB();
			if(badPeopleName.contains(nameA) && badPeopleName.contains(nameB)) 
			{	
				//该桥已存在  直接跳过
				continue;
				
			}else if(badPeopleName.contains(nameA) || badPeopleName.contains(nameB))
			{
				//发现新桥路径    添加一个新的桥点
				if(!badPeopleName.contains(nameA))  badPeopleName.add(nameA);
				if(!badPeopleName.contains(nameB))	badPeopleName.add(nameB);
			}else
			{
				//发现新桥   添加两个新的桥点   桥数+1
				badPeopleName.add(nameA);
				badPeopleName.add(nameB);
				badcount ++;
			}
			//该方法有bug，没有考虑A->B->C的情况
		}
		
		return badcount;
	}
	 
	//无向连通图 缩点/求桥问题
	
	
	public double getPercent(int badpeople, int allpeople) {
		 
		double percent = (double)badpeople/allpeople;
		
		DecimalFormat df = new DecimalFormat("#.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		percent = Double.valueOf(df.format(percent));
		return percent;
	}
}
