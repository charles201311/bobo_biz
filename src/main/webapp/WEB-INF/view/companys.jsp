<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>公司列表</title>

<link href="/resource/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>
<body>
 <div>
    公司规模:<a href="/selects?p1=1&p2=2000000">小型</a> &nbsp; <a href="/selects?p1=2000001&p2=10000000">中型</a> &nbsp;<a href="/selects?p1=10000000&p2=2100000000">大型</a> &nbsp;<a href="/selects">全部</a><br>
   按类型:<a href="/selects?ctype=有限责任公司">有限公司</a> &nbsp; <a href="/selects?ctype=股份有限公司">股份公司</a> &nbsp;<a href="/selects?ctype=国有独资公司">国企</a> &nbsp;<a href="/selects?qt=有限责任公司&qt=股份有限公司&qt=国有独资公司">其他</a> &nbsp; <a href="/selects">全部</a>
 
 </div>


	<table>
		<tr>
			<td>公司名称</td>
			<td>营业执照号</td>
			<td>法人</td>
			<td>注册资金</td>
			<td>公司类型</td>
			<td>成立日期</td>
			<td>详情</td>
		</tr>

		<c:forEach items="${companys}" var="c">

			<tr>
				<td>${c.name }</td>
				<td>${c.registNo }</td>
				<td>${c.corporation }</td>
				<td>${c.capital }</td>
				<td>${c.type.name }</td>
				<td>${c.created }</td>
				<td>详情</td>

			</tr>

		</c:forEach>


	</table>
	${page }

</body>
</html>