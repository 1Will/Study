<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>个人中心-订单管理</title>
	<link rel="stylesheet" href="css/index.css">
</head>
<body>
<!--顶部top-->
<div class="top">
	<div class="w1200 clearfix">
		<div class="gzwm fl">
			<span class="gz0">关注我们：</span>
			<span class="gz gz1"></span>
			<span class="gz gz2"></span>
		</div>
		<ul class="nav fr">
			<li><a class="nav-a" href="register.jsp">注册</a><a class="btn-land" href="javascript:;">登录</a></li>
			<li>会员ID：80001247</li>
			<li><a class="" href="news.jsp">消息</a></li>
			<li><a class="" href="collection.jsp">我的收藏</a></li>
			<li>
				<a class="nav-b" href="javascript:;">个人中心<i class="top-i"></i></a>
				<div class="nav-menu">
					<a href="team.jsp">团队管理</a>
					<a href="user-information.jsp">用户信息</a>
					<a href="order.jsp">订单管理</a>
					<a href="user-message.jsp">我的留言</a>
					<a href="">退出</a>
				</div>
			</li>
			<li><a class="nav-c" href="cart.jsp">购物车</a></li>
			<li>
				<a href="javascript:;">客户服务<i class="top-i"></i></a>
				<div class="nav-menu">
					<a href="service-about.jsp">关于我们</a>
					<a href="service-wenti.jsp">常见问题</a>
				</div>
			</li>
		</ul>
	</div>
</div>
<!--/顶部top-->
<!--head-->
<div class="head w1200 clearfix">
	<div class="logo fl">
		<a href="index.jsp"><img src="images/logo.jpg" alt=""></a>
	</div>
	<div class="search fl">
		<div class="form clearfix">
			<input class="text fl" type="text" placeholder="请输入商品名或编号">
			<button class="button fl"></button>
		</div>
		<div class="search-hot">
			<a href="">红酒</a><a href="">洋酒</a><a href="">白酒</a><a href="">黄酒</a>
		</div>
	</div>
</div>
<!--/head-->
<!--菜单导航<-->
<div class="borb2">
	<div class="w1200 mt35 clearfix">
		<!--菜单-->
		<div class="menu pro fl">
			<h2>全部商品</h2>
			<ul class="menu-list">
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">美妆</a></h3><a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a></div>
					<div class="menu-con">
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">日用</a></h3><a class="menu-a" href="list-one.jsp">玻璃杯</a><span>|</span><a href="list-one.jsp">晴雨伞</a><span>|</span><a href="list-one.jsp">口罩</a></div>
					<div class="menu-con">
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">食品</a></h3><a class="menu-a" href="list-one.jsp">巧克力</a><span>|</span><a href="list-one.jsp">饼干</a><span>|</span><a href="list-one.jsp">酒水</a></div>
					<div class="menu-con">
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">男装</a></h3><a class="menu-a" href="list-one.jsp">上装</a><span>|</span><a href="list-one.jsp">下装</a><span>|</span><a href="list-one.jsp">正装</a></div>
					<div class="menu-con">
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
						<dl class="clearfix"><dt><a href="list-two.jsp">麦片</a></dt><dd><a href="list-two.jsp">牛奶</a></dd><dd><a href="list-two.jsp">咖啡</a></dd><dd><a href="list-two.jsp">柚子茶</a></dd><dd><a href="list-two.jsp">酸梅汤</a></dd><dd><a href="list-two.jsp">矿泉水</a></dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">女装</a></h3><a class="menu-a" href="list-one.jsp">上装</a><span>|</span><a href="list-one.jsp">下装</a><span>|</span><a href="list-one.jsp">正装</a></div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">数码</a></h3><a class="menu-a" href="list-one.jsp">手机</a><span>|</span><a href="list-one.jsp">相机</a><span>|</span><a href="list-one.jsp">摄像机</a></div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">美妆</a></h3><a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a></div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">美妆</a></h3><a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a></div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">美妆</a></h3><a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a></div>
				</li>
				<li>
					<div class="menu-nav"><h3><a href="list-one.jsp">美妆</a></h3><a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a></div>
				</li>
			</ul>
		</div>
		<!--/菜单-->
		<!--菜单导航右侧-->
		<div class="items fr">
			<!--navitems-->
			<div class="navitems">
				<a href="index.jsp">首页</a>
				<a href="">产品专区</a>
				<a href="list-huiyuan.jsp">会员专区</a>
				<a href="list-jifen.jsp">积分专区</a>
			</div>
		<!--/菜单导航右侧-->
		</div>
	</div>
