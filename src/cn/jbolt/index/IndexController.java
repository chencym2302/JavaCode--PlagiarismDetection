package cn.jbolt.index;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.kit.PathKit;
import com.jfinal.render.JsonRender;
import com.jfinal.upload.UploadFile;

public class IndexController extends Controller {
	/**
	 * 首页Action
	 */
	public void index() {
		render("login.jsp");
	}

}