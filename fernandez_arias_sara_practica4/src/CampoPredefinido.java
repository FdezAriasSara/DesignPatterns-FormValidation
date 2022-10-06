import java.io.*;

public class CampoPredefinido extends AbstractField {

	private String etiqueta;
	private String[] valores;

	public CampoPredefinido(String etiqueta, String... valores) {
		super(etiqueta);
		this.valores = valores;
	}

	@Override
	public void pideDato() {

		boolean valido;
		do {
			valido = false;

			super.pideDato();
			for (String valor : valores) {
				if (getValor().toLowerCase().equals(valor.toLowerCase())) {
					valido = true;
					break;
				}
			}

		} while (!valido);
	}

}
