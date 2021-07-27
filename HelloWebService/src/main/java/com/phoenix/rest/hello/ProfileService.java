package com.phoenix.rest.hello;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/profile")
public class ProfileService {

	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_HTML)
	public Response addProfile(@QueryParam("name") String name,@QueryParam("age") int age,@QueryParam("city") String city) {
		return  Response.status(200)
				.entity("<html>"+
						"<body>"+
						"<h1>Profile is created: </h1><br>"+
						"<p>Name: "+name+"</p>"+
						"<p>Age: "+age+"</p>"+
						"<p>City: "+city+"</p>"+
			            "</body>"+
			            "</html>")
				.build();
	}
}//End of Class
