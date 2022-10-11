package app.field;
import java.io.*;

import app.field.validator.Validator;

public class CampoNumero implements Campo {

	private String etiqueta;
	private String texto;
	private Validator validator;
	public CampoNumero(String etiqueta) {
		this.etiqueta=etiqueta;
	}
	public CampoNumero(String etiqueta,Validator validator) {
		this(etiqueta);
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


}
