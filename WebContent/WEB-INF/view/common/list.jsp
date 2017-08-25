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
<div>
	<h3>총 아이템 수:${requestScope.count}</h3>
</div>
<table id="board">
	<tr style="border:1px solid black;">
		<th style="width: 50px;">글번호</th>
		<th>제목2</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>수정/삭제</th>
	</tr>
	<c:forEach var="i" items="${requestScope.list}">
		<tr style="border:1px solid black;">
			<td>${i.itemSeq}</td>
			<td><a onclick="move('move','item','detail')">${i.title}</a></td>
			<td>${i.writer}</td>
			<td>${i.regdate}</td>
			<td>
			<a onclick="move('move','item','update')">수정</a>
			/
			<a onclick="move('move','common','list')">삭제</a>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="5">
		<div style="width:100%; margin:0 auto;">
		<c:if test="${requestScope.prevBlock gt 0}">
			<span><a onclick="list('${requestScope.startPage-1}')">◀</a></span>
		</c:if>
		<c:forEach varStatus="i" begin="${requestScope.startPage}" end="${requestScope.endPage}" step="1">
		<a class="active" onclick="list('${i.index}')">${i.index}</a> &nbsp;&nbsp;&nbsp;
		</c:forEach>
			<c:if test="${requestScope.nextBlock le requestScope.theNumberOfPages}">
				<span><a onclick="list('${requestScope.endPage+1}')">▶</a></span>	
			</c:if>
		</div>
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
function list(pageNumber) {
	location.href="${ctx}/item.action?cmd=list&dir=common&page=list&pageNumber=" +pageNumber;
	
}
</script>
</html>

