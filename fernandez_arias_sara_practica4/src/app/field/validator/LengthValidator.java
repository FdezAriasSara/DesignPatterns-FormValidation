package app.field.validator;

public class LengthValidator implements Validator {

	private int maximum;
	private int minimum;

	public LengthValidator(int maximum,int minimum) {
		this.maximum=maximum;
		this.minimum=minimum;
	}
	
	@Override
	public boolean validate(String text) {
		
		return text.length()>=minimum && text.length()<=maximum;
	}

}
