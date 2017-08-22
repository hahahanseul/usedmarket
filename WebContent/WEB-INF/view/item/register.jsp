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
#container{width:100%;}
table{border-collapse: collapse;}
#detail{border:1px solid black; width:60%; height:300px;margin:0 auto;}
#detail th{border:1px solid black; }
#detail tr td{border:1px solid black; text-align:center;}
#btn_box{width:310px;height:50px;margin: 0 auto;}
.register_btn{width:45%; height:30px; margin-top:20px; margin-right:5px;}
h1{text-align:center;}
</style>
<body>
<div id=wrapper>
<h1>상품등록</h1>
    <div id=container>
   	<table id="detail">
   		<tr>
   			<td rowspan="4" style="width:40%;"></td>
   			<td style="width:10%;">title</td>
   			<td style="width:50%%;"></td>
   		</tr>
   		<tr>
   			<td>writer</td>
   			<td></td>
   		</tr>
   		<tr>
   			<td>regdate</td>
   			<td></td>
   		</tr>
   		<tr>
   			<td>content</td>
   			<td></td>
   		</tr>
   	</table>
   	<div id="btn_box">
   	    <input class="register_btn" onclick="move('move','common','list')" type="button" value="리스트로"/>
   	    <input class="register_btn" onclick="move('move','item','register')" type="button" value="상품등록"/>
   	</div>
    </div>
</div>
</body>
<script>
function move(cmd,dir,page){
	location.href="${ctx}/item.action?cmd="+cmd+"&dir="+dir+"&page="+page;
}
</script>
</html>