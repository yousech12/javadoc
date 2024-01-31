
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * La clase PasswordManagerApp es una aplicación simple de gestión de contraseñas que utiliza varios elementos de interfaz gráfica.
 * Permite la generación de contraseñas y proporciona opciones para personalizar la generación.
 * La aplicación incluye etiquetas, botones, casillas de verificación, botones de opción, menús emergentes y JOptionPane.
 *
 * @author Tu Nombre
 * @version 1.0
 */

public class PasswordManagerApp {

    private JFrame mainFrame;
    private JLabel titleLabel;
    private JButton generateButton;
    private JCheckBox uppercaseCheckBox;
    private JRadioButton strongRadioButton;
    private JComboBox<Integer> lengthComboBox;
    private JPopupMenu popupMenu;

    public PasswordManagerApp() {
        initializeUI();
        addActionListeners();
    }

    /**
     * Inicializa la interfaz de usuario de la aplicación.
     */

    private void initializeUI() {
        // Configuración de la ventana principal
        mainFrame = new JFrame("Gestor de Contraseñas");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Etiqueta de título
        titleLabel = new JLabel("Generador de Contraseñas");
        mainFrame.add(titleLabel);

        // Botón de generación de contraseña
        generateButton = new JButton("Generar Contraseña");
        mainFrame.add(generateButton);

        // Casilla de verificación para letras mayúsculas
        uppercaseCheckBox = new JCheckBox("Incluir Mayúsculas");
        mainFrame.add(uppercaseCheckBox);

        // Botones de opción para la fortaleza de la contraseña
        strongRadioButton = new JRadioButton("Fuerte");
        JRadioButton weakRadioButton = new JRadioButton("Débil");
        ButtonGroup strengthGroup = new ButtonGroup();
        strengthGroup.add(strongRadioButton);
        strengthGroup.add(weakRadioButton);
        mainFrame.add(strongRadioButton);
        mainFrame.add(weakRadioButton);


        Integer[] lengths = {8, 10, 12, 14};
        lengthComboBox = new JComboBox<>(lengths);
        mainFrame.add(lengthComboBox);


        popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Opción 1");
        JMenuItem menuItem2 = new JMenuItem("Opción 2");
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);

        mainFrame.setVisible(true);
    }

    /**
     * Agrega escuchadores de acciones a los elementos de la interfaz.
     */

    private void addActionListeners() {

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String generatedPassword = generatePassword();

                JOptionPane.showMessageDialog(mainFrame, "Contraseña generada: " + generatedPassword);
            }
        });


        titleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (SwingUtilities.isRightMouseButton(evt)) {

                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        });
    }
    /**
     * Genera una contraseña basada en los parámetros de la interfaz gráfica.
     *
     * @return La contraseña generada.
     */

    private String generatePassword() {

        return "ContraseñaGenerada123";
    }
    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordManagerApp();
            }
        });
    }
}
