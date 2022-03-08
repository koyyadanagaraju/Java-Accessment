
public class StringJoiner {

	public static void main(String[] args) {
		String name = "Nagaraj";
		System.out.println("Koyada " + "Nagaraj");
		System.out.println("Hi " + 1);
		System.out.println(10 + "1");
		System.out.println(1 + 2 + "3");
		System.out.println(name.equals("nagaraj"));
		System.out.println(name.equalsIgnoreCase("nagaRaj"));
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf("a"));
		System.out.println(name.replace("a", "koyada"));
	}

}
