package spring_JBC;

public class POJO 
{
	private String name,country,email;

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	@Override
	public String toString() 
	{
		return "POJO [name=" + name + ", country=" + country + ", email=" + email + "]";
	}
	
}
