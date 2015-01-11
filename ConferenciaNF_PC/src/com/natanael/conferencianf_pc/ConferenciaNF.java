/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natanael.conferencianf_pc;

import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author ngafo_000
 */
public class ConferenciaNF extends javax.swing.JFrame {

    //static String ipServer = "192.168.0.184";
    static String ipServer = "192.168.0.125";
    static String portaServer = "12345";
    
    String codFornecedor = "";

    static Socket server;

    public Boolean testServer = true;
    
    String codProd = "";
    
    Boolean inserir = false;
    Boolean insert = false;
    Boolean gravacao = false;
    Boolean consultaChave = false;
    
    Boolean spinnerLoad = true;
    Boolean spinLoad = true;
    
    Boolean ContinuaInserir = true;

    int selectedItem = -1;
    
    InputStream entrada = null;
    OutputStream saida = null;
    
    //ArrayList<String> itens;
    DefaultListModel itens;
    ArrayList<String> codProduto;
    ArrayList<String> descProduto;
    ArrayList<String> quantProtudo;
    
    ArrayList<String> modelo;
    ArrayList<String> serie;
    
    
    
    
    public ConferenciaNF() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        conectar(ipServer,portaServer);
        
    	//itens = new ArrayList<String>();
        itens = new DefaultListModel();
    	codProduto = new ArrayList<String>();
        descProduto = new ArrayList<String>();
        quantProtudo = new ArrayList<String>();
        modelo = new ArrayList<String>();
        
        botaoInserir.setEnabled(inserir);
        botaoPesquisar.setEnabled(inserir);
        botaoGravar.setEnabled(inserir);
        botaoEditar.setEnabled(inserir);
        botaoRemover.setEnabled(inserir);
        botaoLimpar.setEnabled(inserir);
        
        
        txtCnpj.setText("");
        txtChaveAcesso.setText("");
        txtChaveAcesso.setFocusable(true);
        txtChaveAcesso.requestFocus();
        
        modelo.add("Selecione um Modelo ");
        modelo.add("55");
        modelo.add("01");
        modelo.add("04");
        
