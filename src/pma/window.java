package pma;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;
import java.util.ArrayList;

public class window {

	private JFrame frame;
	private JTextField pharma;
	private JTextField medi;
	private JTextField strength;
	private JTextField barcode;
	private JTextField number;
	private JTextField dosage;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField numError;
	private JTextArea textArea;
	private JPanel profile;
	private JPanel barcode_1;
	private JPanel result;
	private ArrayList<Medication> medicationList;
	private ArrayList<String> errors;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArrayList<Medication> medicationList = new ArrayList<Medication>();
		medicationList.add(new Medication("TEVA UK","Bisoprolol fumarate",5,"5017007025733",28,4));
		medicationList.add(new Medication("BROWN& BURK","Ramipril",(float) 2.5,"5060124640457",28,4));
		medicationList.add(new Medication("Aspar","Dispersible Asprin",(float) 75,"5017007050520",28,4));
		medicationList.add(new Medication("TEVA UK","Atorvastatis",(float) 80,"5017007067719",28,4));
		medicationList.add(new Medication("Synthon BV","Eplerenone",(float) 25,"5391512452681",28,4));
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnPersonalMedicationAdvisor = new JTextPane();
		txtpnPersonalMedicationAdvisor.setBounds(133, 11, 178, 16);
		panel.add(txtpnPersonalMedicationAdvisor);
		txtpnPersonalMedicationAdvisor.setBackground(UIManager.getColor("Button.background"));
		txtpnPersonalMedicationAdvisor.setText("Personal Medication Advisor");
		
