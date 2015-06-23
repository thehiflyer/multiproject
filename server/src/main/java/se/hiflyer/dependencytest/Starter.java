package se.hiflyer.dependencytest;

public class Starter {

	public static void main(String[] args) {
		Transformer transformer = new Transformer();

		int transform = transformer.transform(3);
		System.out.println(transform);

		ExtraStuff extraStuff = new ExtraStuff();

		String stringTransform = extraStuff.transform("hallo!");
		System.out.println(stringTransform);
	}
}
