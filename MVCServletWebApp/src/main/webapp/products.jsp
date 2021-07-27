<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop</title>
</head>
<body>
 <jsp:include page="/header.html"/>
  <%
    HttpSession session= request.getSession(false);
     %>
     <% if(session!=null)
     {	 
   String username = (String)session.getAttribute("uname"); 
  %>
  <h2>welcome <%=username%></h2>
  <h3>you can buy products of your choice....</h3>
   <jsp:include page="/footer.html"/> 
  <% }else{ %>
   <h3>sorry! there is no any session.....</h3> 
	 <%} %>
</body>
</html>