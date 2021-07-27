package com.phoenix.rest.hello;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/download")
public class DownloadService {

	@GET
	@Path("/textfile")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTextFile() {
		
		File file = new File("C:\\Users\\Admin\\Desktop\\hello.txt");
		return  Response.ok(file)
				.header("Content-Disposition","attachment; file_name='greeting.txt'")
				.build();
				
	}
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getPdfFile() {
		
		File file = new File("C:\\Users\\Admin\\Desktop\\8th IT material\\2180711 PP syllabus.pdf");
		return  Response.ok(file)
				.header("Content-Disposition","attachment; file_name='syllabus.pdf'")
				.build();
				
	}
	@GET
	@Path("/photo")
	@Produces("image/jpg")
	public Response getImage() {
		
		File file = new File("C:\\Users\\Admin\\Desktop\\bva.jpg");
		return  Response.ok(file)
				.header("Content-Disposition","attachment; file_name='logo.jpg'")
				.build();
				
	}
}//End of class
