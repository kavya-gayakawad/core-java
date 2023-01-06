package xworkz.com.stream.str;

import com.sun.jdi.Type;

public class WeaponDTO {
	private String name;
	private String madeBy;
	private String madeOn;
	private int price;
	private Type type;
	

	
	public WeaponDTO(String name, String madeBy, String madeOn, int price,Type type ) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price+ ", type=" +type +"]";
	}

	@Override
	public int hashCode() {
	
		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals methods");
		if(obj != null) {
			if(obj instanceof WeaponDTO) {
				
				WeaponDTO  dto = (WeaponDTO)obj;
				
				if(dto.name.equals(this.name)) {
					return true;
				}
			}
		}
		return false;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMadeBy() {
		return madeBy;
	}


	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}


	public String getMadeOn() {
		return madeOn;
	}


	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	

}
