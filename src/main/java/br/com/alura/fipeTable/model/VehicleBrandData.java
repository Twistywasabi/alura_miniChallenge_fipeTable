package br.com.alura.fipeTable.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public record VehicleBrandData(@JsonAlias("modelos") Map<String,Integer> models, @JsonAlias("anos") Map<String, String> years) {
}
