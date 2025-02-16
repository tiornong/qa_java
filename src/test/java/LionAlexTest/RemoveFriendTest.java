package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;


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
            Assert.assertEquals("Получено некорректное сообщение об ошибке",
                    String.format("Алекс никогда не перестанет дружить с %s!", defaultFriend),
                    e.getMessage()
            );
        }
    }

    @Test
    public void removeNewFriendTest() throws Exception {
        lionAlex.addFriend(newFriend);

        Assert.assertEquals("Получен некорректный список друзей",
                List.of("Марти", "Глория", "Мелман", newFriend),
                lionAlex.getFriendsList()
        );

        lionAlex.removeFriend(newFriend);

        Assert.assertEquals("Получен некорректный список друзей",
                List.of("Марти", "Глория", "Мелман"),
                lionAlex.getFriendsList()
        );
    }

    @Test
    public void removeNotFriendTest() {
        try {
            lionAlex.removeFriend(NotFriend);
        } catch (Exception e) {
            Assert.assertEquals("Получено некорректное сообщение об ошибке",
                    String.format("Алекс и так не дружит с %s!", NotFriend),
                    e.getMessage()
            );
        }
    }

}
