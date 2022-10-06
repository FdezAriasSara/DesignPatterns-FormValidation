import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractField implements Campo {
	private String texto;
	private String etiqueta;

	public AbstractField(String etiqueta) {
		this.etiqueta=etiqueta;
	}
	@Override
	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print(etiqueta + ": ");
			texto = consola.readLine();

		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

	@Override
	public String getValor() {

		return texto;
	}
	

}
