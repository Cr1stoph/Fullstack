class Main {
    private static String mensaje = "Hola";
    private static int version = 1;

    public static String saludar() {
        return mensaje + "v" + version;
    }

    public static void main(String[] args) {
        System.out.println(saludar());
    }


}
