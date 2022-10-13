package app.field.validator;

import java.util.List;

public class PredefinedFieldValidator implements Validator {
	private List<String> expected;
	public PredefinedFieldValidator(List<String> expected) {
		this.expected=expected;
	}
	public PredefinedFieldValidator(String...strings) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean validate(String text) {
	
		return expected.contains(text);
	}

}
