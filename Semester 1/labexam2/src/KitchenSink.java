/* 
 * CST8116 Lab Exam 2 (21W) Starter Code
 * (c) 2021 Algonquin College All Rights Reserved
 */

/* Class KitchenSink, represents a kitchen sink */
public class KitchenSink {
	private String manufacturer;
	private String material; // steel, iron, plastic, porcelain etc
	private double capacity; // Liters
	
	/* 
	 * Sets manufacturer and material to empty strings, 
	 * capacity to 1
	 */
	public KitchenSink() {
		this("","",0.0);
	}
	
	/* Overloaded constructor */
	public KitchenSink(String  manufacturer, String material, double capacity) {
		setManufacturer(manufacturer);
		setMaterial(material);
		setCapacity(capacity);
	}
	
	/* accessor for manufacturer */
	public String getManufacturer() {
		return manufacturer;
	}

	/* mutator for manufacturer */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/* accessor for material */
	public String getMaterial() {
		return material;
	}

	/* mutator for material */
	public void setMaterial(String material) {
		this.material = material;
	}

	/* accessor for capacity */
	public double getCapacity() {
		return capacity;
	}

	/* mutator for capacity */
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	/* creates a report with class name and field details */
	public String createReport() {
		String format = "KitchenSink: manufacturer %s, material %s, capacity %.2f";
		return String.format(format, getManufacturer(), getMaterial(), getCapacity());
	}
}
