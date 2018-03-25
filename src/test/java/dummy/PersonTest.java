package dummy;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void personGreetsCorrectly(){
        Person p = new Person();
        Assert.assertEquals( "Hello my friend", p.greet());
    }
}
