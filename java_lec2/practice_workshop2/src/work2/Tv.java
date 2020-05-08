package work2;

public class Tv {
 
	private String name;
	private int price;
	private String descript;
	
	
	public Tv() {	
	}

	
	public Tv(String name, int price, String descript) {
		super();
		this.name = name;
		this.price = price;
		this.descript = descript;
	}



	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public String getDescript() {
		return descript;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setDescript(String descript) {
		this.descript = descript;
	}


	@Override
	public String toString() {
		return name +"\t"+price+"\t"+descript;
	}
	
    
	
}
