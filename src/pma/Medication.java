package pma;

public class Medication {
	
	private String pharmaceuticalCompany;
	private String name;
	private double strength;
	private String barcode;
	private int numTablets;
	private int dailyDosage;
	
	public Medication(String pharma,String n,double streng, String bar, int num, int dos){
		initialize(pharma,n,streng,bar,num, dos);
	}
	
	public void initialize(String pharma,String n,double streng, String bar, int num, int dos){
		pharmaceuticalCompany = pharma;
		name = n;
		strength = streng;
		barcode = bar;
		numTablets = num;
		dailyDosage = dos;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCompany(){
		return pharmaceuticalCompany;
	}
	
	public double getStrength(){
		return strength;
	}
	
	public String getBarcode(){
		return barcode;
	}
	
	public int getNumTablets(){
		return numTablets;
	}
	
	public int getDailyDosage(){
		return dailyDosage;
	}
	
	public int getWeeklyDosage(){
		return dailyDosage*7;
	}

	@Override
	public String toString() {
		return "Medication [name=" + name + "]";
	}
}
