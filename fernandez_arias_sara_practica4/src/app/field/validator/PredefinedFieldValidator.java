package app.field.validator;

public class PredefinedFieldValidator implements Validator {
	private String[] expected;
	public PredefinedFieldValidator(String...strings) {
	  this.expected=strings;
	}
	@Override
	public boolean validate(String text) {
	
		for (String string : expected) {
			if(string.equals(text)) {
				return true;
			}
		}
		return false;
	}

}
