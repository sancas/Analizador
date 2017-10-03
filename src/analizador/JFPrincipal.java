/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hugo
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
    }
    
    public void analisis(String texto) {
        try {
            
            String patron = ("(while\\s|if\\s|else\\s|Array\\s|foreach\\s|for\\s|do\\s|public\\s|final\\s|void\\s|main|static\\s|args|System|out|printf)|(double\\s|bool\\s|int\\s|char\\s|string|String)|(class\\s|struct\\s)|(\\+(?!\\+\\s)|[+=]|[\\-]|[\\*]|[/]|\\s=\\s)|(&&|\\|\\||!)|(>\\s|<\\s|!=|<=|>=|==)|([a-zA-Z]+)|(\\+{2}+)|([0-9]+)|([(|)]+)|([\\[|\\]])|([{|}])|(;)|\"(.*?)\"");
            Pattern pattern = Pattern.compile(patron);
            Matcher matcher = pattern.matcher(texto);
            boolean esta1 = false, esta2 = false, esta3 = false, esta4 = false, esta5 = false, esta6 = false, esta7 = false, esta8 = false, esta9 = false;
            boolean esta10 = false, esta11 = false, esta12 = false, esta13 = false, esta14 =false;

            while(matcher.find())
            {

                String tokenTipo1 = matcher.group(1);
                if(tokenTipo1 != null && esta1 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find())
                    {
                        if(matcher2.group(1)!= null)
                        {
                            total += matcher2.group(1) + " ";
                        }
                    }
                    esta1 = true;
                    this.jTextArea1.append("\nPalabras reservadas: " + total);
                }
                String tokenTipo2 = matcher.group(2);
                if(tokenTipo2 != null && esta2 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find())
                    {
                        if(matcher2.group(2)!= null)
                        {
                            total += matcher2.group(2) + " ";
                        }
                    }
                    esta2 = true;
                    this.jTextArea1.append("\nTipos de datos: " + total);
                }


                String tokenTipo3 = matcher.group(3);
                if(tokenTipo3 != null && esta3 == false)
                {
                    String total = "";
                    Matcher matcher3 = pattern.matcher(texto);
                    while(matcher3.find())
                    {
                        if(matcher3.group(3)!= null)
                        {
                            total += matcher3.group(3) + " ";
                        }
                    }
                    esta3 = true;
                    this.jTextArea1.append("\nTipos de estructuras: " + total);
                }

                String tokenTipo4 = matcher.group(4);
                if(tokenTipo4 != null && esta4 == false)
                {
                    String total = "";
                    Matcher matcher4 = pattern.matcher(texto);
                    while(matcher4.find())
                    {
                        if(matcher4.group(4)!= null)
                        {
                            total += matcher4.group(4) + " ";
                        }
                    }
                    esta4 = true;
                    this.jTextArea1.append("\nOperadores Aritmeticos: " + total);
                }

                String tokenTipo5 = matcher.group(5);
                if(tokenTipo5 != null && esta5 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(5)!= null)
                        {
                            total += matcher2.group(5) + " ";
                        }
                    }
                    esta5 = true;
                    this.jTextArea1.append("\nOperadores logicos: " + total);
                }
                String tokenTipo6 = matcher.group(6);
                if(tokenTipo6 != null && esta6 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(6)!= null)
                        {
                            total += matcher2.group(6) + " ";
                        }
                    }
                    esta6 = true;
                    this.jTextArea1.append("\nOperadores relacionales: " + total);
                }
                String tokenTipo7 = matcher.group(7);
                if(tokenTipo7 != null && esta7 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(7)!= null)
                        {
                            total += matcher2.group(7) + " ";
                        }
                    }
                    esta7 = true;
                    this.jTextArea1.append("\nIdentificadores: " + total);
                }

                String tokenTipo8 = matcher.group(8);
                if(tokenTipo8 != null && esta8 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(8)!= null)
                        {
                            total += matcher2.group(8) + " ";
                        }
                    }
                    esta8 = true;
                    this.jTextArea1.append("\nOperador: " + total);
                }

                String tokenTipo9 = matcher.group(9);
                if(tokenTipo9 != null && esta9 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(9)!= null)
                        {
                            total += matcher2.group(9) + " ";
                        }
                    }
                    esta9 = true;
                    this.jTextArea1.append("\nNumero: " + total);
                }

                String tokenTipo10 = matcher.group(10);
                if(tokenTipo10 != null && esta10 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(10)!= null)
                        {
                            total += matcher2.group(10) + " ";
                        }
                    }
                    esta10 = true;
                    this.jTextArea1.append("\nParentesis: " + total);
                }
                String tokenTipo11 = matcher.group(11);
                if(tokenTipo11 != null && esta11 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(11)!= null)
                        {
                            total += matcher2.group(11) + " ";
                        }
                    }
                    esta11 = true;
                    this.jTextArea1.append("\nCorchetes: " + total);
                }
                String tokenTipo12 = matcher.group(12);
                if(tokenTipo12 != null && esta12 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(12)!= null)
                        {
                            total += matcher2.group(12) + " ";
                        }
                    }
                    esta12 = true;
                    this.jTextArea1.append("\nLlaves: " + total);
                }

                String tokenTipo13 = matcher.group(13);
                if(tokenTipo13 != null && esta13 == false)
                {
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(13)!= null)
                        {
                            total += matcher2.group(13) + " ";
                        }
                    }
                    esta13 = true;
                    this.jTextArea1.append("\nPuntos y comas: " + total);
                }
                String tokenTipo14 = matcher.group(14);
                if(tokenTipo14 != null && esta14 == false)
                { 
                    String total = "";
                    Matcher matcher2 = pattern.matcher(texto);
                    while(matcher2.find()){
                        if(matcher2.group(14)!= null)
                        {
                            total += matcher2.group(14) + " ";
                        }
                    }
                    esta14 = true;
                    this.jTextArea1.append("\nCadenas de texto: " + total);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Hubo un problema al intentar leer el archivo" + e);
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnLexico = new javax.swing.JButton();
        btnSintactico = new javax.swing.JButton();
        btnSemantico = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        btnAbrir.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugo\\Documents\\compiladores\\proyecto\\iconos\\ic_folder_open_black_48dp\\android\\drawable-mdpi\\ic_folder_open_black_48dp.png")); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugo\\Documents\\compiladores\\proyecto\\iconos\\ic_sd_storage_black_48dp\\android\\drawable-mdpi\\ic_sd_storage_black_48dp.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugo\\Documents\\compiladores\\proyecto\\iconos\\ic_create_new_folder_black_48dp\\android\\drawable-mdpi\\ic_create_new_folder_black_48dp.png")); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnLexico.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugo\\Documents\\compiladores\\proyecto\\iconos\\ic_clear_all_black_48dp\\android\\drawable-mdpi\\ic_clear_all_black_48dp.png")); // NOI18N
        btnLexico.setText("Análisis Léxico");
        btnLexico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLexico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLexico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnLexico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLexicoActionPerformed(evt);
            }
        });

        btnSintactico.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugo\\Documents\\compiladores\\proyecto\\iconos\\ic_insert_comment_black_48dp\\android\\drawable-mdpi\\ic_insert_comment_black_48dp.png")); // NOI18N
        btnSintactico.setText("Análisis Sintáctico");
        btnSintactico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSintactico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSintactico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSintactico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSemantico.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugo\\Documents\\compiladores\\proyecto\\iconos\\ic_chat_bubble_black_48dp\\android\\drawable-mdpi\\ic_chat_bubble_black_48dp.png")); // NOI18N
        btnSemantico.setText("Análisis Semántico");
        btnSemantico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSemantico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSemantico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSemantico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnEjecutar.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugo\\Documents\\compiladores\\proyecto\\iconos\\ic_slideshow_black_48dp\\android\\drawable-mdpi\\ic_slideshow_black_48dp.png")); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEjecutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEjecutar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEjecutar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btnLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSemantico, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSemantico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSintactico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLexico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    final static Charset ENCODING = StandardCharsets.UTF_8;
    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        final JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(analizador.JFPrincipal.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            
            if (file.getName().contains(".c") || file.getName().contains(".cpp")) {
                //this.jLabel1.setText(file.getName());
                //leyendo archivo
                String texto = "";
                Path path = Paths.get(file.getAbsolutePath());
                List<String> lineas;
                try {
                    
                    lineas = Files.readAllLines(path, ENCODING);
                    for(int x = 0; x< lineas.size(); x++)
                    {
                        jTextArea2.append(lineas.get(x));
                        jTextArea2.append("\n");
                        texto +=lineas.get(x); 
                    }
                    //jTextArea2.append(texto);
                } catch (IOException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //inicializando variables para analisis lexico
            } else {
                JOptionPane.showMessageDialog(rootPane, "Solo se permite leer archivos .c o .cpp ");
            }
            //This is where a real application would open the file.
        } else {
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLexicoActionPerformed
        // TODO add your handling code here:
        analisis(jTextArea2.getText());
    }//GEN-LAST:event_btnLexicoActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLexico;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSemantico;
    private javax.swing.JButton btnSintactico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
