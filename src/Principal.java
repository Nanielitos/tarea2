import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
public class Principal extends JFrame {
    //contenido primer panel
    private JList contactos;
    private JButton verContactos, buscar, ver, eliminar;
    private JScrollPane barraDesplazamiento;

    //contenido segundo panel
    private JLabel nombre, apellido, direc, correo;
    private JTextField nombre1, apellido1, direc1, correo1;
    private JList telefonos, palabrasC;
    private JButton agregar1, eliminar1, agregar2, eliminar2,
            agragarContacto, modificar, limpiar;

    //contenido tercer panel
    private JButton opcion1, opcion2;

    public Principal () {

        super("Lista de contactos");
        setLayout(new GridBagLayout());
        GridBagConstraints restricciones1 = new GridBagConstraints();

        Container contenedorPrincipal = this.getContentPane();
        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBackground(Color.lightGray);

        //panel norte
        TitledBorder border = new TitledBorder(" Lista de contactos ");
        border.setTitleJustification(TitledBorder.LEFT);
        border.setTitlePosition(TitledBorder.TOP);
        JPanel listaPanel = new JPanel();
        listaPanel.setBorder(border);
        listaPanel.setLayout(new GridBagLayout());

        //panel centro
        TitledBorder border2 = new TitledBorder(" Datos personales del contacto ");
        border2.setTitleJustification(TitledBorder.LEFT);
        border2.setTitlePosition(TitledBorder.TOP);
        JPanel datosPanel = new JPanel();
        datosPanel.setBorder(border2);
        datosPanel.setLayout(new GridBagLayout());

        //panel del centro (telefonos)
        TitledBorder border3 = new TitledBorder(" Telefonos ");
        border3.setTitleJustification(TitledBorder.LEFT);
        border3.setTitlePosition(TitledBorder.TOP);
        JPanel telefonosPanelCentro = new JPanel();
        telefonosPanelCentro.setBorder(border3);
        telefonosPanelCentro.setLayout(new GridBagLayout());

        //panel del centro (Palabras clave)
        TitledBorder border4 = new TitledBorder(" Palabras clave ");
        border4.setTitleJustification(TitledBorder.LEFT);
        border4.setTitlePosition(TitledBorder.TOP);
        JPanel palabrasCPanel = new JPanel();
        palabrasCPanel.setBorder(border4);
        palabrasCPanel.setLayout(new GridBagLayout());

        //panel del sur
        TitledBorder border5 = new TitledBorder(" Extenciones ");
        border5.setTitleJustification(TitledBorder.LEFT);
        border5.setTitlePosition(TitledBorder.TOP);
        JPanel extencionesPanel = new JPanel();
        extencionesPanel.setBorder(border5);
        extencionesPanel.setLayout(new GridBagLayout());


        //crear la lista
        String[] nombres = {"Ana", "Margarita", "Daniel", "Divian",
                "Leslie"};
        barraDesplazamiento = new JScrollPane(contactos);
        contactos = new JList(nombres);
        restricciones1.gridx = 0;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 4;
        restricciones1.gridwidth = 3;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.BOTH;
        restricciones1.insets.set(0,0,0,6);
        listaPanel.add(contactos, restricciones1);
        listaPanel.add(barraDesplazamiento);

        //boton1
        verContactos = new JButton("Ver todos los contactos");
        restricciones1.gridx = 3;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.NORTH;
        restricciones1.insets.set(1,0,1,0);
        listaPanel.add(verContactos, restricciones1);

        //boton 2
        buscar = new JButton("Buscar por palabra Clave");
        restricciones1.gridx = 3;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.NORTH;
        restricciones1.insets.set(1,0,1,0);
        listaPanel.add(buscar, restricciones1);

        //boton 3
        ver = new JButton("Ver");
        restricciones1.gridx = 3;
        restricciones1.gridy = 2;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weighty = 0;
        restricciones1.weightx = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.NORTH;
        restricciones1.insets.set(1,0,1,0);
        listaPanel.add(ver, restricciones1);

        //boton 4
        eliminar = new JButton("Eliminar");
        restricciones1.gridx = 3;
        restricciones1.gridy = 3;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.NORTH;
        restricciones1.insets.set(1,0,1,0);
        listaPanel.add(eliminar, restricciones1);

        //Panel norte medidas
        restricciones1.gridx = 0;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 3;
        restricciones1.gridwidth = 2;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.NORTH;
        restricciones1.insets.set(0,0,2,0);
        contenedorPrincipal.add(listaPanel, restricciones1);

        //label nombre
        nombre = new JLabel("Nombre");
        restricciones1.gridx = 0;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(nombre, restricciones1);

        //label apellido
        apellido = new JLabel("Apellido");
        restricciones1.gridx = 0;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(apellido, restricciones1);

        //label direccion
        direc = new JLabel("Direccón");
        restricciones1.gridx = 0;
        restricciones1.gridy = 2;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(direc, restricciones1);

        //label correo
        correo = new JLabel("Correo electrónico");
        restricciones1.gridx = 0;
        restricciones1.gridy = 3;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(correo, restricciones1);

        //text field nombre
        nombre1 = new JTextField("Introdusca el nombre");
        restricciones1.gridx = 1;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 1;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(nombre1, restricciones1);

        //text field apellido
        apellido1 = new JTextField("Introdusca el apellido");
        restricciones1.gridx = 1;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(apellido1, restricciones1);

        //text field direccion
        direc1 = new JTextField("Introdusca la dirección");
        restricciones1.gridx = 1;
        restricciones1.gridy = 2;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(direc1, restricciones1);

        //text field correo
        correo1 = new JTextField("Introdusca el correo electrónico");
        restricciones1.gridx = 1;
        restricciones1.gridy = 3;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.NONE;
        restricciones1.anchor = GridBagConstraints.WEST;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(correo1, restricciones1);

        //boton agregar contacto
        agragarContacto = new JButton("Agregar contacto");
        restricciones1.gridx = 0;
        restricciones1.gridy = 4;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(agragarContacto, restricciones1);

        //boton modificar contacto
        modificar = new JButton("Modificar contacto");
        restricciones1.gridx = 1;
        restricciones1.gridy = 4;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(modificar, restricciones1);

        //boton modificar contacto
        limpiar = new JButton("Limpiar");
        restricciones1.gridx = 2;
        restricciones1.gridy = 4;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 0;
        restricciones1.weighty = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(5,0,5,5);
        datosPanel.add(limpiar, restricciones1);

        //lista panel del centro (telefonos)
        String[] numeros = {"1.-", "2.-", "3.-", "4.-"};
        telefonos = new JList(numeros);
        restricciones1.gridx = 0;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 2;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.BOTH;
        restricciones1.insets.set(0,0,0,0);
        telefonosPanelCentro.add(telefonos, restricciones1);

        //boton agregar panel del centro (telefonos)
        agregar1 = new JButton("Agrgar");
        restricciones1.gridx = 1;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weighty = 1;
        restricciones1.weightx = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.BOTH;
        restricciones1.anchor = GridBagConstraints.EAST;
        restricciones1.insets.set(0,5,0,0);
        telefonosPanelCentro.add(agregar1, restricciones1);

        //boton eliminar panel del centro (telefonos)
        eliminar1 = new JButton("Eliminar");
        restricciones1.gridx = 1;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weighty = 1;
        restricciones1.weightx = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.BOTH;
        restricciones1.anchor = GridBagConstraints.EAST;
        restricciones1.insets.set(0,5,0,0);
        telefonosPanelCentro.add(eliminar1, restricciones1);

        //panel del centro (telefonos) medidas
        restricciones1.gridx = 2;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(5,0,5,0);
        datosPanel.add(telefonosPanelCentro, restricciones1);

        //lista panel del centro (palabras clave)
        String[] palbras = {"1.-", "2.-", "3.-", "4.-"};
        palabrasC = new JList(palbras);
        restricciones1.gridx = 0;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 2;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.BOTH;
        restricciones1.insets.set(0,0,0,0);
        palabrasCPanel.add(palabrasC, restricciones1);

        //boton agregar panel del centro (palabras clave)
        agregar2 = new JButton("Agrgar");
        restricciones1.gridx = 1;
        restricciones1.gridy = 0;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weighty = 1;
        restricciones1.weightx = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.BOTH;
        restricciones1.anchor = GridBagConstraints.EAST;
        restricciones1.insets.set(0,5,0,0);
        palabrasCPanel.add(agregar2, restricciones1);

        //boton eliminar panel del centro (palbras clave)
        eliminar2 = new JButton("Eliminar");
        restricciones1.gridx = 1;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weighty = 1;
        restricciones1.weightx = 0;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.BOTH;
        restricciones1.anchor = GridBagConstraints.EAST;
        restricciones1.insets.set(0,5,0,0);
        palabrasCPanel.add(eliminar2, restricciones1);

        //panel del centro (Palabras clave) medidas
        restricciones1.gridx = 2;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(5,0,5,0);
        datosPanel.add(palabrasCPanel, restricciones1);

        //Panel centro medidas
        restricciones1.gridx = 0;
        restricciones1.gridy = 4;
        restricciones1.gridheight = 3;
        restricciones1.gridwidth = 2;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(5,0,5,0);
        contenedorPrincipal.add(datosPanel, restricciones1);

        //boton opcion uno panel sur
        opcion1 = new JButton("Opción 1");
        restricciones1.gridx = 0;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weighty = 1;
        restricciones1.weightx = 1;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(0,5,0,0);
        extencionesPanel.add(opcion1, restricciones1);

        //boton opcion dos panel sur
        opcion2 = new JButton("Opción 2");
        restricciones1.gridx = 1;
        restricciones1.gridy = 1;
        restricciones1.gridheight = 1;
        restricciones1.gridwidth = 1;
        restricciones1.weighty = 1;
        restricciones1.weightx = 1;
        restricciones1.ipadx = 10;
        restricciones1.ipady = 10;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.CENTER;
        restricciones1.insets.set(0,5,0,0);
        extencionesPanel.add(opcion2, restricciones1);

        //Panel sur medidas
        restricciones1.gridx = 0;
        restricciones1.gridy = 9;
        restricciones1.gridheight = 2;
        restricciones1.gridwidth = 1;
        restricciones1.weightx = 1;
        restricciones1.weighty = 1;
        restricciones1.fill = GridBagConstraints.HORIZONTAL;
        restricciones1.anchor = GridBagConstraints.SOUTH;
        restricciones1.insets.set(5,0,5,0);
        contenedorPrincipal.add(extencionesPanel, restricciones1);
    }
    public static void main (String[] Args){
        Principal ventana = new Principal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }


}
