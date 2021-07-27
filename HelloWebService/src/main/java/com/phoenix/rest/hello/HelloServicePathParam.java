package com.phoenix.rest.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloparam")
public class HelloServicePathParam {

	// Greet user returns String using PathParam
	@GET
	@Path("/{nm}")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@PathParam("nm") String name) {
		return "Hello "+name;
	}
	//Greet user returns String using response
	@GET
	@Path("/user/{nm}")
	@Produces(MediaType.TEXT_HTML)
	public Response greetUserWithResponse(@PathParam("nm") String name) {
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
	@Path("/date/{dd}/{mm}/{yy}")
	@Produces(MediaType.TEXT_HTML)
	public Response getDate(@PathParam("dd") int day,@PathParam("mm") int month,@PathParam("yy") int year) {
		return   Response.status(200)
				.entity("<html>"+
			            "<body>"+
						"<h1>Date is: "+LocalDate.of(day,month,year)+"</h1>"+
			            "</body>"+
			            "</html>")
				.build();
	}	
}//End of class
