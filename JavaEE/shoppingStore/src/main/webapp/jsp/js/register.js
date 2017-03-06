function register(){
	var phoneNum =$("#phoneNum").val()
	var passwd1 =$("#passwd1").val()
	var passwd2 =$("#passwd2").val()
	if (phoneNum!=''&&phoneNum!='请输入手机号码！') {
		if(passwd1!=''&&passwd1!='密码至少6位，最多16位!'){
			if(passwd2!=''){
				if(passwd2==passwd1){
/*					document.registerForm.action = "/shoppingStore/jsp/addUser.do?phone="+phoneNum+"&passwd="+passwd1;
					document.registerFor.submit();*/
					$.ajax({
						type : "POST",
						async : true,
						url : "/shoppingStore/jsp/addUser.do",
						data : {
							"phoneNum" : phoneNum,
							"passwd" : passwd1
						},
						error : function() {
							alert("异常")
							hideLoadingDialog();
							showmsg("登录异常");
						},
						success : function(res) {
							alert("注册成功!")
							window.location.href="/shoppingStore/jsp/index.jsp"
						}
					})
					
				}else {
					alert("两次密码不一致！")
				}
			}else {
				$("#passwd2").attr('placeholder','请再次输入密码！')
			}
		}else {
			$("#passwd1").attr('placeholder','请输入密码！')
		}
	}else {
		$("#phoneNum").attr('placeholder','请输入手机号码！')
	}
}