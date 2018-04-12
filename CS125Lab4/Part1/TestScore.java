
class TestScore {
   private int scores[] = new int[3];
  
   public TestScore (int test[]) throws InvalidTestScore {
       for (int i=0;i<3;i++) {
           if (test[i]<0 || test[i]>100)
               throw new InvalidTestScore (test[i]);
           else
               scores[i]=test[i];
       }
       double avg = Average();
       System.out.println("Average is:"+Average());
       System.out.println("Letter Grade:" + lettergrade(avg));
       
   }
   public String lettergrade(double avg){
	
	String Lettergrade = null;
	if (avg >= 90 && avg <= 100){ // A range
		Lettergrade = "A";
	} 
	else if(avg >= 80 && avg <= 89){// B range
		Lettergrade = "B";
	}	
	else if(avg >= 70 && avg <= 79){ // C range
		Lettergrade = "C";
	}	
	else if(avg >= 60 && avg <= 69){// D range
		Lettergrade = "D";
	}	
	else if(avg >= 50 && avg <= 59){// F range
		Lettergrade = "F";
	}	
	else if(avg >= 1 && avg <= 49){// below F range
		Lettergrade = "F";
	}
	return Lettergrade;
   }
   public double Average() {
       int sum = 0;
       double avg;
       for(int i=0;i<3;i++) {
           sum += scores[i];
       }
       avg = sum / 3;
       return avg;
   }
}