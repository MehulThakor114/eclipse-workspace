<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.phoenix.data.Product"%>
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
  <%
  List<Product> products = (List<Product>)session.getAttribute("product");
   %>
   <table border = 1px style="margin:auto;width:30%">
   <tr style = 'padding:5px'>
      <th>ProductId</th>
      <th>Name</th>
       <th>Brand</th>
        <th>Price</th>
   </tr>
   <% for(Product p:products) { %>
   <tr style = 'padding:5px' >
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getBrand() %></td>
        <td><%= p.getPrice() %></td>
   </tr>
   <%} %>
   </table>
   <jsp:include page="/footer.html"/> 
  <% }
  else { %>
   <h3>sorry! there is no any session.....</h3> 
	 <% } %>
</body>
</html>