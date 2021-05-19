package domain.user;

import java.util.Objects;

public class User {
    private final UserId id;
    private UserName name;

    private User(UserId id, UserName name) {
        this.id = id;
        this.name = name;
    }

    public static User create(UserId id, UserName name) {
        return new User(id, name);
    }

    public UserId id() {
        return this.id;
    }

    public UserName name() {
        return this.name;
    }

    public void changeName(UserName newName) {
        this.name = newName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
