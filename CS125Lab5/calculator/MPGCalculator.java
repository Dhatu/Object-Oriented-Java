import javax.swing.JOptionPane; //used for GUI 

public class MPGCalculator { //sub class
	  
	   public MPGCalculator (double userMiles , double userGallons) throws Invalidentry { 
		   //parameters and thrown exception after input conditions not met
	      
	           if ( userMiles<0 || userGallons<0) // find negative values of the inputs
	           
	               throw new Invalidentry(userMiles,userGallons);//throw exception	
	           
	           
	           }
	   }
	   

