/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteelectronico;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class testV extends javax.swing.JFrame {

    /**
     * Creates new form testV
     */
    public int Sel[]=new int [4];
    public int Keypoint;
    public int SelO=1;
    public int SelO1=1;
    public int SelEsp;
    public int SelO2=1;
    public boolean allow=false;
    public String Opciones1[] = {"Cuando encuentra el apartamento que quería, empieza \na llamar al camión de la mudanza, esperando en la acera \na que el camión llegue se encuentre con un indigente que \nle pide dinero ella lo observa y le da 4 mil pesos porque \nsabe que ese hombre debe de estar pasando hambre; muy a su\npesar el hombre se levanta se mete a la tienda que queda\\nenfrente de su casa a comprar alcohol y emborracharse. \n" +
                                 "El camión de mudanza nunca llega, llegaría dentro de \nun día , porque los hombres se perdieron por \nel camino peligroso y nada transitado. \n" +
                                 "Al día siguiente tiene que llevar ropa que ya ha usado \nporque la mudanza nada que llegaba a sus clases \nregulares y para cuando vuelve el camión ya está esperándola \ny comienza a descargar sus cosas. \n",
                 
                                 "Luego de elegir el apartamento que quiere, llama al \ncamión de la mudanza y mientras espera ve a un indigente que \nle pide dinero, ella en cambio le da comida, porque sabe \nque ese hombre debe de tener hambre, el hombre la mira con \nojos tiernos y devora la comida que la chica le dió. \n"
                                 + "El camión de la mudanza llega y ella empieza a descargar \nsus cosas. "};
        
    public String Opciones2[] = {"La chica elige sushi y espera su pedido, cuando llega \nella lo devora sin dejar nada, pero lastimosamente se \ndespierta a medianoche a vomitar porque el pescado crudo le cayó mal. \nY se verá obligada a estar yendo al baño cada cierto \ntiempo, pero no puede faltar a clases porque tiene un \nquiz muy importante.",
                                     "La chica elige pizza y espera su pedido, cuando llega \nse come la mitad y deja algunos pedazos para que desayune \nal día siguiente."};
        
    public  String Opciones3[] = {"Le pregunta qué le pasa, él le cuenta que está triste porque \nquiere dejar el alcohol pero se le hace muy difícil \nella decide aconsejarle que se meta en un grupo de alcohólicos \nanónimos y reduzca las dosis de alcohol poco a poco no lo suspenda \ntan bruscamente porque la ansiedad que sentirán sera peor \nel le agradece sus consejos le da las botellas de cerveza que tiene \nescondidas y le pide que las arroje a la basura, solo \nse quedaría con una, ella hace y le desea buenas noches a \nJaime y sube a su apartamento.\n" +
                                        "A la mañana siguiente cuando ella se dirige a la universidad se \nencuentra a Jaime y este le cuenta que ya se inscribió a un \ngrupo de alcohólicos y hoy es su primera cita, ella le \ndice que si quiere después de que llegue de la universidad \npuede ir a asearse a su apartamento para ir bien presentado,\na pesar de no ser una entrevista él quiere hacer lo mejor \nporque es algo supremamente importante para el, Jaime \nacepta contento la oferta de la chica. \n" +
                                        "jaime va a su reunión y se siente muy bien, decide ir \na contarle a la chica y ella lo felicita Jaime \nestá muy feliz por su avance.",
            
                                        "hacen contacto visual y sigue su camino hasta llegar a su apartamento\npero los sollozos de Jaime no la dejan dormir.\n" +
                                        "a la mañana siguiente ve a Jaime con los ojos rojos de tanto llorar \ny ella igual porque no pudo pegar ojo en toda la noche \npor los sollozos de él se siente fatal por no haberlo ayudado, \npero ella no le debe nada, decide seguir de largo e irse \na la universidad. \ncuando ella vuelve de la universidad encuentra a Jaime \nborracho lleno de basura. decide no mirar y sube \na su apartamento, escucha golpes, Jaime está recibiendo \nuna paliza, lo dejan tendido en el piso, ella solo puede mirar, no\npuede hacer más nada, al fin de cuentas él no es su papá\n"};
       
    public String Opciones4[] = {"Decirle que ella es su hija ","Decirle que lo mejor es que siga con su vida"};
    
    public String Opciones6[] = {"Jaime acepta","Jaime Rechaza"};
    
    public testV() {
        initComponents();
    }
    public static void Random(int Opciones[]){
        Random Generar = new Random();
        for(int i=1;i<=3;i++){
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(testV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
