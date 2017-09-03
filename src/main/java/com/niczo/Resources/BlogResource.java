package com.niczo.Resources;

import com.niczo.Entity.BlogInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Des:
 * Author:LiNic
 * Date:2017/9/2
 */
@Path("blog")
public class BlogResource {

    @Path("{id}")
    @GET
    public BlogInfo blogInfo(int id){
        return new BlogInfo();
    }
}
