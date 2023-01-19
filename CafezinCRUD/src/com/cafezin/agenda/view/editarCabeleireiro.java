package com.cafezin.agenda.view;

import com.cafezin.agenda.dao.CabelereiroDAO;
import com.cafezin.agenda.model.Cabeleireiro;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class editarCabeleireiro extends javax.swing.JFrame {

    public editarCabeleireiro() {
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
        especialidadeField = new javax.swing.JTextField();
        especialidadeLabel = new javax.swing.JLabel();
        horariosLabel = new javax.swing.JLabel();
        horariosField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        buttonPesquisarCabeleireiros = new javax.swing.JButton();
        dataNascField = new javax.swing.JTextField();
        dataNascLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        anosProfissaoField = new javax.swing.JTextField();
        anosProfissaoLabel = new javax.swing.JLabel();
        buttonDeletar = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();

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

        especialidadeField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        especialidadeField.setForeground(new java.awt.Color(145, 109, 75));
        especialidadeField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        especialidadeField.setSelectionColor(new java.awt.Color(145, 109, 75));

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

        buttonPesquisarCabeleireiros.setBackground(new java.awt.Color(145, 109, 75));
        buttonPesquisarCabeleireiros.setForeground(new java.awt.Color(255, 255, 255));
        buttonPesquisarCabeleireiros.setText("Pesquisar");
        buttonPesquisarCabeleireiros.setBorder(null);
        buttonPesquisarCabeleireiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarCabeleireirosActionPerformed(evt);
            }
        });

        dataNascField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dataNascField.setForeground(new java.awt.Color(145, 109, 75));
        dataNascField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        dataNascField.setSelectionColor(new java.awt.Color(145, 109, 75));

        dataNascLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        dataNascLabel.setForeground(new java.awt.Color(145, 109, 75));
        dataNascLabel.setText("Data de Nascimento");

        idLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        idLabel.setForeground(new java.awt.Color(145, 109, 75));
        idLabel.setText("ID");

        idField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(145, 109, 75));
        idField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        idField.setSelectionColor(new java.awt.Color(145, 109, 75));

        anosProfissaoField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        anosProfissaoField.setForeground(new java.awt.Color(145, 109, 75));
        anosProfissaoField.setDisabledTextColor(new java.awt.Color(145, 109, 75));
        anosProfissaoField.setSelectionColor(new java.awt.Color(145, 109, 75));

        anosProfissaoLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        anosProfissaoLabel.setForeground(new java.awt.Color(145, 109, 75));
        anosProfissaoLabel.setText("Anos de Profissão");

        buttonDeletar.setBackground(new java.awt.Color(145, 109, 75));
        buttonDeletar.setForeground(new java.awt.Color(255, 255, 255));
        buttonDeletar.setText("Deletar Cabelereiro");
        buttonDeletar.setBorder(null);
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

        buttonAtualizar.setBackground(new java.awt.Color(145, 109, 75));
        buttonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        buttonAtualizar.setText("Atualizar Cabelereiro");
        buttonAtualizar.setBorder(null);
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(31, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(anosProfissaoLabel)
                                                        .addComponent(anosProfissaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(especialidadeLabel)
                                                        .addComponent(especialidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(horariosLabel)
                                                                .addGap(47, 47, 47))
                                                        .addComponent(horariosField)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(idLabel)
                                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonPesquisarCabeleireiros, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nomeLabel))
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dataNascLabel)
                                                        .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(31, 31, 31))
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
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(logoCafezin)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(nomeLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(dataNascLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(idLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(buttonPesquisarCabeleireiros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(especialidadeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(especialidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(horariosLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(horariosField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(anosProfissaoLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(anosProfissaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        //Pegar o ID a ser pesquisado
        int idPesquisa = Integer.parseInt(idField.getText());
        CabelereiroDAO cabelereiroDAO = new CabelereiroDAO();
        Cabeleireiro cabeleireiro = cabelereiroDAO.selectCabeleireiro(idPesquisa);

        if(cabeleireiro == null){
            JOptionPane.showMessageDialog(this, "Cabeleireiro não encontrado");
        } else {
            nomeField.setText(cabeleireiro.getNome());
            dataNascField.setText(String.valueOf(cabeleireiro.getDataNasc()));
            anosProfissaoField.setText(String.valueOf(cabeleireiro.getAnosProfissao()));
            especialidadeField.setText(cabeleireiro.getEspecialidade());
            horariosField.setText(cabeleireiro.getHorariosDeTrabalho());
        }
    }

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {
        int idDeletar = Integer.parseInt(idField.getText());
        CabelereiroDAO cabelereiroDAO = new CabelereiroDAO();
        Cabeleireiro cabeleireiro = cabelereiroDAO.selectCabeleireiro(idDeletar);

        if(cabeleireiro == null){
            JOptionPane.showMessageDialog(this, "Cabeleireiro não encontrado");
        } else {
            cabelereiroDAO.deleteByID(idDeletar);
            JOptionPane.showMessageDialog(null, "Cabeleireiro deletado com sucesso");
            nomeField.setText("");
            dataNascField.setText("");
            anosProfissaoField.setText("");
            especialidadeField.setText("");
            horariosField.setText("");
        }
    }

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        Cabeleireiro c1 = new Cabeleireiro();

        CabelereiroDAO cabeleireiroDAO = new CabelereiroDAO();

        String nome = nomeField.getText();
        String dataNasc = dataNascField.getText();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date data = null;

        try {
            data = formato.parse(dataNasc);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }


        Integer anosProfissao = Integer.valueOf(anosProfissaoField.getText());
        String especialidade = especialidadeField.getText();
        String horarios = horariosField.getText();
        Integer idCabeleireiro = Integer.valueOf(idField.getText());

        c1.setNome(nome);
        c1.setDataNasc(data);
        c1.setAnosProfissao(anosProfissao);
        c1.setEspecialidade(especialidade);
        c1.setHorariosDeTrabalho(horarios);
        c1.setIdCabeleireiro(idCabeleireiro);

        cabeleireiroDAO.update(c1);

        JOptionPane.showMessageDialog(null, "Cabeleireiro atualizado com sucesso!");

        nomeField.setText("");
        dataNascField.setText("");
        anosProfissaoField.setText("");
        especialidadeField.setText("");
        horariosField.setText("");
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField anosProfissaoField;
    private javax.swing.JLabel anosProfissaoLabel;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonCadastrarCab;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonPesquisarCabeleireiros;
    private javax.swing.JTextField dataNascField;
    private javax.swing.JLabel dataNascLabel;
    private javax.swing.JTextField especialidadeField;
    private javax.swing.JLabel especialidadeLabel;
    private javax.swing.JTextField horariosField;
    private javax.swing.JLabel horariosLabel;
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
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    // End of variables declaration
}
