/**
 * Excepción personalizada para manejar números negativos.
 *
 * @author AutorDesconocido
 * @version 1.0
 */
public class EsNegatiuEX extends Exception {
    /**
     * Excepción personalizada para manejar números negativos.
     *
     * @author AutorDesconocido
     * @version 1.0
     */
    public EsNegatiuEX () {

        super("el valor no puede ser negativo");

    }
    /**
     * Constructor que acepta un mensaje personalizado.
     *
     * @param msg Mensaje personalizado de la excepción.
     */
    public EsNegatiuEX (String msg) {
        super(msg);
    }
}