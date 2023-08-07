package com.in28minutes.mockito.mockitodemo.business;

public class SomeBusinessImpl {
    private DateService dateService;

    public SomeBusinessImpl(DateService dateService) {
        this.dateService = dateService;
    }

    public int findTheGreatestFromTheData(){
        int[] data = dateService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for(int value: data){
            if (value > greatestValue) greatestValue = value;
        }
        return greatestValue;

    }
}

interface DateService {
    int[] retrieveAllData();
}
