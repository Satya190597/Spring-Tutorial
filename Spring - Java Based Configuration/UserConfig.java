package spring_JBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig 
{
	@Bean
	public POJO user()
	{
		return new POJO();
	}
}
