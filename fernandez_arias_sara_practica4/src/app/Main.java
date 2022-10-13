package app;

import app.field.Field;
import app.field.validator.AndValidator;
import app.field.validator.LengthValidator;
import app.field.validator.OnlyDigitsValidator;
import app.field.validator.OnlyTextValidator;
import app.field.validator.PredefinedFieldValidator;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Field("Nombre", new OnlyTextValidator()));
		formulario.addCampo(new Field("Apellido", new OnlyDigitsValidator()));
		formulario.addCampo(new Field("Telefono", new AndValidator(new OnlyDigitsValidator(), new LengthValidator())));
		formulario.addCampo(new Field("Ciudad", new PredefinedFieldValidator("Santander", "Oviedo", "Cadiz")));
		

		formulario.pideDatos();
	}
}
