/**
 * Created by zhaojj on 15/11/9.
 */
$(document).ready(function(){
	$.ajax({
		url:'load.action',
		type:'POST',
		data:params,
		dataType:'json',
		success:function(result){
			$("#tt").datagrid('load',result);

		}
	})
	$("#add_sub").click(function(){
		var params={"payType":$('#payType').val(),"paytime":$('#paytime').val(),"amount":$('#amount').val(),"content":$('#content').val()};
		$.ajax({
			url:'login.action',
			type:'POST',
			data:params,
			dataType:'json',
			success:function(result){
				alert("success");

			},
			error:function(){
				alert("fail");
			}
		})
	})
})