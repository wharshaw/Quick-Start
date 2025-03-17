package com.sample.quickstart.service.impl;

import com.sample.quickstart.service.CalculationService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CalculationServiceImpl implements CalculationService {

    private int a;
    private int b;

    public Integer setA(int a) {
        this.a = a;
        return a;
    }

    public Integer setB(int b) {
        this.b = b;
        return b;
    }

    public Integer sum(){
        System.out.println(a+b);
        return(a+b);
    }

    public Integer sub(){
        System.out.println(a-b);
        return(a-b);
    }

    public Map<String, Integer> calculation(){
        CalculationServiceImpl calcService = new CalculationServiceImpl();
        calcService.setA(10);
        calcService.setB(6);

        int substractionResult = calcService.sub();
        int sumResult = calcService.sum();

        Map<String, Integer> results = new HashMap<>();
        results.put("substraction", substractionResult);
        results.put("sum", sumResult);

        return results;
        
    }
}
