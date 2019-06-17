package org.crazyit.app.aspect;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;
// 定义一个切面
@Aspect
public class AuthAspect
{
	// 匹配org.crazyit.app.service.impl包下所有类的、
	// 所有方法的执行作为切入点
	@Before("execution(* org.crazyit.app.service.impl.*.*(..))")
	public void authority()
	{
		System.out.println("模拟执行权限检查");
	}
}

