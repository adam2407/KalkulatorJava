package com.company;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @org.junit.jupiter.api.Test
    void dodaj() {
        assertEquals(2,Kalkulator.dodaj(1,1));
    }
}