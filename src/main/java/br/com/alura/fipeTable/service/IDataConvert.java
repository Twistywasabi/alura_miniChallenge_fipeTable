package br.com.alura.fipeTable.service;

public interface IDataConvert {
    <T> T obtainData(String json, Class<T> anyClass);
}
