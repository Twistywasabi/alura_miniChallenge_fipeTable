package br.com.alura.fipeTable.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record VehicleBrandData(@JsonAlias("codigo") String code, @JsonAlias("nome") String brand) {
}
