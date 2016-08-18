package fr.reivon.formation.spring10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class StudentValidator implements Validator {

    @Autowired
    EmailValidator emailValidator;

    public boolean supports(Class<?> aClass) {
        return Student.class.equals(aClass);
    }

    public void validate(Object target, Errors errors) {
        Student student = (Student) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "studentForm.name.NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "studentForm.email.NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "studentForm.id.NotEmpty");

        if (student.getAge() != null) {
            try {
            if (Integer.parseInt(student.getAge()) < 12) {
                errors.rejectValue("age", "studentForm.age.tooyoung");
            }}
            catch (NumberFormatException nfe) {
                errors.rejectValue("age", "studentForm.age.notANumber");
            }
        }

        ValidationUtils.invokeValidator(this.emailValidator, student.getEmail(), errors);
    }
}
