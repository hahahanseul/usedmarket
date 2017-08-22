<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
<title>UsedMarket</title>
</head>
<style>
html,body{width:100%; height:100%;}
table{border-collapse: collapse;}
#board{border:1px solid black; width:80%; margin:0 auto;}
#board th{text-align:center; }
#board tr td{height:30px;}
#container{width: 100%;}
#register_btn{style="width:150px; height:30px;"}
</style>
<body>
<div id=wrapper>
<div id=container>
<table id="board">
	<tr style="border:1px solid black;">
		<th style="width: 50px;">글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>수정/삭제</th>
	</tr>
	<tr style="border:1px solid black;">
		<td>1</td>
		<td><a onclick="move('move','item','detail')">빨간구두</a></td>
		<td>안데르센</td>
		<td></td>
		<td>
		<a onclick="move('move','item','update')">수정</a>
		/
		<a onclick="move('move','common','list')">삭제</a>
		</td>
	</tr>
	<tr>
		<td colspan="5"><input id="register_btn" onclick="move('move','item','register')" type="button" value="상품추가"/></td>
	</tr>
</table>
</div>
</div>
</body>
<script>
function move(cmd,dir,page){
	location.href="${ctx}/item.action?cmd="+cmd+"&dir="+dir+"&page="+page;
}
</script>
</html>

