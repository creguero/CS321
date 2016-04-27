public class BankingSystemProxy{
  public boolean chargeCustomer(double amount, Reservation r){
    Customer cus = Framework.getCustomerbyCID(r.getCustomerID());
    if(validateCard(cus.getCCNumber(),cus.getCCExpiration())){
      return true;
    }else{
      return false;
    }
  }
  
  public boolean validateCard(String ccNumber, String ccExpiration){
    if(ccNumber.length > 10 && ccExpiration.length < 6){
      return true;
    }
    return false;
  }
}