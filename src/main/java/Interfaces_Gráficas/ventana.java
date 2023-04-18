
package Interfaces_Gráficas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ventana extends JFrame {
    
    public JPanel panel;
    
    public ventana(){
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Detiene el proceso al cerrar ventana con x
        this.setTitle("Nombre de ventana"); // Establece el titulo
        //this.setLocation(500, 400);  //Configura locación de ventana
        
        //this.setBounds(500, 400, 300, 200);  // Combina setLocation y setSize
        
        this.setLocationRelativeTo(null);
        
        inicioComponentes(); //Llamo al método que inicia componentes (JPanel)
    }
    
    private void inicioComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocalCajasDeTexto();
                
    }
    
    private void colocarPaneles(){
        panel = new JPanel(); //Crea un panel
        panel.setLayout(null);//Desactivo diseño por defecto de mi panel
        this.getContentPane().add(panel); //Agrega panel a la ventana
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel("Hola"); //Creamos etiqueta
        etiqueta.setBounds(10, 10, 40, 10);
        panel.add(etiqueta); //Agrego etiqueta a mi panel
        
       //JLabel etiquetaIm = new JLabel();
       //etiquetaIm.setIcon(new ImageIcon("image.jpg"));
       //etiquetaIm.setBounds(60, 10, 600, 467);
       // panel.add(etiquetaIm);
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton("Click");
        boton1.setBounds(10, 40, 70, 20);
        panel.add(boton1);
    }
    
    private void colocalCajasDeTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(90, 25, 70, 20);
        panel.add(cajaTexto);
        
        //cajaTexto.getText(); //Obtiene el texto de la caja de texto
    }

}
