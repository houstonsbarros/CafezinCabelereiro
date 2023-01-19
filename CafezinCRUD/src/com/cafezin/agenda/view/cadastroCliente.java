package com.cafezin.agenda.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.cafezin.agenda.dao.CabelereiroDAO;
import com.cafezin.agenda.dao.ClienteDAO;
import com.cafezin.agenda.model.Cabeleireiro;
import com.cafezin.agenda.model.Cliente;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Houston Barros
 */
public class cadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form Agendamento
     */
    public cadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        especialidadeLabel = new javax.swing.JLabel();
        horariosLabel = new javax.swing.JLabel();
        horariosField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        buttonCadastrarCab = new javax.swing.JButton();
        dataNascField = new javax.swing.JTextField();
        dataNascLabel = new javax.swing.JLabel();
        anosProfissaoField = new javax.swing.JTextField();
        anosProfissaoLabel = new javax.swing.JLabel();
        especialidadeField = new javax.swing.JTextField();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        logoCafezin = new javax.swing.JLabel();
        nomeClienteLabel = new javax.swing.JLabel();
        nomeClienteField = new javax.swing.JTextField();
        buttonCadastrarCab1 = new javax.swing.JButton();
        dataField = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        sexoOption = new javax.swing.JComboBox<>();

        jScrollPane1.setViewportView(jTextPane1);

        especialidadeLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        especialidadeLabel.setForeground(new java.awt.Color(145, 109, 75));
        especialidadeLabel.setText("Especialidade");

        horariosLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        horariosLabel.setForeground(new java.awt.Color(145, 109, 75));
        horariosLabel.setText("Horários de Trabalho");

        horariosField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        horariosField.setForeground(new java.awt.Color(145, 109, 75));
        horariosField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        horariosField.setSelectionColor(new java.awt.Color(145, 109, 75));

        nomeLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(145, 109, 75));
        nomeLabel.setText("Nome");

        nomeField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        nomeField.setForeground(new java.awt.Color(145, 109, 75));
        nomeField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        nomeField.setSelectionColor(new java.awt.Color(145, 109, 75));

        buttonCadastrarCab.setBackground(new java.awt.Color(145, 109, 75));
        buttonCadastrarCab.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarCab.setText("Cadastrar Cabeleireiro");
        buttonCadastrarCab.setBorder(null);
        buttonCadastrarCab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarCabActionPerformed(evt);
            }
        });

        dataNascField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dataNascField.setForeground(new java.awt.Color(145, 109, 75));
        dataNascField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        dataNascField.setSelectionColor(new java.awt.Color(145, 109, 75));

        dataNascLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        dataNascLabel.setForeground(new java.awt.Color(145, 109, 75));
        dataNascLabel.setText("Data de Nascimento");

        anosProfissaoField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        anosProfissaoField.setForeground(new java.awt.Color(145, 109, 75));
        anosProfissaoField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        anosProfissaoField.setSelectionColor(new java.awt.Color(145, 109, 75));

        anosProfissaoLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        anosProfissaoLabel.setForeground(new java.awt.Color(145, 109, 75));
        anosProfissaoLabel.setText("Anos de Profissão");

        especialidadeField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        especialidadeField.setForeground(new java.awt.Color(145, 109, 75));
        especialidadeField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        especialidadeField.setSelectionColor(new java.awt.Color(145, 109, 75));

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoCafezin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Houston Barros\\Documents\\NetBeansProjects\\Agenda\\src\\main\\java\\resources\\images\\Cafezin.png")); // NOI18N

        nomeClienteLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        nomeClienteLabel.setForeground(new java.awt.Color(145, 109, 75));
        nomeClienteLabel.setText("Nome");

        nomeClienteField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        nomeClienteField.setForeground(new java.awt.Color(145, 109, 75));
        nomeClienteField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        nomeClienteField.setSelectionColor(new java.awt.Color(145, 109, 75));

        buttonCadastrarCab1.setBackground(new java.awt.Color(145, 109, 75));
        buttonCadastrarCab1.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarCab1.setText("Cadastrar Cliente");
        buttonCadastrarCab1.setBorder(null);
        buttonCadastrarCab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarCab1ActionPerformed(evt);
            }
        });

        dataField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dataField.setForeground(new java.awt.Color(145, 109, 75));
        dataField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        dataField.setSelectionColor(new java.awt.Color(145, 109, 75));

        telefoneLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        telefoneLabel.setForeground(new java.awt.Color(145, 109, 75));
        telefoneLabel.setText("Telefone");

        sexoLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        sexoLabel.setForeground(new java.awt.Color(145, 109, 75));
        sexoLabel.setText("Sexo");

        sexoOption.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        sexoOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(logoCafezin)
                                .addContainerGap(250, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(sexoOption, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(telefoneLabel)
                                                        .addComponent(dataField)))
                                        .addComponent(nomeClienteLabel)
                                        .addComponent(sexoLabel)
                                        .addComponent(buttonCadastrarCab1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                        .addComponent(nomeClienteField))
                                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(logoCafezin)
                                .addGap(34, 34, 34)
                                .addComponent(nomeClienteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sexoLabel)
                                        .addComponent(telefoneLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dataField, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(sexoOption))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(buttonCadastrarCab1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
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
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void buttonCadastrarCabActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void buttonCadastrarCab1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(nomeClienteField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite um nome!");
            nomeClienteField.requestFocus();
        } else if (sexoOption.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione um sexo!");
            sexoOption.requestFocus();
        } else if (dataField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite um telefone!");
            dataField.requestFocus();
        } else {
            String nome = nomeClienteField.getText();
            String sexo = Arrays.toString(sexoOption.getSelectedObjects());

            // Removo os colchetes após tranformar o objeto em String
            sexo = sexo.replace("[", "");
            sexo = sexo.replace("]", "");


            String telefone = dataField.getText();

            ClienteDAO clienteDao = new ClienteDAO();

            Cliente cliente = new Cliente();

            cliente.setNome(nome);
            cliente.setSexo(sexo);
            cliente.setTelefone(telefone);

            clienteDao.create(cliente);

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

            setVisible(false);
        }
    }

    private javax.swing.JTextField anosProfissaoField;
    private javax.swing.JLabel anosProfissaoLabel;
    private javax.swing.JButton buttonCadastrarCab;
    private javax.swing.JButton buttonCadastrarCab1;
    private javax.swing.JTextField dataField;
    private javax.swing.JTextField dataNascField;
    private javax.swing.JLabel dataNascLabel;
    private javax.swing.JTextField especialidadeField;
    private javax.swing.JLabel especialidadeLabel;
    private javax.swing.JTextField horariosField;
    private javax.swing.JLabel horariosLabel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel logoCafezin;
    private javax.swing.JTextField nomeClienteField;
    private javax.swing.JLabel nomeClienteLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JComboBox<String> sexoOption;
    private javax.swing.JLabel telefoneLabel;
    // End of variables declaration
}

