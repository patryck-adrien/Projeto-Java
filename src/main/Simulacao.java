package main;

import entidades.*;
import dados.*;
import javax.swing.JOptionPane;

public class Simulacao extends javax.swing.JFrame {  
    private Botao b; 
    private Stm32 s;
    private Motores m;

    public Simulacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        atLeitura = new javax.swing.JPanel();
        atLista = new javax.swing.JPanel();
        btSensor1 = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btLer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        janela = new javax.swing.JTextArea();
        btListarTodos = new javax.swing.JButton();
        btSensor2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btSensor0 = new javax.swing.JButton();
        btBotao = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jLabel1.setText("jLabel1");

        atLeitura.setBackground(new java.awt.Color(231, 237, 243));
        atLeitura.setName("atLeitura"); // NOI18N

        javax.swing.GroupLayout atLeituraLayout = new javax.swing.GroupLayout(atLeitura);
        atLeitura.setLayout(atLeituraLayout);
        atLeituraLayout.setHorizontalGroup(
            atLeituraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        atLeituraLayout.setVerticalGroup(
            atLeituraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout atListaLayout = new javax.swing.GroupLayout(atLista);
        atLista.setLayout(atListaLayout);
        atListaLayout.setHorizontalGroup(
            atListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        atListaLayout.setVerticalGroup(
            atListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(1, 1, 1));

        btSensor1.setText("Sensor  1");
        btSensor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSensor1ActionPerformed(evt);
            }
        });

        btGravar.setText("Gravar no Arquivo");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btLer.setText("Ler do Arquivo");
        btLer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLerActionPerformed(evt);
            }
        });

        janela.setColumns(20);
        janela.setRows(5);
        jScrollPane1.setViewportView(janela);

        btListarTodos.setText("Listar Todos");
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });

        btSensor2.setText("Sensor 2");
        btSensor2.setToolTipText("");
        btSensor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSensor2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));

        btSensor0.setText("Sensor  0");
        btSensor0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSensor0ActionPerformed(evt);
            }
        });

        btBotao.setText("Botão");
        btBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSensor0)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btBotao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBotao)
                .addGap(24, 24, 24)
                .addComponent(btSensor0)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSensor1)
                            .addComponent(btGravar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSensor2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btListarTodos)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btSensor1)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btSensor2)
                                .addGap(63, 63, 63)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar)
                    .addComponent(btLer)
                    .addComponent(btListarTodos))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Analise velocidades = new Analise(); //obj que contem o ArrayList
    
    private void btSensor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSensor2ActionPerformed
        //obter leituras
        
        //objetos
        m = new Motores(3, "");
        s = new Stm32(3, 0, 0);
        
        //mostrar
        janela.setText(m + "" + s);
        
        //s = new Stm32(3, 1);
        
        //inserir velocidades(insere na ArrayList da classe Analise)
        //velocidades.inserir(s4);
        velocidades.inserir(m, s);
    }//GEN-LAST:event_btSensor2ActionPerformed

    private void btSensor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSensor1ActionPerformed
        //obter leituras
        
        //objetos
        m = new Motores(2, "");
        s = new Stm32(2, 0, 0);
        
        //mostrar
        janela.setText(m + "" + s);
        
        //s = new Stm32(2, 1);
        
        //inserir velocidades (insere na ArrayList da classe Analise)
        //velocidades.inserir(s3);
        velocidades.inserir(m, s);
    }//GEN-LAST:event_btSensor1ActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        //abrir arq p gravacao
        velocidades.abreArquivoGravacao();
        //varrer obj arraylist gravando no arq
        velocidades.gravarObjetos();
        //fechar arq gravacao
        velocidades.fechaArquivoGravacao();

        JOptionPane.showMessageDialog(rootPane, "Gravados com sucesso!");                                      
    }//GEN-LAST:event_btGravarActionPerformed

    private void btLerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLerActionPerformed
        //abrir arq p leitura
        velocidades.abreArquivoLeitura();
        //ler objetos e preencher arraylist
        velocidades.leRegistros();
        //fechar arq leitura
        velocidades.fechaArquivoLeitura();

        JOptionPane.showMessageDialog(rootPane, "Lidos com sucesso!");
    }//GEN-LAST:event_btLerActionPerformed

    private void btSensor0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSensor0ActionPerformed
        //obter leituras

        //objetos
        m = new Motores(1, "");
        s = new Stm32(1, 0, 0);

        //mostrar
        janela.setText(m + "" + s);
        
        //s = new Stm32(1, 1);

        //inserir velocidades(insere na ArrayList da classe Analise)
        //velocidades.inserir(s2);
        velocidades.inserir(m, s);
    }//GEN-LAST:event_btSensor0ActionPerformed

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed
        //mostrar objetos na area de texto
        janela.setText( velocidades.listarTodos() );
        
    }//GEN-LAST:event_btListarTodosActionPerformed

    private void btBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBotaoActionPerformed
        if(b == null){
            //objetos
            b = new Botao(0, 1);
        }
        //mostrar
        janela.setText(b + "");
    }//GEN-LAST:event_btBotaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacao().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atLeitura;
    private javax.swing.JPanel atLista;
    private javax.swing.JButton btBotao;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLer;
    private javax.swing.JButton btListarTodos;
    private javax.swing.JButton btSensor0;
    private javax.swing.JButton btSensor1;
    private javax.swing.JButton btSensor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea janela;
    // End of variables declaration//GEN-END:variables
}
