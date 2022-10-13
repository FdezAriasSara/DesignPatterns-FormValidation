package app.field;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import app.field.validator.Validator;

public class Field {
	private Validator validator;
	private String tag;
	private String content;
	public Field(String tag,Validator validator) {
		this.validator=validator;
		this.tag=tag;
	}
	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(tag+ ": ");
				content= consola.readLine();
				if(validator!=null) {
					valido=validator.validate(content);
				}
				
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	
	}
public String getContent() {
		return content;
	}
}
