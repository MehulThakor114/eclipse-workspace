package com.phoenix.rest.hello;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/hello")
public class HelloService {

	// Plain hello Method
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		return "Hello";
	}
	//Html page
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		return "<html>"+
	            "<body>"+
				"<h1>this is html page<h1>"+
	            "</body>"+
	            "</html>";
	}
	//Xml page
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return  "<text>"+
	            "<info>"+
				"<h1>this is XML page<h1>"+
	            "</info>"+
	            "</text>";
	}	
}//End Of Class