	function update(){
		var ctx = '/SpringmvcSpringMybatis';
		$.ajax({
			type : "POST",
			async : true,
			url : ctx + "/update2.do",
			data : {
				"id" : $('#id').val(),
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
	function updatePerson(){
		var ctx = '/SpringmvcSpringMybatis';
		$.ajax({
			type : "POST",
			async : true,
			url : ctx + "/updatePerson2.do",
			data : {
				"id" : $('#id').val(),
				"name":$('#name').val(),
				"sex":$('#sex').val(),
			},
			error : function() {
				hideLoadingDialog();
				showmsg("登录异常");
			},
			success : function(res) {
				window.location.href="/SpringmvcSpringMybatis/viewAllPerson.do"
			}
		});
	}