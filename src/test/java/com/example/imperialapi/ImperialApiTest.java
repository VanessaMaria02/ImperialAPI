package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperialApiTest {

    ImperialApi imperialApi = new ImperialApi();

    @Test
    public void centimeterTest1(){
        double inch = 4;
        double expected = 10.16;
        double result = imperialApi.centimeter(4);
        assertEquals(expected, result);
    }

    @Test
    public void meterTest1(){
        double yard = 10;
        double expected = 9.140767824497257;
        double result = imperialApi.meter(10);
        assertEquals(expected, result);
    }

}