package project3Package;

public class Date212 implements Comparable<Date212> {


	public int year;
	public int month;
	public int day;
		
	public class IllegalDate212Exception extends IllegalArgumentException //Create a custom IllegalArgumentException to handle Date212 objects which dont make sense
	{
	    public IllegalDate212Exception(String message) 
	    {
	        super(message);
	    }
	
	}
		
		public Date212(String date) // Break the string into 3 parts to separate the year, month, and day for comparisons
		{
			try 
			{
				String temp;		
			
				temp = date.substring(0,4);
				int Year= Integer.parseInt(temp);
			
				temp = date.substring(4,6);
				int Month = Integer.parseInt(temp);
		
				temp = date.substring(6,8);
				int Day = Integer.parseInt(temp);
			
				Date212(Year,Month,Day);
			}	
		
				catch (IllegalDate212Exception e) 
				{
		
					System.err.println("Error: " + date + " Is not valid a date");
					
				
				}
				
			}


			public void validDate(int year, int month, int day) throws IllegalDate212Exception //Method which is called before adding the Dates to the array lists, it ensures dates make sense.
			{	        	        
				if ((year+month+day) == 8 || month > 12 || month < 1 || day > 31 || day < 1) 
				{
					throw new IllegalDate212Exception("Invalid date: " + year + "/" + month + "/" + day);
				}
			}
		
		
			public void Date212(int year, int month, int day)
			{
	
				this.year = year;
				this.month = month;
				this.day = day;
			
			}
			
				public int getYear()
				{
					return year;
				}
					    
					public int getMonth()
					{
						return month;
					}
					    
						public int getDay()
						{
							return day;
						}

						public int compareTo(Date212 other) //Compares specific dates in a Date212 object, starting from years to months, to days. If the current year is greater than a different year it returns a psoitive 1.Less than returns a -1. Equal = move to the next case, months or days. Equals returns 0 
						{
						    if (this.year != other.year) {
						        //System.out.println(Integer.compare(this.year, other.year));
						    	return Integer.compare(this.year, other.year);
						    }
						    if (this.month != other.month) {
						    	//System.out.println(Integer.compare(this.month, other.month));
						    	return Integer.compare(this.month, other.month);
						    }
						    return Integer.compare(this.day, other.day);
						} //The returned values from this method can be used to sort the date values by letting the program know which date is greater than a different date.
						 	
							        	public String toString() //Create a new toString method to set up the dates in the form YYYY//MM/DD, that way, the dates look readable instead of having them be displayed as address locations
							        	{
							        		String returnString =  Integer.toString(year) + "/" +  Integer.toString(month) + "/" + Integer.toString(day);
							        		return returnString;
							        	}
						    						




}