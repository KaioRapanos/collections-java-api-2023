package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiro
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a fun'~ao para dobrar todos os numeros no Stream e armazenas em uma lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar).collect(Collectors.toList());

        //Imprimir a lista de números dobrados
        numerosDobrados.forEach(n-> System.out.println(n));
    }
}