</div>
<!--/菜单导航-->
<!--位置-->
<div class="crumb-wrap w1200 clearfix">
	<div class="crumb crumb-first"><a href="index.jsp">首页</a></div>
	<div class="crumb crumb-sep"><i></i></div>
	<div class="crumb"><a href="">个人中心</a></div>
	<div class="crumb crumb-sep"><i></i></div>
	<div class="crumb"><a href="">订单管理</a></div>
	<div class="crumb crumb-sep"><i></i></div>
	<div class="crumb">收货地址</div>
</div>
<!--/位置-->
<!--客户服务-->
<div class="customer w1200 clearfix">
	<!--左侧菜单-->
	<div class="cust-menu fl">
		<ul>
			<li>
				<div class="cust-name"><h3><i></i>订单管理</h3></div>
				<div class="cust-nav">
					<p class="on"><a href="order.jsp">我的订单</a></p>
					<p><a href="order-address.jsp">收货地址</a></p>
				</div>
			</li>
			<li>
				<div class="cust-name"><h3><i></i>团队管理</h3></div>
				<div class="cust-nav">
					<p><a href="team.jsp">我的团队</a></p>
				</div>
			</li>
			<li>
				<div class="cust-name"><h3><i></i>用户信息</h3></div>
				<div class="cust-nav">
					<p><a href="user-assets.jsp">我的资产</a></p>
					<p><a href="user-information.jsp">个人信息</a></p>
					<p><a href="user-perfect.jsp">完善资料</a></p>
					<p><a href="user-login-password.jsp">登录密码设置</a></p>
					<p><a href="user-embody-password.jsp">提现密码设置</a></p>
					<p><a href="user-message.jsp">我的留言</a></p>
				</div>
			</li>
		</ul>
	</div>
	<!--/左侧菜单-->
	<!--订单列表-->
	<div class="w1018 fr">
		<div class="team-order nt">
			<!--订单导航-->
			<ul class="order-menu clearfix">
				<li class="on">全部订单 (10)</li>
				<li>代付款 （0）</li>
				<li>待收货 （0）</li>
				<li>待评价 （2）</li>
			</ul>
			<!--订单列表-->
			<div class="order-con ord clearfix">
				<!--1-->
				<div class="order-tab">
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><b>已完成</b></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><b>已完成</b></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><b>已完成</b></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>					
				</div>
				<!--2-->
				<div class="order-tab">
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><a class="orl2" href="">待付款</a></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><a class="orl2" href="">待付款</a></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><a class="orl2" href="">待付款</a></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>					
				</div>
				<!--3-->
				<div class="order-tab">
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><b>待收货</b></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><b>待收货</b></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><b>待收货</b></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>					
				</div>
				<!--4-->
				<div class="order-tab">
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><a class="orl2" href="">待评价</a></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><a class="orl2" href="">待评价</a></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
					<ul class="clearfix">
						<li class="ll1"><img src="images/ss.png" alt=""></li>
						<li class="ll2">
							<div><b>订单号：<a href="">16051868151945</a></b></div>
							<div>2016-05-18 00:03:34</div>
						</li>
						<li class="ll3"><span class="orl1">￥4500</span></li>
						<li class="ll4">
							<div><a class="orl2" href="">待评价</a></div>
							<div class="order-gz">
								<span>跟踪</span>
								<i class="order-gz"></i>
								<div class="track">
									<span class="p-arrow"></span>
									<div class="track-con">
										<dl class="track-name clearfix"><dd>处理时间</dd><dd>订单处理信息</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
										<dl class="track-info clearfix"><dt>2016-09-01 16:33:02</dt><dd>你呢订单已经提交</dd></dl>
									</div>
								</div>
							</div>
						</li>
						<li class="ll5"><div><a class="order-pj" href="javascript:;">评价</a></div></li>
						<li class="ll6"><div><a href="order-info.jsp">查看详情</a></div></li>
					</ul>
				</div>
			</div>
			<!---->
		</div>
		<!--订单分页-->
		<div class="skin-page mt10 clearfix">
			<ul class="page-ul page-ord clearfix">
				<li class="disabled"><a href="javascript:;">上一页</a></li>
				<li class="curr"><a href="javascript:;">11</a></li>
				<li><a href="">12</a></li>
				<li><a href="">13</a></li>
				<li><a href="">14</a></li>
				<li class="cutt">...</li>
				<li><a href="">15</a></li>
				<li><a href="">上一页</a></li>
			</ul>
		</div>
		<!---->
	</div>
	<!--/订单列表-->
