package Lektion1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by: Jesper Jansson
 * Date: 2020-10-06
 * Time: 10:50
 * Project: JavaOOP-Spring2
 * Copyright: MIT
 */
public class SquareTest {


@Test
public final void testgetSide(){
    Square tests = new Square(3);
    assertTrue(tests.getSide()==3);
}
    @Test
    public final void testsetSide(){
        Square tests = new Square(2);
        assertTrue(tests.getSide()==2);
        tests.setSide(3);
        assertTrue(tests.getSide()==3);
    }
@Test
public final void testgetArea(){
    Square tests = new  Square(5);
    assertTrue (tests.getArea()==25);

}
@Test
    public final void testgetCirc(){
    Square tests= new Square(5);
    assertTrue(tests.getCirc()==20);
}


}
