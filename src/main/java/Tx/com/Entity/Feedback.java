package Tx.com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private short id;
	private String feedback;
	private short rating;
	private short userId;
	
	
	
	public Short getUserId() {
		return userId;
	}
	public void setUserId(Short userId) {
		this.userId = userId;
	}
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public short getRating() {
		return rating;
	}
	public void setRating(short rating) {
		this.rating = rating;
	}
}
