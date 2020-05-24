
$().ready(function() {  
    $("#login_form").validate({  
        rules: {  
            username: "required",  
            password: {  
                required: true,  
                minlength: 6  
            },  
        },  
        messages: {  
            username: "请输入账号",  
            password: {  
                required: "请输入密码",  
                minlength: $.validator.format("密码不能小于 {0} 个字 符")  
            },  
        }  
    });  
    $("#register_form").validate({  
        rules: {  
            username: "required",  
            password: {  
                required: true,  
                minlength: 6  
            },  
            rpassword: {  
                equalTo: "#register_password"  
            },  
            email: {  
                required: true,  
                email: true  
            }  
        },  
        messages: {  
            username: "请输入账号",  
            password: {  
                required: "请输入密码",  
                minlength: $.validator.format("密码不能小于{0}个字 符")  
            },  
            rpassword: {  
                equalTo: "两次密码不一样"  
            },  
            email: {  
                required: "请输入邮箱",  
                email: "请输入有效邮箱"  
            }  
        }  
    });  
});  
$(function() {  
    $("#register_btn").click(function() {  
        $("#register_form").css("display", "block");  
        $("#login_form").css("display", "none");  
    });  
    
    $("#back_btn").click(function() {  
        $("#register_form").css("display", "none");  
        $("#login_form").css("display", "block");  
    });
    
    $("#login_form").submit(function() {  
        $("#register_form").css("display", "none");  
        $("#login_form").css("display", "block");  
    }); 
    
    $("#register_form").submit(function() {  
    	alert("注册成功！");
        $("#register_form").css("display", "none");  
        $("#login_form").css("display", "block");  
    }); 
    
     
    $("#login_submit").click(function() {  
    	alert("登陆成功！");
    });  
    
});  
//
//function mylogin(){
//	var form = $("#login_form");
//	var options = {
//		url : 'login/mylogin',
//		type : 'post',
//		// data:{},
//		success : function(data) {
//			var htmlToJson = JSON.parse(data);
//			if (htmlToJson.ifSuccess == "success") {
//				alert("登录成功！");
//			}
//			if (htmlToJson.ifSuccess == "failed") {
//				alert("找不到此用户！");
//			}
//		}
//	};
//	form.ajaxSubmit(options);
//	 
//}

//function register(){
//	var form = $("#register_form");
//	var options = {
//		url : 'login/register',
//		type : 'post',
//		// data:{},
//		success : function(data) {
//			var htmlToJson = JSON.parse(data);
//			if (htmlToJson.ifSuccess == "success") {
//				alert("注册成功！");
//			}
//		}
//	};
//	form.ajaxSubmit(options);
//	$("#register_form").css("display", "none");  
//    $("#login_form").css("display", "block"); 
//}


