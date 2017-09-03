package com.niczo.Resources;

import com.niczo.Entity.BlogInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Des:
 * Author:LiNic
 * Date:2017/9/2
 */
@Component
@Path("blog")
public class BlogResource {

    @Path("{id}")
    @GET
    public BlogInfo blogInfo(int id){
        return new BlogInfo();
    }

    @GET
    @Produces("text/plain")
    public String test(){
        return "This is a Test";
    }
}
