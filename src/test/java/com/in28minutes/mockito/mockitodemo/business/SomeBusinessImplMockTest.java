package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {

    @Test
    void findTheGreatestFromTheData_basicScenario() {
        DateService dateServiceMock = mock(DateService.class);
        when(dateServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dateServiceMock);
        assertEquals(25, businessImpl.findTheGreatestFromTheData());
    }

    @Test
    void findTheGreatestFromTheData_OneValue() {
        DateService dateServiceMock = mock(DateService.class);
        when(dateServiceMock.retrieveAllData()).thenReturn(new int[]{35});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dateServiceMock);
        assertEquals(35, businessImpl.findTheGreatestFromTheData());
    }
}