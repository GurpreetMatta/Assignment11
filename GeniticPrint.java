public class GeniticPrint {

	public static <E> void GeniticPrint(E[] inputArray) {

		for (E element : inputArray)
			System.out.printf("%s ", element);

		System.out.println();
	}

	public static void main(String args[]) {

		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		GeniticPrint(integerArray);
		System.out.println("\nArray doubleArray contains:");
		GeniticPrint(doubleArray);
		System.out.println("\nArray characterArray contains:");
		GeniticPrint(characterArray);
	}
}
