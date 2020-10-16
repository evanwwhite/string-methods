//Evan White

//DIRECTIONS:  WRITE JAVA CODE IN EACH OF THE FOLLOWING 10 INSTRUCTIONS.  
//SOME STATEMENTS WILL PRINT TO THE SCREEN, OTHERS WILL NOT (instructions 1-4 do not include print statements).
//PASTE THE OUTPUT UNDERNEATH YOUR SOURCE CODE.


import java.util.Calendar;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		System.out.println(Calendar.getInstance().getTime());
		
		
		//1.TODO:  Declare a String variable and assign it your first name.  A good variable name would be "firstName".
		String firstName = "Evan";
				
		//2.TODO:  Declare a String variable and assign it your last name.
		String lastName = "White";
		
		//3. TODO:  Concatenate the firstName and lastName into another variable --> String fullName.  Be sure to concatenate 
		//   a space between the two names.
		String fullName = firstName + " " + lastName;
		
		//4. TODO:  Use a String method that returns the length() of fullName.  Since the .length(() method returns 
		//   an int, be sure to assign the value to an int variable.
		int length = fullName.length();
		
		//5. TODO:  Use println statements to print your fullName (from #3) and the length (from #4).
		System.out.println(fullName + " " + length );
		
		//6. TODO:  Write a java statement using the .contains() method to print if your fullName contains the letter "n".  
		//   Remember, either a true or false can be returned.
		System.out.println(fullName.contains("n"));
		
		//7. TODO:  Write a java statement using the .indexOf() method.  What is the index of the first occurrence of 'a'?  
		//   Remember, if your fullName does not have an 'a', it will return -1.
		System.out.println(fullName.indexOf("a"));
		
		//8. TODO:  Write a java statement that prints your fullName in all upper case letters.
		System.out.println(fullName.toUpperCase());
		
		//9. TODO:  Write a java statement that uses the .substring method to print the first 3 characters of your fullName.
		System.out.println(fullName.substring(0,3));
		
		//10. TODO:  Write a java statement that uses the .charAt() method to print the character at position 2.
		System.out.println(fullName.charAt(2));
		
	}
}

/*
Mon Sep 21 13:43:41 CDT 2020
Evan White 10
true
2
EVAN WHITE
Eva
a
*/
		