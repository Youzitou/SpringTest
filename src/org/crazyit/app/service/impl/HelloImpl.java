package org.crazyit.app.service.impl;
import org.crazyit.app.service.Hello;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloImpl implements Hello
{
	// 定义一个deleteUser方法，模拟应用中删除用户的方法
	public void deleteUser(Integer id)
	{
		System.out.println("执行Hello组件的deleteUser删除用户：" + id);
	}
	// 定义一个addUser()方法，模拟应用中的添加用户的方法
	public int addUser(String name , String pass)
	{
		System.out.println("执行Hello组件的addUser添加用户：" + name);
		return 20;
	}
}
