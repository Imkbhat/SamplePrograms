public class DogClonable implements Cloneable {
	
	private String dogName;
	public DogClonable (String dogName) {
		this.dogName = dogName;
	}
	public String getDogName() {
		return dogName;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (DogClonable)super.clone();
	}
	
	public static void main(String[] args) {
		DogClonable dc = new DogClonable("Tommy");
			try {
				DogClonable dc2 = (DogClonable) dc.clone();
				System.out.println(dc2.getDogName());
			} catch(CloneNotSupportedException ex) {
				ex.printStackTrace();
			}
	}

}

//Output: Tommy
