package equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro("Ford"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("Volkswagen"));

		System.out.println(carros.contains(new Carro("Ford")));
		System.out.println(new Carro("Ford").hashCode());
		System.out.println(new Carro("Ford1").hashCode());

		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Chevrolet");

		System.out.println(carro1.equals(carro2));
	}
}