        for(int i=0;i< modelo.size();i++)
            listaModelo.addItem(modelo.get(i));
        //txtCnpj.setFocusable(false);
        txtForn.setFocusable(false);
        txtNumNF.setFocusable(false);
        txtserieNF.setFocusable(false);
        //txtChaveAcesso.setFocusable(false);
        txtDataEmissao.setFocusable(false);
        
        
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        txtForn = new javax.swing.JTextField();
        txtNumNF = new javax.swing.JTextField();
        txtserieNF = new javax.swing.JTextField();
        txtChaveAcesso = new javax.swing.JTextField();
        listaModelo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProd = new javax.swing.JList();
        botaoInserir = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        botaoGravar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        txtDataEmissao = new javax.swing.JTextField();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CNPJ/CPF");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fornecedor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Número NF");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Modelo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Série");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Data Emissão");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Chave de Acesso");

        txtCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCnpjMouseClicked(evt);
            }
        });
        txtCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCnpjKeyPressed(evt);
            }
        });

        txtForn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumNF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumNF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumNFKeyPressed(evt);
            }
        });

        txtserieNF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtserieNF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtserieNFKeyPressed(evt);
            }
        });

        txtChaveAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChaveAcesso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChaveAcessoKeyPressed(evt);
            }
        });

        listaModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaModeloItemStateChanged(evt);
            }
        });
        listaModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaModeloKeyPressed(evt);
            }
        });

        listaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdMouseClicked(evt);
            }
        });
        listaProd.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProdValueChanged(evt);
            }
        });
        listaProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaProdKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(listaProd);

        botaoInserir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoInserir.setText("Inserir");
        botaoInserir.setPreferredSize(new java.awt.Dimension(100, 40));
        botaoInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoInserirMouseClicked(evt);
            }
        });

        botaoPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.setPreferredSize(new java.awt.Dimension(100, 40));
        botaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPesquisarMouseClicked(evt);
            }
        });

        botaoGravar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoGravar.setText("Gravar");
        botaoGravar.setPreferredSize(new java.awt.Dimension(100, 40));
        botaoGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoGravarMouseClicked(evt);
            }
        });

        botaoEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setPreferredSize(new java.awt.Dimension(100, 40));
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarMouseClicked(evt);
            }
        });

        botaoRemover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoRemover.setText("Remover");
        botaoRemover.setPreferredSize(new java.awt.Dimension(100, 40));
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseClicked(evt);
            }
        });

        botaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.setPreferredSize(new java.awt.Dimension(100, 40));
        botaoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoLimparMouseClicked(evt);
            }
        });

        txtDataEmissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDataEmissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataEmissaoKeyPressed(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setPreferredSize(new java.awt.Dimension(100, 40));
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtChaveAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumNF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtserieNF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtForn, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(txtNumNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtserieNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtChaveAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnpjMouseClicked
        if(txtCnpj.getText().toString().compareTo("")!= 0){
            String cnpj = txtCnpj.getText().toString();

            if(cnpj.length() == 18)
            {
                    if(cnpj.charAt(10) == '/')
                    {
                            String c1 = cnpj.substring(0,2);
                            String c2 = cnpj.substring(3,6);
                            String c3 = cnpj.substring(7,10);
                            String c4 = cnpj.substring(11,15);
                            String c5 = cnpj.substring(16,18);
                            txtCnpj.setText(c1+c2+c3+c4+c5);
                            txtCnpj.selectAll();
                    }
            }
            else if (cnpj.length() == 14)
            {
                    if(cnpj.charAt(11)== '-')
                    {
                            String c1 = cnpj.substring(0,3);
                            String c2 = cnpj.substring(4,7);
                            String c3 = cnpj.substring(8,11);
                            String c4 = cnpj.substring(12,14);
                            txtCnpj.setText(c1+c2+c3+c4);
                            txtCnpj.selectAll();
                }
            }
        }
    }//GEN-LAST:event_txtCnpjMouseClicked

    private void txtCnpjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnpjKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtCnpj.getText().toString().length() == 14)
            {
                String cnpj = txtCnpj.getText().toString();
                String c1 = cnpj.substring(0,2);
                String c2 = cnpj.substring(2,5);
                String c3 = cnpj.substring(5,8);
                String c4 = cnpj.substring(8,12);
                String c5 = cnpj.substring(12,14);

                txtCnpj.setText(c1 + "." + c2 + "." + c3 + "/" + c4 + "-" + c5);

                consultaFornecedor(txtCnpj.getText().toString());

            }
            else if(txtCnpj.getText().toString().length() == 11)
            {
                String cpf = txtCnpj.getText().toString();
                String c1 = cpf.substring(0,3);
                String c2 = cpf.substring(3,6);
                String c3 = cpf.substring(6,9);
                String c4 = cpf.substring(9,11);

                txtCnpj.setText(c1 + "." + c2 + "." + c3 + "-" + c4);

                //((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
                //.hideSoftInputFromWindow(txtCnpj.getWindowToken(), 0);
                consultaFornecedor(txtCnpj.getText().toString());


            }
            else
            {
                showErro("CPNJ/CPF inválido","Consulta Fornecedor",false);
                txtCnpj.selectAll();
            }

        }
    }//GEN-LAST:event_txtCnpjKeyPressed

    private void txtChaveAcessoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveAcessoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtChaveAcesso.getText().length() == 44){
                if(!consultaChave){
                    decodificaChaveAcesso(txtChaveAcesso.getText().toString());
                }else{
                    int res = JOptionPane.showConfirmDialog(null,
                            "Deseja mesmo consultar outra chave de acesso ?",
                            "Consultar Chave de Acesso",
                            JOptionPane.YES_NO_OPTION);
                    
                    if(res == JOptionPane.YES_OPTION){
                        consultaChave = false;
        	        decodificaChaveAcesso(txtChaveAcesso.getText().toString());
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,
                        "A chave de acesso deve ter 44 digitos !",
                        "Chave de Acesso",
                        JOptionPane.ERROR_MESSAGE);
                txtChaveAcesso.selectAll();
            }
        }
    }//GEN-LAST:event_txtChaveAcessoKeyPressed

    private void botaoInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInserirMouseClicked
        inserirCodigo();
    }//GEN-LAST:event_botaoInserirMouseClicked

    private void botaoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarMouseClicked
        
        String input = "";
        
        input = JOptionPane.showInputDialog(null,
                "Pesquisar Produto",
                "Descrição do Produto");
        
        if(input.compareTo("")!=0)
            pesquisarProdutoDescricao(input);
        
        
    }//GEN-LAST:event_botaoPesquisarMouseClicked

    private void botaoGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGravarMouseClicked
        int res = JOptionPane.showConfirmDialog(null,
                "Deseja mesmo gravar esta nota ?",
                "Gravação NF",
                JOptionPane.YES_NO_OPTION);
        
        if (res == JOptionPane.YES_OPTION)
        {
            String nNF = txtNumNF.getText().toString();
            String modNF = listaModelo.getItemAt(listaModelo.getSelectedIndex()).toString();
            String serNF = txtserieNF.getText().toString();
            String datNF = txtDataEmissao.getText().toString();
            String chNF = txtChaveAcesso.getText().toString();
            if(itens.size() > 0){
                if(nNF.compareTo("")!= 0 & modNF.compareTo("")!= 0 & datNF.compareTo("")!= 0){
                    if(modNF.compareTo("55")==0 ){
            		if((serNF.compareTo("")==0))
                            showErro("Série Nota Fiscal obrigatória para nota fiscal modelo 55 !", "Gravação NF", false);
            		else if(chNF.compareTo("")== 0)
                            showErro("Chave de Acesso obrigatória para nota fiscal modelo 55 !", "Gravação NF", false);
            		else
                            if(validaData())
            			gravaItensNF();
                            else
            			showErro("Data de Emissão inválida", "Gravação NF", false);
                    }else if(modNF.compareTo("04")==0 ){
            		if(validaData())
                            gravaItensNF();
                        else
                            showErro("Data de Emissão inválida", "Gravação NF", false);
                    }else if(modNF.compareTo("01")==0 ){
            		if(validaData())
                            gravaItensNF();
                        else
                            showErro("Data de Emissão inválida", "Gravação NF", false);
                    }
                    else
                        showErro("Modelo da NF Inválido !", "Gravação NF", false);					
            	}else
                    showErro("Existem campos em branco !", "Gravação NF", false);
          }else
            showErro("Não existem produtos para gravação !", "Gravação NF", false);
        }
        
    }//GEN-LAST:event_botaoGravarMouseClicked

    private void botaoRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseClicked
        final int pos = selectedItem;
	if(pos != -1){
            String dados[] = listaProd.getSelectedValue().toString().split("-");
					
            String nomeProduto = dados[1];

            int res = JOptionPane.showConfirmDialog(null,
                    "Deseja mesmo remover o produto: " + nomeProduto + " ?",
                    "Remover produto",
                    JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION){
                itens.remove(pos);
                codProduto.remove(pos);
                descProduto.remove(pos);
                quantProtudo.remove(pos);
                //listaProd.remove(pos);
                listaProd.setModel(itens);
            }
        }else
            showErro("Selecione um item da lista", "Remoção de Item", false);
					
    }//GEN-LAST:event_botaoRemoverMouseClicked

    private void botaoEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMouseClicked
        final int pos = selectedItem;
	if(pos != -1){
            String dados[] = listaProd.getSelectedValue().toString().split("-");

            final String nomeProduto = dados[1];
            final String codigoProduto = dados[0];
            
            int res = JOptionPane.showConfirmDialog(null,
                    "Deseja mesmo editar o produto: " + nomeProduto + " ?",
                    "Editar produto",
                    JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION){
                editarQuantidadeItem(codigoProduto, nomeProduto, pos);
            }
        }else
            showErro("Selecione um item da lista", "Edi��o de Item", false);	
				
    }//GEN-LAST:event_botaoEditarMouseClicked

    private void botaoLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLimparMouseClicked
        int res = JOptionPane.showConfirmDialog(null,
                    "Deseja mesmo limpar a tela?",
                    "Limpar Tela",
                    JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION){
            sendMessage("CLT", null, null);
        }
    }//GEN-LAST:event_botaoLimparMouseClicked

    private void txtDataEmissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataEmissaoKeyPressed
        if(txtDataEmissao.getText().length()==2 & evt.getKeyCode() != KeyEvent.VK_DELETE & evt.getKeyCode() != KeyEvent.VK_BACK_SPACE){
            //txtDataEmissao.setText(txtDataEmissao.getText().subSequence(0, 2)+"/");
            txtDataEmissao.setText(txtDataEmissao.getText().concat("/"));
        }else if(txtDataEmissao.getText().length()==5 & evt.getKeyCode() != KeyEvent.VK_DELETE & evt.getKeyCode() != KeyEvent.VK_BACK_SPACE){
            //txtDataEmissao.setText(txtDataEmissao.getText().subSequence(0, 5)+"/");
            txtDataEmissao.setText(txtDataEmissao.getText().concat("/"));
        }else{
            if(txtDataEmissao.getText().toString().compareTo("") != 0){
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    if(!validaData()){
                        JOptionPane.showMessageDialog(null,
                            "Data inválida",
                            "Data de Emissão",
                            JOptionPane.ERROR_MESSAGE);
                        txtDataEmissao.setFocusable(true);
                        txtDataEmissao.requestFocus();
                        txtDataEmissao.selectAll();
                    }
                    else if(txtChaveAcesso.getText().toString().compareTo("")==0)
                    {
                        txtChaveAcesso.setFocusable(true);
                        txtChaveAcesso.requestFocus();
                    }
                }
            }
        }
    }//GEN-LAST:event_txtDataEmissaoKeyPressed

    private void txtNumNFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumNFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                listaModelo.setFocusable(true);
                listaModelo.requestFocus();
        }
    }//GEN-LAST:event_txtNumNFKeyPressed

    private void listaModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaModeloItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            
        }
    }//GEN-LAST:event_listaModeloItemStateChanged

    private void txtserieNFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserieNFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                txtDataEmissao.setFocusable(true);
                txtDataEmissao.requestFocus();
        }
    }//GEN-LAST:event_txtserieNFKeyPressed

    private void listaProdValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProdValueChanged
        
    }//GEN-LAST:event_listaProdValueChanged

    private void listaProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaProdKeyPressed

    private void listaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdMouseClicked
        int pos = listaProd.getSelectedIndex();
        if(pos != -1){
                selectedItem = pos;
        }else{
                selectedItem = -1;
        }
    }//GEN-LAST:event_listaProdMouseClicked

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        int res = JOptionPane.showConfirmDialog(null,
                    "Deseja mesmo sair ?" ,
                    "Sair",
                    JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION){
                this.dispose();
                new MainActivity().setVisible(true);
            }
    }//GEN-LAST:event_botaoSairMouseClicked

    private void listaModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaModeloKeyPressed
        if ( evt.getKeyCode() == KeyEvent.VK_ENTER && listaModelo.getSelectedIndex() > 0 )
        {
            if(txtChaveAcesso.getText().toString().compareTo("")==0 & txtCnpj.getText().toString().compareTo("")!= 0)
            {
                txtserieNF.setFocusable(true);
                txtserieNF.requestFocus();
            }
        }
    }//GEN-LAST:event_listaModeloKeyPressed

    

    
    public void showErro(String msg,final Boolean exit){
        JOptionPane.showMessageDialog(null, 
                msg,
                "Conferencia NF",
                JOptionPane.ERROR_MESSAGE);
        
        if(exit)
            System.exit(0);
        
    }
        
    public void showErro(String msg,String titulo,final Boolean exit){
        JOptionPane.showMessageDialog(null, 
                msg,
                titulo,
                JOptionPane.ERROR_MESSAGE);
        
        if(exit)
            System.exit(0);
    }
    
    public void sendMessage(String cmd,String msg,String title)
    {
        if(cmd.compareTo("MSG")==0){
            showErro(msg,title ,false);
        }else if(cmd.compareTo("MSG-F")==0){
            showErro(msg,title ,true);
	}else if(cmd.compareTo("CLT")==0)//Comando limpa tela
	{		  		
            inserir = false;

            codProduto.clear();
            descProduto.clear();
            quantProtudo.clear();

            //itens = null;
            itens.removeAllElements();
	    //listaProd.removeAll();
            listaProd.setModel(itens);
	                    
            txtCnpj.setText("");
            txtForn.setText("");
            txtNumNF.setText("");
            txtserieNF.setText("");
            txtDataEmissao.setText("");
            txtChaveAcesso.setText("");
	                    
	    listaModelo.setSelectedIndex(0);
	                    
            botaoGravar.setEnabled(false);
            botaoInserir.setEnabled(false);
            botaoPesquisar.setEnabled(false);
            botaoEditar.setEnabled(false);
            botaoRemover.setEnabled(false);
            botaoLimpar.setEnabled(false);
            //txtCnpj.setFocusable(false);
            txtForn.setFocusable(false);
            txtNumNF.setFocusable(false);
            txtserieNF.setFocusable(false);
            listaModelo.setFocusable(false);
            //txtChaveAcesso.setFocusable(false);
            txtDataEmissao.setFocusable(false);

            txtCnpj.setFocusable(true);

            txtChaveAcesso.setFocusable(true);
            txtChaveAcesso.requestFocus();
	}
    }
    
    public Boolean validaData()
    {
    	try{
            if(txtDataEmissao.getText().toString().length() == 10){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
                dateFormat.setLenient(false);
                String data = dateFormat.format(dateFormat.parse(txtDataEmissao.getText().toString())).toString();
            
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e)
        {
                return false;
        }
    }
    
    public void decodificaChaveAcesso(String chave)
    {
    	
        String cnpjCh = chave.substring(6,20);
        String numnfCh = chave.substring(25,34);
        String modCh = chave.substring(20,22);
        String serieCh = chave.substring(22,25);

        String c1 = cnpjCh.substring(0,2);
        String c2 = cnpjCh.substring(2,5);
        String c3 = cnpjCh.substring(5,8);
        String c4 = cnpjCh.substring(8,12);
        String c5 = cnpjCh.substring(12,14);
        
        txtCnpj.setText(c1 + "." + c2 + "." + c3 + "/" + c4 + "-" + c5);
        consultaFornecedor(txtCnpj.getText().toString());
		
        txtNumNF.setText(String.valueOf(Integer.parseInt(numnfCh)));
        txtserieNF.setText(String.valueOf(Integer.parseInt(serieCh)));
        if(modCh.compareTo("55")==0)
        {
                listaModelo.setSelectedIndex(1);
        }
        else if(modCh.compareTo("04")==0)
        {
                listaModelo.setSelectedIndex(2);
        }
        else
        {
                listaModelo.setSelectedIndex(3);
        }
        txtCnpj.setFocusable(false);
        txtChaveAcesso.setFocusable(false);
        txtDataEmissao.setFocusable(true);
        txtDataEmissao.requestFocus();
        consultaChave = true;
    }
    
    private void pesquisarProdutoDescricao(String descr){
        ArrayList<String> listaPesquisa = new ArrayList<String>();
	try{
            if(descr.compareTo("") != 0)
	    {
                Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
                conectar(ipServer,portaServer);
                enviar("CPP\n"+descr);
                String palavra = "";
                String dados[];
                listaPesquisa.clear();
                while((palavra = recebeCaracteres()).compareTo("CPPI")==0)
                {
                        dados = recebeCaracteres().split(";");
                        listaPesquisa.add(dados[0] + " - " + dados[1]);
                }
                Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
                if(palavra.compareTo("CPPF")==0 & listaPesquisa.size() >0)
                {
                    
                    Object obj[] = listaPesquisa.toArray();
                    
                    String item = JOptionPane.showInputDialog(null,
                            "Selecione o produto",
                            "Listagem de Produtos",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            obj,
                            listaPesquisa.get(0).toString()).toString();
                    
                    dados = item.split("-");
                    inserirProduto(dados[0]);
				    	
						
                    }else{
                        showErro("Nenhum produto encontrado !", "Pesquisa Produto",false);
	            }
            }
        }catch(Exception e ){
            showErro("Falha na pesquisa !", "Pesquisa Produto",false);
        }

    }
    
    public void gravaItensNF(){
        Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
        new Thread(new Runnable() {
            @Override
            public void run() {
                conectar(ipServer,portaServer);
					
                enviar("CABNF");
					
                String nNF = txtNumNF.getText().toString();
                String modNF = listaModelo.getSelectedItem().toString();
                String serNF = txtserieNF.getText().toString();
                String datNF = txtDataEmissao.getText().toString();
                String chNF = txtChaveAcesso.getText().toString();
    				
                enviar(codFornecedor + ";" + nNF + ";" + modNF + ";" + serNF + ";" + datNF + ";" + chNF);
                gravacao = false;
                receber_t();
                if(gravacao)
                {
                        enviar("GIN");
                        for(int i=0;i< itens.size();i++)
                        {
                                gravacao = false;
                                enviar(codProduto.get(i) + ";" + quantProtudo.get(i) );
                                receber_t();
				    		
                        }
                        if(gravacao)
                        {
                                enviar("FIM");
                                receber_t();
                        }
                }else{
                    showErro("Erro na gravação do cabeçalho da NF","Gravação NF",false);
                }
            }
        }).start();	
    }
    
    public void inserirProduto(String codigo)
    {
        Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
        if(codigo.compareTo("")!= 0)
        {
            conectar(ipServer,portaServer);
            enviar("CIP\n" + codigo);
            receber();
        }else{
            showErro("Código produto vazio","Consulta Produto",false);
        }
        Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);

    }

    public void consultaFornecedor(String cnpj)
    {
        Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
        if(cnpj.compareTo("") != 0)
        {
            conectar(ipServer,portaServer);
            enviar("CNF\n"+cnpj);
            receber();

        }
        Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
    }

    public void conectar(String ip, String porta){
        try{

            server = new Socket(ip,Integer.parseInt(porta));
            entrada = server.getInputStream();
            saida = server.getOutputStream();
            if(testServer)
            {
                enviar("Test Server");
                Thread.sleep(500);
                testServer = false;
            }

            String palavra = "";

            Boolean conexaoOk = false;

            while(!conexaoOk)
            {
                palavra = recebeCaracteres();
                conexaoOk = true;
                if(palavra.compareTo("Conexao OK")!=0)
                {
                    sendMessage("MSG-F","Erro na conexão com Servidor","Conexão Servidor");
                }
            }

        }catch(Exception e){
            //showErro("Servidor n�o respondeu !","Sem conex�o",true);
            sendMessage("MSG-F","Erro na conexão com Servidor","Conexão Servidor");

        }

    }
    
    public void enviar(String msg){
        try{
            if(server != null)
            {
                byte[] b = (msg+"\n").getBytes();

                if(saida != null)
                {

                    saida.write(b);
                    saida.flush();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,
                    e.toString(),
                    "Conferência NF",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void receber_t(){
        try{
            //aguarde_init();
            if(this.server != null)
            {
                entrada = server.getInputStream();
                saida = server.getOutputStream();
                if(this.entrada != null)
                {
                    String palavra="";
                    palavra = recebeCaracteres();
                    palavra.replace("\n","");

                    if(palavra.compareTo("Gravacao OK")==0)
                    {
                            gravacao = true;
                    }
                    else if(palavra.compareTo("CABNFOK")==0)
                    {
                            gravacao = true;
                    }
                    else if(palavra.compareTo("GINF")==0)
                    {
                            sendMessage("MSG","Gravação de dados da NF Concluida","Gravação NF");
                            sendMessage("CLT",null,null);

                            inserir = false;
                            consultaChave = false;

                    }
                    else if(palavra.compareTo("Falha GIND")==0)
                    {
                            gravacao = false;
                            sendMessage("MSG","Erro na gravação de dados, dados insuficientes","Gravaçãoo NF");
                    }
                    else if(palavra.compareTo("Falha GIN")==0)
                    {
                            gravacao = false;
                            sendMessage("MSG","Erro na gravação de dados","Gravação NF");
                    }
                    else if(palavra.compareTo("Falha CABNF")==0)
                    {
                            gravacao = false;
                            sendMessage("MSG","Erro na gravação do cabeçalho da NF","Gravação NF");
                    }
                }
            }
        }catch(Exception e){
            sendMessage("MSG",e.toString(),"Gravação NF");
        }

        //aguarde_end();
    }
    
    public void receber(){
        try{
            if(this.server != null)
            {
                entrada = server.getInputStream();
                saida = server.getOutputStream();
                if(this.entrada != null)
                {
                    String palavra="";
                    palavra = recebeCaracteres();
                    palavra.replace("\n","");
                    if(palavra.compareTo("Encontrado")==0)
                    {
                            palavra = recebeCaracteres();
                            if(palavra.compareTo("Falha") !=0)
                            {
                                Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
                                palavra.replace("\n","");
                                String[] dados = palavra.split(";");
                                txtForn.setText(dados[1]);
                                codFornecedor = dados[0];
                                txtForn.setEnabled(false);
                                consultaChave=true;
                                inserir = true;
                                botaoInserir.setEnabled(inserir);
                                botaoPesquisar.setEnabled(inserir);
                                botaoGravar.setEnabled(inserir);
                                botaoEditar.setEnabled(inserir);
                                botaoRemover.setEnabled(inserir);
                                botaoLimpar.setEnabled(inserir);
                                if(txtChaveAcesso.getText().toString().compareTo("")!= 0)
                                {
                                    txtDataEmissao.setFocusable(true);
                                    txtDataEmissao.requestFocus();
                                }
                                else
                                {
                                    txtChaveAcesso.setFocusable(false);
                                    txtNumNF.setFocusable(true);
                                    txtNumNF.requestFocus();
                                }

                            }
                            else
                            {
                                    showErro("Fornecedor não Encontrado",false);
                                    txtChaveAcesso.setFocusable(true);
                                    txtCnpj.setFocusable(true);
                            }

                    }
                    else if(palavra.compareTo("CIP")== 0)
                    {
                            palavra = recebeCaracteres();
                            if(palavra.compareTo("Encontrado")==0)
                        {
                            palavra = recebeCaracteres();
                            if(palavra.compareTo("Falha") != 0)
                            {
                                    Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
                                    palavra.replace("\n","");
                                    String[] dados = palavra.split(";");
                                    quantidadeItem(dados[1],dados[0]);
                            }
                            else
                            {
                                    showErro("Produto não Encontrado",false);
                            }
                        }
                            else
                            {
                                    showErro("Produto não Encontrado",false);
                            }
                    }
                    else if(palavra.compareTo("Gravacao OK")==0)
                    {
                            gravacao = true;
                    }
                    else if(palavra.compareTo("GINF")==0)
                    {
                            showErro("Gravação de dados da NF concluida.","Gravação NF",false);

                    }
                    else if(palavra.compareTo("Falha GIN")==0)
                    {
                            gravacao = false;
                            showErro("Erro na gravação de dados","Gravação NF",false);
                    }
                    else if(palavra.compareTo("Nao Encontrado")== 0)
                    {
                            showErro("Fornecedor não Encontrado",false);
                            txtForn.setText("");
                            txtCnpj.setText("");
                            txtCnpj.setFocusable(true);
                            txtCnpj.requestFocus();

                    }

                }
            }
        }catch(Exception e){
            sendMessage("MSG",e.toString(),"Gravação NF");
        }

        //aguarde_end();
    }
    
    public String recebeCaracteres() throws Exception
    {
        int res = -1;
        Boolean recebendo = true;
        String palavra="";
        while(recebendo)
        {
            res = entrada.read();
            if((char)res != '\n' & res != -1)
            {
                palavra += (char)res;
            }
            else if (res == -1)
            {
                    recebendo = false;
                    palavra =  "Falha";
            }
            else
            {
                    recebendo = false;
            }
        }
        return palavra;
    }
    
    public void editarQuantidadeItem(String cod,String desc,int pos)
    {
            final String descri = desc;
            final String codigo = cod;
            final int index = pos;
            
            String input = "";
            insert = false;
            
            input = JOptionPane.showInputDialog(null,
                    "Quantidade do produto: " + desc,
                    "Editar quantidade",
                    JOptionPane.PLAIN_MESSAGE);
            
            if(insert == false)
            {
                    insert = true;
                    codProduto.set(index,codigo);
                    descProduto.set(index,descri);
                    quantProtudo.set(index,input);
                    itens.set(index,codigo + " - " + descri + " - " + input);
                    /*listaProd.removeAll();
                    for (int i=0; i< itens.size();i++)
                    {
                        listaProd.add(itens.get(i).toString(),null);
                    }*/
                    listaProd.setModel(itens);
                    
            }
    }
    
    public void inserirCodigo()
    {
        String input = "";
        insert= false;
        
        input = JOptionPane.showInputDialog(null,
                "Insira o codigo do produto: ",
                "Código do Produto",
                JOptionPane.PLAIN_MESSAGE);
        if(input == null){
            ContinuaInserir = false;
        }else{
            if (insert == false) 
            {
                    insert = true;
                    inserirProduto(input);
                    ContinuaInserir = true;
            }
        }
    }
    
    public void quantidadeItem(String desc,String cod)
    {
        final String codigo = cod;
        final String descri = desc;
        String input = "";
        
        insert = false;
        
        input = JOptionPane.showInputDialog(null,
            "Insira a quantidade do produto: " + desc,
            "Quantidade do Produto",
            JOptionPane.PLAIN_MESSAGE);
        if(input == null){
            ContinuaInserir = false;
        }else{
            if(insert == false)
            {
                    insert = true;
                    codProduto.add(codigo);
                    descProduto.add(descri);
                    quantProtudo.add(input);
                    //itens.add(codigo + " - " + descri + " - " + input);
                    itens.addElement(codigo + " - " + descri + " - " + input);
                    listaProd.setModel(itens);
                    
                    if(ContinuaInserir)
                    {
                            inserirCodigo();
                    }
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoGravar;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox listaModelo;
    private javax.swing.JList listaProd;
    private javax.swing.JTextField txtChaveAcesso;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtDataEmissao;
    private javax.swing.JTextField txtForn;
    private javax.swing.JTextField txtNumNF;
    private javax.swing.JTextField txtserieNF;
    // End of variables declaration//GEN-END:variables
}
