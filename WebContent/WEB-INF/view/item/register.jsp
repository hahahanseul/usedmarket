<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
    <title>UsedMarket</title>
</head>
<style>
html,body{width:100%; height:100%;}
#wrapper{width:100%;}
#container{padding: 30px 0px;}
#register_form{width:30%; margin:0 auto;}
#btn_box{width:310px;height:50px;margin: 0 auto;}
span{width: 150px;}
.register_btn{width:150px; height:30px; margin-top:20px; margin-right:5px;}
h1{text-align:center;}
</style>
<body>
<div id=wrapper>
<h1>상품등록</h1>
    <div id=container>
   	<form id="register_form">
   		<span>TITLE</span><input type="text" id="title" name="title"/><br />
   		<span>WRITER</span><input type="text" id="writer" name="writer"/><br />
   		<span>CONTENT</span><input type="text" id="content" name="content"/><br />
		<span>CATEGORY</span>
		<input type="checkbox" name="category" value="used" checked/>중고<br>
		<input type="checkbox" name="category" value="elec" />전자제품<br>
		<input type="checkbox" name="category" value="book"/>도서<br>
		<input type="checkbox" name="category" value="clothes"/>의류<br>
   		<input class="register_btn" onclick="register()" type="submit" value="상품추가"/>
   		<input type="hidden" name="cmd" value="register" />
   		<input type="hidden" name="dir" value="common" />
   		<input type="hidden" name="page" value="list" />
   	</form>
    </div>
</div>
</body>
<script>
function register(){
	var input_title=document.getElementById('title').value;
	var input_writer=document.getElementById('writer').value;
	var input_content=document.getElementById('content').value;
	if(input_title==""){
		alert('제목을 입력해주세요');
		return false;
	}
	if(input_writer==""){
		alert('작성자명을 입력해주세요');
		return false;
	}
	if(input_content==""){
		alert('내용을 입력해주세요');
		return false;
	}
	var form = document.getElementById('register_form');
	form.action = "${ctx}/item.action";
	return true;
}
</script>
</html>