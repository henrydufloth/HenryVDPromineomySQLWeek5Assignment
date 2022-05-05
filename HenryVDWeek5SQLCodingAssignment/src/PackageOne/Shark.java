package PackageOne;


public class Shark {
	
	private String name;
	
	public Shark(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String objectName = name;
		return objectName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
	
