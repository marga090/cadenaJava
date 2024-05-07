public class RecorrerCadena {
    public static void main(String[] args) {
        String cadena = "Hola, mundo!";
        
        // Recorriendo la cadena utilizando un bucle for
        System.out.println("Recorriendo la cadena utilizando un bucle for:");
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            System.out.println("Carácter en posición " + i + ": " + caracter);
        }
    }
}