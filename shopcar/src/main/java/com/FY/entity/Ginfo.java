package com.FY.entity;

public class Ginfo {
	private int id;
	private String name;
	private int typeid;
	private int price;
	private int store;
	private Gtype gtype;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStore() {
		return store;
	}
	public void setStore(int store) {
		this.store = store;
	}
	public Gtype getGtype() {
		return gtype;
	}
	public void setGtype(Gtype gtype) {
		this.gtype = gtype;
	}
	

}
