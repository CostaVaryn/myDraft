package url.yt;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MainSimpleApp {
    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printer.print("Hi");

        Printer lambdaPrinter = m -> System.out.println(m);
        lambdaPrinter.print("Hi lambda");

        Printer methodReferencePrinter = System.out::println;
        methodReferencePrinter.print("Method reference");

        Map<String, Printer> printerHub = new HashMap<>();
        printerHub.put("lambda", lambdaPrinter);
        printerHub.put("secondPrinter", m -> {
            System.out.println("-=-=-");
            System.out.println(m);
            System.out.println("-=-=-");
        });
        printerHub.get("lambda").print("Hello");
        printerHub.get("second").print("Hello");

        List<String> names = Arrays.asList("Mark", "Adam", "Frank", "Bob");
//        List<String> filteredNames = new ArrayList<>();
//        for (String name : names) {
//            if (name.startsWith("A")) {
//                System.out.println(name);
//            }
//        }
//        filteredNames.sort(String::compareToIgnoreCase);

//        names.stream().filter(n -> n.startsWith("M")).forEach(n -> System.out.println(n));

        List<String> filteredNames =
            names
                    .stream()
                    .filter(n -> n.startsWith("J"))
                    .sorted(String::compareToIgnoreCase)
                    .collect(Collectors.toList());
        System.out.println(filteredNames);

        printerHub.get("lambda").colorPrint("Purple");
    }

    @FunctionalInterface
    interface Printer {
        void print(String msg);
        default void colorPrint(String msg) {
            System.out.println("Default method, message: " + msg);
        }
    }
}
