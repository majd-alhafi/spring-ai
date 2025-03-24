package com.example.springaiintro.dtos;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record CapitalResponse(@JsonPropertyDescription("This is the city name") String capital,
                              @JsonPropertyDescription("This is the city population") String population,
                              @JsonPropertyDescription("This is the city area") String Area) {
}
