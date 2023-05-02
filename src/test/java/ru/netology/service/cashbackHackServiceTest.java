package ru.netology.service;

//import org.junit.jupiter.api.Test;

import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

public class cashbackHackServiceTest {
    @org.testng.annotations.Test
    public void calculateCashback() {
        cashbackHackService service = new cashbackHackService();
        int expected = 100;
        int amount900 = 900;
        int actual = service.remain(amount900);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain() {
        cashbackHackService service = new cashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}