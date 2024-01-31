/**
 * Clase de utilidad que contiene métodos para verificar si un número es capicúa, primo, obtener
 * el factorial y más.
 *
 * @author AutorDesconocido
 * @version 1.0
 */
public class SocUtil {
    /**
     * Comprueba si un número entero es capicúa.
     *
     * @param numero Número entero a verificar.
     * @return True si el número es capicúa, false en caso contrario.
     * @throws EsNegatiuEX Se lanza si el número es negativo.
     * @deprecated A partir de la versión 1.35, se ha reemplazado por {@link #esCapikua(int)}.
     */
    @Deprecated
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int numAlReves = 0;
        int copia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero %10;
            numero /= 10;
        }
        return copia == numAlReves;
    }
    /**
     * Comprueba si un número entero es capicúa.
     *
     * @param numero Número entero a verificar.
     * @return True si el número es capicúa, false en caso contrario.
     * @throws EsNegatiuEX Se lanza si el número es negativo.
     * @see EsNegatiuEX
     */
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX ();
        }
        String cadNum = numero + "";
        String numAlReves = (new StringBuilder(cadNum)).reverse().toString();
        return cadNum.equals(numAlReves);
    }
    /**
     * Comprueba si un número entero es primo.
     *
     * @param numero Número entero a verificar.
     * @return True si el número es primo, false en caso contrario.
     * @throws EsNegatiuEX Se lanza si el número es negativo.
     * @see EsNegatiuEX
     */
    public static boolean esPrimer(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int limit = numero / 2 + 1;
        int div = 2;
        while (div < limit) {
            if (numero % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }
    /**
     * Calcula el factorial de un número entero.
     *
     * @param numero Número entero no negativo.
     * @return El factorial del número.
     * @throws EsNegatiuEX Se lanza si el número es negativo.
     * @see EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero" target="_blank">Sangaku Maths</a>
     */

    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no se puede calcular el factorial de un número negativo");
        }
        long fact = 1L;
        while (numero > 1) {
            fact *= numero;
            numero --;
        }
        return fact;
    }
}