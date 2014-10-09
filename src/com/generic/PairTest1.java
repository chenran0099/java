package com.generic;

public class PairTest1 {

	public static void main(String[] args) {

		String[] words = { "wo", "shi", "da", "sha", "bi" };

		Pair<String> pair = ArrayAlg.minmax(words);

		System.out.println("min : " + pair.getFirst());
		System.out.println("max : " + pair.getSecond());

		String middle = ArrayAlg.<String> getMiddle(words);

		System.out.println("middle : " + middle);
		
	}
}

class ArrayAlg {

	public static Pair<String> minmax(String[] a) {

		if (a == null || a.length == 0) {
			return null;
		}

		String max = a[0];
		String min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) {
				min = a[i];
			}

			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}

		return new Pair<String>(min, max);
	}

	// 泛型方法 (泛型可以不再泛型类中定义,可以在普通类中定义)

	public static <T> T getMiddle(T[] a) {

		return a[a.length / 2];
	}

}
