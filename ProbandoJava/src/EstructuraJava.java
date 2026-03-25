public class EstructuraJava {
    public static void main(String[] args) {
        int edad = 20;
        if(edad <18){
            System.out.println("Menor de edad");
        }else if (edad == 18){
            System.out.println("Justo en la mayoria de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }

        String opcion = "B";
        switch (opcion){
            case "A":
                System.out.println("Elegiste la opcion A");
                break;
                case "B":
                    System.out.println("Elegiste la opcion B");
                    break;
                case "C":
                    System.out.println("Elegiste la opcion C");
                        break;
                default:
                    System.out.println("opcion ivalida");
        }
    }
}
