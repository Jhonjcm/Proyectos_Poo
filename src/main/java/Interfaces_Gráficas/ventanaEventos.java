/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_Gráficas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ventanaEventos extends JFrame{
    
    private JPanel panel;
    private JLabel saludo; 
    private JTextField filaTexto;
    
    public ventanaEventos(){
        setLocationRelativeTo(null);
        setSize(300, 200);
        setTitle("Ejemplo ventana de eventos");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        inicioComponentes();
        
    }
    
    private void inicioComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarFilasDeTexto();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel); // Agrego panel a la ventana
       
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta1 = new JLabel("Bienvenid@s");
        etiqueta1.setBounds(10, 10, 100, 15);
        panel.add(etiqueta1);
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 30, 90, 20);
        panel.add(boton1);
        
        saludo = new JLabel();
        saludo.setBounds(110, 30, 100, 20);
        panel.add(saludo);
        
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                saludo.setText("Hola "+ filaTexto.getText());
            }
        };
        
        boton1.addActionListener(oyenteAccion);
    }
    
    private void colocarFilasDeTexto(){
        filaTexto = new JTextField();
        filaTexto.setBounds(120, 10, 100, 15);
        panel.add(filaTexto);
    }
}
