/**
 * La clase Password representa un generador y evaluador de contraseñas.
 * Permite la generación de contraseñas aleatorias con una longitud específica
 * y proporciona métodos para determinar la fortaleza de la contraseña.
 *
 * @author Tu Nombre
 * @version 1.5
 */
public final class Password {

    private final static int LONG_DEF = 8;
    private int longitud;
    private String contrasena;

    /**
     * Obtiene la longitud de la contraseña.
     *
     * @return La longitud de la contraseña.
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Establece la longitud de la contraseña.
     *
     * @param longitud La nueva longitud para la contraseña.
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene la contraseña generada.
     *
     * @return La contraseña generada.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Genera una contraseña aleatoria basada en la longitud especificada.
     * El algoritmo incluye letras minúsculas, letras mayúsculas y números.
     *
     * @return La contrasena generada aleatoriamente.
     * @see Math#random()
     * @see Math#floor(double)
     */
    public String generaPassword() {
        String password = "";
        for (int i = 0; i < longitud; i++) {
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));
            if (eleccion == 1) {
                char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                    password += mayusculas;
                } else {
                    char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                    password += numeros;
                }
            }
        }
        return password;
    }

    /**
     * Verifica si la contraseña es fuerte según ciertos criterios.
     *
     * @return True si la contraseña es fuerte, false en caso contrario.
     * @see String#charAt(int)
     */
    public boolean esFuerte() {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;

        for (int i = 0; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) >= 97 && contrasena.charAt(i) <= 122) {
                cuentaminusculas += 1;
            } else {
                if (contrasena.charAt(i) >= 65 && contrasena.charAt(i) <= 90) {
                    cuentamayusculas += 1;
                } else {
                    cuentanumeros += 1;
                }
            }
        }

        return (cuentanumeros >= 5 && cuentaminusculas >= 1 && cuentamayusculas >= 2);
    }

    /**
     * Verifica si la contraseña es fuerte utilizando un algoritmo anterior.
     * Obsoleto desde la versión 1.2. Reemplazado por el método {@link #esFuerte()}.
     *
     * @return True si la contraseña es fuerte, false en caso contrario.
     * @deprecated Reemplazado por {@link #esFuerte()}
     */
    @Deprecated
    public boolean esFort() {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;

        for (int i = 0; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) >= 97 && contrasena.charAt(i) <= 122) {
                cuentaminusculas += 1;
            } else {
                if (contrasena.charAt(i) >= 65 && contrasena.charAt(i) <= 90) {
                    cuentamayusculas += 1;
                } else {
                    cuentanumeros += 1;
                }
            }
        }

        return (cuentanumeros >= 3 && cuentaminusculas >= 1 && cuentamayusculas >= 1);
    }

    /**
     * Constructor por defecto, crea una contraseña con la longitud predeterminada.
     */
    public Password() {
        this(LONG_DEF);
    }

    /**
     * Constructor parametrizado, crea una contraseña con la longitud especificada.
     * Genera automáticamente una contraseña durante la creación del objeto.
     *
     * @param longitud La longitud de la contraseña.
     */
    public Password(int longitud) {
        this.longitud = longitud;
        contrasena = generaPassword();
    }
}
