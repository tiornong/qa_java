package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GetFriendsListTest {

    @Test
    public void getDefaultFriendsListTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriendsList());
    }

}
