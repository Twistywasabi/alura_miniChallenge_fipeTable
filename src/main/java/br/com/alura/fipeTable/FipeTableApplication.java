package br.com.alura.fipeTable;

import br.com.alura.fipeTable.Main.Main;
import br.com.alura.fipeTable.model.VehicleBrandData;
import br.com.alura.fipeTable.service.ApiConsume;
import br.com.alura.fipeTable.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FipeTableApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipeTableApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.showMenu();

	}
}
