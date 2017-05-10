package domain.Guitar;

public class Guitar {
    int serialNumber;
	private String builder,model,type,backwood,topwood;
    private double price;


public Guitar(int serialNumber,double price,String builder,String model,String type,String backwood,String topwood){
	this.serialNumber=serialNumber;
	this.price=price;
	this.builder=builder;
	this.model=model;
	this.type=type;
	this.backwood=backwood;
	this.topwood=topwood;
}
public Guitar() {
	// TODO Auto-generated constructor stub
}

public int getSerialNumber() {
	return serialNumber;
}


public void setSerialNumber(int serialNumber) {
	this.serialNumber = serialNumber;
}


public String getBuilder() {
	return builder;
}


public void setBuilder(String builder) {
	this.builder = builder;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public String getBackwood() {
	return backwood;
}


public void setBackwood(String backwood) {
	this.backwood = backwood;
}


public String getTopwood() {
	return topwood;
}


public void setTopwood(String topwood) {
	this.topwood = topwood;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}

}