		JPanel barcode_1 = new JPanel();
		barcode_1.setBounds(6, 69, 438, 191);
		panel.add(barcode_1);
		barcode_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(148, 99, 130, 26);
		barcode_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 48, 130, 26);
		barcode_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBarcode_1 = new JLabel("Barcode:");
		lblBarcode_1.setBounds(83, 53, 53, 16);
		barcode_1.add(lblBarcode_1);
		
		JLabel lblDailyDosage_1 = new JLabel("Daily Dosage:");
		lblDailyDosage_1.setBounds(49, 104, 87, 16);
		barcode_1.add(lblDailyDosage_1);
		
		JButton barcodeSubmit = new JButton("Submit");
		barcodeSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		barcodeSubmit.setBounds(158, 144, 117, 29);
		barcode_1.add(barcodeSubmit);
		barcode_1.setVisible(false);
		
		JPanel result_1 = new JPanel();
		result_1.setBackground(new Color(255, 140, 0));
		result_1.setBounds(6, 69, 438, 191);
		panel.add(result_1);
		result_1.setLayout(null);
		
		JTextPane txtpnAmberWarning = new JTextPane();
		txtpnAmberWarning.setForeground(Color.BLACK);
		txtpnAmberWarning.setBackground(new Color(255, 140, 0));
		txtpnAmberWarning.setText("Amber Warning");
		txtpnAmberWarning.setBounds(174, 6, 96, 16);
		result_1.add(txtpnAmberWarning);
		
		JTextPane txtpnCausedBy = new JTextPane();
		txtpnCausedBy.setBackground(new Color(255, 140, 0));
		txtpnCausedBy.setForeground(Color.BLACK);
		txtpnCausedBy.setText("Caused By:");
		txtpnCausedBy.setBounds(6, 30, 68, 16);
		result_1.add(txtpnCausedBy);
		
		JTextArea txtrBisoprololFumarateAnd = new JTextArea();
		txtrBisoprololFumarateAnd.setBackground(new Color(255, 140, 0));
		txtrBisoprololFumarateAnd.setForeground(new Color(0, 0, 0));
		txtrBisoprololFumarateAnd.setText("Bisoprolol fumarate and Ramipril\nEplerenone and Atorvastatis");
		txtrBisoprololFumarateAnd.setRows(2);
		txtrBisoprololFumarateAnd.setBounds(27, 58, 385, 107);
		result_1.add(txtrBisoprololFumarateAnd);
		result_1.setVisible(false);
		
		JPanel profile = new JPanel();
		profile.setBounds(6, 69, 438, 191);
		panel.add(profile);
		profile.setLayout(null);
		
		JTextPane txtpnMedication = new JTextPane();
		txtpnMedication.setBackground(SystemColor.window);
		txtpnMedication.setText("Medication");
		txtpnMedication.setBounds(6, 6, 103, 16);
		profile.add(txtpnMedication);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.window);
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(6, 25, 303, 160);
		profile.add(textArea);
		
		JTextPane txtpnDosage = new JTextPane();
		txtpnDosage.setBackground(SystemColor.window);
		txtpnDosage.setText("Dosage");
		txtpnDosage.setBounds(313, 6, 53, 16);
		profile.add(txtpnDosage);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(SystemColor.window);
		textArea_1.setBounds(323, 25, 109, 160);
		profile.add(textArea_1);
		
		JPanel manual = new JPanel();
		manual.setBounds(6, 69, 438, 191);
		panel.add(manual);
		manual.setLayout(null);
		JLabel lblNewLabel = new JLabel("Pharmaceutical Company:");
		lblNewLabel.setBounds(6, 6, 162, 16);
		manual.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Medication:");
		lblNewLabel_1.setBounds(95, 34, 73, 16);
		manual.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Strength (mg):");
		lblNewLabel_2.setBounds(79, 62, 89, 16);
		manual.add(lblNewLabel_2);
		
		JLabel lblBarcode = new JLabel("Barcode:");
		lblBarcode.setBounds(115, 90, 53, 16);
		manual.add(lblBarcode);
		
		JLabel lblNumberOfTablets = new JLabel("Number of Tablets:");
		lblNumberOfTablets.setBounds(47, 118, 121, 16);
		manual.add(lblNumberOfTablets);
		
		JLabel lblDailyDosage = new JLabel("Daily Dosage:");
		lblDailyDosage.setBounds(79, 146, 89, 16);
		manual.add(lblDailyDosage);
		
		pharma = new JTextField();
		pharma.setBounds(180, 6, 130, 26);
		manual.add(pharma);
		pharma.setColumns(10);
		
		medi = new JTextField();
		medi.setBounds(180, 29, 130, 26);
		manual.add(medi);
		medi.setColumns(10);
		
		strength = new JTextField();
		strength.setBounds(180, 57, 130, 26);
		manual.add(strength);
		strength.setColumns(10);
		
		barcode = new JTextField();
		barcode.setBounds(180, 85, 130, 26);
		manual.add(barcode);
		barcode.setColumns(10);
		
		number = new JTextField();
		number.setBounds(180, 113, 130, 26);
		manual.add(number);
		number.setColumns(10);
		
		dosage = new JTextField();
		dosage.setBounds(180, 141, 130, 26);
		manual.add(dosage);
		dosage.setColumns(10);
		
		JTextPane strengthError = new JTextPane();
		strengthError.setBackground(SystemColor.window);
		strengthError.setBounds(322, 62, 98, 16);
		manual.add(strengthError);
		
		JTextPane numError_1 = new JTextPane();
		numError_1.setBackground(SystemColor.window);
		numError_1.setBounds(322, 118, 98, 16);
		manual.add(numError_1);
		
		JTextPane dosError = new JTextPane();
		dosError.setBackground(SystemColor.window);
		dosError.setBounds(322, 146, 98, 16);
		manual.add(dosError);
		
		JButton manualSubmit = new JButton("Submit");
		manualSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String company = pharma.getText();
				String name = medi.getText();
				String bar = barcode.getText();
				double streng = 1;
				int num =1;
				int dos = 1;
				boolean error=false;
				try{
					try{
						streng = Float.valueOf(strength.getText());
						strengthError.setText("");
					}catch (NumberFormatException t){
						strengthError.setText("Not a number");
						error=true;
					}
					try{
						num = Integer.valueOf(number.getText());
						numError_1.setText("");
					}catch (NumberFormatException t){
						numError_1.setText("Not at number");
						error=true;
					}
					try{
						dos = Integer.valueOf(dosage.getText());
						dosError.setText("");
					}catch (NumberFormatException t){
						dosError.setText("Not a number");
						error=true;
					}
					if (streng<0){
						strengthError.setText("Negative Number");
						error=true;
					}
					if (num<0){
						numError_1.setText("Negative Number");
						error=true;
					}
					if (dos<0){
						dosError.setText("Negative Number");
						error=true;
					}
					if (error){
						throw new FormException();
					}
					Medication newMedicine = new Medication(company, name, streng, bar, num,dos);
					medicationList.add(newMedicine);
					textArea.setText("");
					for (Medication medication : medicationList){
						
						textArea.append(medication.getName()+"\n");
					}
					profile.setVisible(true);
					result_1.setVisible(false);
					barcode_1.setVisible(false);
					manual.setVisible(false);
				}catch (FormException t){
				}
				
			}
		});
		manualSubmit.setBounds(190, 162, 117, 29);
		manual.add(manualSubmit);
		manual.setVisible(false);
		
		JButton results = new JButton("Results");
		results.setBounds(335, 39, 109, 29);
		panel.add(results);
		
		JButton barcodeButton = new JButton("Barcode Entry");
		barcodeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(false);
				result_1.setVisible(false);
				barcode_1.setVisible(true);
				manual.setVisible(false);
			}
		});
		barcodeButton.setBounds(227, 39, 109, 29);
		panel.add(barcodeButton);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
				for (Medication medication : medicationList){
					
					textArea.append(medication.getName()+"\n");
				}
				profile.setVisible(true);
				result_1.setVisible(false);
				barcode_1.setVisible(false);
				manual.setVisible(false);
			}
		});
		btnProfile.setBounds(6, 39, 117, 29);
		panel.add(btnProfile);
		
		JButton manualEntry = new JButton("Manual Entry");
		manualEntry.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(false);
				result_1.setVisible(false);
				barcode_1.setVisible(false);
				manual.setVisible(true);
			}
		});
		manualEntry.setBounds(123, 39, 109, 29);
		panel.add(manualEntry);
		results.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(false);
				result_1.setVisible(true);
				barcode_1.setVisible(false);
				manual.setVisible(false);
			}
		});
		for (Medication medication : medicationList){
			
			textArea.append(medication.getName()+"\n");
		}
		profile.setVisible(true);
		
	}
}