</div>
<!--/客户服务-->
<!--service-->
<div class="service mt50 w1200">
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
<!--登陆-->
<div class="pop"></div>
<div class="land">
	<div class="land-s">
		<span class="land-gb"></span>
		<div class="land-name"><h2>欢迎登录</h2><p>还没有账户？<a href="register.jsp">立即注册</a></p></div>
		<div class="land-inp"><span class="ic ic1"><i></i></span><input type="text" placeholder="邀请码 / 手机"></div>
		<div class="land-inp"><span class="ic ic2"><i></i></span><input type="password" placeholder="密码"><span class="ic3"></span></div>
		<div class="land-check mt20"><label class="fl"><input type="checkbox"><span>记住登录状态</span></label><a class="fr" href="password.jsp">忘记密码</a></div>
		<div class="land-btn mt20"><button>登　录</button></div>
		<div class="land-share mt40">
			<h3>其他方式登录</h3>
			<div class="share-s mt20">
				<a href=""><img src="images/share1.png" alt=""></a>
				<a href=""><img src="images/share2.png" alt=""></a>
				<a href=""><img src="images/share3.png" alt=""></a>
			</div>

		</div>
	</div>
</div>
<!--/登陆-->
<!--评价-->
<div class="evaluate popup">
	<span class="withd-gb eval-gb"></span>
	<div class="eval">
		<dl class="clearfix"><dt><span>*</span>评价：</dt><dd><div class="eval-xx clearfix"><span class="on"></span><span></span><span></span><span></span><i><em>1</em>分</i></div></dd></dl>
		<dl class="clearfix"><dt><span>*</span>标题：</dt><dd><input class="eval-in" type="text" placeholder="输入标题"></dd></dl>
		<dl class="clearfix"><dt><span>*</span>感受：</dt><dd><textarea class="eval-in eval-tex" placeholder="商品满意吗？来分享您的感受吧~"></textarea><p class="eval-p2">评价字数限制<span>300</span>字</p></dd></dl>
		<dl class="clearfix"><dt><span>*</span>晒图：</dt><dd><div class="eval-img">
			<div class="eval-slt"><span></span>1/5</div>
			<ul class="eval-list clearfix">
				<li class="on"><img src="images/sp8.jpg" alt=""><input type="file"></li>
				<li><img src="" alt=""><input type="file"></li>
			</ul>
		</div></dd></dl>
		<dl class="clearfix"><dt><span></span></dt><dd><input class="eval-btn" type="button" value="确认评价"></dd></dl>
	</div>
</div>
<!--/评价-->
<script src="js/jquery.min.js"></script>
<script src="js/index.js"></script>
</body>
</html>