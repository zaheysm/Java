
public class KitchenClass {
	
	private String manufacturer;
	private String material;
	private double capacity;
	
	
	
	public KitchenClass(){
		
	}
	public KitchenClass(String manufacturer,String material,double capacity){
		this.manufacturer=manufacturer;
		this.material=material;
		this.capacity=capacity;
	}
	
	
	public String getmanufacturer() {
		
		return manufacturer;
	}
	
	public String getmaterial() {
		
		return material;
	}
	
	public double getcapacity() {
		return capacity;
	}
	
	public void setKitchensupply(String manufacturer,String material,double capacity) {
		this.manufacturer=manufacturer;
		this.material=material;
		this.capacity=capacity;
	}
	
	
	public void printkithcen() {
		
		System.out.println("manufacturer :"+manufacturer);
		System.out.println("material :"+material);
		System.out.println("capacity (L):"+capacity);
	}
	
	

}
