class InvalidTestScore extends Exception {
   public InvalidTestScore (int n) {
       super("Error:Number cannot be less than 0 and greater than 100 i.e " +n);
   }
}

