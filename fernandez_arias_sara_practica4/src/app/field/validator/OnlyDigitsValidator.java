package app.field.validator;

public class OnlyDigitsValidator implements Validator {

	@Override
	public boolean validate(String text) {
		for (char ch : text.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
