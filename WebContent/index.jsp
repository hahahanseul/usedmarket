<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<img src="${img}/loading.gif" alt="" />
<script>
alert('Start');
location.href="${ctx}/common.action?cmd=move&page=list&pageNumber=1";
</script>