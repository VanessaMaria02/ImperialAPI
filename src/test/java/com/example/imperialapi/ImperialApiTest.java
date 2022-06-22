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

}