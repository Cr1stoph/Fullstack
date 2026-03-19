import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int edad = 20;
        if (edad < 18) {
            System.out.println("El edad es menor de 18");
        }else if (edad == 18) {
            System.out.println("Justo en la mayoria de edad");
        }else{
            System.out.printf("El edad es mayor de edad");
        }
        String opcion = "B";
        switch (opcion) {
            case "A":
                System.out.println("Elegiste la opcion A");
                break;
            case "B":
                System.out.println("Elegiste la opcion B");
                    break;
            default:
                System.out.println("El opcion no existe");
        }
        List<String> productos =  Arrays.asList("teclado", "mouse", "Pantalla");
        for (String p : productos) {
            System.out.println("📦"+p);
        }
        int contador = 0;
        while (contador < productos.size()) {
            System.out.println("numero " + contador);
            contador++;
        }
    }
}