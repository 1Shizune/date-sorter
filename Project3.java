package project3Package;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project3 {
    	

	// create two ArrayLists to separate sorted and unsorted dates
	
	public static void main(String[] args) throws FileNotFoundException {  
    	
		UnsortedDate212List ArrayList1 = new UnsortedDate212List();
	    SortedDate212List ArrayList2 = new SortedDate212List();
	    
    		
        	File file;
        	Scanner scan;                  
            file = new File("C:\\Users\\Persi\\OneDrive\\Documents\\P1input.txt");
            scan = new Scanner(file);
            System.out.println("In format YYYY/MM//DD");
            String hey = new String(); 
            hey = "hey";
            
            while(scan.hasNextLine()) // String tokenizer to place the strings in an ordered form for as long as the file has lines, also splits the multiple dates in one line from the text file input
            {
                String line = scan.nextLine();                                           
                StringTokenizer token = new StringTokenizer(line,",");
                
                
                
                
                while (token.hasMoreTokens()) {
                    String date = token.nextToken();
                    
                    try {
                        	                  		
                    		String temp = date.substring(0, 4); //break the string into a year, month, and day for the ValidDate method argument which makes sure the date format and its values make sense
                        	int year = Integer.parseInt(temp);

                        	temp = date.substring(4, 6);
                        	int month = Integer.parseInt(temp);

                        	temp = date.substring(6, 8);
                        	int day = Integer.parseInt(temp);

                        	
                        	Date212 date212Instance = new Date212(date); //create new Date212 to bypass the Non-static method call in the static main method
                        	date212Instance.validDate(year, month, day); //Call validDate method and handle the exception if thrown

                        	
                        	Date212 dates = new Date212(date); // If validation succeeds, create Date212 object and add to ArrayLists
                        	//System.out.println(ArrayList2.toString());
                        	//System.out.println(ArrayList1.toString());                       	
                        	ArrayList1.append(dates);                       	                        	
                        	ArrayList2.insert(dates);
                    	} 
                   
                    	catch (Date212.IllegalDate212Exception e) // Exception which Separates invalid dates from the Sorted and Unsorted lists of dates and only prints it to the console
                    	{
                    		
                    		System.out.println(date.substring(0, 4) + "\\" + date.substring(4, 6) + "\\" + date.substring(6, 8) + "\\" + "is not a valid date");
                    	}
                }
        
                
            }
            
            Date212GUI.initialize(); // call the GUI class from Date212GUI   
            Date212GUI.leftSide.append("Appended Unsorted Dates" + "\n");
        	Date212GUI.leftSide.append("\n");
        	Date212GUI.leftSide.append(ArrayList1.toString());        
        	Date212GUI.rightSide.append("Inserted Sorted Dates" + "\n");
        	Date212GUI.rightSide.append("\n");
        	Date212GUI.rightSide.append(ArrayList2.toString());      
            
	}
        
                
            
        	

        }

	
   