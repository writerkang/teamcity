package domain.user;

import java.util.Optional;

public interface UserRepository {
    public void save(User user);
    public User findBy(UserId id);
    public Optional<User> findBy(UserName name);
}
