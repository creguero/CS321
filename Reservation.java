public class Reservation{
  private int reservationID;
  private int status;
  private int startDate;
  private int endDate;
  private int roomType;
  private int numOccupants;
  private boolean guaranteed;
  private int roomNumber;
  private int customerID;

  //Constructor
  
  public Reservation(){
    this.reservationID = -1;
    this.status = -1;
    this.startDate = -1;
    this.endDate = -1;
    this.roomType = -1;
    this.numOccupants = -1;
    this.guaranteed = false;
    this.roomNumber = -1;
    this.customerID = -1;
      
  }

  //Setters
  
  public void setReservationID(int reservationID){
    this.reservationID = reservationID;
  }
  
  public void setStatus(int status){
    this.status = status;
  }
  
  public void setStartDate(int startDate){
    this.startDate = startDate;
  }
  
  public void setEndDate(int endDate){
    this.endDate = endDate;
  }
  
  public void setRoomType(int roomType){
    this.roomType = roomType;
  }
  
  public void setNumOccupants(int numOccupants){
    this.numOccupants = numOccupants;
  }
  
  public void setGuaranteed(boolean guaranteed){
    this.guaranteed = guaranteed;
  }
  
  public void setRoomNumber(int roomNumber){
    this.roomNumber = roomNumber;
  }
  
  public void setCustomerID(int customerID){
    this.customerID = customerID;
  }

  //Getters
  
  public int getReservationID(){
    return this.reservationID;
  }
  
  public int getStatus(){
    return this.status;
  }
  
  public int getStartDate(){
    return this.startDate;
  }
  
  public int getEndDate(){
    return this.endDate;
  }
  
  public int getRoomType(){
    return this.roomType;
  }
  
  public int getNumOccupants(){
    return this.numOccupants;
  }
  
  public boolean getGuaranteed(){
    return this.guaranteed;
  }
  
  public int getRoomNumber(){
    return this.roomNumber;
  }
  
  public int getCustomerID(){
    return this.customerID;
  }
}
