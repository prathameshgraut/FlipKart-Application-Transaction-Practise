package Tx.com.DTO;

public class bookingDTO {
	
	private String userName;
	private String userEmail;
	private short userAge;
	private long userMobNo;
	private String userAddrress;
	private char userGender;
	
	private double paymentAmount;
	
	private String productName;
	private short productQuantity;
	private float productPrice;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public short getUserAge() {
		return userAge;
	}
	public void setUserAge(short userAge) {
		this.userAge = userAge;
	}
	public long getUserMobNo() {
		return userMobNo;
	}
	public void setUserMobNo(long userMobNo) {
		this.userMobNo = userMobNo;
	}
	public String getUserAddrress() {
		return userAddrress;
	}
	public void setUserAddrress(String userAddrress) {
		this.userAddrress = userAddrress;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public short getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(short productQuantity) {
		this.productQuantity = productQuantity;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
}
