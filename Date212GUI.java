package project3Package;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Date212GUI extends Project3 {

	static JFrame myFrame; //Set GUI to display the dates
	static TextArea leftSide, rightSide, text;
        
       
		public static void initialize() {
		myFrame = new JFrame();
		myFrame.setSize(500, 500);
		myFrame.setLocation(100, 100);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1, 2));
		myFrame.setTitle("Sorted and Unsorted Dates");
		leftSide = new TextArea();
		rightSide = new TextArea();
		myFrame.getContentPane().add(leftSide);
		myFrame.getContentPane().add(rightSide);
		myFrame.setVisible(true);
		JMenuBar menubar = new JMenuBar();
		myFrame.setJMenuBar(menubar);
		JMenu file = new JMenu("File");
		menubar.add(file);
		JMenuItem exit = new JMenuItem("Exit The Program");
		file.add(exit);
		JMenuItem open = new JMenuItem("Open New File");
		file.add(open);
		
			class exitAction implements ActionListener
			{
				
				public void actionPerformed(ActionEvent e) 
				{
					System.exit(0); 
				}	
			}
		
				exit.addActionListener(new exitAction()); 
		
					class openAction implements ActionListener //Define the menu item "open" to have it open a file directory and display .txt files in a new GUI
					{

						public void actionPerformed(ActionEvent e)
						{
							JFileChooser j = new JFileChooser();
							int response = j.showSaveDialog(null);
							if(response == JFileChooser.APPROVE_OPTION)				
							{
								myFrame = new JFrame();
								myFrame.setSize(500, 500);
								myFrame.setLocation(100, 100);
								myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								myFrame.setLayout(new GridLayout(0,1));
								myFrame.setTitle("File Contents");
								text = new TextArea();					
								myFrame.getContentPane().add(text);					
								myFrame.setVisible(true);
					
					
					
								File file = new File(j.getSelectedFile().getAbsolutePath());
								try 
								{
									Scanner scan = new Scanner(file);
									String line;       
									while(scan.hasNextLine())
									{			                                                   			                			                										
										line = scan.next();   
										text.append("\n" + line);
									}
							
							
					
								} 
									catch (FileNotFoundException e1) 
									{						
										System.out.println("File Not Found");
									}
					
										System.out.println(file);
							}
						}
				
					}
	
			open.addActionListener(new openAction());
				
		}
		

}