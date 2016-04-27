
public class Calendar {
	private int date = 1;
	private int singles[] = new int[31];
	private int doubles[] = new int[31];
	
	Calendar(){
		
	}
	
	public int getDate(){
		return date;
	}
	
	public int dayChange(){
		date++;
		return date;
	}
	
	public void setDate(int newDate){
		date = newDate;
	}
	
	public static boolean checkAvailability(int checkDate, int roomType){
		if(roomType == 1){
			if(singles[checkDate]<NUM_SINGLE_ROOMS){
				return true;
			}
			return false;
		}
		else{
			if(doubles[checkDate]<NUM_DOUBLE_ROOMS){
				return true;
			}
			return false;
		}
	}
	
	public void incrementSingles(int checkDate){
		singles[checkDate]++;
	}
	
	public void decrementSingles(int checkDate){
		singles[checkDate]--;
	}
	
	public void incrementDoubles(int checkDate){
		doubles[checkDate]++;
	}
	
	public void decrementDoubles(int checkDate){
		doubles[checkDate]--;
	}
	
}
