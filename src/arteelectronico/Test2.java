

package arteelectronico;
import javax.swing.JOptionPane;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class Test2 extends javax.swing.JFrame {

    /**
     * Creates new form Texto
     */
    public String Opciones1[] = {"\"Cuando encuentra el apartamento que quería, empieza \\na llamar al camión de la mudanza, esperando en la acera \\na que el camión llegue se encuentre con un indigente que \\nle pide dinero ella lo observa y le da 4 mil pesos porque \\nsabe que ese hombre debe de estar pasando hambre; muy a su\\npesar el hombre se levanta se mete a la tienda que queda\\nenfrente de su casa a comprar alcohol y emborracharse. \\n\"\n" +
"                               + \"El camión de mudanza nunca llega, llegaría dentro de \\nun día , porque los hombres se perdieron por \\nel camino peligroso y nada transitado. \\n\"\n" +
"                "
                                + "+ \"Al día siguiente tiene que llevar ropa que ya ha usado \\nporque la mudanza nada que llegaba a sus clases \\nregulares y para cuando vuelve el camión ya está esperándola \\ny comienza a descargar sus cosas. \\n\";",
                 
                                 "Luego de elegir el apartamento que quiere, llama al \ncamión de la mudanza y mientras espera ve a un indigente que \nle pide dinero, ella en cambio le da comida, porque sabe \nque ese hombre debe de tener hambre, el hombre la mira con \nojos tiernos y devora la comida que la chica le dió. \n"
                                 + "El camión de la mudanza llega y ella empieza a descargar \nsus cosas. "};
        
    public String Opciones2[] = {"La chica elige sushi y espera su pedido, cuando llega \nella lo devora sin dejar nada, pero lastimosamente se \ndespierta a medianoche a vomitar porque el pescado crudo le cayó mal. \nY se verá obligada a estar yendo al baño cada cierto \ntiempo, pero no puede faltar a clases porque tiene un \nquiz muy importante.",
                                     "La chica elige pizza y espera su pedido, cuando llega \nse come la mitad y deja algunos pedazos para que desayune \nal día siguiente."};
        
    public  String Opciones3[] = {"\"Le pregunta qué le pasa, él le cuenta que está triste porque \\ quiere dejar el alcohol pero se le hace muy difícil \\ ella decide aconsejarle que se meta en \\ un grupo de alcohólicos anónimos y reduzca las dosis de alcohol poco a poco \\ no lo suspenda tan bruscamente porque la ansiedad que sentirán sera peor \\ el le agradece sus consejos le da las botellas de cerveza que tiene escondidas \\ y le pide que las arroje a la basura,\\ solo se quedaría con una, ella hace y le desea buenas noches a Jaime \\ y sube a su apartamento.\n" +
                                        "\"A la mañana siguiente cuando ella se dirige a la universidad se encuentra a Jaime \\ y este le cuenta que ya se inscribió a un grupo de alcohólicos y hoy es su primera cita,\\ ella le dice que si quiere después de que llegue de la universidad \\ puede ir a asearse a su apartamento para ir bien presentado,\\ a pesar de no ser una entrevista él quiere hacer lo mejor \\ porque es algo supremamente importante para el, Jaime acepta contento la oferta de la chica. \n" +
                                        "\"jaime va a su reunión y se siente muy bien, \\ decide ir a contarle a la chica y ella lo felicita Jaime \\ está muy feliz por su avance.",
            
                                        "\"hacen contacto visual y sigue su camino hasta llegar a su apartamento\\ pero los sollozos de Jaime no la dejan dormir.\n" +
                                        "\"a la mañana siguiente ve a Jaime con los ojos rojos de tanto llorar \\ y ella igual porque no pudo pegar ojo en toda la noche por los sollozos de él \\ se siente fatal por no haberlo ayudado, pero ella no le debe nada,\\  decide seguir de largo e irse a la universidad.\\ cuando ella vuelve de la universidad encuentra a Jaime borracho lleno de basura.\\ decide no mirar y sube a su apartamento, escucha golpes, Jaime está recibiendo una paliza,\\ lo dejan tendido en el piso, ella solo puede mirar, no puede hacer más nada, \\ al fin de cuentas él no es su papá"};
       
    public String Opciones4[] = {"Decirle que ella es su hija ","Decirle que lo mejor es que siga con su vida"};
    
    public String Opciones6[] = {"Jaime acepta","Jaime Rechaza"};
    
    public Test2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        Ing2 = new javax.swing.JButton();
        Ing1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Text.setColumns(20);
        Text.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Text.setRows(5);
        Text.setText("Una chica que está en segundo año \nde derecho ha vuelto a la ciudad \ndonde creció después de haber hecho \nsu primer año en otro país. Está buscando \napartamentos que queden cerca de su \nuniversidad para que todo sea más fácil. \nEncuentra dos apartamentos \n1. 5 minutos de la universidad pero por un camino \ntotalmente solo y peligroso \n2. 20 minutos de la universidad pero por un camino \nmás transitado, pero al ser más transitado ocurren \nmuchos trancones. \n");
        jScrollPane1.setViewportView(Text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 726, 254);

        Ing2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Webp.net-resizeimage.png"))); // NOI18N
        Ing2.setText("jButton1");
        Ing2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Ing2.setIconTextGap(0);
        Ing2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing2ActionPerformed(evt);
            }
        });
        getContentPane().add(Ing2);
        Ing2.setBounds(490, 330, 112, 145);

        Ing1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Webp.net-resizeimage.png"))); // NOI18N
        Ing1.setText("jButton1");
        Ing1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Ing1.setIconTextGap(0);
        Ing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing1ActionPerformed(evt);
            }
        });
        getContentPane().add(Ing1);
        Ing1.setBounds(80, 330, 110, 145);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/A_blank_black_picture.jpg"))); // NOI18N
        Background.setText("jLabel2");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 740, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing1ActionPerformed
        
    }//GEN-LAST:event_Ing1ActionPerformed

    private void Ing2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ing2ActionPerformed

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
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Texto().setVisible(true);
            }
        });
    }
    public static void Random(int Opciones[]){
        Random Generar = new Random();
        for(int i =1;i<=2;i++){
            int Aux = Generar.nextInt(2)+1;
            if(!comprobarNumero(Aux,Opciones)){
                Opciones[i]=Aux;
            }
            else{
                i--;
            }
        }
    }
    public static boolean comprobarNumero(int num,int Al[]){
               for(int i=1;i<=3;i++){
                       if(Al[i]==num){
                            return true;
                       }
               }
               return false;
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Ing1;
    private javax.swing.JButton Ing2;
    private javax.swing.JTextArea Text;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
