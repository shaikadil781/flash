
public class Method1 {

	public static void main(String[] args) {

		swear(3, 10);
		System.out.println("************");
		swear(10, 20);
		System.out.println("************");
		swear(3, 10);

	}

	public static void swear(int i, int j) {
		while (i <= j) {
			System.out.println(i);
			i++;
		}

	}

}

