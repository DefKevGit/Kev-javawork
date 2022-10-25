package com.qa.demo.persistence.domain;

public class PersonDTO {

    private Long id;

    private String name;

    //private int age; // age is kept secret

      public PersonDTO() 
      {
         super();    
      }
    
    

	public PersonDTO(Person person)
	{
		super();
		this.id = person.getId();
		this.name = person.getName();
		//this.age = person.getAge();// don't want to display age [see above]	
	}



	public Long getId()
	{
		return id;
	}



	public void setId(Long id)
	{
		this.id = id;
	}



	public String getName()
	{
		return name;
	}



	public void setName(String name)
	{
		this.name = name;
	}



//	public int getAge()
//	{
//		return age;
//	}
//
//
//
//	public void setAge(int age)
//	{
//		this.age = age;
//	}



	
    
}