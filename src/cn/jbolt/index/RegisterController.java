package cn.jbolt.index;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.jfinal.core.Controller;

import cn.jbolt.common.model.User;

public class RegisterController extends Controller{
	 
		public void index() {
			String sId = getPara("sId");
			String name = getPara("name");
			String password = getPara("password");
			Date date = new Date();
			User.dao.saveUser(sId,name,password,date);
			render("/theOK.jsp");
		}
}
