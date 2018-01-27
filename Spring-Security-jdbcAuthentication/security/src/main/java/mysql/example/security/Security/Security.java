package mysql.example.security.Security;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter
{
	@Autowired
	DataSource datasource;
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.authorizeRequests()
		.antMatchers("/private/*").hasRole("USER")
		.antMatchers("/admin/*").hasRole("ADMIN")
		.and()
		.formLogin();
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.jdbcAuthentication().dataSource(datasource)
		.usersByUsernameQuery("SELECT username,password,enabled FROM Login WHERE username=?")
		.authoritiesByUsernameQuery("SELECT username,role FROM Roles WHERE username=?");
	}
}
