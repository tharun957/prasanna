package com.rakesh.springboot.firstwebapp.validate;

import org.springframework.stereotype.Component;

@Component
public class Validateuser {

    public boolean Check( String name) {
    	return name.equalsIgnoreCase("rakesh");
    }

	
}
