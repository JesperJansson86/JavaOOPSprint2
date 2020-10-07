package Lektion1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by: Jesper Jansson
 * Date: 2020-10-06
 * Time: 11:12
 * Project: JavaOOP-Spring2
 * Copyright: MIT
 */
public class TriangleTest extends TestCase {
    Triangle t = new Triangle(3,4);
@Test
public final void testgetWidth(){
    assertTrue(t.getWidth()==4);
}
@Test
public final void testgetHeight(){
    assertTrue(t.getHeight()==3);
}
@Test
public final void testsetHeight(){
    t.setHeight(4);
    assertTrue(t.getHeight()==4);
}    @Test
public final void testsetWidth(){
    t.setWidth(3);
    assertTrue(t.getWidth()==3);
}
@Test
    public final void testgetArea(){
    assertTrue(t.getArea()==6);
}
@Test
    public final void testgetCirc(){
    Triangle t = new Triangle(4,6);
    assertTrue(t.getCirc()==16);
}
}