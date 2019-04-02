<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form action="${pageContext.request.contextPath }/servlet/AlipayServlet" method="post">
		WIDout_trade_no:<input type="text" name="WIDout_trade_no"><br/>
		WIDtotal_amount:<input type="text" name="WIDtotal_amount"><br/>
		WIDsubject:<input type="text" name="WIDsubject"><br/>
		WIDbody:<input type="text" name="WIDbody"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>