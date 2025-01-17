package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RemoveFriendTest {

    LionAlex lionAlex;
    String defaultFriend = "Марти";
    String newFriend = "Тимати";
    String NotFriend = "Егор";

    @Before
    public void setUp() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        lionAlex = new LionAlex(felineMock);
    }

    @Test
    public void removeDefaultFriendTest() {
        try {
            lionAlex.removeFriend(defaultFriend);
        } catch (Exception e) {
            Assert.assertEquals(String.format("Алекс никогда не перестанет дружить с %s!", defaultFriend), e.getMessage());
        }
    }

    @Test
    public void removeNewFriendTest() throws Exception {
        lionAlex.addFriend(newFriend);
        lionAlex.removeFriend(newFriend);
    }

    @Test
    public void removeNotFriendTest() {
        try {
            lionAlex.removeFriend(NotFriend);
        } catch (Exception e) {
            Assert.assertEquals(String.format("Алекс и так не дружит с %s!", NotFriend), e.getMessage());
        }
    }

}
