package project3Package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedDate212List extends Date212List{	 //adds a sorting method to Date212List
		
	private ArrayList<Date212> arrayList2; //ArrayList of Date212 objects
	
	public SortedDate212List()
	{
		super();
		arrayList2 = new ArrayList<>();
	}

			public void insert(Date212 date) //insert method adds dates into the ArrayList and sorts them using Collections sort
			{				
				//System.out.println("Inserting date: " + date);
				arrayList2.add(date);				
				Collections.sort(arrayList2);
				//System.out.println("Sorted arrayList2: " + arrayList2);
			}
			
											
				public int getLength() 
				{
					return arrayList2.size();
				}

					/*public Date212 get(int index2) //While searching for a specific value, use get to retrieve it 
					{
						return arrayList2.get(index2);
					}
					*/
						public ArrayList<Date212> getArrayList()
						{
							return arrayList2;
						}

						
						@Override
						    public String toString() { //toString method, appends the objects that make a Date212 and turns it into a single string.
						        StringBuilder result = new StringBuilder();
						        for (Date212 date : arrayList2) {
						            result.append(date).append("\n");
						        }
						        return result.toString();
						    }
						
						
}
