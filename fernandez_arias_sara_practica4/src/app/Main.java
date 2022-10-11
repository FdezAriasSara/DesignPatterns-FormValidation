package app;

import app.field.CampoNumero;
import app.field.CampoPredefinido;
import app.field.CampoTexto;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new CampoTexto("Nombre"));
		formulario.addCampo(new CampoTexto("Apellido"));
		formulario.addCampo(new CampoNumero("Telefono"));
		formulario.addCampo(new CampoPredefinido("Ciudad", "Santander", "Oviedo", "Cadiz"));
		

		formulario.pideDatos();
	}
}
