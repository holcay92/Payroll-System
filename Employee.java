package PayrollProject;

//Employee abstract superclass.
	public abstract class Employee {
		private String firstName;
		private String lastName;
		private String socialSecurityNumber;

// three-argument constructor
		public Employee( String first, String last, String ssn )
		{
				firstName = first;
					lastName = last;
						socialSecurityNumber = ssn;
		} 
		public void setFirstName( String first ){
			firstName = first;
		} 
		public String getFirstName(){
				return firstName;
		} 
		public void setLastName( String last ){
			lastName = last;
		} 
		public String getLastName()
{
   return lastName;
}
public void setSocialSecurityNumber( String ssn )
{
   socialSecurityNumber = ssn; 
} 

public String getSocialSecurityNumber()
{
   return socialSecurityNumber;
} 

public String toString()
{
   return String.format( "%s %s\nsocial security number: %s",
      getFirstName(), getLastName(), getSocialSecurityNumber() );
}

// abstract method overridden by subclasses
public abstract double earnings(); 
} 


/**************************************************************************
* (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/
