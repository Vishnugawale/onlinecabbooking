package com.cab.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passengerfuctionality {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Name;
private int seatNo;
private String Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getSeatNo() {
	return seatNo;
}
public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "Passengerfuctionality [id=" + id + ", Name=" + Name + ", seatNo=" + seatNo + ", Address=" + Address + "]";
}

}
