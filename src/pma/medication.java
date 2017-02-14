package pma;

public class medication {
	
	private String pharmaceuticalCompany;
	private String name;
	private float strength;
	private String barcode;
	private int numTablets;
	
	public medication(String pharma,String n,float streng, String bar, int num){
		initialize(pharma,n,streng,bar,num);
	}
	
	public void initialize(String pharma,String n,float streng, String bar, int num){
		pharmaceuticalCompany = pharma;
		name = n;
		strength = streng;
		barcode = bar;
		numTablets = num;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCompany(){
		return pharmaceuticalCompany;
	}
	
	public float getStrength(){
		return strength;
	}
	
	public String getBarcode(){
		return barcode;
	}
	
	public int getNumTablets(){
		return numTablets;
	}
}
