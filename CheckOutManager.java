public class CheckOutManager{
  public double checkOut(Calendar c1,String[] instructions){
    Customer cus = Framework.getCustomerByName(instructions[0]);
    int id = cus.getCustomerID();
    Reservation r = Framework.getReservationByCID(id);
    r.setStatus(3);
    int roomType = r.getRoomType();
    double roomCost;
    if(roomType == 1){
    roomCost = Framework.SINGLE_RATE*(r.getEndDate()-r.getStartDate());
    return roomCost;
    }
    roomCost = Framework.DOUBLE_RATE*(r.getEndDate()-r.getStartDate());
    return roomCost;
  }
}