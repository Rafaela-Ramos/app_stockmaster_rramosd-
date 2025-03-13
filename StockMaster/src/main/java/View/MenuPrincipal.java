
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

package View;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {
    private JDesktopPane desktopPane; // Panel para ventanas internas

    public MenuPrincipal() {
        // Configurar la ventana principal
        setTitle("STOCK MASTER - Menú Principal");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el contenedor de ventanas internas
        desktopPane = new JDesktopPane();
        add(desktopPane);

        // Crear la barra de menú con fondo verde
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(0, 204, 0)); // Color verde

        // Fuente en negrita para los menús
        Font menuFont = new Font("Arial", Font.BOLD, 14);

        // Crear y estilizar menús
        JMenu menuProductos = crearMenu("Productos", menuFont);
        JMenuItem agregarProducto = crearMenuItem("Agregar Producto");
        JMenuItem verStock = crearMenuItem("Ver Stock");
        menuProductos.add(agregarProducto);
        menuProductos.add(verStock);

        JMenu menuUsuarios = crearMenu("Usuarios", menuFont);
        JMenuItem gestionarUsuarios = crearMenuItem("Gestionar Usuarios");
        JMenuItem verPerfil = crearMenuItem("Ver Perfil");
        menuUsuarios.add(gestionarUsuarios);
        menuUsuarios.add(verPerfil);

        JMenu menuReportes = crearMenu("Reportes", menuFont);
        JMenuItem verVentas = crearMenuItem("Ver Ventas");
        menuReportes.add(verVentas);

        JMenu menuSesion = crearMenu("Cuenta", menuFont);
        JMenuItem cerrarSesion = crearMenuItem("Cerrar Sesión");
        menuSesion.add(cerrarSesion);

        // Agregar menús a la barra de menú
        menuBar.add(menuProductos);
        menuBar.add(menuUsuarios);
        menuBar.add(menuReportes);
        menuBar.add(menuSesion);

        // Agregar barra de menú a la ventana
        setJMenuBar(menuBar);

        // Acciones para los ítems del menú
        agregarProducto.addActionListener(e -> abrirVentanaInterna(new VentanaAgregarProducto()));
        verStock.addActionListener(e -> abrirVentanaInterna(new VentanaVerStock()));
        gestionarUsuarios.addActionListener(e -> abrirVentanaInterna(new VentanaGestionUsuarios()));
        verPerfil.addActionListener(e -> abrirVentanaInterna(new VentanaVerPerfil()));
        verVentas.addActionListener(e -> abrirVentanaInterna(new VentanaVerVentas()));

        // Acción para cerrar sesión
        cerrarSesion.addActionListener(e -> {
            int respuesta = JOptionPane.showConfirmDialog(this, 
                "¿Seguro que deseas cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                dispose(); // Cierra la ventana principal
                new Login().setVisible(true); // Simula el regreso a la pantalla de login
            }
        });

        setVisible(true);
    }

    // Método para crear menús con estilo personalizado
    private JMenu crearMenu(String titulo, Font font) {
        JMenu menu = new JMenu(titulo);
        menu.setForeground(new Color(0, 0, 153)); // Color azul
        menu.setFont(font);
        return menu;
    }

    // Método para crear ítems del menú con estilo
    private JMenuItem crearMenuItem(String titulo) {
        JMenuItem item = new JMenuItem(titulo);
        item.setFont(new Font("Arial", Font.BOLD, 12));
        return item;
    }

    // Método para abrir ventanas internas en el JDesktopPane
    private void abrirVentanaInterna(JInternalFrame ventana) {
        desktopPane.add(ventana);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuPrincipal();
    }
}

// Ventana interna: Agregar Producto
class VentanaAgregarProducto extends JInternalFrame {
    public VentanaAgregarProducto() {
        setTitle("Agregar Producto");
        setSize(400, 300);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}

// Ventana interna: Ver Stock
class VentanaVerStock extends JInternalFrame {
    public VentanaVerStock() {
        setTitle("Ver Stock");
        setSize(500, 350);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}

// Ventana interna: Gestionar Usuarios
class VentanaGestionUsuarios extends JInternalFrame {
    public VentanaGestionUsuarios() {
        setTitle("Gestionar Usuarios");
        setSize(450, 320);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}

// Ventana interna: Ver Perfil
class VentanaVerPerfil extends JInternalFrame {
    public VentanaVerPerfil() {
        setTitle("Ver Perfil");
        setSize(400, 280);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}

// Ventana interna: Ver Ventas
class VentanaVerVentas extends JInternalFrame {
    public VentanaVerVentas() {
        setTitle("Ver Ventas");
        setSize(500, 350);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}

// Simulación de ventana de inicio de sesión (puedes reemplazarlo con tu propio Login)
class Login extends JFrame {
    public Login() {
        setTitle("Login - STOCK MASTER");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        add(new JLabel("Pantalla de Login (A completar)"));
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
