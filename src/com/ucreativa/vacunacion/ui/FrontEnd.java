package com.ucreativa.vacunacion.ui;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo){
        super(titulo);
    }

    public void build(){
        this.construccionPantalla();
        this.crearComponentas();
        super.setVisible(true);

    }

    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setLayout(new GridLayout(5,2));

    }

    private void crearComponentas(){
        //Crear labels
        JLabel lblNombre = new JLabel("Nombre");
        JTextField txtNombre = new JTextField();
        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);

        JLabel lblCedula = new JLabel("Cedula");
        JTextField txtCedula = new JTextField();
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);

        JLabel lblEdad = new JLabel("Edad");
        JTextField txtEdad = new JTextField();
        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);

        JLabel lblRiesgo = new JLabel("Riesgo");
        JCheckBox txtRiesgo = new JCheckBox();
        this.agregarComponente(lblRiesgo);
        this.agregarComponente(txtRiesgo);

        JLabel lblIsAmigo = new JLabel("Es Amigo?");
        JCheckBox txtIsAmigo = new JCheckBox();
        this.agregarComponente(lblIsAmigo);
        this.agregarComponente(txtIsAmigo);



        JLabel lblRelacion = new JLabel("Relacion");
        JTextField txtRelacion = new JTextField();
        this.agregarComponente(lblRelacion);
        this.agregarComponente(txtRelacion);

        JLabel lblFacebook = new JLabel("Facebook");
        JTextField txtFacebook = new JTextField();
        this.agregarComponente(lblFacebook);
        this.agregarComponente(txtFacebook);



        JLabel lblParentesco = new JLabel("Parentezco");
        JTextField txtParentezco = new JTextField();
        this.agregarComponente(lblParentesco);
        this.agregarComponente(txtParentezco);


        JLabel lblMarca = new JLabel("Marca");
        JTextField txtMarca = new JTextField();
        this.agregarComponente(lblMarca);
        this.agregarComponente(txtMarca);

        txtIsAmigo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblParentesco.setVisible(!txtIsAmigo.isSelected());
                txtParentezco.setVisible(!txtIsAmigo.isSelected());
                lblRelacion.setVisible(txtIsAmigo.isSelected());
                txtRelacion.setVisible(txtIsAmigo.isSelected());
                lblFacebook.setVisible(txtIsAmigo.isSelected());
                txtFacebook.setVisible(txtIsAmigo.isSelected());

            }
        });


        JButton btnAgregar = new JButton("Agregar");
        this.agregarComponente(btnAgregar);
        btnAgregar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                try {
                    service.save(txtNombre.getText(),
                            txtCedula.getText(),
                            txtEdad.getText(),
                            txtRiesgo.isSelected(),
                            txtIsAmigo.isSelected(),
                            txtRelacion.getText(),
                            txtFacebook.getText(),
                            txtParentezco.getText(),
                            txtMarca.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


                txtNombre.setText("");
                txtCedula.setText("");
                txtEdad.setText("");
                txtRiesgo.setText("");
                txtIsAmigo.setText("");
                txtRelacion.setText("");
                txtFacebook.setText("");
                txtParentezco.setText("");
                txtMarca.setText("");

                 String repote = String.join("\n",service.get());
                 JOptionPane.showMessageDialog((JButton)e.getSource(), repote);



            }
        });


    }

    private void agregarComponente(Component component){
        super.getContentPane().add(component);
    }



}
