package PackageOne;

import java.util.ArrayList;
import java.util.List;


public class Animal {
	
	private String name;
	static List<Animal> animals = new ArrayList<>(List.of(
			new Animal("Monkey"), new Animal("Cat"), new Animal("Hippo"), new Animal("Snail")));
	
	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String objectName = name + " Animal";
		return objectName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int compare(Animal a1, Animal a2) {
		return a1.name.compareTo(a2.name);
	}
	
	public static List<Animal> getAnimals() {
		return animals;
	}
}
