package Test;

import Main.Fan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Test Class to test the functions of Ceiling Fan.
 */
class FanTest {
    private Fan fan;

    @BeforeEach
    void setUp() throws Exception {
        fan = new Fan();
    }

    @Test
    //To test that Fan speed is increases up to 3 and set back to 0.
    void testIncreaseSpeed(){
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(0,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(1,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(2,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(3,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(0,fan.getSpeed());
        System.out.println(fan.toString());
    }

    @Test
    //To test the Fan Direction changes while still not affect the speeding setting.
    void testReverseDirection(){
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(0,fan.getSpeed());
        System.out.println(fan.toString());

        fan.reverseDirection();
        assertEquals("REVERSE", fan.getFanDirection());
        assertEquals(0,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("REVERSE", fan.getFanDirection());
        assertEquals(1,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("REVERSE", fan.getFanDirection());
        assertEquals(2,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("REVERSE", fan.getFanDirection());
        assertEquals(3,fan.getSpeed());
        System.out.println(fan.toString());

        fan.increaseSpeed();
        assertEquals("REVERSE", fan.getFanDirection());
        assertEquals(0,fan.getSpeed());
        System.out.println(fan.toString());

        fan.reverseDirection();
        fan.increaseSpeed();
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(1,fan.getSpeed());
        System.out.println(fan.toString());

        fan.reverseDirection();
        fan.increaseSpeed();
        assertEquals("REVERSE", fan.getFanDirection());
        assertEquals(2,fan.getSpeed());
        System.out.println(fan.toString());

        fan.reverseDirection();
        fan.increaseSpeed();
        assertEquals("FORWARD", fan.getFanDirection());
        assertEquals(3,fan.getSpeed());
        System.out.println(fan.toString());

        fan.reverseDirection();
        fan.increaseSpeed();
        assertEquals("REVERSE", fan.getFanDirection());
        assertEquals(0,fan.getSpeed());
        System.out.println(fan.toString());

    }
}