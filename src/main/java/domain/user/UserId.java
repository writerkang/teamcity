package domain.user;

public record UserId(String value) {

    public UserId(String value) {
        if (value == null || value.strip().isEmpty()) {
            throw new IllegalArgumentException(value);
        }

        this.value = value.strip();
    }
}
