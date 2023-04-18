package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cashbackHackServiceTest {
    @Test
    void calculateCashback(){
        cashbackHackService service = new cashbackHackService();
        int expected =100;
        int amount900 = 900;
        int actual = service.remain (amount900);
        assertEquals(expected, actual);


    }

}