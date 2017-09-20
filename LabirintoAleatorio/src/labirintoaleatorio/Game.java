package labirintoaleatorio;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import labirintoaleatorio.Labirinto.Sala;

public class Game extends javax.swing.JFrame {

    public Game(String playerName, int tam) {
        initComponents();
        player = new Player(playerName);
        lblPlayerName.setText(player.getPlayerName());
        setSize(890, 640);
        setExtendedState(MAXIMIZED_BOTH);
        
        if (tam == 160) {
            gamePanel.setLayout(new java.awt.GridLayout(0, 16));
            this.x = 10;
            this.y = 16;
        }
        else if (tam == 216) {
            gamePanel.setLayout(new java.awt.GridLayout(0, 18));
            this.x = 12;
            this.y = 18;
        }
        else {
            gamePanel.setLayout(new java.awt.GridLayout(0, 20));
            this.x = 14;
            this.y = 20;
        }
        lab = new Labirinto(tam);
        createMatriz(tam); 
        
        
    }
    
    public void createMatriz(int tam) {
        Sala[] salas = lab.getSalas();
        this.matriz = new JLabel[tam];
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            //System.out.println(lab.getSala(i).getQntSala() + ""); //Printa a quantidade de salas
            matriz[i] = new JLabel();
            if (lab.getSala(i).getQntSala() == 0) {
                matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/back.png"))); 
            }
            
            else if (lab.getSala(i).getQntSala() == 1){
                if (lab.getSala(i).isUp()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/3-c.png")));
                }
                else if (lab.getSala(i).isRight()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/3-d.png")));
                }
                else if (lab.getSala(i).isDown()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/3-b.png")));
                }
                else if (lab.getSala(i).isLeft()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/3-e.png")));
                }
            }
            
            else if (lab.getSala(i).getQntSala() == 2){
                if (lab.getSala(i).isUp() && lab.getSala(i).isRight()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/2-be.png")));
                }
                else if (lab.getSala(i).isUp() && lab.getSala(i).isDown()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/2-cb.png")));
                }
                else if (lab.getSala(i).isUp() && lab.getSala(i).isLeft()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/2-bd.png")));
                }
                else if (lab.getSala(i).isRight()&& lab.getSala(i).isDown()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/2-ce.png")));
                }
                else if (lab.getSala(i).isRight()&& lab.getSala(i).isLeft()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/2-ed.png")));
                }
                else if (lab.getSala(i).isDown()&& lab.getSala(i).isLeft()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/2-cd.png")));
                }
            }
            
            else if (lab.getSala(i).getQntSala() == 3){
                if (!lab.getSala(i).isUp()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/1-cima.png")));
                }
                else if (!lab.getSala(i).isRight()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/1-dir.png")));
                }
                else if (!lab.getSala(i).isDown()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/1-baixo.png")));
                }
                else if (!lab.getSala(i).isLeft()) {
                    matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/1-esq.png")));
                }
            }
            
            else if (lab.getSala(i).getQntSala() == 4){
                matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/null.png"))); 
            }
            
            //matriz[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/def/null.png"))); 
            gamePanel.add(matriz[i]);            
        }
        gamePanel.updateUI();
    }
    
    public void addKeys() {
        if (player.getKeys() < 3) {
            player.addKeys();
            lblKeys.setText(player.getKeys() + " / 3");
        }
        if (player.getKeys() == 3){
            lblKeys.setText(player.getKeys() + " / 3");
            lblStatus.setText("Você achou todas as chaves, procure a porta.");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBar = new javax.swing.JPanel();
        lblPlayerName = new javax.swing.JLabel();
        lblPlayerImg = new javax.swing.JLabel();
        lblKeys = new javax.swing.JLabel();
        life1 = new javax.swing.JLabel();
        life2 = new javax.swing.JLabel();
        life3 = new javax.swing.JLabel();
        mainGame = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gamePanel = new javax.swing.JPanel();
        bottonBar = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        topBar.setBackground(new java.awt.Color(33, 125, 25));

        lblPlayerName.setForeground(java.awt.Color.white);
        lblPlayerName.setText("PlayerName");

        lblPlayerImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/playerIMG.png"))); // NOI18N
        lblPlayerImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayerImgMouseClicked(evt);
            }
        });

        lblKeys.setForeground(new java.awt.Color(255, 255, 255));
        lblKeys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/icons8_Password_1_25px.png"))); // NOI18N
        lblKeys.setText("0 / 3");
        lblKeys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKeysMouseClicked(evt);
            }
        });

        life1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/icons8_Hearts_25px_3.png"))); // NOI18N

        life2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/icons8_Hearts_25px_3.png"))); // NOI18N

        life3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/icons8_Hearts_25px_3.png"))); // NOI18N

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayerImg)
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPlayerName))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(life1)
                        .addGap(0, 0, 0)
                        .addComponent(life2)
                        .addGap(0, 0, 0)
                        .addComponent(life3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblKeys)
                .addGap(12, 12, 12))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblPlayerImg))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblPlayerName)
                        .addGap(2, 2, 2)
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(life1)
                            .addComponent(life2)
                            .addComponent(life3))))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblKeys)
                .addGap(18, 18, 18))
        );

        mainGame.setBackground(java.awt.Color.white);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        gamePanel.setBackground(new java.awt.Color(255, 255, 255));
        gamePanel.setLayout(new java.awt.GridLayout(0, 16));
        jScrollPane1.setViewportView(gamePanel);

        javax.swing.GroupLayout mainGameLayout = new javax.swing.GroupLayout(mainGame);
        mainGame.setLayout(mainGameLayout);
        mainGameLayout.setHorizontalGroup(
            mainGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainGameLayout.setVerticalGroup(
            mainGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottonBar.setBackground(new java.awt.Color(33, 125, 25));

        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/icons8_Notification_20px.png"))); // NOI18N
        lblStatus.setText("Bem vindo(a) ao Labirinto");
        lblStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        lblQuit.setForeground(new java.awt.Color(255, 255, 255));
        lblQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labirintoaleatorio/images/icons8_Exit_20px.png"))); // NOI18N
        lblQuit.setText("Sair");
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bottonBarLayout = new javax.swing.GroupLayout(bottonBar);
        bottonBar.setLayout(bottonBarLayout);
        bottonBarLayout.setHorizontalGroup(
            bottonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottonBarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQuit)
                .addGap(5, 5, 5))
        );
        bottonBarLayout.setVerticalGroup(
            bottonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottonBarLayout.createSequentialGroup()
                .addGroup(bottonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(lblQuit))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottonBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(bottonBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblKeysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKeysMouseClicked
        addKeys();
    }//GEN-LAST:event_lblKeysMouseClicked

    private void lblPlayerImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayerImgMouseClicked
        
    }//GEN-LAST:event_lblPlayerImgMouseClicked

    private void lblQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblQuitMouseClicked

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottonBar;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKeys;
    private javax.swing.JLabel lblPlayerImg;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel life1;
    private javax.swing.JLabel life2;
    private javax.swing.JLabel life3;
    private javax.swing.JPanel mainGame;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
    private Labirinto lab;
    private Player player;
    private JLabel matriz[];
    private Sala salas[];
    private int x, y;
}
