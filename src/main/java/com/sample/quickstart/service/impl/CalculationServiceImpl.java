package com.sample.quickstart.service.impl;

import com.sample.quickstart.dto.CalculationDTO;
import com.sample.quickstart.service.CalculationService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CalculationServiceImpl implements CalculationService {

    private CalculationDTO calculationDTO;

    private void setCalculationDTO(CalculationDTO calculationDTO){
        this.calculationDTO = calculationDTO;
    }

    public Integer sum(){
        int result = calculationDTO.getA() + calculationDTO.getB();
        System.out.println(result);
        return(result);
    }

    public Integer sub(){
        int result = calculationDTO.getA() - calculationDTO.getB();
        System.out.println(result);
        return(result);
    }

    public Map<String, Integer> calculation(){
        CalculationDTO dto = new CalculationDTO();
        dto.setA(10);
        dto.setB(6);

        int substractionResult = this.sub();
        int sumResult = this.sum();

        Map<String, Integer> results = new HashMap<>();
        results.put("substraction", substractionResult);
        results.put("sum", sumResult);

        return results;
    }
}
