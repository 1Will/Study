function login(){
	var phoneNum =$("#phoneNum").val()
	var passwd =$("#passwd").val()
	if (phoneNum!=''&&phoneNum!='手机号码') {
		if(passwd!=''&&passwd!='密码'){
					$.ajax({
						type : "POST",
						async : true,
						url : "/shoppingStore/jsp/login.do",
						data : {
							"phoneNum" : phoneNum,
							"passwd" : passwd
						},
						error : function() {
							alert("操作错误！")
						},
						success : function(res) {
							/*res为登录的用户信息，拥有phone、passwd、id信息，等待js向页面写入*/
							if(res!=''){
								alert(res.phone+"登录成功!")
								/*window.location.href="/shoppingStore/jsp/index.jsp"*/
								$("#noUser").css('display','none'); 
								$("#user").text(res.phone);
								$("#userId").text("用户ID："+(res.id+80000000));
								$('#user').attr('href','http://www.baidu.com'); 
								$("#haveUser").css('display','block'); 
								$(".land").removeClass('active');
								$(".pop").hide();
								$('body').css("overflow","auto");
							}else{
								alert("用户不存在或密码错误！")
							}
						}
					})
					
		}else {
			$("#passwd1").attr('placeholder','请输入密码！')
		}
	}else {
		$("#phoneNum").attr('placeholder','请输入手机号码！')
	}
}