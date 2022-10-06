import java.io.*;

public class CampoTexto extends AbstractField {

	//private String etiqueta;

	//private String texto;
	public CampoTexto(String etiqueta) {
		super(etiqueta);
	}
	@Override
	public void pideDato() {
		

		boolean valido;
		do {
			valido = true;
				super.pideDato();
				for (char ch : getValor().toCharArray()) {
					if (!Character.isLetter(ch)) {
						valido = false;
						break;
					}
				}
			
		} while (!valido);
	}

	
}
