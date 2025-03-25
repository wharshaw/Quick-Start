package com.sample.quickstart.service.impl;

import com.sample.quickstart.dto.CalculationDTO;
import com.sample.quickstart.service.CalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class CalculationServiceImpl implements CalculationService {

    public double sum(CalculationDTO calculationDTO){
        double result = calculationDTO.getA() + calculationDTO.getB();
        System.out.println(result);
        return(result);
    }

    public double sub(CalculationDTO calculationDTO){
        double result = calculationDTO.getA() - calculationDTO.getB();
        System.out.println(result);
        return(result);
    }

    public double multi(CalculationDTO calculationDTO){
        double result = calculationDTO.getA() * calculationDTO.getB();
        System.out.println(result);
        return (result);
    }

    public double divide(CalculationDTO calculationDTO){
        if (calculationDTO.getB() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        double result = (double) calculationDTO.getA() / calculationDTO.getB();
        System.out.println(result);
        return (result);
    }

    @Override
    public Map<String, Number> calculation(CalculationDTO calculationDTO){

        log.info("calculation method accessed");

        double subtractionResult = this.sub(calculationDTO);
        double sumResult = this.sum(calculationDTO);
        double multiResult = this.multi(calculationDTO);
        double divideResult = this.divide(calculationDTO);

        Map<String, Number> results = new HashMap<>();
        results.put("Subtraction", subtractionResult);
        results.put("Sum", sumResult);
        results.put("Multiplication", multiResult);
        results.put("Deviation", divideResult);

        return results;
    }
}
