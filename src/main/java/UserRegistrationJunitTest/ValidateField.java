package UserRegistrationJunitTest;

import java.util.regex.Pattern;

@FunctionalInterface
public interface ValidateField {
	boolean isValid(String str,Pattern p);
}
