/**
 * Created by zhaojj on 15/11/9.
 */
$(document).ready(function(){
	$("#sub").click(function(){
		var params=$("#num1").val();
		$.ajax({
			url:'login.action',
			type:'POST',
			data:"num=1",
			dataType:'json',
			success:function(result){
				$("#output").attr("value","sucess");

			},
			error:function(){
				alert("fail");
			}
		})
	})
})