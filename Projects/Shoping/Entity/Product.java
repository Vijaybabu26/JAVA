package Shoping.Entity;

public class Product {
	private int Product_Id;
	private String Product_Name;
	private double Product_Price;
	private int Admin_Id;
	
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public double getProduct_Price() {
		return Product_Price;
	}
	public void setProduct_Price(double product_Price) {
		Product_Price = product_Price;
	}
	public int getAdmin_Id() {
		return Admin_Id;
	}
	public void setAdmin_Id(int admin_Id) {
		Admin_Id = admin_Id;
	}
	
	
}
