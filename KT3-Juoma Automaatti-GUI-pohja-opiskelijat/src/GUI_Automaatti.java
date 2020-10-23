import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GUI_Automaatti extends JFrame {

	// Luokkamuuttujat
	// Esitell‰‰n t‰‰ll‰ jotta komponentteihin voidaan viitata mist‰ tahansa luokan
	// sis‰lt‰

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;
	private JButton kahviPainike;
	private JButton tee;
	private JButton kaakaoPainike;
	private JLabel kahviMaara;
/**
	 * Main-metodi, joka k‰ynnist‰‰ sovelluksen
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Luodaan ensmin uusi JuomaAutomaatti-olio
					JuomaAutomaatti ja = new JuomaAutomaatti();

					// K‰yttˆliittym‰ saa parametrina olion, jonka tiedot se n‰ytt‰‰
					GUI_Automaatti frame = new GUI_Automaatti(ja);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Konstruktorissa rakennetaan k‰yttˆliittym‰. Huomaa, ett‰ otetaan parametrina
	 * vastaan alussa luotu juoma-automaatti. T‰m‰ siksi, ett‰ voidaan n‰ytt‰‰ sen
	 * tiedot GUI:ssa
	 */
	public GUI_Automaatti(JuomaAutomaatti ja) {

		// Ikkunan otsikko ja koko

		setTitle("Kahviautomaatti GUI v. 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 705);

	 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		String kahvia;
		kahviMaara = new JLabel(kahvia);
		GridBagConstraints gbc_kahviMaara = new GridBagConstraints();
		gbc_kahviMaara.insets = new Insets(0, 0, 5, 0);
		gbc_kahviMaara.gridx = 2;
		gbc_kahviMaara.gridy = 4;
		contentPane.add(kahviMaara, gbc_kahviMaara);
		kahviPainike = new JButton("Kahvi");
		kahviPainike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valmistaKahvi();
			
			}
		});
		kahviPainike.setFont(new Font("Tahoma", Font.PLAIN, 16));
		kahviPainike.setIcon(new ImageIcon("C:\\Users\\oskar\\eclipse-workspace\\KT3-Juoma Automaatti-GUI-pohja-opiskelijat\\kahvi.png"));
		GridBagConstraints gbc_kahviPainike = new GridBagConstraints();
		gbc_kahviPainike.insets = new Insets(0, 0, 5, 5);
		gbc_kahviPainike.anchor = GridBagConstraints.WEST;
		gbc_kahviPainike.gridx = 1;
		gbc_kahviPainike.gridy = 4;
		contentPane.add(kahviPainike, gbc_kahviPainike);
		
		tee = new JButton("Tee");
		tee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valmistaTee();
			}
		});
		
		
		tee.setIcon(new ImageIcon("C:\\Users\\oskar\\eclipse-workspace\\KT3-Juoma Automaatti-GUI-pohja-opiskelijat\\tee.png"));
		GridBagConstraints gbc_tee = new GridBagConstraints();
		gbc_tee.insets = new Insets(0, 0, 5, 5);
		gbc_tee.gridx = 1;
		gbc_tee.gridy = 5;
		contentPane.add(tee, gbc_tee);
		
		kaakaoPainike = new JButton("Kaakao");
		kaakaoPainike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valmistaKaakao();
			}
		});
		kaakaoPainike.setIcon(new ImageIcon("C:\\Users\\oskar\\eclipse-workspace\\KT3-Juoma Automaatti-GUI-pohja-opiskelijat\\kaakao.png"));
		kaakaoPainike.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_kaakaoPainike = new GridBagConstraints();
		gbc_kaakaoPainike.insets = new Insets(0, 0, 0, 5);
		gbc_kaakaoPainike.gridx = 1;
		gbc_kaakaoPainike.gridy = 6;
		contentPane.add(kaakaoPainike, gbc_kaakaoPainike);
	}
}
