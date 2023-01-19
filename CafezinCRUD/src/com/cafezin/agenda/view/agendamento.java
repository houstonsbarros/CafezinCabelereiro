package com.cafezin.agenda.view;/*
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
import java.util.List;

/**
 *
 * @author Houston Barros
 */
public class agendamento extends javax.swing.JFrame {

    /**
     * Creates new form Agendamento
     */
    public agendamento() {
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

        jPanel1 = new javax.swing.JPanel();
        logoCafezin = new javax.swing.JLabel();
        horaLabel = new javax.swing.JLabel();
        horaField = new javax.swing.JTextField();
        agendarHorario = new javax.swing.JButton();
        dataField = new javax.swing.JTextField();
        dataLabel = new javax.swing.JLabel();
        profissionalLabel = new javax.swing.JLabel();
        selectProfissional = new javax.swing.JComboBox();
        selectCliente = new javax.swing.JComboBox();
        clienteLabel = new javax.swing.JLabel();
        dataField1 = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        pagamentoLabel = new javax.swing.JLabel();
        selectPagamento = new javax.swing.JComboBox();
        dataField2 = new javax.swing.JTextField();
        valorLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoCafezin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Houston Barros\\Documents\\NetBeansProjects\\Agenda\\src\\main\\java\\resources\\images\\Cafezin.png")); // NOI18N

        horaLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        horaLabel.setForeground(new java.awt.Color(145, 109, 75));
        horaLabel.setText("Hora");

        horaField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        horaField.setForeground(new java.awt.Color(145, 109, 75));
        horaField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        horaField.setSelectionColor(new java.awt.Color(145, 109, 75));

        agendarHorario.setBackground(new java.awt.Color(145, 109, 75));
        agendarHorario.setForeground(new java.awt.Color(255, 255, 255));
        agendarHorario.setText("Agendar Horário");
        agendarHorario.setBorder(null);
        agendarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarHorarioActionPerformed(evt);
            }
        });

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

        dataField1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dataField1.setForeground(new java.awt.Color(145, 109, 75));
        dataField1.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        dataField1.setSelectionColor(new java.awt.Color(145, 109, 75));

        valorLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        valorLabel.setForeground(new java.awt.Color(145, 109, 75));
        valorLabel.setText("Valor");

        pagamentoLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        pagamentoLabel.setForeground(new java.awt.Color(145, 109, 75));
        pagamentoLabel.setText("Forma de Pagamento");

        selectPagamento.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        selectPagamento.setForeground(new java.awt.Color(145, 109, 75));
        selectPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Dinheiro", "PIX", "Cartão de Crédito", "Cartão de Débito" }));

        dataField2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dataField2.setForeground(new java.awt.Color(145, 109, 75));
        dataField2.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        dataField2.setSelectionColor(new java.awt.Color(145, 109, 75));

        valorLabel1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        valorLabel1.setForeground(new java.awt.Color(145, 109, 75));
        valorLabel1.setText("Serviço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(250, 250, 250)
                                                .addComponent(logoCafezin))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                        .addComponent(selectCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 76, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(horaLabel)
                                        .addComponent(horaField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valorLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valorLabel1))
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agendarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(dataField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(valorLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dataField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(18, 18, 18)
                                .addComponent(agendarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
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

    private void agendarHorarioActionPerformed(java.awt.event.ActionEvent evt) {
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        Agendamento agendamento = new Agendamento();
        Cliente cliente = new Cliente();
        Cabeleireiro cabeleireiro = new Cabeleireiro();

        String hora = horaField.getText();
        String dataAgenda = dataField.getText();
        Integer valor = Integer.valueOf(dataField1.getText());
        String servico = dataField2.getText();
        String formaPagamento = (String) selectPagamento.getSelectedItem();
        String statusPG = "Aguardando Pagamento";

        cliente = (Cliente) selectCliente.getSelectedItem();
        cabeleireiro = (Cabeleireiro) selectProfissional.getSelectedItem();

        agendamento.setHora(hora);
        agendamento.setDataAgenda(dataAgenda);
        agendamento.setValor(valor);
        agendamento.setServico(servico);
        agendamento.setFormaPagamento(formaPagamento);
        agendamento.setStatusPG(statusPG);
        agendamento.setCabeleireiro(cabeleireiro);
        agendamento.setCliente(cliente);

        agendamentoDAO.create(agendamento);

        JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
        setVisible(false);
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
    private javax.swing.JButton agendarHorario;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JTextField dataField;
    private javax.swing.JTextField dataField1;
    private javax.swing.JTextField dataField2;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JTextField horaField;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoCafezin;
    private javax.swing.JLabel pagamentoLabel;
    private javax.swing.JLabel profissionalLabel;
    private javax.swing.JComboBox selectCliente;
    private javax.swing.JComboBox selectPagamento;
    private javax.swing.JComboBox selectProfissional;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JLabel valorLabel1;
    // End of variables declaration
}