import java.io.*;
import java.util.*;

public class HotelReservationCoordinator{
  MakeReservationManager res = new MakeReservationManager();
  CheckInManager cin = new CheckInManager();
  CheckOutManager cout = new CheckOutManager();
  Calendar c1 = new Calendar();
  BankingSystemProxy bnk = new BankingSystemProxy();
  
  public static void main(String [] args){
    try {
      Framework.init(filename);
    }
    catch (IOException e) {
      return;
    }
    while (Framework.hasNextInstruction()) {
      String[] instructionData = Framework.nextInstruction();
      int instruction = Integer.parseInt(instructionData[0]);
      String[] instructions2 = Arrays.copyOfRange(instructionData, 1, instructionData.length);
      executeInstruction(instruction, instruction2);
    }
  }
  public void executeInstruction(int instruction, String[] instructions2){
    switch (instruction) {
      case 1:  
        res.initialize(instructions2);
        Framework.storeReservation(res);        
        break;
      case 2:  
        cin.checkIn(c1,instructions2);
        break;
      case 3:  
        double bill = cout.checkOut(c1,instructions2);
        if(bnk.chargeCustomer(bill,r)){
          System.out.println("Customer Charged");
        }else{
          System.out.println("Card failed");
        }
        break;
      case 5:  
        c1.setDate(c1.getDate()++);
        break;
      default: 
        break;
    }  
  }
}