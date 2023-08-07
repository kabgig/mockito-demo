package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {


    @Test
    void findTheGreatestFromTheData_basicScenario1() {
        DateService dateServiceStub = new DateServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dateServiceStub);
        int result = businessImpl.findTheGreatestFromTheData();
        assertEquals(25, result);
    }
    @Test
    void findTheGreatestFromTheData_basicScenario2() {
        DateService dateServiceStub = new DateServiceStub2();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dateServiceStub);
        int result = businessImpl.findTheGreatestFromTheData();
        assertEquals(35, result);
    }
}

class DateServiceStub1 implements DateService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}
class DateServiceStub2 implements DateService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{35};
    }
}