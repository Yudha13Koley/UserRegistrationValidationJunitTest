package UserRegistrationJunitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	private static final String EmailPattern="(^[a-zA-Z0-9]+)"+"([. + _ -]?[a-zA-Z0-9]*)"+"[^. + _ -]@[a-zA-Z0-9]+"+"(\\.[a-zA-Z]{2,4})"+"(\\.[a-zA-Z]{2})?";
	public EmailValidation() {

	}
	public boolean Validate(String email) {
		Pattern pattern=Pattern.compile(EmailPattern);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
	}
}
