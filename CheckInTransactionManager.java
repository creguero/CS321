public class CheckInTransactionManager{
  
  private int singleRoomNumber = 1;
  private int doubleRoomNumber = 1;
  private Customer cus;
  
  public void initialize(String[] input){
    Customer customer = Framework.getCustomerByName(input[1]);
    if (input.length>2){
      customer.setCCType(input[2]);
      customer.setCCExpiration(input[3]);
      customer.setCCNumber(input[4]);
    }
    Framework.modifyCustomer(customer.getCustomerID(), customer);
    cus = customer;
  }
  
  public boolean proxyValidate(){
    BankingSystemProxy temp = new BankingSystemProxy();
    boolean validated = temp.validateCard(cus.getCCNumber());
    temp.validateCard(cus.getCCNumber());
    return validated;
  }
  
  public void assignRoom(){
    Reservation reservation = Framework.getReservationByCID(cus.getCustomerID());
    if (reservation.getRoomType()==1){
      if (singleRoomNumber <= Framework.NUM_SINGLE_ROOMS){
        reservation.setRoomNumber(singleRoomNumber);
        singleRoomNumber++;
      }
    }
    else if (reservation.getRoomType()==2){
      if (doubleRoomNumber <= Framework.NUM_DOUBLE_ROOMS){
        reservation.setRoomNumber(doubleRoomNumber);
      }
    }
  }
  
  public void updateCardInfo(String ccType, String ccNumber, String ccExpiration){
    cus.setCCType(ccType);
    cus.setCCNumber(ccNumber);
    cus.setCCExpiration(ccExpiration);
  }
  
  public boolean changeEndDate(Reservation reservation, int newEndDate){
    for(int i = reservation.getStartDate(); i<=newEndDate; i++){
      if(Calendar.checkAvailability(i, reservation.getRoomType()) == false){
        return false;
      }
    }
    reservation.setEndDate(newEndDate);
    return true;
  }
}