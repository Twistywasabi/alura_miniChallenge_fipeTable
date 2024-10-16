# FIPE Table Consult 🚩

A CLI App (no Web) based on a challenge in "Java: trabalhando com lambdas, streams e Spring Framework" course

## Objective 📜

Create a program with user interaction by text (console).

We will implement an application to consult the average value of vehicles (cars, motorcycles or trucks) according to the FIPE table, which can be accessed through this website (https://veiculos.fipe.org.br/)

Checking vehicle values on the website has the following flow:

* Firstly, you need to choose the type of vehicle: car, motorcycle or truck.

***IMAGE 1***

* After that, you need to fill in the BRAND, MODEL and YEAR for consultation.

***IMAGE 2***

* Finally, the evaluation of only that chosen year is displayed.

***IMAGE 3***

* The objective of the project is to have a flow similar to what is done on the website, but with some improvements.

* We will create a Spring project with a command line, using the Scanner class to interact with the user via terminal.

* We will ask the user to enter the desired vehicle type (car, truck or motorcycle).

* Once this is done, we will list all the brands of that type of vehicle, asking the user to choose a brand by code.

* After this choice, we will list all the vehicle models of that brand.

* We will ask the user to enter a part of the model they want to view, for example PALIO.

* We will list only the models that have the word PALIO in the name.

* The user will choose a specific model by code and, unlike the website, we will already list the evaluations for ALL available years of that model, returning a list similar to the image below:

***IMAGE 4***

Notes:

* To carry out the challenge, we will consume an API, documented in this link.

* Depending on the chosen brand (car, motorcycle, or truck), we will call one of the endpoints below to search for the brands:
https://parallelum.com.br/fipe/api/v1/carros/marcas
https://parallelum.com.br/fipe/api/v1/motos/marcas
https://parallelum.com.br/fipe/api/v1/caminhoes/marcas

* The return of this request will be a list with the code and desired brand. If the user wants to query Fiat car models, for example, which have the code 21, they will have to make a new request to the endpoint:
https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos

* Once this is done, they will choose a model code, for example this Palio Weekend Stile 1.6 mpi 16V 4p, represented by the code 560. Then they will have to make a third request to the endpoint:
https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos/560/anos

* To find out the evaluation for each available year, we will have to make requests for the code per year, where we will get a return similar to what is shown below:
https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos/560/anos/2003-1

* In order to display the evaluations of all years for this model in our application, we will need to work with collections and repetition structures to be able to display all evaluations of all years to our user.

* Use the Jackson library to deserialize the data.

* Model the classes as necessary to represent the makes, models and data of the vehicles.

* Recall the concepts seen in the course to filter the models by a part of the name.


***IMAGE 5***

Have a good challenge!

## Technologies and Tools 👨‍💻

- JAVA 17
- Spring boot 3.3.4
- Packaging JAR
- Maven

## Result 🎁

## References 📚

https://github.com/alura-cursos/3257-java-desafio/blob/main/README.md



## Updates 🕐
