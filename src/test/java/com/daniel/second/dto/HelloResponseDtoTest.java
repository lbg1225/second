package com.daniel.second.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {
    @Test
    public void rombokFunctionTest() {
        String name = "이병관";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
