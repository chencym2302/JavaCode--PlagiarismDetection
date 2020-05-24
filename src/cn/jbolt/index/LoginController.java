package cn.jbolt.index;

import java.util.Date;
import java.util.List;

import com.jfinal.core.Controller;

import cn.jbolt.common.model.User;

public class LoginController extends Controller
{
	public void index() {

	}

	public void login()
	{
//		String params="";
		
		// 获取用户名
        String username = getPara("username");
        // 获取密码
        String password = getPara("password");
        
		List<User> users = User.dao.findByNameAndPwd(username, password);
		
		if (users.size()>0)
		{
			redirect("/upload.jsp");
			//错误提示——待完成
		} else
		{
			//错误提示——待完成
			//跳转登录页——待完成
			
		}
	
		
//		render(new JsonRender(params).forIE());
	}

	public void register()
	{
		String username = getPara("username");
		String password = getPara("password");
		String email = getPara("email");
		Date date = new Date();
		User.dao.saveUser(username, password, email, date);
		
		
		//跳转登录页——待完成
		
		
	}

	
}
