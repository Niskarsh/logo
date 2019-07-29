package com.logo.logo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.logo.logo.Logo;

import java.io.IOException;
import java.util.List;
import com.logo.logo.Graphics;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("logo")
public class MyResource{
	
	

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Graphics[] getIt(String src) {
        return Logo.run(src.substring(src.indexOf(':')+2,src.lastIndexOf('\"')));
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return "hi";
    }

}
