package lee;

import org.springframework.context.*;
import org.springframework.context.support.*;

import org.crazyit.app.service.*;

import java.util.Arrays;

public class BeanTest
{
	public static void main(String[] args)
	{
		// 创建Spring容器
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		/*Hello hello = ctx.getBean("hello" , Hello.class);
		hello.addUser("孙悟空" , "7788");
		hello.deleteUser(1);
		World world = ctx.getBean("world" , World.class);
		world.bar();*/
		// 获取Spring 容器中的所有Bean实例的名称
		System.out.println("------"+ Arrays.toString(ctx.getBeanDefinitionNames()));

	}
}