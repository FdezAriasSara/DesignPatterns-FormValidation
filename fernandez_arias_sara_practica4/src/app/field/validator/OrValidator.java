package app.field.validator;

public class OrValidator implements Validator {
	private Validator[] validators;
	public OrValidator(Validator...validators ) {
		this.validators=validators;
	}
	@Override
	public boolean validate(String text) {
		for (Validator validator : validators) {
			if(validator.validate(text))
				return true;
			
		}
		return false;
	}

}
