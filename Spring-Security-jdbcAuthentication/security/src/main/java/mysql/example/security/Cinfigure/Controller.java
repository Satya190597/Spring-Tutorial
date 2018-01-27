package mysql.example.security.Cinfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller 
{
	@RequestMapping(value = "/guest/{name}")
	public String getPublicAccount(@PathVariable String name)
	{
		return "Welcome To GUEST MENU : "+name;
	}
	@RequestMapping(value = "/private/{name}")
	public String getPrivateAccount(@PathVariable String name)
	{
		//Object principal = SecurityContextHolder.getContext().getAuthentication().getName();
		return "Welcome To PRIVATE MENU : "+name;
	}
	@RequestMapping(value = "/admin/{name}")
	public String getAdminAccount(@PathVariable String name)
	{
		//Object principal = SecurityContextHolder.getContext().getAuthentication().getName();
		return "Welcome To ADMIN MENU : "+name;
	}
	@Bean(name="datasource")
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource driverDataManager = new DriverManagerDataSource();
		driverDataManager.setDriverClassName("com.mysql.jdbc.Driver");
		driverDataManager.setUrl("jdbc:mysql://localhost:3306/satya");
		driverDataManager.setUsername("root");
		return driverDataManager;
	}
}
