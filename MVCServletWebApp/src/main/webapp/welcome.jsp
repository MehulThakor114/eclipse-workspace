<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.phoenix.web.models.LoginBean" %>
<%-- <jsp:useBean id="javaBean" scope="request" class="com.phoenix.web.models.LoginBean" /> --%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body style="background-color:DarkCyan">
<% LoginBean bean =(LoginBean)request.getAttribute("object"); %>
  <jsp:include page="/header.html"/>
  <h2 style="background-color:white">Your welcome <%=bean.getUsername()%></h2>
  <% request.getSession(true);
     session.setAttribute("uname", bean.getUsername());
     session.setMaxInactiveInterval(10);
     int stime=session.getMaxInactiveInterval();
  %>
  <h3>session will be closed in <%=stime%> second </h3>
  <%
  String EncodedUrl = response.encodeURL("products.jsp");
  %>
  <p style='font-size:25px'>To buy products of your choice <p><a href='<%=EncodedUrl%>'>Click here</a>
   <jsp:include page="/footer.html"/>

</body>
</html>