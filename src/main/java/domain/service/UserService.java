package domain.service;

import domain.user.UserName;
import domain.user.UserRepository;

public class UserService {
    UserRepository userRepository;

    public boolean isExist(UserName userName) {
        return true;
    }
}
