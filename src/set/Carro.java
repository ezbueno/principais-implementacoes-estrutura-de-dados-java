package set;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

	private String marca;

	public Carro(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(this.marca, other.marca);
	}

	@Override
	public String toString() {
		return "Carro [marca=" + this.marca + "]";
	}

	@Override
	public int compareTo(Carro carro) {
		return this.getMarca().compareTo(carro.getMarca());
	}
}
