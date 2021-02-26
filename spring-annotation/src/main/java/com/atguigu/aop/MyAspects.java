package com.atguigu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspects {

	
	@Before("execution(* com.atguigu.aop.MathCalculator.* (..))")
	public void log() {
		System.out.println("MyAspects");
		
	}
}
