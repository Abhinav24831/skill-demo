import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

public class SkillDemoTester {
    @Test
    public void combineWordsTest(){
        assertEquals("Hello World", SkillDemo.combineWords("Hello", "World"));
    }
}
