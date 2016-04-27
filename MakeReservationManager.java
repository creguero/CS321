
public class MakeReservationManager {

	//private int customerNumber = 0;
	
	public void initialize(String[] input){
		Customer cus = new Customer();
		Reservation res = new Reservation();
		
		cus.setName(input[0]);
		cus.setAddress(input[1]);
		res.setStartDate(input[2]);
		res.setEndDate(input[3]);
		res.setRoomType(input[4]);
		res.setNumOccupants(input[5]);
		res.setGuaranteed(input[6]);
		
		if(input[6] == "1"){
			cus.setCCType(input[7]);
			cus.setCCNumber(input[8]);
			cus.setCCExpiration(input[9]);
		}
			
		int customerID = Framework.storeCustomer(cus);
		
		int resID = Framework.storeReservation(res);
		//customerNumber++;
	}
	
	public boolean confirmRoomAvailability(int startDate, int endDate, int roomType){
		
		for(int i = startDate; i<=endDate; i++){
			if(Calendar.checkAvailability(i, roomType) == false){
				return false;
			}
		}
		return true;
	}

}
