package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GetFriendsListTest {

    @Test
    public void getFriendsListTest() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        LionAlex lionAlex = new LionAlex(felineMock);
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriendsList());
    }

}
