package com.example.test_drivendevelopment;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {


    @Test
    public void test1() {
        validator v = new validator();
        assertEquals(1, v.validate("password"));
    }

    @Test
    public void test2() {
        validator v = new validator();
        assertEquals(2, v.validate("passwords"));
    }
}
