package com.sample.quickstart.service;

import com.sample.quickstart.dto.CalculationDTO;

import java.util.Map;

public interface CalculationService {

    Map<String, Number> calculation(CalculationDTO calculationDTO);
}
