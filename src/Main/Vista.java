/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author GREGORIO
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    
    Chomsky chomsky=new Chomsky();
    List<String> variablesNoTerminales;
    List<String> variablesTerminales;
     Map<String,List<String>> transiciones;
     List<String> borrarNoGeneradoras=new ArrayList<>();
     String varInicial;
     String contenidoLista="";

    public Vista() {
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

        InputVariablesTerminales = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextVariablesTerminales = new javax.swing.JTextField();
        TextVariableInicial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextSigma = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputVariablesTerminales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputVariablesTerminalesActionPerformed(evt);
            }
        });

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Gramatica Chomsky");

        jLabel2.setText("Variables no Terminales");

        jLabel3.setText("Variables Terminales");

        TextVariablesTerminales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextVariablesTerminalesActionPerformed(evt);
            }
        });

        TextVariableInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextVariableInicialActionPerformed(evt);
            }
        });

        jLabel4.setText("Variable Inicial");

        jLabel5.setText("Sigma");

        TextSigma.setColumns(20);
        TextSigma.setRows(5);
        jScrollPane1.setViewportView(TextSigma);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextVariableInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextVariablesTerminales, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(InputVariablesTerminales, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputVariablesTerminales, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextVariablesTerminales, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextVariableInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputVariablesTerminalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputVariablesTerminalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputVariablesTerminalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.setVisible(false);
        chomsky.TextArea.setText("");
        chomsky.setVisible(false);
        String varNoTer= InputVariablesTerminales.getText();
        variablesNoTerminales= new ArrayList<String>(Arrays.asList(varNoTer.split(",")));
        variablesNoTerminales.stream()
                            .forEach(vt -> {
                                            esString(vt.trim(),"La variable no terminal ");
                                            System.out.println("variable no terminal: " +vt);});
        String varTer= TextVariablesTerminales.getText();
        variablesTerminales= new ArrayList<String>(Arrays.asList(varTer.split(",")));
        variablesTerminales.add("ε");
        variablesTerminales.add("λ");
        variablesTerminales.stream()
                            .forEach(vt -> {
                                            noEsNumero(vt.trim(),"La variable terminal ");
                                            System.out.println("variable terminal: " + vt);});
        varInicial = TextVariableInicial.getText();
        boolean estaVarInicial = variablesNoTerminales.stream()
                                .anyMatch(vnt-> vnt.equals(varInicial));
        
        if(estaVarInicial==false){
            JOptionPane.showMessageDialog(rootPane, "La variable inicial " +varInicial +" no se encuentra en las variables no terminales");
        }else{
        System.out.println(estaVarInicial);
        chomsky.setString(TextSigma.getText());
        
        Map<String, List<String>> transiciones=null;
        
        //Asignar sigma a un map
                String a;
        /*Map<String, List<String>> transiciones =
                Arrays.stream(TextSigma.getText().split(","))
                //.map(i-> i.split("/"))
                //.forEach(System.out::println)
                .map(i-> i.split("→"))
                .collect(Collectors.groupingBy(entry->entry[0],v->convertirSigma(v[1])));
                /*.collect(Collectors.groupingBy(entry-> entry[0],
                        Collectors.mapping(entry->convertirSigma(entry[1]),
                                Collectors.toList() )));*/
        

        //transiciones.entrySet().stream().forEach(e->System.out.println(e.getKey() + " : " + e.getValue()));
        
        chomsky.TextArea.setText("Sigma sus Transacciones ...." +"\n" + "\n" );
        guardarTransiciones(TextSigma.getText());
        
       

        chomsky.setVisible(true);
        
        }
        
        
        /*if(!validarString(InputVariablesTerminales.getText().trim())){
            JOptionPane.showMessageDialog(rootPane, "LOS DATOS NO SON VALIDOS");
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextVariablesTerminalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextVariablesTerminalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextVariablesTerminalesActionPerformed

    private void TextVariableInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextVariableInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextVariableInicialActionPerformed

    public void esString(String datos,String mensaje){
        if(!datos.matches("[a-zA-Z]")){
            JOptionPane.showMessageDialog(rootPane, mensaje + datos  + " no esta permitida");
        }
    }
    public void noEsNumero(String datos,String mensaje){
        if(!datos.matches("[0-9]") && !datos.matches("[λε]")){
            JOptionPane.showMessageDialog(rootPane, mensaje + datos  + " no esta permitido");
        }
    }
    
    public void guardarTransiciones(String sigma){
        String[] obtenerTransiciones=sigma.split(",");
        String a=Arrays.toString(obtenerTransiciones);
        List<String> az=Arrays.stream(obtenerTransiciones)
                .collect(Collectors.toList());
                
       az.stream().forEach(x->chomsky.TextArea.setText(chomsky.TextArea.getText() + x ));
       transiciones= az.stream()
               .map(tra-> tra.split("→"))
               .collect(Collectors.toMap(entry-> entry[0],entry-> convertirSigma(entry[1])));
        //System.out.println(transiciones);
        
        transiciones.entrySet()
                .stream()
                .forEach(e-> generadores(e.getKey(),e.getValue()));
        
        chomsky.TextArea.setText(chomsky.TextArea.getText() +"\n" + "\n" + "\n" +"Eliminando no generadoras" +"\n");
        //borrarNoGeneradoras.remove(-1);
        //System.out.println("Index de " + borrarNoGeneradoras.indexOf("SS"));
        borrarNoGeneradoras.stream()
                .forEach(bTran-> {
                    System.out.println(bTran);
                    System.out.println(varInicial);
                    if(!bTran.equals(varInicial)){
                        System.out.println("Probando q llega en no generadoras: "+ bTran);
                    chomsky.TextArea.setText(chomsky.TextArea.getText() +  bTran +" no es generadora");
                    
                    transiciones.remove(bTran);
                    }
                    });
        List<String> TransicionesGeneran=obtenerKeyMap(transiciones);
        imprimirMap(TransicionesGeneran);
        System.out.println(transiciones);
    }
    
    
    public List<String> convertirSigma(String a){
        String[] c=a.split("/");
        List<String> g= Arrays.stream(c)
                .map(i-> i)
                .collect(Collectors.toList());
    return g;
    }
    
    public void generadores(String key,List<String> sigma){
        
        /*sigma.stream()
                .forEach(t->System.out.println(esGenerador(t)));*/
        List<Boolean> seEncuentra=new ArrayList<Boolean>();
        for(String transiccion: variablesTerminales){
        boolean v=sigma.stream()
                .anyMatch(t->t.equals(transiccion));
        seEncuentra.add(v);
        
        }
        
        boolean c= seEncuentra.stream().anyMatch(t->t==true);
        System.out.println("Es verdadera generadora" + c) ;
        if(c==false){
        borrarNoGeneradoras.add(key);
        }
        //if(c==false){
        //    chomsky.TextArea.setText(chomsky.TextArea.getText() + "\n" + "La transicion " +key + " no es generadora");
        //transiciones.remove(key);
        //}
        
    }
    
    public boolean esGenerador(String transicion){
      boolean v=  variablesTerminales.stream()
                .anyMatch(t->t.equals(transicion) );
      return v;
    }
    
    public List<String> obtenerKeyMap(Map<String, List<String>> sigma){
    List<String> prueba= sigma.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList());
    //prueba.stream().forEach(s->System.out.println("Dentro de prueba " + s ));
    return prueba;
    }
    
    public void imprimirMap(List<String> sigma){
        List<String> prueba=transiciones.get("S");
        //sigma.stream().forEach(s->System.out.println("Probando transiciones : "+s));
        
        List<String> transi= new ArrayList<>();
        int con=0;
        System.out.println("Tamañno sigma " + sigma.size() );
        for(String s: sigma ){
            
            contenidoLista=contenidoLista+ s + "→";
            transi = transiciones.get(s);
            for(String b: transi){
            con++;
            if(con==transi.size()){
                contenidoLista= contenidoLista + b;
            }else{
                contenidoLista= contenidoLista + b + "/";
            }
            }
            con=0;
            contenidoLista= contenidoLista;
        }
        System.out.println("Contador " + con);
                System.out.println(contenidoLista);
        chomsky.TextArea.setText(chomsky.TextArea.getText() + "\n"+ "\n" + contenidoLista);

    }
    

    
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputVariablesTerminales;
    private javax.swing.JTextArea TextSigma;
    private javax.swing.JTextField TextVariableInicial;
    private javax.swing.JTextField TextVariablesTerminales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
