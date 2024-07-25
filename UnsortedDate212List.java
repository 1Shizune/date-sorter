package project3Package;

import java.util.ArrayList;

public class UnsortedDate212List extends Date212List { //adds to the Date212List class an unsorted method
	
	private ArrayList<Date212> arrayList1;
	
	public UnsortedDate212List()
	{
		super();
		arrayList1 = new ArrayList<>();
	}
			
			public void append(Date212 date) //Adds the dates into the ArrayList, without an order, first date in, last date out
	    	{
				arrayList1.add(date);
	    	}	
			
				public int getLength()
				{
					return length; 
				}
	
					/*public Date212 get(int index1) //returns a specified Date from the ArrayList 
					{
						return arrayList1.get(index1);
					}
					*/
						public ArrayList<Date212> getArrayList() 
						{
							return arrayList1;
						}
					
						public String toString() { //rewrite the toString method to pass on to UnsortedDate212List and SortedDate212List class, outputs the values of the dates which are turned to strings and are concatenated. The elements that form a Date212 object, Year,Month,Day.
					        StringBuilder result = new StringBuilder();
					        for (Date212 date : arrayList1) 
					        {
					        	result.append(date).append("\n"); //Turns a the multiple objects in Date212, appends them and converts them into a single, readable string.
					        }
					        return result.toString();
					    }
						
						
					


}		
