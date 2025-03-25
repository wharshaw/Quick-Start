package com.sample.quickstart.controller;

import com.sample.quickstart.dto.CalculationDTO;
import com.sample.quickstart.service.CalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("api/calculation")
@RestController
@Slf4j
public class CalculationController {

    @Autowired
    CalculationService calculationService;

//    @PostMapping
//    public String calculate(){
//        calculationService.calculation();
//        return "success";
//    }

    @PostMapping
    public ResponseEntity<Map<String,Number>> calculate(@RequestBody CalculationDTO calculationDTO) {
        Map<String, Number> results = calculationService.calculation(calculationDTO);
        return ResponseEntity.ok(results);
    }

}
