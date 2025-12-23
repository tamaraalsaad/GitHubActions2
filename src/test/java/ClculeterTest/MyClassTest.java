package ClculeterTest;

import Clculeter.MyClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @Test
    public void testAdd() {
        MyClass myClass = new MyClass();
        assertEquals(3, myClass.add(1, 2));
        assertEquals(0, myClass.add(-1, 1));
        assertEquals(0, myClass.add(0, 0));
    }

    @Test
    public void subAdd() {
        MyClass myClass = new MyClass();
        assertEquals(1, myClass.sub(2, 1));
        assertEquals(-2, myClass.sub(-1, 1));
        assertEquals(0, myClass.sub(0, 0));
    }
}
