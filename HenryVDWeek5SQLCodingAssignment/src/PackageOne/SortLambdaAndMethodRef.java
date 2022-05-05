package PackageOne;

import java.util.Comparator;
import java.util.List;

public class SortLambdaAndMethodRef {
	public static void main(String[] args) {
		
		lambdaSort();
		System.out.println("-----------------------");
		methodRefSort();
		
	}
	
	public static void lambdaSort() {
		List<Animal> animals = Animal.getAnimals();
		Comparator<Animal> compar = (a1, a2) -> Animal.compare(a1, a2);
		animals.sort(compar);
		System.out.println("LAMBDA");
		animals.forEach(animal -> System.out.println(animal.toString()));
	}
	
	public static void methodRefSort() {
		List<Animal> animals = Animal.getAnimals();
		Comparator<Animal> compar = Animal::compare;
		animals.sort(compar);
		System.out.println("METHOD REFERENCE");
		animals.forEach(animal -> System.out.println(animal.toString()));
	}
}
