
package calculadoraa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ventana extends JFrame {
    
    JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField();
    JTextField txtValor2 = new JTextField();
    JLabel lblResultado = new JLabel("total");
    int valor1 = 0;

    public ventana() {
        this.setVisible(true); //mostrar ventana
        this.setLocationRelativeTo(null); //centar ventana 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar la ventana a dar clic en la x
    }

    // crear panel 
    public void insertpanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setLayout(null);
    }

    public void insertarEtiquetas() {
        JLabel lblValor1 = new JLabel("ingrese el primer valor");
        lblValor1.setBounds(20, 10, 200, 10);
        panelInicio.add(lblValor1);

        JLabel lblValor2 = new JLabel("ingrese el segundo valor");
        lblValor2.setBounds(20, 10, 170, 150);
        panelInicio.add(lblValor2);

        lblResultado.setBounds(20, 180, 200, 25);
        panelInicio.add(lblResultado);

    }

    public void insertarTexto() {

        txtValor1.setBounds(190, 10, 150, 25);
        panelInicio.add(txtValor1);
        txtValor1.repaint();

        txtValor2.setBounds(190, 80, 150, 25);
        panelInicio.add(txtValor2);
        txtValor2.repaint();
    }

    public void insertarBotones() {
        JButton btnSumar = new JButton("sumar");
        btnSumar.setBounds(120, 110, 80, 30);
        panelInicio.add(btnSumar);
        btnSumar.repaint();

        ActionListener sumando = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor1 = txtValor1.getText();
                String valor2 = txtValor2.getText();

                if (valor1.equals("") || valor2.equals("")) {
                    JOptionPane.showMessageDialog(null, "debe llenar todos los campos");

                } else {
                    int resultadoSuma = Integer.parseInt(valor1) + Integer.parseInt(valor2);
                    lblResultado.setText("total: " + String.valueOf(resultadoSuma));
                }
            }
        };
        btnSumar.addActionListener(sumando);

        JButton btnSum = new JButton("+");
        btnSum.setBounds(220, 110, 80, 30);
        panelInicio.add(btnSum);
        btnSum.repaint();

        ActionListener suma2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showConfirmDialog(null, "debe ingresar un valor ");
                } else {
                    valor1 += Integer.parseInt(txtValor1.getText());
                    txtValor1.setText("");
                }
            }
        };
        btnSum.addActionListener(suma2);

        JButton btnIgual = new JButton("=");
        panelInicio.add(btnIgual);
        btnIgual.setBounds(310, 110, 60, 30);

        ActionListener Total = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtValor1.setText(String.valueOf(valor1));
            }

        };
        btnIgual.addActionListener(Total);

        JButton btn1 = new JButton("1");
        btn1.setBounds(120, 155, 50, 30);
        panelInicio.add(btn1);
        btn1.repaint();

        ActionListener agregar1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "1";
                txtValor1.setText(union);
            }
        };
        btn1.addActionListener(agregar1);

        btnSumar.addActionListener(sumando);

        JButton btn2 = new JButton("2");
        btn2.setBounds(175, 155, 50, 30);
        panelInicio.add(btn2);
        btn2.repaint();

        ActionListener agregar2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "2";
                txtValor1.setText(union);
            }
        };
        btn2.addActionListener(agregar2);
    }
}

    