package PackageOne;


import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDao {
	

	public static void main(String[] args) {
		Shark shark = new Shark("Great White");
		
		sharkCheck(fullOptional(shark), shark);
		sharkCheck(emptyOptional(), shark);
		
	}
	
	public static Optional<Shark> fullOptional(Shark shark) {
		Optional<Shark> fullOptional = Optional.of(shark);
		return fullOptional;
	}
	public static Optional<Shark> emptyOptional() {
		Optional<Shark> emptyOptional = Optional.empty();
		return emptyOptional;
		
	}

	
	private static void sharkCheck(Optional<Shark> sharkOptional, Shark shark) {

		try {
			System.out.println("There is a " + sharkMethod(sharkOptional, shark) + "! Get in the boat!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	
	}
	
	private static Shark sharkMethod(Optional<Shark> sharkOptional, Shark shark) {
		return sharkOptional
				.orElseThrow(() -> new NoSuchElementException("I don't see any " + shark + "s."));
	}
	

}
