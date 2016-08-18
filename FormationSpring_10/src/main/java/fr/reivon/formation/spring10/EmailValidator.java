package fr.reivon.formation.spring10;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class EmailValidator implements Validator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean supports(Class<?> aClass) {
        return String.class.equals(aClass);
    }

    public void validate(Object target, Errors errors) {
        String email = (String) target;

        matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            errors.rejectValue("email", "pattern.email");
        }
    }
}
