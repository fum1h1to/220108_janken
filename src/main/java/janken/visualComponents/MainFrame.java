package janken.visualComponents;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import janken.Main;

public class MainFrame extends javax.swing.JFrame{
	/**
	 * Creates new form MainFrame
	 */
	public MainFrame(String title) {
		super(title);
		initComponents();
		cards.setFocusable(true);
		cards.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
				switch ( e.getKeyCode() ) {
				case KeyEvent.VK_D:
					Main.DEBUG = !Main.DEBUG;
					System.out.println("デバッグモード： " + Main.DEBUG);
					break;
				case KeyEvent.VK_W:
					Main.DEFINITELY_WIN = !Main.DEFINITELY_WIN;
					System.out.println("絶対勝てるモード： " + Main.DEFINITELY_WIN);
					break;
				}
			}
			public void keyReleased(KeyEvent e) {
			}
		});

		setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		wrap = new javax.swing.JPanel();
		cards = new javax.swing.JPanel();
		startPanel1 = new janken.visualComponents.StartPanel();
		textInputPanel1 = new janken.visualComponents.TextInputPanel();
		myHandResultPanel1 = new janken.visualComponents.MyHandResultPanel();
		jankenResultPanel1 = new janken.visualComponents.JankenResultPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(640, 480));

		wrap.setBackground(new java.awt.Color(102, 102, 102));
		wrap.setPreferredSize(new java.awt.Dimension(800, 450));

		cards.setLayout(new java.awt.CardLayout());
		cards.add(startPanel1, "card1");
		cards.add(textInputPanel1, "card2");
		cards.add(myHandResultPanel1, "card3");
		cards.add(jankenResultPanel1, "card4");

		javax.swing.GroupLayout wrapLayout = new javax.swing.GroupLayout(wrap);
		wrap.setLayout(wrapLayout);
		wrapLayout.setHorizontalGroup(
				wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(cards, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		wrapLayout.setVerticalGroup(
				wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);

		getContentPane().add(wrap, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public MyHandResultPanel getMyHandResultPanel() {
		return myHandResultPanel1;
	}

	public JankenResultPanel getJankenResultPanel() {
		return jankenResultPanel1;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel cards;
	private janken.visualComponents.JankenResultPanel jankenResultPanel1;
	private janken.visualComponents.MyHandResultPanel myHandResultPanel1;
	private janken.visualComponents.StartPanel startPanel1;
	private janken.visualComponents.TextInputPanel textInputPanel1;
	private javax.swing.JPanel wrap;
	// End of variables declaration//GEN-END:variables
}
