<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="javaBean" scope="request" class="com.phoenix.web.models.LoginBean" />  
<jsp:setProperty name="javaBean" property="username"/>
<jsp:setProperty name="javaBean" property="password"  param="passwd" />  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Controller</title>
</head>
<body>
<% 
   if(javaBean.isValid())
   {%>
	   <jsp:forward page="/welcome.jsp"/>
 <%  }else{ %>
       <h2 style="color:red">Invalid Login</h2>
 	   <jsp:include page="/login.html"/>
 <% }   
%>
</body>
</html>