package com.diaz.malambo.object;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
  
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "student")
public class Student implements Serializable {
  
    private static final long serialVersionUID = 1L;
  
    @XmlAttribute(name = "id")
    private int id;
  
    @XmlElement(name = "firstName")
    private String firstName;
  
    @XmlElement(name = "lastName")
    private String lastName;
    
    @XmlElement(name = "age")
    private int age;
    
    public Student() 
    {
	  	    
	  
	}
	  	    
	 public Student(String fname, String lname, int age, int id) 
	 {
	  
           this.firstName = fname;
  
           this.lastName = lname;
  
           this.age = age;
  
           this.id = id;
  
   }
	 
	 public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
//		@Override
//		public String toString()
//		{
//			StringBuffer buffer	=	new StringBuffer();
//			buffer.append(" Primer Nombre:  ").append(this.lastName);
//			buffer.append(" Segundo Nombre: ").append(this.firstName);
//			buffer.append(" Edad: ").append(this.age);
//			
//			return  buffer.toString();			
//		}
	 

}
