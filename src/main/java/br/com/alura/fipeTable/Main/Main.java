package br.com.alura.fipeTable.Main;

import br.com.alura.fipeTable.model.Data;
import br.com.alura.fipeTable.model.Models;
import br.com.alura.fipeTable.model.VehicleBrandData;
import br.com.alura.fipeTable.service.ApiConsume;
import br.com.alura.fipeTable.service.ConvertData;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private Scanner reading = new Scanner(System.in);

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    private ApiConsume consume = new ApiConsume();

    private ConvertData converter = new ConvertData();

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

        var brand = converter.obtainList(json, Data.class);

        brand.stream().sorted(Comparator.comparing(Data::code)).forEach(System.out::println);

        var secondMenu = """
                
                Escolha uma marca pelo código:
                
                """;

        System.out.println(secondMenu);

        var optionBrand = reading.nextLine();

        address = address + "/" + optionBrand + "/modelos";

        json = consume.obtainData(address);

        var modelList = converter.obtainData(json, Models.class);

        System.out.println("\n Modelos dessa marca: ");
        modelList.models().stream()
                .sorted(Comparator.comparing(Data::code))
                .forEach(System.out::println);



    }

}
