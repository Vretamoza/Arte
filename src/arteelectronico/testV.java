/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteelectronico;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class testV extends javax.swing.JFrame {

    /**
     * Creates new form testV
     */
    public int Sel[]=new int [5];
    public int Keypoint;
    public int SelO=1;
    public int SelO1=1;
    public int SelEsp;
    public int SelO2=1;
    public boolean allow=false;
    
  public String Opciones1[] = {"","Cuando encuentra el apartamento que quería, empieza \na llamar al camión de la mudanza, esperando en la acera \na que el camión llegue se encuentre con un indigente que \nle pide dinero ella lo observa y le da 4 mil pesos porque \nsabe que ese hombre debe de estar pasando hambre; muy a su\npesar el hombre se levanta se mete a la tienda que queda\\nenfrente de su casa a comprar alcohol y emborracharse. \n" +
                                 "El camión de mudanza nunca llega, llegaría dentro de \nun día , porque los hombres se perdieron por \nel camino peligroso y nada transitado. \n" +
                                 "Al día siguiente tiene que llevar ropa que ya ha usado \nporque la mudanza nada que llegaba a sus clases \nregulares y para cuando vuelve el camión ya está esperándola \ny comienza a descargar sus cosas. \n",
                 
                                 "Luego de elegir el apartamento que quiere, llama al \ncamión de la mudanza y mientras espera ve a un indigente que \nle pide dinero, ella en cambio le da comida, porque sabe \nque ese hombre debe de tener hambre, el hombre la mira con \nojos tiernos y devora la comida que la chica le dió. \n"
                                + "El camión de la mudanza llega y ella empieza a descargar \nsus cosas. "};
        
    public String Opciones2[] = {"","La chica elige sushi y espera su pedido, cuando llega \nella lo devora sin dejar nada, pero lastimosamente se \ndespierta a medianoche a vomitar porque el pescado crudo le cayó mal. \nY se verá obligada a estar yendo al baño cada cierto \ntiempo, pero no puede faltar a clases porque tiene un \nquiz muy importante.",
                                     "La chica elige pizza y espera su pedido, cuando llega \nse come la mitad y deja algunos pedazos para que desayune \nal día siguiente."};
        
    public  String Opciones3[] = {"","Le pregunta qué le pasa, él le cuenta que está triste porque \nquiere dejar el alcohol pero se le hace muy difícil \nella decide aconsejarle que se meta en un grupo de alcohólicos \nanónimos y reduzca las dosis de alcohol poco a poco no lo suspenda \ntan bruscamente porque la ansiedad que sentirán sera peor \nel le agradece sus consejos le da las botellas de cerveza que tiene \nescondidas y le pide que las arroje a la basura, solo \nse quedaría con una, ella hace y le desea buenas noches a \nJaime y sube a su apartamento.\n" +
                                        "A la mañana siguiente cuando ella se dirige a la universidad se \nencuentra a Jaime y este le cuenta que ya se inscribió a un \ngrupo de alcohólicos y hoy es su primera cita, ella le \ndice que si quiere después de que llegue de la universidad \npuede ir a asearse a su apartamento para ir bien presentado,\na pesar de no ser una entrevista él quiere hacer lo mejor \nporque es algo supremamente importante para el, Jaime \nacepta contento la oferta de la chica. \n" +
                                        "jaime va a su reunión y se siente muy bien, decide ir \na contarle a la chica y ella lo felicita Jaime \nestá muy feliz por su avance.",
            
                                        "hacen contacto visual y sigue su camino hasta llegar a su apartamento\npero los sollozos de Jaime no la dejan dormir.\n" +
                                        "a la mañana siguiente ve a Jaime con los ojos rojos de tanto llorar \ny ella igual porque no pudo pegar ojo en toda la noche \npor los sollozos de él se siente fatal por no haberlo ayudado, \npero ella no le debe nada, decide seguir de largo e irse \na la universidad. \ncuando ella vuelve de la universidad encuentra a Jaime \nborracho lleno de basura. decide no mirar y sube \na su apartamento, escucha golpes, Jaime está recibiendo \nuna paliza, lo dejan tendido en el piso, ella solo puede mirar, no\npuede hacer más nada, al fin de cuentas él no es su papá\n"};
       
    public String Opciones4[] = {"","Decirle que ella es su hija ","Decirle que lo mejor es que siga con su vida"};
    
    public String Opciones6[] = {"","Jaime acepta","Jaime Rechaza"};
    
    public testV() {
        initComponents();
        Random(Sel);
        JOptionPane.showMessageDialog(null,Sel[1]);
        JOptionPane.showMessageDialog(null,Sel[2]);
    }
    public static void Random(int Opciones[]){
        Random Generar = new Random();
        for(int i=1;i<=2;i++){
            int Aux = Generar.nextInt(3);
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
        Text = new javax.swing.JTextArea();
        Ing1 = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Ing2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text.setColumns(20);
        Text.setRows(5);
        Text.setText("Una chica que está en segundo año \nde derecho ha vuelto a la ciudad \ndonde creció después de haber hecho \nsu primer año en otro país. Está buscando \napartamentos que queden cerca de su \nuniversidad para que todo sea más fácil. \nEncuentra dos apartamentos \n1. 5 minutos de la universidad pero por un camino \ntotalmente solo y peligroso \n2. 20 minutos de la universidad pero por un camino \nmás transitado, pero al ser más transitado ocurren \nmuchos trancones. \n");
        jScrollPane1.setViewportView(Text);

        Ing1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Webp.net-resizeimage.png"))); // NOI18N
        Ing1.setText("jButton1");
        Ing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing1ActionPerformed(evt);
            }
        });

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Ing2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Webp.net-resizeimage.png"))); // NOI18N
        Ing2.setText("jButton3");
        Ing2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ing1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ing2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ing1)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ing2))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        JOptionPane.showMessageDialog(null,SelO);
        if(allow==true){
            switch(SelO){
                case 1:{
                    Text.setText("Cuando ya ha terminado de acomodar todo, cuyo procesos le llevó 3 días está cansada y hambrienta decide ordenar comida por rappi, tiene 15k en rappicreditos si come sushi le saldrá totalmente gratis, pero si coge pizza tendrá que pagar 3k demás.");
                    SelO++;
                    allow=false;
                    break;
                }
                case 2:{
                    switch(SelO1){
                        case 1:{
                            Text.setText("A la mañana siguiente se va a la universidad y se encuentra al indigente este la saluda alegremente, hay algo en el que le recuerda a alguien pero no sabe a quien, cuando va caminando alguien grita su apellido y ella y el indigente voltean al mismo tiempo, ambos se miran extrañados.");
                            SelO1++;
                            break;
                        }
                        case 2:{
                            Text.setText("Señor: ¿Es usted apellido Perez señorita? Hola, mi nombre es Jaime Perez\n" +
                            "Ella sorprendida se da cuenta que el es su padre, el que la abandonó cuando era muy pequeña porque el tenia  problemas con el alcohol.\n" +
                            "Chica: Hola, mi nombre es Julia Pérez (miente)\n" +
                            "Señor: ¡vaya! tenemos el mismo apellido, que coincidencia");
                            SelO1++;
                            break;
                        }
                        case 3:{
                            Text.setText("la chica se despide del hombre y se dirige al paradero de buses, ella pensó que sentiría rabia al ver al hombre que le dio la vida pero que la abandonó a ella y a su mama despues de tantos años, pero sorprendentemente siente mucha pena por él, en el estado en el que está, se dejó consumir por el alcohol.\n" +
                             "la chica va a clase regular y cuando llega al edificio, encuentra a Jaime que está llorando.");
                            SelO1=1;
                            allow=false;
                            SelO++;
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                        switch(SelO1){
                            case 1:{
                                Text.setText("Ya han pasado varios meses desde que jaime estuvo llorando, la chica y Jaime han hablado más los últimos meses, escucho de los vecino que tuvo una hija, pero que la abandonó y se arrepiente de ella cada dia pero no puede hacer nada ahora mismo.");
                                SelO1++;
                                break;
                            }
                            case 2:{
                                Text.setText("la chica se siente un poco mal al escuchar eso, todavía no sabe si decirle que ella es su hija, pero la verdad no quiere sentir que él al saber eso va a estar con ella por compromiso o porque realmente la ama y la extrañó después de tantos años, pero no quiere averiguarlo, simplemente no le dirá.");
                                SelO1=1;
                                allow=false;
                                SelO++;
                                break;
                            }
                        }
                        break;
                }
                case 4:{
                    switch(SelEsp){
                        case 1:{
                            Text.setText("Jaime al estar sobrio empieza a recordar y le cuenta a la chica que está arrepentido de haber dejado perder el control de su vida por causa del alcohol, y le dice que le gustaría poder reencontrarse con su familia y pedirles perdón por haberles abandonado. Y que además ahora que consiguió un trabajo, puede ayudarles con los gastos");
                            break;
                        }
                        case 2:{
                            switch(SelO2){
                                case 1:{
                                    Text.setText("Después de varios días la chica no ha vuelto a ver al indigente que era su padre. Al salir hacia la universidad se encuentra con una de sus vecinas y caminan juntas a tomar el bus. ");
                                    SelO2++;
                                    break;
                                }
                                case 2:{
                                    Text.setText("De camino a la parada de bus pasan por la esquina en la que siempre estaba Jaime y su vecina le dice que desde que internaron a Jaime ahora el barrio se veía limpio y no lleno de la basura con la que este convive");
                                    SelO2++;
                                    break;
                                }
                                case 3:{
                                    Text.setText("La chica al escuchar esto queda en shock y le pregunta a su vecina en cual hospital lo tienen internado, ella le responde y luego la chica le pide que se adelante, que olvidó algo en casa");
                                    SelO2++;
                                    break;
                                }
                                case 4:{
                                    Text.setText("La chica corre a su casa y se encierra a llorar, porque a pesar de no querer entablar una relación con su padre, sigue siendo su padre, sale del edificio, toma un taxi y llega al hospital, pregunta por Jaime Pérez y la enferma le cuenta que el necesita un trasplante de hígado o morirá");
                                    SelO2++;
                                    break;
                                }
                                case 5:{
                                    Text.setText("para que un alcohólico reciba una donación debe de tener por lo menos 1 año de sobriedad y Jaime no cumple con esa característica, así que no califica en la lista");
                                    SelO2++;
                                    break;
                                }
                                case 6:{
                                    Text.setText("la única manera de recibir el higado es que un familiar donde por el, al escuchar eso, la chica le dice a la enferma que ella es su hija y se quiere hacer los exámenes de compatibilidad para ver si es apta para donar o no");
                                    SelO2++;
                                    break;
                                }
                                case 7:{
                                    Text.setText("luego de una larga espera, los exámenes salen positivos; la chica va corriendo a la habitación de su papá y le dice que encontraron un donante para él y ");
                                    SelO2++;
                                    break;
                                }
                                case 8:{
                                    Text.setText("el sorprendido dice que no lo puede creer que el no esta en la lista pero la chica le dice que es ella quien va a donarle un pedazo de su hígado");
                                    SelO2++;
                                    break;
                                }
                                case 9:{
                                    Text.setText("y le dice que queda en él la decision, si lo acepta o no, le dice su verdadero nombre, monica perez y cae en la cuenta de que ella es su hija.");
                                    SelO2=1;
                                    allow=false;
                                    break;
                                }
                                
                            }
                            break;
                        }
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione una de las Opciones","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NextActionPerformed

    private void Ing2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing2ActionPerformed
        if(SelO==1){
            Text.setText(Opciones1[Sel[2]]);
            for(int i=1;i<=3;i++){
                Sel[i]=0;
            }
            Random(Sel);
            allow=true;
        }
        if(SelO==2){
            Text.setText(Opciones2[Sel[2]]);
            for(int i=1;i<=3;i++){
                Sel[i]=0;
            }
            Random(Sel);
            allow=true;
        }
        if(SelO==3){
            Text.setText(Opciones3[Sel[2]]);
            for(int i=1;i<=3;i++){
                Sel[i]=0;
            }
            Keypoint=Sel[2];
            Random(Sel);
            allow=true;
        }
        if(SelO==4){
            Text.setText(Opciones4[Sel[2]]);
            for(int i=1;i<=3;i++){
                Sel[i]=0;
            }
            Random(Sel);
            allow=true;
        }
    }//GEN-LAST:event_Ing2ActionPerformed

    private void Ing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing1ActionPerformed
        if(SelO==1){
            Text.setText(Opciones1[Sel[1]]);
            for(int i=1;i<=3;i++){
                Sel[i]=0;
            }
            Random(Sel);
            allow=true;
        }
        if(SelO==2){
            Text.setText(Opciones2[Sel[1]]);
            for(int i=1;i<=3;i++){
                Sel[i]=0;
            }
            Random(Sel);
            allow=true;
        }
        if(SelO==3){
            Text.setText(Opciones3[Sel[1]]);
            for(int i=1;i<=3;i++){
                Sel[i]=0;
            }
            Keypoint=Sel[1];
            Random(Sel);
            allow=true;
        }
        if(SelO==4){
            
        }
    }//GEN-LAST:event_Ing1ActionPerformed

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
    private javax.swing.JButton Ing1;
    private javax.swing.JButton Ing2;
    private javax.swing.JButton Next;
    private javax.swing.JTextArea Text;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
