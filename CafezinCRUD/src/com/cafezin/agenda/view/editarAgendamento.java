package com.cafezin.agenda.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.cafezin.agenda.dao.AgendamentoDAO;
import com.cafezin.agenda.dao.CabelereiroDAO;
import com.cafezin.agenda.dao.ClienteDAO;
import com.cafezin.agenda.model.Agendamento;
import com.cafezin.agenda.model.Cabeleireiro;
import com.cafezin.agenda.model.Cliente;

import javax.swing.*;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.valueOf;

/**
 *
 * @author Houston Barros
 */
public class editarAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form EditarCabeleireiro
     */
    public editarAgendamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        loginLabel2 = new javax.swing.JLabel();
        loginField3 = new javax.swing.JTextField();
        loginLabel3 = new javax.swing.JLabel();
        loginLabel4 = new javax.swing.JLabel();
        loginField4 = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        buttonCadastrarCab = new javax.swing.JButton();
        loginField1 = new javax.swing.JTextField();
        loginLabel1 = new javax.swing.JLabel();
        loginField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        logoCafezin = new javax.swing.JLabel();
        buttonPesquisarCabeleireiros = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        buttonDeletar = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();
        selectPagamento = new javax.swing.JComboBox();
        selectProfissional = new javax.swing.JComboBox();
        selectCliente = new javax.swing.JComboBox();
        clienteLabel = new javax.swing.JLabel();
        valorField = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        horaLabel = new javax.swing.JLabel();
        horaField = new javax.swing.JTextField();
        pagamentoLabel = new javax.swing.JLabel();
        dataField = new javax.swing.JTextField();
        dataLabel = new javax.swing.JLabel();
        profissionalLabel = new javax.swing.JLabel();
        selectStatus = new javax.swing.JComboBox();
        clienteLabel1 = new javax.swing.JLabel();

        loginLabel2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        loginLabel2.setForeground(new java.awt.Color(145, 109, 75));
        loginLabel2.setText("Anos de Profissão");

        loginField3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        loginField3.setForeground(new java.awt.Color(145, 109, 75));
        loginField3.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        loginField3.setSelectionColor(new java.awt.Color(145, 109, 75));

        loginLabel3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        loginLabel3.setForeground(new java.awt.Color(145, 109, 75));
        loginLabel3.setText("Especialidade");

        loginLabel4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        loginLabel4.setForeground(new java.awt.Color(145, 109, 75));
        loginLabel4.setText("Horários de Trabalho");

        loginField4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        loginField4.setForeground(new java.awt.Color(145, 109, 75));
        loginField4.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        loginField4.setSelectionColor(new java.awt.Color(145, 109, 75));

        loginLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(145, 109, 75));
        loginLabel.setText("Nome");

        loginField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        loginField.setForeground(new java.awt.Color(145, 109, 75));
        loginField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        loginField.setSelectionColor(new java.awt.Color(145, 109, 75));

        buttonCadastrarCab.setBackground(new java.awt.Color(145, 109, 75));
        buttonCadastrarCab.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrarCab.setText("Cadastrar Cabeleireiro");
        buttonCadastrarCab.setBorder(null);

        loginField1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        loginField1.setForeground(new java.awt.Color(145, 109, 75));
        loginField1.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        loginField1.setSelectionColor(new java.awt.Color(145, 109, 75));

        loginLabel1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        loginLabel1.setForeground(new java.awt.Color(145, 109, 75));
        loginLabel1.setText("Data de Nascimento");

        loginField2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        loginField2.setForeground(new java.awt.Color(145, 109, 75));
        loginField2.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        loginField2.setSelectionColor(new java.awt.Color(145, 109, 75));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoCafezin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Houston Barros\\Documents\\NetBeansProjects\\Agenda\\src\\main\\java\\resources\\images\\Cafezin.png")); // NOI18N

        buttonPesquisarCabeleireiros.setBackground(new java.awt.Color(145, 109, 75));
        buttonPesquisarCabeleireiros.setForeground(new java.awt.Color(255, 255, 255));
        buttonPesquisarCabeleireiros.setText("Pesquisar");
        buttonPesquisarCabeleireiros.setBorder(null);
        buttonPesquisarCabeleireiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarCabeleireirosActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        idLabel.setForeground(new java.awt.Color(145, 109, 75));
        idLabel.setText("ID");

        idField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(145, 109, 75));
        idField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        idField.setSelectionColor(new java.awt.Color(145, 109, 75));

        buttonDeletar.setBackground(new java.awt.Color(145, 109, 75));
        buttonDeletar.setForeground(new java.awt.Color(255, 255, 255));
        buttonDeletar.setText("Deletar Agendamento");
        buttonDeletar.setBorder(null);
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

        buttonAtualizar.setBackground(new java.awt.Color(145, 109, 75));
        buttonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        buttonAtualizar.setText("Atualizar Agenda");
        buttonAtualizar.setBorder(null);
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });

        selectPagamento.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        selectPagamento.setForeground(new java.awt.Color(145, 109, 75));
        selectPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Dinheiro", "PIX", "Cartão de Crédito", "Cartão de Débito" }));

        selectProfissional.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        selectProfissional.setForeground(new java.awt.Color(145, 109, 75));
        selectProfissional.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        selectProfissional.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                selectProfissionalAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        selectCliente.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        selectCliente.setForeground(new java.awt.Color(145, 109, 75));
        selectCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        selectCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                selectClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        clienteLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        clienteLabel.setForeground(new java.awt.Color(145, 109, 75));
        clienteLabel.setText("Cliente");

        valorField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        valorField.setForeground(new java.awt.Color(145, 109, 75));
        valorField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        valorField.setSelectionColor(new java.awt.Color(145, 109, 75));

        valorLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        valorLabel.setForeground(new java.awt.Color(145, 109, 75));
        valorLabel.setText("Valor");

        horaLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        horaLabel.setForeground(new java.awt.Color(145, 109, 75));
        horaLabel.setText("Hora");

        horaField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        horaField.setForeground(new java.awt.Color(145, 109, 75));
        horaField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        horaField.setSelectionColor(new java.awt.Color(145, 109, 75));

        pagamentoLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        pagamentoLabel.setForeground(new java.awt.Color(145, 109, 75));
        pagamentoLabel.setText("Forma de Pagamento");

        dataField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dataField.setForeground(new java.awt.Color(145, 109, 75));
        dataField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        dataField.setSelectionColor(new java.awt.Color(145, 109, 75));

        dataLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        dataLabel.setForeground(new java.awt.Color(145, 109, 75));
        dataLabel.setText("Data");

        profissionalLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        profissionalLabel.setForeground(new java.awt.Color(145, 109, 75));
        profissionalLabel.setText("Profisisonal");

        selectStatus.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        selectStatus.setForeground(new java.awt.Color(145, 109, 75));
        selectStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Pago com Dinheiro", "Pago com PIX", "Pago com Crédito", "Pago com Débito" }));

        clienteLabel1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        clienteLabel1.setForeground(new java.awt.Color(145, 109, 75));
        clienteLabel1.setText("Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(258, 258, 258)
                                                .addComponent(logoCafezin))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(31, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idLabel)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPesquisarCabeleireiros, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(horaLabel)
                                        .addComponent(horaField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valorLabel))
                                .addGap(22, 22, 22))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pagamentoLabel)
                                        .addComponent(selectPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(profissionalLabel)
                                        .addComponent(selectProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clienteLabel)
                                        .addComponent(selectCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clienteLabel1)
                                        .addComponent(selectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(logoCafezin)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(idLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonPesquisarCabeleireiros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(horaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(horaField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(dataLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dataField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(valorLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(profissionalLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(selectProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(clienteLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(selectCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(pagamentoLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(selectPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(clienteLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(selectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
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

    private void buttonPesquisarCabeleireirosActionPerformed(java.awt.event.ActionEvent evt) {
        int idPesquisa = Integer.parseInt(idField.getText());
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        Agendamento agendamento = agendamentoDAO.selectAgendamento(idPesquisa);

        if(agendamento == null){
            JOptionPane.showMessageDialog(this, "Agendamento não encontrado");
        } else {
            horaField.setText(agendamento.getHora());
            dataField.setText(agendamento.getDataAgenda());
            valorField.setText(String.valueOf(agendamento.getValor()));
            selectPagamento.setSelectedItem(agendamento.getFormaPagamento());
            selectProfissional.setSelectedItem(agendamento.getCabeleireiro());
            selectCliente.setSelectedItem(agendamento.getCliente());
            selectStatus.setSelectedItem(agendamento.getStatusPG());
        }
    }

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {
        int idPesquisa = Integer.parseInt(idField.getText());
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        Agendamento agendamento = agendamentoDAO.selectAgendamento(idPesquisa);

        if(agendamento == null){
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
        } else {
            agendamentoDAO.deleteByID(idPesquisa);
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
            horaField.setText("");
            dataField.setText("");
            valorField.setText("");
            selectPagamento.setSelectedItem("Selecione");
            selectProfissional.setSelectedItem("Selecione");
            selectCliente.setSelectedItem("Selecione");
            selectStatus.setSelectedItem("Selecione");
        }
    }

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        Agendamento a1 = new Agendamento();
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        Cliente cliente = new Cliente();
        Cabeleireiro cabeleireiro = new Cabeleireiro();

        String hora = horaField.getText();
        String dataAgenda = dataField.getText();
        Integer valor = Integer.valueOf(valorField.getText());
        String formaPagamento = (String) selectPagamento.getSelectedItem();
        String statusPG = (String) selectStatus.getSelectedItem();
        Integer idAgendamento = Integer.valueOf(idField.getText());

        cliente = (Cliente) selectCliente.getSelectedItem();
        cabeleireiro = (Cabeleireiro) selectProfissional.getSelectedItem();

        a1.setHora(hora);
        a1.setDataAgenda(dataAgenda);
        a1.setValor(valor);
        a1.setFormaPagamento(formaPagamento);
        a1.setStatusPG(statusPG);
        a1.setCabeleireiro(cabeleireiro);
        a1.setCliente(cliente);
        a1.setIdAgenda(idAgendamento);


        agendamentoDAO.update(a1);

        JOptionPane.showMessageDialog(null, "Agendamento atualizado com sucesso!");
    }

    private void selectProfissionalAncestorAdded(javax.swing.event.AncestorEvent evt) {
        CabelereiroDAO cabelereiroDAO = new CabelereiroDAO();
        List<Cabeleireiro> listaDeCabelereiros = CabelereiroDAO.listarCabeleireiros();

        // Remove todos os itens do Combobox;
        selectProfissional.removeAll();

        for(Cabeleireiro c: listaDeCabelereiros){
            selectProfissional.addItem(c);
        }
    }

    private void selectClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> listaDeClientes = ClienteDAO.listarClientes();

        // Remove todos os itens do Combobox;
        selectCliente.removeAll();

        for(Cliente c: listaDeClientes){
            selectCliente.addItem(c);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonCadastrarCab;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonPesquisarCabeleireiros;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JLabel clienteLabel1;
    private javax.swing.JTextField dataField;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JTextField horaField;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginField;
    private javax.swing.JTextField loginField1;
    private javax.swing.JTextField loginField2;
    private javax.swing.JTextField loginField3;
    private javax.swing.JTextField loginField4;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel loginLabel4;
    private javax.swing.JLabel logoCafezin;
    private javax.swing.JLabel pagamentoLabel;
    private javax.swing.JLabel profissionalLabel;
    private javax.swing.JComboBox selectCliente;
    private javax.swing.JComboBox selectPagamento;
    private javax.swing.JComboBox selectProfissional;
    private javax.swing.JComboBox selectStatus;
    private javax.swing.JTextField valorField;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration
}
