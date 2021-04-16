import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FooBarBazTest {

    private FooBarBaz fbb;

    @BeforeEach
    void setUp() {
        this.fbb = new FooBarBaz();
    }

    @Test
    void testTransformWhenDivByThree() {
        // run test and verify result
        assertEquals("foo", fbb.transform(3)); // expected result, actual result
    }

    @Test
    void testTransformWhenDivByFive() {
        assertEquals("bar", fbb.transform(5));
    }
    
    @Test
    void testTransform() {
    	FooBarBaz temp = new FooBarBaz();
    	assertEquals("bar", fbb.transform(10));
    	assertEquals("foo", fbb.transform(3));
    }
    
    @Test
    void testTransformNone() {
    	assertEquals("4", fbb.transform(4));
    }

}