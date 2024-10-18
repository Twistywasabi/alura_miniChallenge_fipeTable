package br.com.alura.fipeTable.service;

import java.util.List;

public interface IDataConvert {
    <T> T obtainData(String json, Class<T> anyClass);

    <T> List<T> obtainList (String json, Class<T> anyClass);

}
