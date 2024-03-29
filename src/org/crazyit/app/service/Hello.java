package org.crazyit.app.service;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2018, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public interface Hello
{
	// 定义一个deleteUser方法，模拟应用中删除用户的方法
	void deleteUser(Integer id);
	// 定义一个addUser()方法，模拟应用中添加用户的方法
	int addUser(String name, String pass);
}
