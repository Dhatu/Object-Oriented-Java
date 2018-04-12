class Invalidentry extends Exception { // exception class
   public Invalidentry (double userMiles, double userGallon) { //parameters
       super("Error:Numbers cannot be less than 0 or be character/symbols"); //message for reason of error
   }
}

