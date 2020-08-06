package com.lti.resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
@Path("/hello")
public class HelloResource {
	@GET
	public String hello(@QueryParam("name") String name) {
		return "Hello" + name;
	}
}
