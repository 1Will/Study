	function insert(){
		var ctx = '/SpringmvcSpringMybatis';
		$.ajax({
			type : "POST",
			async : true,
			url : ctx + "/insert2.do",
			data : {
				"shopNo" : $('#shopNo').val(),
				"shopName":$('#shopName').val(),
				"shopType":$('#shopType').val(),
				"shopPassword" : $('#shopPassword').val(),
				"note":$('#note').val()
			},
			error : function() {
				hideLoadingDialog();
				showmsg("登录异常");
			},
			success : function(res) {
					window.location.href="/SpringmvcSpringMybatis/viewAll.do"
				}
		});
	}