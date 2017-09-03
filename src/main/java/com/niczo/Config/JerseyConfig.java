package com.niczo.Config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Des:
 * Author:LiNic
 * Date:2017/9/2
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        register()
    }
}
