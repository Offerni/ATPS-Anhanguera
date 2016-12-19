/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolaboradores;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Ciretran
 */
public class PjFormulario extends java.awt.Frame {
    
    Pj pjUm = new Pj("","","","",0,0,0);

    /**
     * Creates new form PjFormulario
     */
    public PjFormulario() {
        initComponents();
        this.setLocationRelativeTo(null); // seta a localização para o centro da tela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPjSalvar = new javax.swing.JButton();
        tfPjNome = new javax.swing.JTextField();
        btnPjCalcPag = new javax.swing.JButton();
        tfPjEndereco = new javax.swing.JTextField();
        lblPjNome = new javax.swing.JLabel();
        lblPjEndereco = new javax.swing.JLabel();
        lblPjTel = new javax.swing.JLabel();
        lblPjCnpj = new javax.swing.JLabel();
        tfPjValHora = new javax.swing.JTextField();
        lblPjValHora = new javax.swing.JLabel();
        btnPjSair = new javax.swing.JButton();
        lblPjHorasTrab = new javax.swing.JLabel();
        tfPjHorasTrab = new javax.swing.JTextField();
        tfPjCnpj = new javax.swing.JFormattedTextField();
        tfPjTel = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(273, 354));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        btnPjSalvar.setText("Salvar");
        btnPjSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPjSalvarActionPerformed(evt);
            }
        });

        btnPjCalcPag.setText("Calcular Pagto");
        btnPjCalcPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPjCalcPagActionPerformed(evt);
            }
        });

        tfPjEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPjEnderecoActionPerformed(evt);
            }
        });

        lblPjNome.setText("Nome");

        lblPjEndereco.setText("Endereço");

        lblPjTel.setText("Telefone");

        lblPjCnpj.setText("CNPJ");

        lblPjValHora.setText("Valor por Hora");

        btnPjSair.setText("Voltar");
        btnPjSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPjSairActionPerformed(evt);
            }
        });

        lblPjHorasTrab.setText("Horas Trabalhadas");

        tfPjHorasTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPjHorasTrabActionPerformed(evt);
            }
        });

        try {
            tfPjCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfPjTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfPjNome)
            .addComponent(tfPjEndereco)
            .addComponent(tfPjValHora)
            .addComponent(tfPjHorasTrab)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPjHorasTrab)
                .addContainerGap(157, Short.MAX_VALUE))
            .addComponent(tfPjCnpj)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPjValHora)
                    .addComponent(lblPjCnpj)
                    .addComponent(lblPjTel)
                    .addComponent(lblPjEndereco)
                    .addComponent(lblPjNome))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tfPjTel)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPjSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPjCalcPag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPjSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPjNome)
                .addGap(1, 1, 1)
                .addComponent(tfPjNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblPjEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPjEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPjTel, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(tfPjTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPjCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(tfPjCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPjValHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPjValHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblPjHorasTrab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPjHorasTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPjSalvar)
                    .addComponent(btnPjCalcPag)
                    .addComponent(btnPjSair)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
       System.exit(0); // Encerra o sistema
        
    }//GEN-LAST:event_exitForm

    private void tfPjEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPjEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPjEnderecoActionPerformed

    private void btnPjCalcPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPjCalcPagActionPerformed
       
        String nome = pjUm.getNome(); // Variáveis Locais
        String endereco = pjUm.getEndereco();
        String telefone = pjUm.getTel();
        String cnpj = pjUm.getCnpj();
        double salario = pjUm.getSalario();
        int horas = pjUm.getHoras();
        double ganhoPorHora = pjUm.calcularGanhoPorHora(salario, horas);
        
        DecimalFormat df = new DecimalFormat("###,###,##0.00"); // Métodos para formatação de numero float, 2 casas após a vírcula
        df.setMaximumFractionDigits(2);
        
        if (nome.equals("") || endereco.equals("") || telefone.equals("(  )    -    ") || cnpj.equals("  .   .   /    -  ") || salario==0 || horas==0){ // Verifica se todos os campos estão preenchidos
            JOptionPane.showMessageDialog(null, "É necessário salvar um prestador de serviços antes de calcular o pagamento.\n Caso ja tenha digitado, clique em salvar." ,"Erro", JOptionPane.ERROR_MESSAGE);         
        }
        else{
            JOptionPane.showMessageDialog(null, "\nNome: " + pjUm.getNome() + 
            "\nEndereço: " + pjUm.getEndereco() + "\nTelefone: " + pjUm.getTel() + 
            "\nCNPJ: " + pjUm.getCnpj() + "\nValor por Hora: " + pjUm.getSalario() +
            "\nHoras Trabalhadas: " + pjUm.getHoras() + "\nSalario Bruto: R$" +
             df.format(pjUm.calcularGanhoPorHora(salario, horas)) +
             "\nImposto de Renda Retido na Fonte: -R$" + df.format(pjUm.calcularIRRF(ganhoPorHora)) + 
             "\nPIS/COFINS/CSLL/ISS: -R$" + df.format(pjUm.calcularImpostos()) + 
             "\nSalario Líquido: R$" + df.format(pjUm.salarioLiquido()));
        }
    }//GEN-LAST:event_btnPjCalcPagActionPerformed

    private void btnPjSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPjSairActionPerformed
        this.dispose(); // método para fechar a janela
        String opcao; // volta para a tela inicial apos sair da janela
        do{
                opcao = JOptionPane.showInputDialog("Informe o tipo de colaborador (CLT ou PJ)");
                if (opcao == null) {
                    System.exit(0);
                }
                
                opcao = opcao.toUpperCase(); // transforma em caixa alta caso a opção tenha sido digitada em caixa baixa
                
                if (opcao.equals("CLT")){
                    new CltFormulario().setVisible(true); // exibe o formulário caso a condição acima seja verdadeira
                }
                else if (opcao.equals("PJ")){
                    new PjFormulario().setVisible(true);
                }     
        } while (!opcao.equals("CLT") && ! opcao.equals("PJ"));   
    }//GEN-LAST:event_btnPjSairActionPerformed

    private void btnPjSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPjSalvarActionPerformed
        String nome, endereco, telefone, cnpj, horas, salarioB;

        nome = tfPjNome.getText();
        endereco = tfPjEndereco.getText();
        telefone = tfPjTel.getText();
        cnpj = tfPjCnpj.getText();
        salarioB = tfPjValHora.getText();
        horas = tfPjHorasTrab.getText();
        
        if (nome.equals("") || endereco.equals("") || telefone.equals("(  )    -    ") || cnpj.equals("  .   .   /    -  ") || salarioB.equals("") || horas.equals("")){ // Verifica se todos os campos estão preenchidos
            JOptionPane.showMessageDialog(null, "PREENCHER TODOS OS CAMPOS" ,"Erro", JOptionPane.ERROR_MESSAGE);         
        }
        
        else{ // Caso não estejam, retorna mensagem de ERRO.
            JOptionPane.showMessageDialog(null, "PJ Cadastrada!");
            pjUm.setNome(nome);
            pjUm.setEndereco(endereco);
            pjUm.setTel(telefone);
            pjUm.setCnpj(cnpj);
            pjUm.setHoras(Integer.parseInt(horas));
            pjUm.setSalario(Double.parseDouble(salarioB));
        }    
    }//GEN-LAST:event_btnPjSalvarActionPerformed

    private void tfPjHorasTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPjHorasTrabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPjHorasTrabActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PjFormulario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPjCalcPag;
    private javax.swing.JButton btnPjSair;
    private javax.swing.JButton btnPjSalvar;
    private javax.swing.JLabel lblPjCnpj;
    private javax.swing.JLabel lblPjEndereco;
    private javax.swing.JLabel lblPjHorasTrab;
    private javax.swing.JLabel lblPjNome;
    private javax.swing.JLabel lblPjTel;
    private javax.swing.JLabel lblPjValHora;
    private javax.swing.JFormattedTextField tfPjCnpj;
    private javax.swing.JTextField tfPjEndereco;
    private javax.swing.JTextField tfPjHorasTrab;
    private javax.swing.JTextField tfPjNome;
    private javax.swing.JFormattedTextField tfPjTel;
    private javax.swing.JTextField tfPjValHora;
    // End of variables declaration//GEN-END:variables
}
