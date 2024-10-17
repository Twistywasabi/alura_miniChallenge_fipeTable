package br.com.alura.fipeTable.Main;

import br.com.alura.fipeTable.service.ApiConsume;

import java.util.Scanner;

public class Main {

    private Scanner reading = new Scanner(System.in);

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    private ApiConsume consume = new ApiConsume();

    public void showMenu() {


        var menu = """
                                
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                                
                Digite uma das opções para consulta: 
                                
                """;

        System.out.println(menu);
        var option = reading.nextLine();
        String address;

        if (option.toLowerCase().contains("carr")) {
            address = URL_BASE + "carros/marcas";
        } else if (option.toLowerCase().contains("mot")) {
            address = URL_BASE + "motos/marcas";
        } else {
            address = URL_BASE + "caminhoes/marcas";
        }

        var json = consume.obtainData(address);
        System.out.println(json);


    }

}
