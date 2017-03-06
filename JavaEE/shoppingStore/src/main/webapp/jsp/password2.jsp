<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>忘记密码</title>
	<link rel="stylesheet" href="css/index.css">
</head>
<body>
<div class="register">
	<!---->
	<div class="register-top w1200">
		<h1><a href="index.jsp"><img src="images/logo.png" alt=""></a></h1>
		<p class="reg-hy">欢迎注册</p>
		<p class="reg-dl">我已经注册 ，马上<a href="">登录</a></p>
	</div>
	<!---->
	<div class="password w1200">
		<div class="pass">		
			<h1>找回密码</h1>
			<div class="pass-dl">
				<dl class="clearfix">
					<dt><span>新密码</span></dt>
					<dd>
						<input type="text" name="text1" class="input phone shuru1 input_cur1" placeholder="密码至少6位，最多16位!">
						<span class="btn-jp  jp-btn" onclick="gb1();"></span>
						<div class="jpp"></div>
					</dd>
				</dl>
				<dl class="clearfix">
					<dt><span>确认密码</span></dt>
					<dd>
						<input type="text" name="text1" class="input phone shuru2 input_cur2">
						<span class="btn-jp reg-jp jp-btn" onclick="gb2();"></span>
						<div class="jpp"></div>
					</dd>
				</dl>
			</div>
			<div class="pass-btn">
				<a href="password3.jsp">确　认</a>
			</div>
		</div>
	</div>
	<!---->
</div>
<!--/商品详情页-->
<!--service-->
<div class="service mt100 w1200">
	<ul class="clearfix">
		<li class="ser1">
			<h3>正品低价</h3>
			<p>正品行货 品质保障</p>
		</li>
		<li class="ser2">
			<h3>正品低价</h3>
			<p>正品行货 品质保障</p>
		</li>
		<li class="ser3">
			<h3>正品低价</h3>
			<p>正品行货 品质保障</p>
		</li>
		<li class="ser4">
			<h3>正品低价</h3>
			<p>正品行货 品质保障</p>
		</li>
	</ul>
</div>
<!--/service-->
<!--slogen-->
<div class="slogen w1200">
	<ul class="clearfix">
		<li class="slo1">
			<h3>新手指南</h3>
			<p><a href="">新用户注册</a></p>
			<p><a href="">购物流程</a></p>
		</li>
		<li class="slo2">
			<h3>物流配送</h3>
			<p><a href="">配送方式</a></p>
			<p><a href="">配送服务</a></p>
			<p><a href="">运费标准</a></p>
			<p><a href="">物流跟踪</a></p>
		</li>
		<li class="slo3">
			<h3>售后服务</h3>
			<p><a href="">退回说明</a></p>
			<p><a href="">退款说明</a></p>
			<p><a href="">加多得保障</a></p>
		</li>
		<li class="slo4">
			<h3>常见问题</h3>
			<p><a href="">账号问题</a></p>
			<p><a href="">发票问题</a></p>
			<p><a href="">订单问题</a></p>
		</li>
		<li class="slo5">
			<h3>关于我们</h3>
			<p><a href="">企业介绍</a></p>
			<p><a href="">联系我们</a></p>
		</li>
	</ul>
</div>
<!--/slogen-->
<!---->
<!--foot-->
<div class="foot">
	<div class="w1200"><p>Copyright 2005-2016 Company name All Rights Reserved.北京加多得科技有限公司</p></div>
</div>
<!--/foot-->
<script src="js/jquery.min.js"></script>
<script src="js/index.js"></script>
<script src="js/keyboard.js"></script>
</body>
</html>