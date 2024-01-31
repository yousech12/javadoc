/**
 * Clase principal que contiene el metodo main para probar la funcionalidad de SocUtil.
 *
 * @author AutorDesconocido
 * @version 1.0
 */
public class Principal {
    /**
     * Método principal para probar la funcionalidad de SocUtil.
     *
     * @param args Argumentos de la línea de comandos (no utilizado en este programa).
     */
    public static void main(String[] args) {
        try {
            System.out.println("12345 es capicúa: " + SocUtil.esCapikua(12345));
            System.out.println("1221 es capicua: " + SocUtil.esCapicua(1221));
            System.out.println("1234321 es capicúa: " + SocUtil.esCapikua(1234321)); }
        catch (EsNegatiuEX ex) {
        }
    }
}