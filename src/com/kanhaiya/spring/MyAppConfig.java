package com.kanhaiya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

	@Bean
public MyColor getMyColor()
{
	return new RedColor();
}

}
