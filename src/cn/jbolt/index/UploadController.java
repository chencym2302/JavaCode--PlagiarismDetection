package cn.jbolt.index;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.jfinal.json.Json;
import com.jfinal.render.JsonRender;
import com.jfinal.upload.UploadFile;

import cn.jbolt.common.model.Files;

public class UploadController extends Controller {

	public void index() {

	}

	public static String createId() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 多文件上传
	 * 多文件上传需要在src下面添加com.oreilly.servlet包，添加MultipartRequest.java的类，用于处理多文件重命名问题
	 */
	public void moreUploadFile() {
		String params = "{\"ifSuccess\":\"error\"}";
		String fid, filename, filepath, classes, lesson;
		Date date = new Date();
		// 循环遍历获取文件重命名，如果不需要重命名则无需此步骤
		try {
			List<UploadFile> upFile = getFiles("file");
			if(!upFile.isEmpty())
				params = "{\"ifSuccess\":\"success\"}";
			
			classes = getPara("classes");
			lesson = getPara("lesson");
			
			for (int i = 0; i < upFile.size(); i++) {
				fid = createId();
				filename = upFile.get(i).getOriginalFileName();
				filepath = upFile.get(i).getUploadPath();
				Files.dao.saveFile(fid, filename, filepath,classes,lesson,date);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		render(new JsonRender(params).forIE());
		
	}
	
	

	public void getFiles(int limit, int offset, String qclass, String lesson)
    {
		try
		{
			List<Files> lstFiles = Files.dao.getFilesList();
			JSONArray jsonData=new JSONArray();
			JSONObject jo=null;
			for (Files f : lstFiles) {
				jo=new JSONObject();
				jo.put("fileName",f.getFileName());
				jo.put("filePath",f.getFilePath());
				jo.put("classNum",f.getClassNum());
				jo.put("lessonNum",f.getLessonNum());
				jo.put("createTime",f.getCreateTime());
				
				jsonData.add(jo);
			}
			int total = lstFiles.size();
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("rows", jsonData);
			jsonObject.put("total", total);
			
	        render(new JsonRender(jsonObject).forIE());
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
	
}
