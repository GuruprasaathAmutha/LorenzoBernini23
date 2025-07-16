package selvan.ponniyin.JUnitPractise;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testingPractiseOneTest {

    @Test
    void addtest(){
        testingPractiseOne testingPractiseOne = new testingPractiseOne();
         assertEquals(3, testingPractiseOne.add(1,2));
    }



}