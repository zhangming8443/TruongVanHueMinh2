package ss19.excercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private final static String CLASS_NAME_REGEX = "^[ACP]\\d{4}[GHIK]";

    public ValidateClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
