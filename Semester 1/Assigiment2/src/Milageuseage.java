

public class Milageuseage {
	
	private double distance;
	private double fuelefficiency;
	private int fueleperkm=100;
	
	public Milageuseage(){
		
	}
	
	

	public double getdistance() {
		
		return distance;
	}
	
	public double getfuelefficie() {
		
		return fuelefficiency;
	}
	
	public void setcar(double distance,double fuelefficiency) {
		this.distance=distance;
		this.fuelefficiency=fuelefficiency;
	}
	
	public void caculateefficncy() {
		
		
		
		double result=distance/(fueleperkm/fuelefficiency);
		result=Math.ceil(result);
		System.out.println("The estimate amount fuel needed for the trip is: "+result);
		
		
	}
}
