package Lektion1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by: Jesper Jansson
 * Date: 2020-10-06
 * Time: 11:47
 * Project: JavaOOP-Spring2
 * Copyright: MIT
 */
public class UsedFuelTest extends TestCase {
    UsedFuel test = new UsedFuel(1000,1000);
@Test
    public final void testAverageMile(){
    assertTrue(test.averageMile()==1);
}
@Test
    public final void testmilesDriven(){
    assertTrue(test.milesDriven>=0);
    assertTrue();
}
}