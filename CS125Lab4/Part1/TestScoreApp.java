import java.util.Scanner;
class TestScoreApp {
   public static void main (String args[]) throws Exception {
       Scanner kb = new Scanner (System.in);
       int array[] = new int[3];
       System.out.println("Please Enter TestScores");
       for(int i=0;i<3;i++)
           array[i]=kb.nextInt();
       try
       {
           TestScore t1 = new TestScore(array);
       }
       catch (InvalidTestScore e)
       {
           System.out.println(e.getMessage());
   }
       
       System.exit(0);
}
}


