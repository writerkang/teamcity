package domain.user;

public record UserName(String firstName, String lastName) {

    public UserName(String firstName, String lastName) {
        if (firstName == null || firstName.strip().length() < 3) {
            throw new IllegalArgumentException();
        }
        if (lastName == null || lastName.strip().length() < 3) {
            throw new IllegalArgumentException();
        }

        this.firstName = firstName.strip();
        this.lastName = lastName.strip();
    }
}
