package com.lerbqs.algoritmosqs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Desafio extends javax.swing.JFrame {

    public Desafio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnQuicksort = new javax.swing.JButton();
        CbxQuick = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tADatosQ = new javax.swing.JTextArea();
        LbtTiempoDatosQ = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnSelection = new javax.swing.JButton();
        CbxSelection = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tADatosS = new javax.swing.JTextArea();
        LbTiempoDatosS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Likhan", 1, 24)); // NOI18N
        jLabel1.setText("           QUICKSORT");

        BtnQuicksort.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        BtnQuicksort.setText("Cargar Datos (Click Aqui)");
        BtnQuicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuicksortActionPerformed(evt);
            }
        });

        CbxQuick.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150", "600", "1200" }));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jLabel3.setText("Numero de Datos \"n\"");

        jLabel5.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jLabel5.setText("DATOS ORDENADOS");

        jLabel7.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jLabel7.setText("Tiempo en ejecucion ");

        tADatosQ.setColumns(20);
        tADatosQ.setRows(5);
        jScrollPane3.setViewportView(tADatosQ);

        LbtTiempoDatosQ.setFont(new java.awt.Font("Likhan", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BtnQuicksort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CbxQuick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LbtTiempoDatosQ, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(195, 195, 195))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnQuicksort)
                    .addComponent(CbxQuick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbtTiempoDatosQ, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Likhan", 1, 24)); // NOI18N
        jLabel2.setText("SELECTION SORT");

        BtnSelection.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        BtnSelection.setText("Cargar Datos (Click Aqui)");
        BtnSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelectionActionPerformed(evt);
            }
        });

        CbxSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150", "600", "1200" }));

        jLabel4.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jLabel4.setText("Numero de Datos \"n\"");

        jLabel6.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jLabel6.setText("DATOS ORDENADOS");

        jLabel8.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jLabel8.setText("Tiempo en ejecucion");

        tADatosS.setColumns(20);
        tADatosS.setRows(5);
        jScrollPane4.setViewportView(tADatosS);

        LbTiempoDatosS.setFont(new java.awt.Font("Likhan", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(112, 112, 112))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(LbTiempoDatosS, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(BtnSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CbxSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(156, 156, 156))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnSelection)
                    .addComponent(CbxSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbTiempoDatosS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnQuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuicksortActionPerformed
        //Extraccion de la opcion selecccionada del combobox
        int resultado_CBxQuick = Integer.parseInt(CbxQuick.getSelectedItem().toString());

        try {
            //llamar al archivo con la cantidad de datos seleccionada, 3 archivos diferentes: 150, 600, 1200
            //Se verifica que opcion digiti el usuario para llamar al archivo correcto
            establecerArchivo(resultado_CBxQuick, 1);
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_BtnQuicksortActionPerformed

    public void establecerArchivo(int opcion, int id) throws IOException {
            
        if(id == 1 ){
            switch (opcion) {
                case 150:
                    leerArchivo(opcion, id);
                    break;
                case 600:
                    leerArchivo(opcion, id);
                    break;
                case 1200:
                    leerArchivo(opcion, id);
                    break;
            }
        }else{
            switch (opcion) {
                case 150:
                    leerArchivo(opcion, id);
                    break;
                case 600:
                    leerArchivo(opcion, id);
                    break;
                case 1200:
                    leerArchivo(opcion, id);
                    break;
            }
                
        }
        
        
       

    }

    public void leerArchivo(int cantDatos, int id) throws IOException {
        String opcion= "";
        String opc;
        String contenido = "";
       
        
        
        if (id == 1) {
            
            switch (cantDatos) {
                
                case 150:
                    opcion= "";
                    opcion= "/home/ceos/NetBeansProjects/AlgoritmosQS/src/main/java/com/lerbqs/algoritmosqs/Datos/Quick150";
                    break;
                  case 600:
                    opcion= "";
                    opcion ="/home/ceos/NetBeansProjects/AlgoritmosQS/src/main/java/com/lerbqs/algoritmosqs/Datos/Quick600";  
                    break;
                  case 1200:
                    opcion= "";
                    opcion ="/home/ceos/NetBeansProjects/AlgoritmosQS/src/main/java/com/lerbqs/algoritmosqs/Datos/Quick1200";
                    break;
             
            }
        } else {
            switch (cantDatos) {
                case 150:
                    opcion= "";
                    opcion = "/home/ceos/NetBeansProjects/AlgoritmosQS/src/main/java/com/lerbqs/algoritmosqs/Datos/Selection150";
                    break;
                case 600:
                    opcion= "";
                    opcion = "/home/ceos/NetBeansProjects/AlgoritmosQS/src/main/java/com/lerbqs/algoritmosqs/Datos/Selection600";
                    break;
                case 1200:
                    opc = "/home/ceos/NetBeansProjects/AlgoritmosQS/src/main/java/com/lerbqs/algoritmosqs/Datos/Selection1200";
                    break;
            }
        }
        
        //LECTURA DE ARCHIVOS
        File file = new File(opcion);
        ArrayList <String> lineas = null;
         int[] valores;
        try{
            
            if(file.exists()){
            lineas = new  ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String linea;
            
                while((linea = br.readLine()) != null) {                    
                    lineas.add(linea);
                    contenido +=linea+"";
                }
                contenido = contenido.replace(" ", "");
                String [] datos = contenido.split(",");
                valores= new int[datos.length];
                for (int i = 0; i < datos.length; i++) {
                   
                    
                    try {
                         valores[i] = Integer.parseInt(datos[i]);
                    } catch (NumberFormatException e) {
                        System.err.println( e.getCause());
                    }
                }
                
                
                
                if(id == 1){
                    double tiempoInicial = System.nanoTime();
                    int[] qOrden = quickSort(valores, 0, valores.length - 1);
                    double tiempoFinal = System.nanoTime();
                    //tiempo que tarda el algoritmo en responder al n de datos
                    LbtTiempoDatosQ.setText(String.valueOf((tiempoFinal - tiempoInicial)/1000000) + "ms");
                   tranformarAString(qOrden, tADatosQ);
                } else {
                    //Tiempo que tarda el selectionsort
                    double tiempoInicial = System.nanoTime();
                    int[] sOrden = selectionSort(valores);
                    double tiempoFinal = System.nanoTime();
                    
                     LbTiempoDatosS.setText(String.valueOf((tiempoFinal - tiempoInicial)/1000000) + "ms");
                   
                    tranformarAString(sOrden, tADatosS);
                }
            }
            

        } catch (IOException ev) {
            JOptionPane.showMessageDialog(null, "Ups!! Parece que tenemos un problema, no se ha encontrado tu archivo" + ev.getCause());
        }
        
       
       
    }
    private void BtnSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelectionActionPerformed
        //Extraccion de la opcion selecccionada del combobox
        int resultado_CBxSelection = Integer.parseInt(CbxSelection.getSelectedItem().toString());
        
        try {
            //llamar al archivo con la cantidad de datos seleccionada, 3 archivos diferentes: 150, 600, 1200
            //Se verifica que opcion digiti el usuario para llamar al archivo correcto
            establecerArchivo(resultado_CBxSelection, 2);
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_BtnSelectionActionPerformed
    
    public  int[] quickSort(int[] numeros, int izq, int der) {
       
            /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
           
            while(i<j)
            {
               while (numeros[i] <= pivote && i < j) 
                  i++;

               while (numeros[j] > pivote) 
                  j--;   

               if (i<j) 
               {                                     
                   aux = numeros[i];                  
                   numeros[i]= numeros[j];
                   numeros[j]=aux;
               }
            }

             numeros[izq] = numeros[j]; 
             numeros[j] = pivote;

             if (izq < j-1)
                quickSort(numeros,izq,j-1);

             if (j+1 < der)
                quickSort(numeros,j+1,der);
             
             return numeros;
      }
private void tranformarAString(int datos[], JTextArea ta){
int salto =10;
    for (int i = 0; i < datos.length; i++) {
        
        
       
          
        
        if(i != salto){
             ta.append(String.valueOf(datos[i])+"|");
        }else{
            ta.append(String.valueOf("\n"));
            salto += 10;
        }
      
    }
}      
public int[] selectionSort (int arr[]){
        for (int i = 0; i < arr.length; i++) {
                int menor = arr[i];
                int cual = i;
                
                //Selecionar menor
                for (int j = i +1; j < arr.length; j++) {
                    if(arr[j] < menor){
                        cual = j;
                    }
            }
                int temp = arr[i];
                arr[i] = menor;
                arr[cual] = temp;
    }
         return arr;

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnQuicksort;
    private javax.swing.JButton BtnSelection;
    private javax.swing.JComboBox<String> CbxQuick;
    private javax.swing.JComboBox<String> CbxSelection;
    private javax.swing.JLabel LbTiempoDatosS;
    private javax.swing.JLabel LbtTiempoDatosQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea tADatosQ;
    private javax.swing.JTextArea tADatosS;
    // End of variables declaration//GEN-END:variables
}
