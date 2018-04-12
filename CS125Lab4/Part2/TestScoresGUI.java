import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TestScoresGUI extends JFrame{


   private JLabel  firsttest, secondtest, thirdtest, averageL, lettergradeL;
   private JTextField  woneTF, wtwoTF, wthreeTF, averageTF, lettergradeTF;
   private JButton clearB,calculateB,exitB;
   private CalculateButtonHandler cbHandler;
   private ExitButtonHandler ebHandler;
   private ClearButtonHandler  clHandler;
   private static final int WIDTH =600;
   private static final int HEIGHT=400;
   public TestScoresGUI()
   // LABELS FOR THE GUI//
   {
	  firsttest=new JLabel("Test score #1:",SwingConstants.RIGHT);
	  secondtest=new JLabel ("Test score #2:" ,SwingConstants.RIGHT);
	  thirdtest=new JLabel ("Test score #3:",SwingConstants.RIGHT);
      averageL=new JLabel ("Test score average:" ,SwingConstants.RIGHT);
      lettergradeL = new JLabel ("Test score Letter:" ,SwingConstants.RIGHT);
      
    //USER INPUT TEXT FIELDS//
      
      woneTF= new JTextField(5);
      wtwoTF= new JTextField(5);
      wthreeTF= new JTextField(5);
      averageTF= new JTextField(5);
      lettergradeTF= new JTextField(5);
    //TO CREATE A CTA BUTTON TO GET THE AVERAGE//
      calculateB= new JButton("Submit");
      cbHandler=new CalculateButtonHandler();
      clHandler= new ClearButtonHandler();
      calculateB.addActionListener(cbHandler);
    //THE FOLLOWING WILL PROVIDE AN EXIT BUTTON TO EXIT THE WINDOW//
      exitB=new JButton("Exit Program");
      clearB = new JButton("Clear");
      clHandler = new ClearButtonHandler();
      clearB.addActionListener(clHandler);
      ebHandler=new ExitButtonHandler();
      exitB.addActionListener(ebHandler);
      
      setTitle ("Weighted Average Test Scores");
      
      Container pane = getContentPane();
      
      pane.setLayout(new GridLayout(7,3));
      
     
      
      pane.add (firsttest);
      pane.add (woneTF);
      
      pane.add (secondtest);
      pane.add (wtwoTF);
      
      pane.add (thirdtest);
      pane.add (wthreeTF);
       
    
      
      pane.add (averageL);
      pane.add (averageTF);
     
      pane.add (lettergradeL);
      pane.add (lettergradeTF);
      
      pane.add (calculateB);
     
      pane.add (exitB);
      pane.add (clearB);
      
      setSize(WIDTH,HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }
   public class ClearButtonHandler implements ActionListener{
	      public void actionPerformed(ActionEvent e){
	    	  woneTF.setText("");
	 			wtwoTF.setText("");
	 			wthreeTF.setText("");
	 			averageTF.setText("");
	 			lettergradeTF.setText("");
	      }
   }
      
   public class CalculateButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent e){
         double  fristtest, secondtest,  thirdtest, ave;
         DecimalFormat twoDigits=new DecimalFormat("0.00");
         fristtest=Double.parseDouble(woneTF.getText());
         secondtest=Double.parseDouble (wtwoTF.getText());
         thirdtest=Double.parseDouble (wthreeTF.getText());
         ave=(fristtest+secondtest+thirdtest)/(3);
         averageTF.setText (twoDigits.format(ave).toString());
         String lettergrad  = null;
         
 		if (ave >= 90 && ave <= 100){ // A range
 			lettergrad  = "A";
 		} 
 		else if(ave >= 80 && ave <= 89){// B range
 			lettergrad  = "B";
 		}	
 		else if(ave >= 70 && ave <= 79){ // C range
 			lettergrad  = "C";
 		}	
 		else if(ave >= 60 && ave <= 69){// D range
 			lettergrad  = "D";
 		}	
 		else if(ave >= 50 && ave <= 59){// F range
 			lettergrad  = "F";
 		}	
 		else if(ave >= 1 && ave <= 49){// below F range
 			lettergrad  = "F";
 		}
 		lettergradeTF.setText(lettergrad);
		
      }
   }
   private class ExitButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent e){
            System.exit(0);
      }
            
            
   }
// Create Test score fields
	private int testscore1;
	private int testscore2;
	private int testscore3;
	// constructor for the input of 3 scores in methods
	public void TestScoresGUI( int testscore1, int testscore2, int testscore3){
		this.testscore1 = testscore1;
		this.testscore2 = testscore2;
		this.testscore3 = testscore3;
	}
    // 3 access methods to set ones from different classes
	public double getScore1() {
        return testscore1;
    }

    public double getScore2() {
        return testscore2;
    }

    public double getScore3() {
        return testscore3;
    }
    //3 mutator methods to set ones from different classes
    public void setScore1(int score) {
		testscore1 = score;
    }

    public void setScore2(int score) {
    	testscore2 = score;
    }

    public void setScore3(int score) {
    	testscore3 = score;
    }
    // access method for average of the 3 scores
    public double getAvgScore() {
        return (testscore1 + testscore2 + testscore3) / 3;
    }
    // access method for average letter grade of the 3
public String getGrade(double avg) {
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

                    
}