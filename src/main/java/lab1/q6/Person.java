package lab1.q6;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String socialInsuranceNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public void setSocialInsuranceNumber(String socialInsuranceNumber) {
        this.socialInsuranceNumber = socialInsuranceNumber;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + '\t'  + socialInsuranceNumber;
    }
}
