//Sudhin Domala
//110475495
//CS 114
//Homework 6 
class Car{
	String VIN;
	String make;
	int year;
	Car(String VIN, String make, int year){
		this.VIN = VIN;
		this.make = make;
		this.year = year;;
	}
	public boolean equals(Car c){
		return VIN.equals(c.VIN);
	}
	public String getmake(){
		return make;
	}
}
class RepairTicket{
	String VIN;
	double cost;
	double newCost;
	String description;
	RepairTicket(String VIN, double cost, String description){
		this.VIN= VIN;
		this.cost= cost;
		this.description = description;
	}
	public boolean equals(RepairTicket r){
		return VIN.equals(r.VIN) && cost==r.cost && description.equals(r.description);
	}
	public double getcost(){
		return cost;
	}
	public String getVIN(){
		return VIN;
	}
	public double getnewCost(){
		return newCost;
	}
}

public class CarRepairShop {	
	int sum = 0;
	Car[] cars = new Car[100];
	RepairTicket[] tickets = new RepairTicket[100];
	int countCars = 0;
	int counttickets = 0;
	int totalrepairs = 0;
	public int addNewCar(String VIN, String make, int year){
		Car c = new Car(VIN, make,year);
		for(int i=1; i < countCars; i++)
			if(cars[i-1].equals(c))
				return -1;
		if (countCars==cars.length-1){
				Car[] temp = new Car[cars.length * 2];
				System.arraycopy(cars, 0, temp, 0, cars.length);
				
		}
		cars[countCars++] = c;
		return countCars;			
	}
	public int addRepairTicket(String VIN, double cost, String description){
		RepairTicket r = new RepairTicket(VIN, cost, description);
		
		boolean foundVIN =false;
		
		for (int i=0; i< countCars; i++){
			if (cars[i].VIN.equals(VIN))
				foundVIN = true;
		}
		if (foundVIN == false)
			return -1;
		
		tickets[counttickets++] = r;
		return counttickets;	
		}
	public double getRepairCost(int ticketNum){
		if (ticketNum > 0 && ticketNum <= counttickets)
			if (tickets[ticketNum -1] != null){
				return tickets[ticketNum - 1].getcost();
		}
			return -1;
	}
	
	public double getTotalRepairCosts(String VIN){
		int sum1= 0;
		
		for (int i=1; i <= counttickets; i++){
			if ( tickets[i-1] != null && tickets[i-1].VIN.equals(VIN)){
				sum1 += tickets[i-1].getcost();	
			}
		}
		return (sum1 > 0? sum1 :-1);
		
	}
	public String getWorstCarMake(){
		int[] countArray = new int[countCars];
		for (int i=0; i< countCars; i++){
			for (int j =1 ; j< counttickets; j++)
			if (cars[i].VIN.equals(tickets[j-1].getVIN())){
				countArray[i] += 1;
			}
		}
		int max = countArray[0];
		for (int i = 1; i < countArray.length; i++) {
		    if (countArray[i] > max) {
		      max = countArray[i];
		    }
		}
		for (int i = 0; i< countArray.length; i++){
			if (cars[i] != null);
				if (countArray[i] == max)
					return cars[i].getmake();
	}
		return null;
	}
	public boolean updateRepairCost (int ticketNum, double newCost){
		for (int i=1; i<counttickets; i++){
			if (tickets[i] != null){
				if (tickets[i].equals(ticketNum)){
					tickets[i-1].getnewCost();
				return true;
				}
			}
		}
		return false;	
	}
	public boolean deleteRepair(int ticketNum){
		if(tickets[ticketNum-1] != null){
			if (ticketNum <= counttickets)
				tickets[ticketNum - 1] = null;
			return true;
			}
			return false;
	}

	public boolean deleteAllRepairsForCar(String VIN){
		for (int i = 1; i< tickets.length; i++){
		if(tickets[i-1] != null)
			if(tickets[i-1].getVIN().equals(VIN)){
				tickets[i-1]= null;
				return true;
		}
		}
				return false;
	}
	public boolean deleteCarAndRepairs(String VIN){
		for (int i=1; i < tickets.length; i++){
			if(tickets[i-1] != null)
				if(tickets[i-1].getVIN().equals(VIN)){
					tickets[i-1]= null;
					cars[i-1] = null;
					return true;
			}
		}
			
					return false;
		}
	}

