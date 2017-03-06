/**
 * 查询商品
 */

$(function() {
	$("#btnSelect").click(function() {
		var name=$("#selectName").val();
		window.location.href="/shoppingStore/jsp/selectProduct.do?name="+name;
	})
})