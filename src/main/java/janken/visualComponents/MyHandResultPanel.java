package janken.visualComponents;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import janken.Main;
import janken.opponent.Hikakin;
import janken.opponent.Keisuke;
import janken.opponent.Opponent;
import janken.opponent.Sazae;

public class MyHandResultPanel extends javax.swing.JPanel {

	private int selectHand = -1;

	/**
	 * Creates new form MyHandResultPanel
	 */
	public MyHandResultPanel() {
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
		java.awt.GridBagConstraints gridBagConstraints;

		success = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		hikakinButton = new javax.swing.JButton();
		sazaeButton = new javax.swing.JButton();
		keisukeButton = new javax.swing.JButton();
		failure = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setBackground(new java.awt.Color(204, 204, 204));
		setForeground(new java.awt.Color(51, 51, 51));
		setLayout(new java.awt.CardLayout());

		success.setBackground(new java.awt.Color(204, 204, 204));
		success.setLayout(new java.awt.GridBagLayout());

		jLabel1.setFont(Main.PIXEL_MPLUS_24);
		jLabel1.setForeground(new java.awt.Color(51, 51, 51));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("あなたの出す手は！？");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 0.2;
		gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
		success.add(jLabel1, gridBagConstraints);

		jLabel2.setFont(Main.PIXEL_MPLUS_16);
		jLabel2.setForeground(new java.awt.Color(51, 51, 51));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("何か");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 0.8;
		gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
		success.add(jLabel2, gridBagConstraints);

		hikakinButton.setBackground(new java.awt.Color(255, 51, 51));
		hikakinButton.setFont(Main.PIXEL_MPLUS_16);
		hikakinButton.setForeground(new java.awt.Color(51, 51, 51));
		hikakinButton.setText("ヒカキンさんと勝負");
		hikakinButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hikakinButtonActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.weightx = 0.33;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 15, 0);
		success.add(hikakinButton, gridBagConstraints);

		sazaeButton.setBackground(new java.awt.Color(255, 255, 0));
		sazaeButton.setFont(Main.PIXEL_MPLUS_16);
		sazaeButton.setForeground(new java.awt.Color(51, 51, 51));
		sazaeButton.setText("サザエさんと勝負");
		sazaeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sazaeButtonActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.weightx = 0.33;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
		success.add(sazaeButton, gridBagConstraints);

		keisukeButton.setBackground(new java.awt.Color(0, 153, 255));
		keisukeButton.setFont(Main.PIXEL_MPLUS_16);
		keisukeButton.setForeground(new java.awt.Color(51, 51, 51));
		keisukeButton.setText("本田圭佑と勝負");
		keisukeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				keisukeButtonActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.weightx = 0.33;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 20);
		success.add(keisukeButton, gridBagConstraints);

		add(success, "success");

		failure.setBackground(new java.awt.Color(204, 204, 204));
		failure.setLayout(new java.awt.GridBagLayout());

		jLabel3.setFont(Main.PIXEL_MPLUS_24);
		jLabel3.setForeground(new java.awt.Color(0, 0, 0));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("手を予測出来ませんでした。");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		failure.add(jLabel3, gridBagConstraints);

		jButton1.setBackground(new java.awt.Color(51, 204, 255));
		jButton1.setFont(Main.PIXEL_MPLUS_16);
		jButton1.setForeground(new java.awt.Color(51, 51, 51));
		jButton1.setText("戻る");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 15, 20);
		failure.add(jButton1, gridBagConstraints);

		add(failure, "failure");
	}// </editor-fold>//GEN-END:initComponents

	private void hikakinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hikakinButtonActionPerformed
		// TODO add your handling code here:
		Hikakin hika = Main.getHikakin();
		if(hika == null){
			Object[] msg = {"現在準備中です。"};
			JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}
		if(!hika.getSuccess()){
			Object[] msg = {"現在準備中です。"};
			JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}
		int battleResult = hika.battle(selectHand);
		showNext(battleResult, hika);
	}//GEN-LAST:event_hikakinButtonActionPerformed

	private void sazaeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sazaeButtonActionPerformed
		// TODO add your handling code here:
		Sazae saza = Main.getSazae();
		if(saza == null){
			Object[] msg = {"現在準備中です。"};
			JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}
		if(!saza.getSuccess()){
			Object[] msg = {"現在準備中です。"};
			JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}
		int battleResult = saza.battle(selectHand);
		showNext(battleResult, saza);
	}//GEN-LAST:event_sazaeButtonActionPerformed

	private void keisukeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keisukeButtonActionPerformed
		// TODO add your handling code here:
		Keisuke kei = Main.getKeisuke();
		if(kei == null){
			Object[] msg = {"現在準備中です。"};
			JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}
		if(!kei.getSuccess()){
			Object[] msg = {"現在準備中です。"};
			JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}

		int battleResult = Main.getKeisuke().battle(selectHand);

		showNext(battleResult, kei);
	}//GEN-LAST:event_keisukeButtonActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		javax.swing.JPanel parent = (javax.swing.JPanel) SwingUtilities.getAncestorOfClass(javax.swing.JPanel.class, this);
		java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();

		layout.previous(parent);
	}//GEN-LAST:event_jButton1ActionPerformed

	private void showNext(int battleResult, Opponent opponent) {
		javax.swing.JPanel parent = (javax.swing.JPanel) SwingUtilities.getAncestorOfClass(javax.swing.JPanel.class, this);
		java.awt.CardLayout layout = (java.awt.CardLayout) parent.getLayout();

		JankenResultPanel resultPanel = Main.mainFrame.getJankenResultPanel();
		if(Main.DEFINITELY_WIN) {
			resultPanel.setJankenResult(Main.VICTORY);
		} else {
			resultPanel.setJankenResult(battleResult);
		}
		resultPanel.setOpponent(opponent);
		resultPanel.updateDisplay();

		layout.next(parent);
	}

	public void updateDisplay() {
		java.awt.CardLayout layout = (java.awt.CardLayout) this.getLayout();

		if (selectHand == Main.GU) {
			jLabel2.setText("グー！");
			jLabel2.setIcon(new ImageIcon("./images/img_gu.png"));
			layout.show(this, "success");
		} else if (selectHand == Main.CHO) {
			jLabel2.setText("チョキ！");
			jLabel2.setIcon(new ImageIcon("./images/img_cho.png"));
			layout.show(this, "success");
		} else if (selectHand == Main.PA) {
			jLabel2.setText("パー！");
			jLabel2.setIcon(new ImageIcon("./images/img_pa.png"));
			layout.show(this, "success");
		} else {
			layout.show(this, "failure");
		}
	}

	public void setSelectHand(int selectHand) {
		this.selectHand = selectHand;
		updateDisplay();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel failure;
	private javax.swing.JButton hikakinButton;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JButton keisukeButton;
	private javax.swing.JButton sazaeButton;
	private javax.swing.JPanel success;
	// End of variables declaration//GEN-END:variables
}