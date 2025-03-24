package com.sample.quickstart.service.impl;

import com.sample.quickstart.service.PalindromeService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PalindromeServiceImpl implements PalindromeService {

    public List<String> findPalindromicString(String[] array){
        return Arrays.stream(array)
                .filter(str -> str.equals(new
                        StringBuilder(str).reverse().toString()))
                .collect(Collectors.toList());
    }

}


