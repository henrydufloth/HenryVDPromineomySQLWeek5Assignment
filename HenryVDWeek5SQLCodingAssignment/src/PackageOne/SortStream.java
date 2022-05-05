package PackageOne;

import java.util.stream.Collectors;

public class SortStream {
	public static void main(String[] args) {
		stream();
	}

	private static void stream() {
		String orderedNames = getNames();
		System.out.println(orderedNames);
	}
	
	private static String getNames() {
		return Animal.getAnimals().stream()
				.map(name -> new String(name.toString()))
				.sorted()
				.collect(Collectors.joining(", "));
	}
}
