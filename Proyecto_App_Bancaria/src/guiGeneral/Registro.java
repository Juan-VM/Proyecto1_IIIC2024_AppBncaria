package guiGeneral;

import BaseDatos.BaseDatos;
import Personas.Administradores;
import Personas.Usuarios;
import RegistroDatos.DatosRegistrados;
import Sedes.SedeCiudadColon;
import Sedes.SedePuriscal;
import Sedes.SedeSanPedro;
import Sedes.SedeCentral;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    boolean verPasswordRegistro;
    boolean jblGenerarClaveIsClicked;

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        verPasswordRegistro = false;
        jblGenerarClaveIsClicked = false;
        lblVerRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojoCerrado.png")));
        psdPasswordOF.setEchoChar('*');
        txtsRegistroPorDefecto();
        alertasPorDefecto();
    }

    public void txtsRegistroPorDefecto() {
        txtUsuarioOF.setText("Ingrese su usuario");
        txtApellidoOF.setText("Ingrese sus apellidos");
        txtTelefonoOF.setText("Ingrese su telefono");
        txtCedulaOF.setText("Ingrese su cedula");
        psdPasswordOF.setText("Ingrese su password");
        txtClaveNumerica.setText("Clave numerica");
    }

    //Si el texto esta vacio le establece el texto predeterminado
    //Al presionar si el texto es el predeterminado lo establece vacio.
    public void txtsSetTextoPredeterminado(String is) {
        if (!(txtUsuarioOF.getText().equals("Ingrese su usuario")) && !(txtUsuarioOF.getText().equals("")) && !is.equals("usuario")) {
            txtUsuarioOF.setForeground(new Color(153, 153, 153));
        } else {
            if (txtUsuarioOF.getText().equals("")) {
                txtUsuarioOF.setText("Ingrese su usuario");
            }
            txtUsuarioOF.setForeground(new Color(153, 153, 153));
        }

        if (!(txtApellidoOF.getText().equals("Ingrese sus apellidos")) && !(txtApellidoOF.getText().equals("")) && !is.equals("apellidos")) {
            txtApellidoOF.setForeground(new Color(153, 153, 153));
        } else {
            if (txtApellidoOF.getText().equals("")) {
                txtApellidoOF.setText("Ingrese sus apellidos");
            }
            txtApellidoOF.setForeground(new Color(153, 153, 153));
        }

        if (!(txtCedulaOF.getText().equals("Ingrese su cedula")) && !(txtCedulaOF.getText().equals("")) && !is.equals("cedula")) {
            txtCedulaOF.setForeground(new Color(153, 153, 153));
        } else {
            if (txtCedulaOF.getText().equals("")) {
                txtCedulaOF.setText("Ingrese su cedula");
            }
            txtCedulaOF.setForeground(new Color(153, 153, 153));
        }

        if (!(txtTelefonoOF.getText().equals("Ingrese su telefono")) && !(txtTelefonoOF.getText().equals("")) && !is.equals("telefono")) {
            txtTelefonoOF.setForeground(new Color(153, 153, 153));
        } else {
            if (txtTelefonoOF.getText().equals("")) {
                txtTelefonoOF.setText("Ingrese su telefono");
            }
            txtTelefonoOF.setForeground(new Color(153, 153, 153));
        }

        if (!(String.valueOf(psdPasswordOF.getPassword()).equals("Ingrese su password")) && !(String.valueOf(psdPasswordOF.getPassword()).equals("")) && !is.equals("password")) {
            psdPasswordOF.setForeground(new Color(153, 153, 153));
        } else {
            if (String.valueOf(psdPasswordOF.getPassword()).equals("")) {
                psdPasswordOF.setText("Ingrese su password");
            }
            psdPasswordOF.setForeground(new Color(153, 153, 153));
        }

        if (!is.equals("txts por defecto")) {
            cbRol.setForeground(new Color(153, 153, 153));
        }
    }
    
    //Oculta los mensajes de error
    public void alertasPorDefecto(){
        alertaCedula.setVisible(false);
        alertaTelefono.setVisible(false);
    }
        
    public boolean validarRepetidos() {
        boolean existen = false;
        if (DatosRegistrados.getListaCedulas().contains(txtCedulaOF.getText()) || DatosRegistrados.getListaTelefonos().contains(txtTelefonoOF.getText())) {
            existen = true;
            if (DatosRegistrados.getListaCedulas().contains(txtCedulaOF.getText())) {
                alertaCedula.setVisible(true);
            }

            if (DatosRegistrados.getListaTelefonos().contains(txtTelefonoOF.getText())) {
                alertaTelefono.setVisible(true);
            }
        }
        return existen;
    }
    
    public int generarClaveNumerica(ArrayList<Integer> clavesRegistradas){
        Random random = new Random();
        int clave;
        while (true){
            clave = 999 + random.nextInt(9000);
            
            if(!clavesRegistradas.contains(clave)){
                break;
            }     
        }
        return clave;     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        panelAtras = new javax.swing.JPanel();
        jblAtras = new javax.swing.JLabel();
        jblBarraArriba = new javax.swing.JLabel();
        jblLogo2 = new javax.swing.JLabel();
        jblNombreBanco2 = new javax.swing.JLabel();
        jblFrase2 = new javax.swing.JLabel();
        jblFondoRegistro = new javax.swing.JLabel();
        jblRolOF = new javax.swing.JLabel();
        sep2 = new javax.swing.JSeparator();
        jblUsuarioOF = new javax.swing.JLabel();
        txtUsuarioOF = new javax.swing.JTextField();
        sep1 = new javax.swing.JSeparator();
        jblApellidoOF = new javax.swing.JLabel();
        txtApellidoOF = new javax.swing.JTextField();
        sep3 = new javax.swing.JSeparator();
        jblCedulaOF = new javax.swing.JLabel();
        txtCedulaOF = new javax.swing.JTextField();
        sep4 = new javax.swing.JSeparator();
        jblTelefonoOF = new javax.swing.JLabel();
        txtTelefonoOF = new javax.swing.JTextField();
        psdPasswordOF = new javax.swing.JPasswordField();
        sep5 = new javax.swing.JSeparator();
        jblPasswordOF = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        jblBancoLogo = new javax.swing.JLabel();
        jblIniciarSesion1 = new javax.swing.JLabel();
        panelGuardarOF = new javax.swing.JPanel();
        jblGuardarOF = new javax.swing.JLabel();
        panelVerRegistro = new javax.swing.JPanel();
        lblVerRegistro = new javax.swing.JLabel();
        jblClaveNumerica = new javax.swing.JLabel();
        txtClaveNumerica = new javax.swing.JTextField();
        panelGenerarClave = new javax.swing.JPanel();
        jblGenerarClave = new javax.swing.JLabel();
        sep6 = new javax.swing.JSeparator();
        sep7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cbSede = new javax.swing.JComboBox<>();
        alertaCedula = new javax.swing.JLabel();
        alertaTelefono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAtras.setBackground(new java.awt.Color(252, 247, 215));
        panelAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        jblAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jblAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jblAtrasMouseExited(evt);
            }
        });
        panelAtras.add(jblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panelRegistro.add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jblBarraArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarraInicio.png"))); // NOI18N
        panelRegistro.add(jblBarraArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        jblLogo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bambuLogo128px.png"))); // NOI18N
        panelRegistro.add(jblLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 390, 130));

        jblNombreBanco2.setFont(new java.awt.Font("STSong", 1, 36)); // NOI18N
        jblNombreBanco2.setForeground(new java.awt.Color(51, 51, 51));
        jblNombreBanco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblNombreBanco2.setText("BNBUU");
        panelRegistro.add(jblNombreBanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 390, -1));

        jblFrase2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblFrase2.setForeground(new java.awt.Color(51, 51, 51));
        jblFrase2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblFrase2.setText("Deje que su dinero brote con nosotros");
        panelRegistro.add(jblFrase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 390, -1));

        jblFondoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jblFondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoRegistroPanel.png"))); // NOI18N
        panelRegistro.add(jblFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, -30, 390, 720));

        jblRolOF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblRolOF.setForeground(new java.awt.Color(51, 51, 51));
        jblRolOF.setText("ROL");
        panelRegistro.add(jblRolOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 90, 30));

        sep2.setForeground(new java.awt.Color(102, 102, 102));
        sep2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelRegistro.add(sep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 10, 40));

        jblUsuarioOF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblUsuarioOF.setForeground(new java.awt.Color(51, 51, 51));
        jblUsuarioOF.setText("NOMBRE");
        panelRegistro.add(jblUsuarioOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        txtUsuarioOF.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioOF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUsuarioOF.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuarioOF.setText("Ingrese su usuario");
        txtUsuarioOF.setBorder(null);
        txtUsuarioOF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioOFMousePressed(evt);
            }
        });
        panelRegistro.add(txtUsuarioOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 370, 50));

        sep1.setForeground(new java.awt.Color(102, 102, 102));
        panelRegistro.add(sep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 620, 10));

        jblApellidoOF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblApellidoOF.setForeground(new java.awt.Color(51, 51, 51));
        jblApellidoOF.setText("APELLIDOS");
        panelRegistro.add(jblApellidoOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 30));

        txtApellidoOF.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoOF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtApellidoOF.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidoOF.setText("Ingrese sus apellidos");
        txtApellidoOF.setBorder(null);
        txtApellidoOF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoOFMousePressed(evt);
            }
        });
        panelRegistro.add(txtApellidoOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 360, 50));

        sep3.setForeground(new java.awt.Color(102, 102, 102));
        panelRegistro.add(sep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 620, 10));

        jblCedulaOF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblCedulaOF.setForeground(new java.awt.Color(51, 51, 51));
        jblCedulaOF.setText("CEDULA");
        panelRegistro.add(jblCedulaOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 30));

        txtCedulaOF.setBackground(new java.awt.Color(255, 255, 255));
        txtCedulaOF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtCedulaOF.setForeground(new java.awt.Color(153, 153, 153));
        txtCedulaOF.setText("Ingrese su cedula");
        txtCedulaOF.setBorder(null);
        txtCedulaOF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaOFMousePressed(evt);
            }
        });
        panelRegistro.add(txtCedulaOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 360, 50));

        sep4.setForeground(new java.awt.Color(102, 102, 102));
        panelRegistro.add(sep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 620, 10));

        jblTelefonoOF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblTelefonoOF.setForeground(new java.awt.Color(51, 51, 51));
        jblTelefonoOF.setText("TELEFONO");
        panelRegistro.add(jblTelefonoOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 140, 30));

        txtTelefonoOF.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoOF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTelefonoOF.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefonoOF.setText("Ingrese su telefono");
        txtTelefonoOF.setBorder(null);
        txtTelefonoOF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoOFMousePressed(evt);
            }
        });
        panelRegistro.add(txtTelefonoOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 360, 50));

        psdPasswordOF.setBackground(new java.awt.Color(255, 255, 255));
        psdPasswordOF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        psdPasswordOF.setForeground(new java.awt.Color(153, 153, 153));
        psdPasswordOF.setText("Ingrese su password");
        psdPasswordOF.setBorder(null);
        psdPasswordOF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psdPasswordOFMousePressed(evt);
            }
        });
        panelRegistro.add(psdPasswordOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 290, 50));

        sep5.setForeground(new java.awt.Color(102, 102, 102));
        panelRegistro.add(sep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 620, 10));

        jblPasswordOF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblPasswordOF.setForeground(new java.awt.Color(51, 51, 51));
        jblPasswordOF.setText("PASSWORD");
        panelRegistro.add(jblPasswordOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 150, 30));

        cbRol.setBackground(new java.awt.Color(255, 255, 255));
        cbRol.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbRol.setForeground(new java.awt.Color(153, 153, 153));
        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Admin" }));
        cbRol.setBorder(null);
        cbRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbRolMousePressed(evt);
            }
        });
        panelRegistro.add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 140, 30));

        jblBancoLogo.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jblBancoLogo.setForeground(new java.awt.Color(51, 51, 51));
        jblBancoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bambuLogo64px.png"))); // NOI18N
        jblBancoLogo.setText("BNBUU");
        panelRegistro.add(jblBancoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 205, -1));

        jblIniciarSesion1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jblIniciarSesion1.setForeground(new java.awt.Color(51, 51, 51));
        jblIniciarSesion1.setText("REGISTRO");
        panelRegistro.add(jblIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        panelGuardarOF.setBackground(new java.awt.Color(92, 88, 29));
        panelGuardarOF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblGuardarOF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblGuardarOF.setForeground(new java.awt.Color(255, 255, 255));
        jblGuardarOF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblGuardarOF.setText("GUARDAR");
        jblGuardarOF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblGuardarOF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblGuardarOFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jblGuardarOFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jblGuardarOFMouseExited(evt);
            }
        });
        panelGuardarOF.add(jblGuardarOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        panelRegistro.add(panelGuardarOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 140, 50));

        panelVerRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelVerRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVerRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojoCerrado.png"))); // NOI18N
        lblVerRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVerRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVerRegistroMouseExited(evt);
            }
        });
        panelVerRegistro.add(lblVerRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        panelRegistro.add(panelVerRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 40, 40));

        jblClaveNumerica.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblClaveNumerica.setForeground(new java.awt.Color(51, 51, 51));
        jblClaveNumerica.setText("CLAVE NUM");
        panelRegistro.add(jblClaveNumerica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, 30));

        txtClaveNumerica.setEditable(false);
        txtClaveNumerica.setBackground(new java.awt.Color(255, 255, 255));
        txtClaveNumerica.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        txtClaveNumerica.setForeground(new java.awt.Color(153, 153, 153));
        txtClaveNumerica.setText("Clave numerica");
        txtClaveNumerica.setBorder(null);
        panelRegistro.add(txtClaveNumerica, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 160, 50));

        panelGenerarClave.setBackground(new java.awt.Color(92, 88, 29));
        panelGenerarClave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblGenerarClave.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblGenerarClave.setForeground(new java.awt.Color(255, 255, 255));
        jblGenerarClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblGenerarClave.setText("GENERAR");
        jblGenerarClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblGenerarClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblGenerarClaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jblGenerarClaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jblGenerarClaveMouseExited(evt);
            }
        });
        panelGenerarClave.add(jblGenerarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        panelRegistro.add(panelGenerarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 140, 50));

        sep6.setForeground(new java.awt.Color(102, 102, 102));
        panelRegistro.add(sep6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 620, 10));

        sep7.setForeground(new java.awt.Color(102, 102, 102));
        panelRegistro.add(sep7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 620, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SEDE");
        panelRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        cbSede.setBackground(new java.awt.Color(255, 255, 255));
        cbSede.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbSede.setForeground(new java.awt.Color(153, 153, 153));
        cbSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puriscal", "San Pedro", "Ciudad Colon" }));
        cbSede.setBorder(null);
        panelRegistro.add(cbSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 160, 30));

        alertaCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/advertencia.png"))); // NOI18N
        panelRegistro.add(alertaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 40, 40));

        alertaTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/advertencia.png"))); // NOI18N
        panelRegistro.add(alertaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioOFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioOFMousePressed
        txtsSetTextoPredeterminado("usuario");
        if (txtUsuarioOF.getText().equals("Ingrese su usuario")) {
            txtUsuarioOF.setText("");
        }
        txtUsuarioOF.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_txtUsuarioOFMousePressed

    private void txtApellidoOFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoOFMousePressed
        txtsSetTextoPredeterminado("apellidos");
        if (txtApellidoOF.getText().equals("Ingrese sus apellidos")) {
            txtApellidoOF.setText("");
        }
        txtApellidoOF.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_txtApellidoOFMousePressed

    private void txtCedulaOFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaOFMousePressed
        txtsSetTextoPredeterminado("cedula");
        alertaCedula.setVisible(false);
        if (txtCedulaOF.getText().equals("Ingrese su cedula")) {
            txtCedulaOF.setText("");
        }
        txtCedulaOF.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_txtCedulaOFMousePressed

    private void txtTelefonoOFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoOFMousePressed
        txtsSetTextoPredeterminado("telefono");
        alertaTelefono.setVisible(false);
        if (txtTelefonoOF.getText().equals("Ingrese su telefono")) {
            txtTelefonoOF.setText("");
        }
        txtTelefonoOF.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_txtTelefonoOFMousePressed

    private void psdPasswordOFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psdPasswordOFMousePressed
        txtsSetTextoPredeterminado("password");
        if (String.valueOf(psdPasswordOF.getPassword()).equals("Ingrese su password")) {
            psdPasswordOF.setText("");
        }
        psdPasswordOF.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_psdPasswordOFMousePressed

    private void cbRolMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRolMousePressed

        cbRol.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_cbRolMousePressed

    private void jblGuardarOFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblGuardarOFMouseClicked
        try {
            String usuario = txtUsuarioOF.getText();
            String apellido = txtApellidoOF.getText();
            String telefono = txtTelefonoOF.getText();
            String cedula = txtCedulaOF.getText();
            String password = String.valueOf(psdPasswordOF.getPassword());
            int claveNumerica;
            int rol = cbRol.getSelectedIndex();
            int sede = cbSede.getSelectedIndex();
            try {
                claveNumerica = Integer.parseInt(txtClaveNumerica.getText());
            } catch (Exception e) {
                claveNumerica = 0;
            }

            if (usuario.trim().equals("") || apellido.trim().equals("") || telefono.trim().equals("") || cedula.trim().equals("") || password.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, espacios sin llenar");
            } else {
                if (usuario.equals("Ingrese su usuario") || apellido.equals("Ingrese sus apellidos") || telefono.equals("Ingrese su telefono")
                            || cedula.equals("Ingrese su cedula") || password.equals("Ingrese su password") || claveNumerica == 0) {

                    JOptionPane.showMessageDialog(null, "Error, debes rellenar todos los espacios");
                } else {

                    boolean repetidos = validarRepetidos();
                    if (repetidos == false) {
                        switch (rol) {
                            case 0 -> {
                                Usuarios user = new Usuarios(usuario, apellido, password, cedula, telefono, claveNumerica, rol, sede, 0, 0, 0);
                                SedeCentral.ListaUsers.add(user);
                                DatosRegistrados.addCedula(cedula);
                                DatosRegistrados.addTelefono(telefono);
                                switch (sede) {
                                    case 0 -> {
                                        SedePuriscal.getListaUsers().add(user);
                                    }
                                    case 1 -> {
                                        SedeSanPedro.getListaUsers().add(user);
                                    }
                                    case 2 -> {
                                        SedeCiudadColon.getListaUsers().add(user);
                                    }
                                }
                                
                                BaseDatos.agregarUsuarioTxt(user.getUsuario(), user.getApellidos(), user.getCedula(), user.getTelefono(), user.getPassword(), String.valueOf(user.getClaveNumerica()),
                                        String.valueOf(user.getRol()), String.valueOf(user.getSede()),
                                        String.valueOf(user.getCuentaCorriente().getSaldo()), String.valueOf(user.getCuentaAhorro().getSaldo()), String.valueOf(user.getCuentaSimpe().getSaldo()),
                                        String.valueOf(user.getCuentaCorriente().getEstado()), String.valueOf(user.getCuentaAhorro().getEstado()), String.valueOf(user.getCuentaSimpe().getEstado()),
                                        String.valueOf(user.getEstadoUsuario()), String.valueOf(user.getEstadoCuenta()));
                            }
                            case 1 -> {
                                Administradores admin = new Administradores(usuario, apellido, password, cedula, telefono, claveNumerica, rol, sede);
                                SedeCentral.ListaAdmins.add(admin);
                                DatosRegistrados.addCedula(cedula);
                                DatosRegistrados.addTelefono(telefono);
                                switch (sede) {
                                    case 0 -> {
                                        SedePuriscal.getListaAdmins().add(admin);
                                    }
                                    case 1 -> {
                                        SedeSanPedro.getListaAdmins().add(admin);
                                    }
                                    case 2 -> {
                                        SedeCiudadColon.getListaAdmins().add(admin);
                                    }
                                }
                                BaseDatos.agregarAdminTxt(admin.getUsuario(), admin.getApellidos(), admin.getCedula(), admin.getTelefono(), admin.getPassword(), String.valueOf(admin.getClaveNumerica()),
                                        String.valueOf(admin.getRol()), String.valueOf(admin.getSede()));
                            }
                        }
                        
                        JOptionPane.showMessageDialog(null, "Datos guardados");
                        Inicio inicio = new Inicio();
                        inicio.setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Error, datos en uso");
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_jblGuardarOFMouseClicked

    private void jblGuardarOFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblGuardarOFMouseEntered
        panelGuardarOF.setBackground(new Color(153, 145, 86));
        jblGuardarOF.setForeground(Color.black);
    }//GEN-LAST:event_jblGuardarOFMouseEntered

    private void jblGuardarOFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblGuardarOFMouseExited
        panelGuardarOF.setBackground(new Color(92, 88, 29));
        jblGuardarOF.setForeground(Color.white);
    }//GEN-LAST:event_jblGuardarOFMouseExited

    private void lblVerRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerRegistroMouseClicked
        if (verPasswordRegistro == false) {
            verPasswordRegistro = true;
            lblVerRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojoAbierto.png")));
            psdPasswordOF.setEchoChar((char) 0);
        } else {
            verPasswordRegistro = false;
            lblVerRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojoCerrado.png")));
            psdPasswordOF.setEchoChar('*');
        }
    }//GEN-LAST:event_lblVerRegistroMouseClicked

    private void lblVerRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerRegistroMouseEntered
        panelVerRegistro.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_lblVerRegistroMouseEntered

    private void lblVerRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerRegistroMouseExited
        panelVerRegistro.setBackground(Color.white);
    }//GEN-LAST:event_lblVerRegistroMouseExited

    private void jblAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblAtrasMouseEntered
        panelAtras.setBackground(new Color(232, 225, 182));
    }//GEN-LAST:event_jblAtrasMouseEntered

    private void jblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblAtrasMouseExited
        panelAtras.setBackground(new Color(252, 247, 215));
    }//GEN-LAST:event_jblAtrasMouseExited

    private void jblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblAtrasMouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jblAtrasMouseClicked

    private void jblGenerarClaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblGenerarClaveMouseEntered
        if (jblGenerarClaveIsClicked == false) {
            panelGenerarClave.setBackground(new Color(153, 145, 86));
            jblGenerarClave.setForeground(Color.black);
        }
    }//GEN-LAST:event_jblGenerarClaveMouseEntered

    private void jblGenerarClaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblGenerarClaveMouseExited
        if (jblGenerarClaveIsClicked == false) {
            panelGenerarClave.setBackground(new Color(92, 88, 29));
            jblGenerarClave.setForeground(Color.white);
        }
    }//GEN-LAST:event_jblGenerarClaveMouseExited

    private void jblGenerarClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblGenerarClaveMouseClicked
        if (jblGenerarClaveIsClicked == false) {

            jblGenerarClaveIsClicked = true;
            int claveNumerica = generarClaveNumerica(DatosRegistrados.getListaClaves());
            DatosRegistrados.addClave(claveNumerica);
            txtClaveNumerica.setText(String.valueOf(claveNumerica));

        } else {
            JOptionPane.showMessageDialog(null, "Ya existe una clave numerica");
        }

    }//GEN-LAST:event_jblGenerarClaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertaCedula;
    private javax.swing.JLabel alertaTelefono;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JComboBox<String> cbSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jblApellidoOF;
    private javax.swing.JLabel jblAtras;
    private javax.swing.JLabel jblBancoLogo;
    private javax.swing.JLabel jblBarraArriba;
    private javax.swing.JLabel jblCedulaOF;
    private javax.swing.JLabel jblClaveNumerica;
    private javax.swing.JLabel jblFondoRegistro;
    private javax.swing.JLabel jblFrase2;
    private javax.swing.JLabel jblGenerarClave;
    private javax.swing.JLabel jblGuardarOF;
    private javax.swing.JLabel jblIniciarSesion1;
    private javax.swing.JLabel jblLogo2;
    private javax.swing.JLabel jblNombreBanco2;
    private javax.swing.JLabel jblPasswordOF;
    private javax.swing.JLabel jblRolOF;
    private javax.swing.JLabel jblTelefonoOF;
    private javax.swing.JLabel jblUsuarioOF;
    private javax.swing.JLabel lblVerRegistro;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelGenerarClave;
    private javax.swing.JPanel panelGuardarOF;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPanel panelVerRegistro;
    private javax.swing.JPasswordField psdPasswordOF;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    private javax.swing.JSeparator sep4;
    private javax.swing.JSeparator sep5;
    private javax.swing.JSeparator sep6;
    private javax.swing.JSeparator sep7;
    private javax.swing.JTextField txtApellidoOF;
    private javax.swing.JTextField txtCedulaOF;
    private javax.swing.JTextField txtClaveNumerica;
    private javax.swing.JTextField txtTelefonoOF;
    private javax.swing.JTextField txtUsuarioOF;
    // End of variables declaration//GEN-END:variables
}
