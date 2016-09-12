/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Fraccionario;
import clases.Indeterminacion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SP
 */
public class Ejercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio2
     */
    public Ejercicio2() {
        initComponents(); 
        cmdMixto.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeradorUno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominadorUno = new javax.swing.JTextField();
        txtEnteroUno = new javax.swing.JTextField();
        txtNumeradorDos = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominadorDos = new javax.swing.JTextField();
        txtEnteroDos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumeradorTres = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDenominadorTres = new javax.swing.JTextField();
        txtEnteroTres = new javax.swing.JTextField();
        cmbOperacionesBasicas = new javax.swing.JComboBox();
        cmdCalcular = new javax.swing.JButton();
        cmdMixto = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 18)); // NOI18N
        jLabel1.setText("Ejercicio2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 80, -1));

        txtNumeradorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeradorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, -1));

        txtDenominadorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominadorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 30));

        txtEnteroUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnteroUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtEnteroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, -1));

        txtNumeradorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeradorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 60, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 60, -1));

        txtDenominadorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominadorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, 30));

        txtEnteroDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnteroDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtEnteroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        txtNumeradorTres.setEditable(false);
        jPanel1.add(txtNumeradorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 50, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 50, -1));

        txtDenominadorTres.setEditable(false);
        jPanel1.add(txtDenominadorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 50, 30));

        txtEnteroTres.setEditable(false);
        jPanel1.add(txtEnteroTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 60, -1));

        cmbOperacionesBasicas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sumar", "Restar", "Multiplicar ", "Dividir" }));
        jPanel1.add(cmbOperacionesBasicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 110, -1));

        cmdCalcular.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(102, 0, 51));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        cmdMixto.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        cmdMixto.setForeground(new java.awt.Color(255, 153, 0));
        cmdMixto.setText("Mixto");
        cmdMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMixtoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, -1));

        cmdBorrar.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(255, 0, 0));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(634, 201));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int operacion = 0,numuno,numdos,demuno,demdos,entuno,entdos;Fraccionario f1,f2,f3=null; 
        txtNumeradorTres.setText("");txtDenominadorTres.setText("");txtEnteroTres.setText(""); 
        int sw=1; 
        if(txtEnteroUno.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
            txtEnteroUno.requestFocusInWindow();
        }else if(txtEnteroDos.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
            txtEnteroDos.requestFocusInWindow();
        }else if(txtNumeradorUno.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
            txtDenominadorUno.requestFocusInWindow();
        }else if(txtNumeradorDos.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
            txtNumeradorDos.requestFocusInWindow();
        }else if(txtDenominadorUno.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
            txtDenominadorUno.requestFocusInWindow();
        }else if(txtDenominadorDos.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
            txtNumeradorDos.requestFocusInWindow();
        }else{ 
          JOptionPane.showMessageDialog(this,"Campos requeridos agregados satisfactoriamente"); 
          try{ 
            entuno=Integer.parseInt(txtEnteroUno.getText());
          }catch(NumberFormatException e){ 
             JOptionPane.showMessageDialog(this,"La parte numero uno debe ser valida","Error",JOptionPane.ERROR_MESSAGE);
              txtEnteroUno.requestFocusInWindow();
                txtEnteroUno.selectAll();
                sw=0;
          } 
          try{ 
            entdos=Integer.parseInt(txtEnteroDos.getText());
          }catch(NumberFormatException e){ 
             JOptionPane.showMessageDialog(this,"La parte numero dos debes ser valida","Error",JOptionPane.ERROR_MESSAGE);
              txtEnteroDos.requestFocusInWindow();
                txtEnteroDos.selectAll();
                sw=0;
          } 
          try{ 
            numuno=Integer.parseInt(txtNumeradorUno.getText());
          }catch(NumberFormatException e){ 
            JOptionPane.showMessageDialog(this,"El numerador uno debe ser valido","Error",JOptionPane.ERROR_MESSAGE); 
             txtNumeradorUno.requestFocusInWindow();
                txtNumeradorUno.selectAll();
                sw=0;
          } 
          try{ 
            numdos=Integer.parseInt(txtNumeradorDos.getText()); 
          }catch(NumberFormatException e){ 
           JOptionPane.showMessageDialog(this,"El numerador dos debe ser valido","Error",JOptionPane.ERROR_MESSAGE); 
             txtNumeradorDos.requestFocusInWindow();
                txtNumeradorDos.selectAll();
                sw=0;
          } 
          try{ 
            demuno=Integer.parseInt(txtDenominadorUno.getText());
          }catch(NumberFormatException e){ 
            JOptionPane.showMessageDialog(this,"El denominador uno debe ser valido","Error",JOptionPane.ERROR_MESSAGE);
             txtDenominadorUno.requestFocusInWindow();
                txtDenominadorUno.selectAll();
                sw=0;
          } 
          try{ 
           demdos=Integer.parseInt(txtDenominadorDos.getText());
          }catch(NumberFormatException e){ 
           JOptionPane.showMessageDialog(this,"El denominador dos debe ser valido","Error",JOptionPane.ERROR_MESSAGE);
            txtDenominadorDos.requestFocusInWindow();
                txtDenominadorDos.selectAll();
           sw=0;
          } 
          if(sw==1){ 
           cmbOperacionesBasicas.getSelectedIndex(); 
           entuno=Integer.parseInt(txtEnteroUno.getText()); 
           entdos=Integer.parseInt(txtEnteroDos.getText()); 
           numuno=Integer.parseInt(txtNumeradorUno.getText()); 
           numdos=Integer.parseInt(txtNumeradorDos.getText()); 
           demuno=Integer.parseInt(txtDenominadorUno.getText()); 
           demdos=Integer.parseInt(txtDenominadorDos.getText());
           try{ 
            f1=new Fraccionario(entuno,numuno,demuno); 
            f2=new Fraccionario(entdos,numdos,demdos); 
            switch(operacion){ 
                case 0: 
                 f3=f1.Suma(f2); 
                 break;
                case 1: 
                 f3=f1.Resta(f2); 
                 break; 
                case 2: 
                 f3=f1.Multiplicacion(f2); 
                 break;
                case 3: 
                 f3=f1.Division(f2); 
                 break;
            } 
            txtEnteroTres.setText(""+f3.getEntero()); 
            txtNumeradorTres.setText(""+f3.getNumerador()); 
            txtDenominadorTres.setText(""+f3.getDenominador()); 
            cmdMixto.setEnabled(true);
           }catch(Indeterminacion e){ 
              JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                     
           }
          }
          
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMixtoActionPerformed
          try {
            // TODO add your handling code here:
            Fraccionario f3, f;
            int ent, n, d;
            ent = Integer.parseInt(txtEnteroTres.getText());
            n = Integer.parseInt(txtNumeradorTres.getText());
            d = Integer.parseInt(txtDenominadorTres.getText());
            f3 = new Fraccionario(ent, n, d);
            f = f3.FraccionMixta();
            txtEnteroTres.setText("");
            txtNumeradorTres.setText("" + f.getNumerador());
            txtDenominadorTres.setText("" + f.getDenominador());
            cmdMixto.setEnabled(false);
        } catch (Indeterminacion ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }//GEN-LAST:event_cmdMixtoActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       txtEnteroUno.setText("");
        txtEnteroDos.setText("");
        txtEnteroTres.setText("");
        txtNumeradorUno.setText("");
        txtNumeradorDos.setText("");
        txtNumeradorTres.setText("");
        txtDenominadorUno.setText("");
        txtDenominadorDos.setText("");
        txtDenominadorTres.setText("");
        txtEnteroUno.setText("");
        cmbOperacionesBasicas.setSelectedIndex(0);
        txtEnteroUno.requestFocusInWindow();
        cmdMixto.setEnabled(false);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtEnteroUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnteroUnoKeyTyped
        char c=evt.getKeyChar(); 
        if(!Character.isDigit(c)){ 
          getToolkit(); 
          evt.consume();
        }
    }//GEN-LAST:event_txtEnteroUnoKeyTyped

    private void txtNumeradorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorUnoKeyTyped
        char c=evt.getKeyChar(); 
        if(!Character.isDigit(c)){ 
          getToolkit(); 
          evt.consume(); 
        } 
    }//GEN-LAST:event_txtNumeradorUnoKeyTyped

    private void txtDenominadorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorUnoKeyTyped
      char c=evt.getKeyChar(); 
        if(!Character.isDigit(c)){ 
          getToolkit(); 
          evt.consume(); 
        } 
    }//GEN-LAST:event_txtDenominadorUnoKeyTyped

    private void txtEnteroDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnteroDosKeyTyped
       char c=evt.getKeyChar(); 
        if(!Character.isDigit(c)){ 
          getToolkit(); 
          evt.consume();
        }
    }//GEN-LAST:event_txtEnteroDosKeyTyped

    private void txtNumeradorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorDosKeyTyped
      char c=evt.getKeyChar(); 
        if(!Character.isDigit(c)){ 
          getToolkit(); 
          evt.consume(); 
        } 
    }//GEN-LAST:event_txtNumeradorDosKeyTyped

    private void txtDenominadorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorDosKeyTyped
      char c=evt.getKeyChar(); 
        if(!Character.isDigit(c)){ 
          getToolkit(); 
          evt.consume(); 
        } 
    }//GEN-LAST:event_txtDenominadorDosKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacionesBasicas;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdMixto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDenominadorDos;
    private javax.swing.JTextField txtDenominadorTres;
    private javax.swing.JTextField txtDenominadorUno;
    private javax.swing.JTextField txtEnteroDos;
    private javax.swing.JTextField txtEnteroTres;
    private javax.swing.JTextField txtEnteroUno;
    private javax.swing.JTextField txtNumeradorDos;
    private javax.swing.JTextField txtNumeradorTres;
    private javax.swing.JTextField txtNumeradorUno;
    // End of variables declaration//GEN-END:variables
}