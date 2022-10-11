package app.field;
import java.io.*;

import app.field.validator.Validator;

public class CampoTexto implements Campo {

	private String etiqueta;
	private Validator validator;

	public CampoTexto(String etiqueta) {
		this.etiqueta = etiqueta;
	
	}
	public CampoTexto(String etiqueta,Validator validator) {
		this.validator=validator;
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();
				if(validator!=null) {
					valido=validator.validate(texto);
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