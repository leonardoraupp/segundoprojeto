
public class CelsiusToFahrenheit {

    double celsius = 22;
    double fahrenheit = (celsius * 1.8) + 32;
    int fahrenheitArredondado = (int) fahrenheit;
    String nome = "Leonardo";
    public void retornarTemperaturaConvertida() {
        System.out.println(String.format("Bem vindo ao sistema %s", nome));
        System.out.println(
                """
                                
                Temperatura em Fahrenheit em tipo double: %.2f°F
                
                Temperatura em Fahrenheit em tipo int: %d°F
                """.formatted(fahrenheit, fahrenheitArredondado));
    }
}
