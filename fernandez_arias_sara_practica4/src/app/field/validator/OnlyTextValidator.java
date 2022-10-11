package app.field.validator;

public class OnlyTextValidator implements Validator {

	@Override
	public boolean validate(String text) {
		for (char ch : text.toCharArray()) {
			if (!Character.isLetter(ch)) {
			return false;
			}
		}
		return true;
	}

}
