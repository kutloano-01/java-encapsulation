//package encapsulation.projects.project2;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class UserTest {
//    @Test
//    public void testUserUpdateEmail() {
//        User user = new User("alice", "alice@example.com");
//        User updated = user.updateEmail("alice@new.com");
//        assertEquals("alice@new.com", updated.getEmail());
//        assertEquals("alice@example.com", user.getEmail());
//    }
//
//    @Test
//    public void testProfileManagerAddAndGet() {
//        ProfileManager manager = new ProfileManager();
//        User user = new User("alice", "alice@example.com");
//        manager.addProfile(user);
//        assertEquals(1, manager.getProfileCount());
//        assertEquals(user, manager.getProfile("alice"));
//    }
//
//    @Test
//    public void testUserNullUsernameThrows() {
//        assertThrows(IllegalArgumentException.class, () -> new User(null, "alice@example.com"));
//    }
//}