package br.com.alura.fipeTable.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertData implements IDataConvert{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obtainData(String json, Class<T> anyClass) {
        try {
            return mapper.readValue(json, anyClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
