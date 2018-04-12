package TestScore_2;

public class TestScore2 {
	// Create Test score fields
	private int testscore1;
	private int testscore2;
	private int testscore3;
	// constructor for the input of 3 scores in methods
	public TestScore2( int testscore1, int testscore2, int testscore3){
		this.testscore1 = testscore1;
		this.testscore2 = testscore2;
		this.testscore3 = testscore3;
	}
	// constructor to make a object to refer to
    public TestScore2() {
		
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
