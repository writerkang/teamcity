//package user;
//
//import domain.user.User;
//import domain.user.UserId;
//import domain.user.UserName;
//import domain.user.UserRepository;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserTest {
//
//    private UserRepository userRepository;
//
//    @Test
//    void should_copy_user_to_repository() {
////        userRepository = new InMemoryUserRepository();
//        var newUser = User.create(
//                new UserId("    AA     "),
//                new UserName("Patrick     ", "   Lee"));
//
//        userRepository.save(newUser);
//        var searchedUser = userRepository.findBy(new UserId("  AA "));
//
//        assertEquals(newUser.name(), searchedUser.name());
//
//        newUser.changeName(new UserName("    Kyle   ", " Lee   "));
//
//        assertNotEquals(newUser.name(), searchedUser.name());
//    }
//
//    @Test
//    void user_id_should_not_null_or_empty() {
//        assertThrows(IllegalArgumentException.class,
//                () -> new UserId("            "));
//
//        assertThrows(IllegalArgumentException.class,
//                () -> new UserId(null));
//
//        assertThrows(IllegalArgumentException.class,
//                () -> new UserId(null));
//    }
//
//    @Test
//    void user_name_each_field_should_longer_than_two() {
//        assertThrows(IllegalArgumentException.class,
//                () -> new UserName("            ", "         "));
//
//        assertThrows(IllegalArgumentException.class,
//                () -> new UserName("ed", "  sdfsdfsdf       "));
//
//        assertThrows(IllegalArgumentException.class,
//                () -> new UserName("edsdfdsf", "  sf       "));
//    }
//
//}
