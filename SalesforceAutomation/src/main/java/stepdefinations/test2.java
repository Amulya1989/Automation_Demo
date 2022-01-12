package stepdefinations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 System.out.println("Time With Date "+date);
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
	}

}
