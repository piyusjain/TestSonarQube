package com.sonar.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MathServiceTest {
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipliesNumbers() {
        System.out.println("Testing multiply() started...");
        int result = mathService.multiply(2, 4);

        assertThat(result, equalTo(8));
        System.out.println("Testing multiply() ended...");
    }
}
