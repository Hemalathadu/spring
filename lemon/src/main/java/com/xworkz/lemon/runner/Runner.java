package com.xworkz.lemon.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.lemon.dto.LemonBean;

public class Runner {
	public static void main(String args[]) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		LemonBean bean=context.getBean(LemonBean.class);
		bean.maataMantra();
		
		System.out.println(Arrays.toString(bean.getLocation()));
	}

}
