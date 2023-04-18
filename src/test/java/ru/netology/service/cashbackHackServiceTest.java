package ru.netology.service;


import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class cashbackHackServiceTest {
    @Test
    void calculateCashback(){
        cashbackHackService service = new cashbackHackService();
        int expected =100;
        int amount900 = 900;
        int actual = service.remain (amount900);
 assertEquals(expected,actual);
    }

}