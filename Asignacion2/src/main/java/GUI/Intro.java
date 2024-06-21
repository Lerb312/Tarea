package GUI;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Intro extends javax.swing.JFrame {

    public Intro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENID@");

        jButton1.setText("CONTINUAR...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Cargar archivo MINBORRA.IN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(151, 151, 151))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String opcion = "/MINBORRA";
        InputStream input = getClass().getResourceAsStream(opcion);
        File file = new File(opcion);
        String contenido = "";
        ArrayList<String>  patrones = new ArrayList<>();
        String patron = "";
        
        System.out.println(file.exists());
        if(file.exists()){
            System.out.println("si");
            try{
                 BufferedReader br = new BufferedReader(new InputStreamReader(input));  
                 String linea;
              
                while((linea = br.readLine()) != null){
                    contenido += linea + "";
                 }
                
                contenido = contenido.replace(" ","");
                String  []archivo = contenido.split("\n");
                
                int nroBorrar = Integer.parseInt(archivo[0]);
                int nroNBorrar = 0;
                int indiceNBorrar = 0;
                int p = 1;
                while (p < archivo.length && !isANumber(archivo[p])) {                    
                    p++;
                }
                
                if (p < archivo.length) {
                    nroNBorrar = Integer.parseInt(archivo[p]);
                    indiceNBorrar = p;
                }
                
                int i;
                for ( i = 1; i < indiceNBorrar; i++) {
                    for (int j = 1; j < indiceNBorrar; j++) {
                        if(i != j){
                             if ( archivo[i].length() == archivo[j].length()) {//(i+1 != indiceNBorrar) &&
                       
                                //Comparar caracteres
                                int h=0;
                                for (int k = 0; k <  archivo[i].length() ; k++) {
                                    if(archivo[i].charAt(k) == archivo[j].charAt(h)){
                                        patron += archivo[i].charAt(k);
                                    }else{
                                        patron += "?";
                                    }

                                    patrones.add(patron);
                                    patron = "";
                                }
                    }
                        }
                    }
                }
            }catch(IOException io){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean  isANumber(String num){
    try{
        Integer.parseInt(num);
        return true;
    }catch(NumberFormatException nf){
        return false;
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
