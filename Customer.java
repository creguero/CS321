
public class Customer {
	private int customerID;
	private String name;
	private String address;
	private String ccType;
	private String ccNumber;
	private String ccExpiration;
	
	Customer(){
		customerID = -1;
		name = null;
		address = null;
		ccType = null;
		ccNumber = null;
		ccExpiration = null;
	}
	
	public void setCustomerID(int id){
		customerID = id;
	}
	
	public void setName(String nname){
		name = nname;
	}
	
	public void setAddress(String naddress){
		address = naddress;
	}
	
	public void setCCType(String nccType){
		ccType = nccType;
	}
	
	public void setCCNumber(String nccNumber){
		ccNumber = nccNumber;
	}
	
	public void setCCExpiration(String nccExpiration){
		ccExpiration = nccExpiration;
	}
	
	public int getCustomerID(){
		return customerID;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCCType(){
		return ccType;
	}
	
	public String getCCNumber(){
		return ccNumber;
	}
	
	public String getCCExpiration(){
		return ccExpiration;
	}
}
