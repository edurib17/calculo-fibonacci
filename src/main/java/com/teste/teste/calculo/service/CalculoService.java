package com.teste.teste.calculo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculoService {
    /// 1 1 2 3 5 8 13 21 34 55 89 144
    public Integer getCalculoByNumber(Integer number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int valueResponse = 0;
        for (int i = 2; i <= number; ++i) {
            valueResponse = a + b;
            a = b;
            b = valueResponse;
        }
        return valueResponse;
    }
}
