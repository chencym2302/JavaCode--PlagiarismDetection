package cn.jbolt.index;

import java.util.List;

import com.jfinal.core.Controller;

import cn.jbolt.common.model.User;

public class LoginContraler extends Controller{
		 
		 
	    public void index(){  
	          
	        List<User> users = User.dao.findByNameAndPwd(getPara("name"),getPara("password"));  
	          
	        if (users.size() > 0) {  
	            //找到用户  
	            setSessionAttr("userInfo", users.get(0));  
	            render("/OK.jsp");  
	        } else {  
	              
	            render("/no.jsp");  
	        }

	    }
}
