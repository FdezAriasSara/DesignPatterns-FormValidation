import java.io.*;

public class CampoNumero extends AbstractField{

	private String etiqueta;

	public CampoNumero(String etiqueta) {
		super(etiqueta);
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();

				for (char ch : texto.toCharArray()) {
					if (!Character.isDigit(ch)) {
						valido = false;
						break;
					}
				}
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}

	public String getValor() {
		return texto;
	}

	private String texto;
}
