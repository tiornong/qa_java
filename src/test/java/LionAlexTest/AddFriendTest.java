package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class AddFriendTest {

    @Test
    public void addFriendTest() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        LionAlex lionAlex = new LionAlex(felineMock);

        lionAlex.addFriend("Тимати");
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман", "Тимати"), lionAlex.getFriendsList());


    }

}
