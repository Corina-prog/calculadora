
package calculadoraa;

public class Calculadoraa {

    public static void main(String[] args) {
       
         ventana inicio = new ventana();
      inicio.setTitle("calculadora basica");
      inicio.setBounds(500, 100, 400,600);//posicion y dimension 
      inicio.setResizable(false);//desactivar redimensión 
      inicio.insertpanel();
      inicio.insertarEtiquetas();
      inicio.insertarTexto();
      inicio.insertarBotones();
    }
    
}
