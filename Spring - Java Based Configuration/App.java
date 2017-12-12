package spring_JBC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfig.class);
		
		POJO myUser = ctx.getBean(POJO.class);
		myUser.setName("Satya Prakash Nandy");
		myUser.setEmail("webprakashsatya@gmail.com");
		myUser.setCountry("India");
		ctx.close();
		
		System.out.println(myUser);
	}
}
