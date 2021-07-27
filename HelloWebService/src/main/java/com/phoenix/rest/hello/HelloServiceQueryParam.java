package com.phoenix.rest.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloquery")
public class HelloServiceQueryParam {

	// Greet user returns String using PathParam
	@GET
	@Path("/greet")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@QueryParam("nm") String name) {
		return "Hello "+name;
	}
	//Greet user returns String using response
	@GET
	@Path("/user")
	@Produces(MediaType.TEXT_HTML)
	public Response greetUserWithResponse(@QueryParam("nm") String name) {
		return  Response.status(200)
				.entity("<html>"+
			            "<body>"+
						"<h1>Hello user: "+name+"<h1>"+
			            "</body>"+
			            "</html>")
				.build();
				
	}
	//Returns date with Response
	@GET
	@Path("/date")
	@Produces(MediaType.TEXT_HTML)
	public Response getDate(@QueryParam("yy") int year,@QueryParam("mm") int month,@QueryParam("dd") int day) {
		return   Response.status(200)
				.entity("<html>"+
			            "<body>"+
						"<h1>Date is: "+LocalDate.of(year,month,day)+"</h1>"+
			            "</body>"+
			            "</html>")
				.build();
	}	
}//End of class

