package com.vamsi.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service("PrimeService")
@Path("/prime")
public class PrimeService 
{
	@GET
	@Path("/{number}")
	@Produces("text/plain")
	public boolean isPrime(@PathParam("number")int number)
	{
		System.out.println("Returning result....");
		return true;
	}
}
