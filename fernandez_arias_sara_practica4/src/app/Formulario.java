package app;
import java.util.*;

import app.field.Field;

public class Formulario {
	public void addCampo(Field field) {
		fields.add(field);
	}

	public void pideDatos() {
		for (Field field : fields) {
			field.pideDato();
			System.out.println(field.getContent());
		}
	}

	private List<Field> fields = new ArrayList<>();
}
