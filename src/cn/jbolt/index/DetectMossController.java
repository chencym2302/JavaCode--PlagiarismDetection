package cn.jbolt.index;

import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.jfinal.render.JsonRender;
import moss.CMD;
import moss.JSoup;

import cn.jbolt.common.model.Files;
import cn.jbolt.common.model.Results;
import cn.jbolt.common.model.Resultscount;
import cn.jbolt.common.model.Resultscount2;
import cn.jbolt.common.model.Resultsmoss;

public class DetectMossController extends Controller
{
	public void index()
	{
	}

	public void codeDetect()
	{
		String params;
		//		获取前台参数
		String classes = getPara("classes");
		String lesson = getPara("lesson");
		String language = getPara("language");
		double lowScore = Double.valueOf(getPara("lowScore"));
		CMD cmd = new CMD();
		String dir = "";
		String urlhere = "";
		
		List<Files> fileslist = Files.dao.getFilesList(classes,lesson);
		
		if(fileslist.isEmpty()) {
			params = "{\"ifSuccess\":\"error\"}";
			render(new JsonRender(params).forIE());
		}
		  
		//更新resultsmoss表
		Resultsmoss.dao.deleteResultsList();
		if(!fileslist.isEmpty()) {
			dir = fileslist.get(0).getFilePath();
			urlhere = cmd.getUrlOfCmd(3, language, dir);
			if(!JSoup.getConnection(urlhere)) {
				params = "{\"ifSuccess\":\"error\"}";
				render(new JsonRender(params).forIE());
			};
		}
		if(cmd.taskKill("perl.exe")) {
			System.out.println("success and kill perl.exe");
		}
		
		int allCount = fileslist.size();
		List<Resultsmoss> lstResults = Resultsmoss.dao.getResultsList(lowScore);
		
		if(lstResults.isEmpty()) {
			Resultscount2.dao.deleteResultsList();
			Resultscount2.dao.saveResults(0, allCount, 0);
		}
		
		int bridgeCount = getBridgeCount(lstResults,fileslist);
		double percent = getPercent(allCount-bridgeCount,allCount);
		//更新计算结果表
		Resultscount2.dao.deleteResultsList();
		Resultscount2.dao.saveResults(bridgeCount, allCount, percent);
		
		params = "{\"ifSuccess\":\"success\"}";
		render(new JsonRender(params).forIE());
	}
	
	public void getResults(int limit, int offset, String classes, String lesson)
	{
		try
		{
			List<Resultsmoss> lstResults = Resultsmoss.dao.getResultsList();

			JSONArray jsonData = new JSONArray();

			JSONObject jo = null;
			
			for (Resultsmoss r : lstResults)

			{
				jo = new JSONObject();

				jo.put("id", r.getId());
				
				jo.put("fileA", r.getFileA());

				jo.put("fileB", r.getFileB());

				jo.put("score", r.getScore());

				jo.put("sameLines", r.getSameLines());

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
			List<Resultscount2> lstResults = Resultscount2.dao.getResultsList();

			JSONArray jsonData = new JSONArray();

			JSONObject jo = null;
			
			for (Resultscount2 r : lstResults)

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
	//无向连通图 缩点/求桥问题
	public int getBridgeCount(List<Resultsmoss> lstResults, List<Files> fileslist){
		
		int badcount = 0;
		//记录桥点
		List<String> badPeopleName = new ArrayList<String>();
		
		for(Resultsmoss results : lstResults){
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
