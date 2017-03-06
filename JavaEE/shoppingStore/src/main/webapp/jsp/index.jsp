<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<!--顶部top-->
	<div class="top">
		<div class="w1200 clearfix">
			<div class="gzwm fl">
				<span class="gz0">关注我们：</span> <span class="gz gz1"></span> <span
					class="gz gz2"></span>
			</div>
			<ul class="nav fr">
				<li id="haveUser" style="display: none;"><a id="user" class="nav-a" href="" ></a></li>
				<li id="noUser" style="display: block;"><a class="nav-a" href="register.jsp">注册</a><a
					class="btn-land" href="javascript:;">登录</a></li>
				<li id="userId"></li>
				<li><a class="" href="news.jsp">消息</a></li>
				<li><a class="" href="collection.jsp">我的收藏</a></li>
				<li><a class="nav-b" href="javascript:;">个人中心<i
						class="top-i"></i></a>
					<div class="nav-menu">
						<a href="team.jsp">团队管理</a> <a href="user-information.jsp">用户信息</a>
						<a href="order.jsp">订单管理</a> <a href="user-message.jsp">我的留言</a> <a
							href="">退出</a>
					</div></li>
				<li><a class="nav-c" href="cart.jsp">购物车</a></li>
				<li><a href="javascript:;">客户服务<i class="top-i"></i></a>
					<div class="nav-menu">
						<a href="service-about.jsp">关于我们</a> <a href="service-wenti.jsp">常见问题</a>
					</div></li>
			</ul>
		</div>
	</div>
	<!--/顶部top-->
	<!--head-->
	<div class="head w1200 clearfix">
		<div class="logo fl">
			<a href="index.jsp"><img src="images/logo.png" alt=""></a>
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
	<div class="w1200 mt35 clearfix">
		<!--菜单-->
		<div class="menu fl">
			<h2>全部商品</h2>
			<ul class="menu-list">
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">美妆</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a
							href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a>
					</div>
					<div class="menu-con">
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">日用</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">玻璃杯</a><span>|</span><a
							href="list-one.jsp">晴雨伞</a><span>|</span><a href="list-one.jsp">口罩</a>
					</div>
					<div class="menu-con">
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">食品</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">巧克力</a><span>|</span><a
							href="list-one.jsp">饼干</a><span>|</span><a href="list-one.jsp">酒水</a>
					</div>
					<div class="menu-con">
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">男装</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">上装</a><span>|</span><a
							href="list-one.jsp">下装</a><span>|</span><a href="list-one.jsp">正装</a>
					</div>
					<div class="menu-con">
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
						<dl class="clearfix">
							<dt>
								<a href="list-two.jsp">麦片</a>
							</dt>
							<dd>
								<a href="list-two.jsp">牛奶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">咖啡</a>
							</dd>
							<dd>
								<a href="list-two.jsp">柚子茶</a>
							</dd>
							<dd>
								<a href="list-two.jsp">酸梅汤</a>
							</dd>
							<dd>
								<a href="list-two.jsp">矿泉水</a>
							</dd>
						</dl>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">女装</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">上装</a><span>|</span><a
							href="list-one.jsp">下装</a><span>|</span><a href="list-one.jsp">正装</a>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">数码</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">手机</a><span>|</span><a
							href="list-one.jsp">相机</a><span>|</span><a href="list-one.jsp">摄像机</a>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">美妆</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a
							href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">美妆</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a
							href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">美妆</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a
							href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a>
					</div>
				</li>
				<li>
					<div class="menu-nav">
						<h3>
							<a href="list-one.jsp">美妆</a>
						</h3>
						<a class="menu-a" href="list-one.jsp">保湿</a><span>|</span><a
							href="list-one.jsp">保湿</a><span>|</span><a href="list-one.jsp">保湿</a>
					</div>
				</li>
			</ul>
		</div>
		<!--/菜单-->
		<!--菜单导航右侧-->
		<div class="items fr">
			<!--navitems-->
			<div class="navitems">
				<a class="on" href="index.jsp">首页</a> <a href="">产品专区</a> <a
					href="list-huiyuan.jsp">会员专区</a> <a href="list-jifen.jsp">积分专区</a>
			</div>
			<!--navitems-->
			<div id="hdp1" class="hdp1">
				<div class="hd">
					<ul>
						<li><img src="images/hdp1.jpg" /></li>
						<li><img src="images/hdp1.jpg" /></li>
						<li><img src="images/hdp1.jpg" /></li>
					</ul>
				</div>
				<div class="bd">
					<ul>
						<li>
							<div class="bg"></div>
							<div class="pic">
								<a href=""><img src="images/hdp1.jpg" /></a>
							</div>
							<div class="title">
								<a href="">效果图1</a>
							</div>
						</li>
						<li>
							<div class="bg"></div>
							<div class="pic">
								<a href=""><img src="images/hdp1.jpg" /></a>
							</div>
							<div class="title">
								<a href="">效果图2</a>
							</div>
						</li>
						<li>
							<div class="bg"></div>
							<div class="pic">
								<a href=""><img src="images/hdp1.jpg" /></a>
							</div>
							<div class="title">
								<a href="">效果图3</a>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>

		<!--/菜单导航右侧-->
	</div>
	<!--/菜单导航-->
	<!--热门推荐-->
	<div class="recommend w1200 clearfix">
		<!--推荐1-->
		<div class="rec1 fl">
			<a href=""><div class="ysy"></div>
				<p class="ysy-p">一 送 一</p> <img src="images/img1.jpg" alt=""></a>
		</div>
		<!--推荐2-->
		<div class="rec2 fl">
			<a href=""><div class="ysy"></div>
				<p class="ysy-p">超值组合</p> <img src="images/img3.jpg" alt=""></a>
		</div>
		<!--推荐3-->
		<div class="rec3 fl">
			<!--hdp2-->
			<div id="hdp2" class="hdp2">
				<div class="hd">
					<ul>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
				<div class="bd">
					<ul>
						<li><a href="article.jsp"><img src="images/hdp2.jpg" /></a></li>
						<li><a href="article.jsp"><img src="images/hdp2.jpg" /></a></li>
						<li><a href="article.jsp"><img src="images/hdp2.jpg" /></a></li>
					</ul>
				</div>
			</div>
			<!--hdp3-->
			<div id="hdp3" class="hdp2 hdp3">
				<div class="hd">
					<ul>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
				<div class="bd">
					<ul>
						<li><a href="article.jsp"><img src="images/hdp3.jpg" /></a></li>
						<li><a href="article.jsp"><img src="images/hdp3.jpg" /></a></li>
						<li><a href="article.jsp"><img src="images/hdp3.jpg" /></a></li>
					</ul>
				</div>
			</div>
		</div>
		<!--推荐4-->
		<div class="rec4 fr">
			<a href="article.jsp"><img src="images/img4.jpg" alt=""></a>
		</div>
	</div>
	<!--/热门推荐-->
	<!--葡萄酒-->
	<div class="title w1200">
		<h2>葡萄酒</h2>
	</div>
	<div class="content w1200 clearfix">
		<!--商品列表-->
		<ul class="content-list fl">
			<li>
				<div class="hot"></div> <a class="img-a" href="article.jsp"><img
					src="images/sp1.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱王朝 干红葡萄酒 750ml*6瓶/箱王朝
						干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div>
			</li>
			<li>
				<div class="hot"></div> <a class="img-a" href="article.jsp"><img
					src="images/sp2.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div>
			</li>
			<li><a class="img-a" href="article.jsp"><img
					src="images/sp3.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div></li>
			<li><a class="img-a" href="article.jsp"><img
					src="images/sp4.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div></li>
		</ul>
		<!--相关商品-->
		<div class="content-con fr">
			<div class="con-box con1">
				<h3 class="tit">相关品牌</h3>
				<ul class="con-list clearfix">
					<li><a href="">泸州老窖</a></li>
					<li><a href="">洋河</a></li>
					<li><a href="">五粮液</a></li>
					<li><a href="">茅台</a></li>
					<li><a href="">西凤</a></li>
					<li><a href="">剑南春</a></li>
					<li><a href="">小糊涂仙</a></li>
					<li><a href="">绵竹</a></li>
					<li><a href="">红星</a></li>
					<li><a href="">牛栏山</a></li>
				</ul>
			</div>
			<div class="con-box">
				<h3 class="tit">相关搜索</h3>
				<ul class="con-list clearfix">
					<li><a href="">250ml-49</a></li>
					<li><a href="">浓香型白酒</a></li>
					<li><a href="">51%以上...</a></li>
					<li><a href="">杜康白酒</a></li>
					<li><a href="">大润发FP...</a></li>
					<li><a href="">京府白酒</a></li>
					<li><a href="">凤香型白酒</a></li>
					<li><a href="">茅台醇白酒</a></li>
					<li><a href="">孔府家白酒孔府家白酒</a></li>
					<li><a href="">杏花村白酒</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--白酒-->
	<div class="title w1200">
		<h2>白酒</h2>
	</div>
	<div class="content w1200 clearfix">
		<!--商品列表-->
		<ul class="content-list fl">
			<li><a class="img-a" href="article.jsp"><img
					src="images/sp5.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div></li>
			<li><a class="img-a" href="article.jsp"><img
					src="images/sp6.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div></li>
			<li><a class="img-a" href="article.jsp"><img
					src="images/sp7.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div></li>
			<li><a class="img-a" href="article.jsp"><img
					src="images/sp8.jpg" alt=""></a>
				<div class="p-price">
					<span>￥</span>205
				</div>
				<div class="p-name">
					<a href="article.jsp">王朝 干红葡萄酒 750ml*6瓶/箱</a>
				</div>
				<div class="p-quality">品质保证，喝的放心。过量饮酒 有害健康</div>
				<div class="p-stock clearfix">
					<div class="p-stock-in fl">
						<input class="p-input" type="text" value="1"> <a
							class="p-add" href="javascript:;"></a> <a class="p-decrease"
							href="javascript:;"></a>
					</div>
					<div class="p-cart fl">
						<a href="javascript:;">加入购物车</a>
					</div>
				</div></li>
		</ul>
		<!--相关商品-->
		<div class="content-con fr">
			<div class="con-box con1">
				<h3 class="tit">相关品牌</h3>
				<ul class="con-list clearfix">
					<li><a href="">泸州老窖</a></li>
					<li><a href="">洋河</a></li>
					<li><a href="">五粮液</a></li>
					<li><a href="">茅台</a></li>
					<li><a href="">西凤</a></li>
					<li><a href="">剑南春</a></li>
					<li><a href="">小糊涂仙</a></li>
					<li><a href="">绵竹</a></li>
					<li><a href="">红星</a></li>
					<li><a href="">牛栏山</a></li>
				</ul>
			</div>
			<div class="con-box">
				<h3 class="tit">相关品牌</h3>
				<ul class="con-list clearfix">
					<li><a href="">250ml-49</a></li>
					<li><a href="">浓香型白酒</a></li>
					<li><a href="">51%以上...</a></li>
					<li><a href="">杜康白酒</a></li>
					<li><a href="">大润发FP...</a></li>
					<li><a href="">京府白酒</a></li>
					<li><a href="">凤香型白酒</a></li>
					<li><a href="">茅台醇白酒</a></li>
					<li><a href="">孔府家白酒孔府家白酒</a></li>
					<li><a href="">杏花村白酒</a></li>
				</ul>
			</div>
		</div>
	</div>
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
				<p>
					<a href="">新用户注册</a>
				</p>
				<p>
					<a href="">购物流程</a>
				</p>
			</li>
			<li class="slo2">
				<h3>物流配送</h3>
				<p>
					<a href="">配送方式</a>
				</p>
				<p>
					<a href="">配送服务</a>
				</p>
				<p>
					<a href="">运费标准</a>
				</p>
				<p>
					<a href="">物流跟踪</a>
				</p>
			</li>
			<li class="slo3">
				<h3>售后服务</h3>
				<p>
					<a href="">退回说明</a>
				</p>
				<p>
					<a href="">退款说明</a>
				</p>
				<p>
					<a href="">加多得保障</a>
				</p>
			</li>
			<li class="slo4">
				<h3>常见问题</h3>
				<p>
					<a href="">账号问题</a>
				</p>
				<p>
					<a href="">发票问题</a>
				</p>
				<p>
					<a href="">订单问题</a>
				</p>
			</li>
			<li class="slo5">
				<h3>关于我们</h3>
				<p>
					<a href="">企业介绍</a>
				</p>
				<p>
					<a href="">联系我们</a>
				</p>
			</li>
		</ul>
	</div>
	<!--/slogen-->
	<!---->
	<!--foot-->
	<div class="foot">
		<div class="w1200">
			<p>Copyright 2005-2016 Company name All Rights
				Reserved.北京加多得科技有限公司</p>
		</div>
	</div>
	<!--/foot-->
	<!--登陆-->
	<div class="pop"></div>
	<div class="land">
		<div class="land-s">
			<span class="land-gb"></span>
			<div class="land-name">
				<h2>欢迎登录</h2>
				<p>
					还没有账户？<a href="register.jsp">立即注册</a>
				</p>
			</div>
			<div class="land-inp">
				<span class="ic ic1"><i></i></span><input id="phoneNum" type="text"
					placeholder="手机号码">
			</div>
			<div class="land-inp">
				<span class="ic ic2"><i></i></span><input id="passwd" type="password"
					placeholder="密码"><span class="ic3"></span>
			</div>
			<div class="land-check mt20">
				<label class="fl"><input type="checkbox"><span>记住登录状态</span></label><a
					class="fr" href="password.jsp">忘记密码</a>
			</div>
			<div class="land-btn mt20">
				<button onclick="login()">登 录</button>
			</div>
			<div class="land-share mt40">
				<h3>其他方式登录</h3>
				<div class="share-s mt20">
					<a href=""><img src="images/share1.png" alt=""></a> <a
						href=""><img src="images/share2.png" alt=""></a> <a href=""><img
						src="images/share3.png" alt=""></a>
				</div>

			</div>
		</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.SuperSlide.2.1.1.js"></script>
	<script src="js/index.js"></script>
	<script src="js/login.js"></script>
	<script>
		//幻灯片1
		jQuery("#hdp1").slide({
			mainCell : ".bd ul",
			effect : "top",
			autoPlay : true,
			triggerTime : 0
		});
		//幻灯片2
		jQuery("#hdp2").slide({
			mainCell : ".bd ul",
			effect : "left",
			autoPlay : true,
			triggerTime : 0
		});
		//幻灯片3
		jQuery("#hdp3").slide({
			mainCell : ".bd ul",
			effect : "top",
			autoPlay : true,
			triggerTime : 0
		});
	</script>
</body>
</html>