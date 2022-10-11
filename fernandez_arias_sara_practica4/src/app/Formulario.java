package app;
import java.util.*;

import app.field.Campo;

public class Formulario {
	public void addCampo(Campo campo) {
		campos.add(campo);
	}

	public void pideDatos() {
		for (Campo campo : campos) {
			campo.pideDato();
			System.out.println(campo.getValor());
		}
	}

	private List<Campo> campos = new ArrayList<Campo>();
}
