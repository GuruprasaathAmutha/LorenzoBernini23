package selvan.ponniyin.JUnitPractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testingPractiseTest {


    @Test
    void addTest(){
        testingPractise testingPractise = new testingPractise();
        assertEquals(4,  testingPractise.add(2,2));
    }
}