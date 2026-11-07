package Tx.com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	private String name;
	private String email;
	private short age;
	private long mobNo;
	private String addrress;
	private char gender;
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public String getAddrress() {
		return addrress;
	}
	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
