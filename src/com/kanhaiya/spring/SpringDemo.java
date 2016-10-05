package com.kanhaiya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
MyColor color=(MyColor)context.getBean(RedColor.class);
color.printColor();
	}

}
 