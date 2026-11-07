package Tx.com.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	private double amount;
	
	@CreationTimestamp
	private LocalDate orderDate;
	@CreationTimestamp
	private LocalDateTime orderTime;
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short paymentId;
	private short userId;
	
	//Relational Mapping
//	@ManyToMany
//	@JoinColumn(name = "user_id")
//	private User user;
//
//	@ManyToMany
//	@JoinColumn(name = "product_id")
//	private Product product;
	
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}

	
	
	
	public short getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(short paymentId) {
		this.paymentId = paymentId;
	}
	public short getUserId() {
		return userId;
	}
	public void setUserId(short userId) {
		this.userId = userId;
	}
	public short getId() {
		return id;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user; 
//	}
	public void setId(short id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDateTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
}
