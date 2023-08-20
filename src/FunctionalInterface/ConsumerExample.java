package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o Consumer com expressao lambda para imprimir numeros pares
        //Consumer<Integer> imprimirNumeroPar = numero -> {...};
//            if (numero % 2 == 0){
//                System.out.println(numero + " ");
//            }
//        };

//        Usar o Consumer para imprimir números pares no Stream
//        numeros.stream().forEach(imprimirNumeroPar);
//        numeros.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                if (n % 2 == 0){
//                    System.out.println(n);
//                }
//            }
//        });
        numeros.stream().forEach(n -> {if (n % 2 == 0){
            System.out.println(n);
            }
        });
    }
}