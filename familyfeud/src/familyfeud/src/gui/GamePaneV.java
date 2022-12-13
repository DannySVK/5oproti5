package familyfeud.src.gui;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class GamePaneV implements PaneV{
	private Label lblOdpoved2;
	private Label lblOdpoved3;
	private Label lblOdpoved4;
	private Label lblOdpoved5;
	private Label lblOdpoved6;
	private Label lblOdpoved7;
	private Label lblOdpoved1;
	private Label lblBody1;
	private Label lblBody2;
	private Label lblBody3;
	private Label lblBody4;
	private Label lblBody5;
	private Label lblBody6;
	private Label lblBody7;
	private Shell shell;
	private Button btnShow1;
	private Button btnShow2;
	private Button btnShow3;
	private Button btnShow4;
	private Button btnShow5;
	private Button btnShow6;
	private Button btnShow7;
	private Label lblOtazka;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(128, 128, 255));
		shell.setSize(557, 558);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(3, false));
		new Label(shell, SWT.NONE);

		lblOtazka = new Label(shell, SWT.CENTER);
		lblOtazka.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		lblOtazka.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		lblOtazka.setText("bblaslkdaslkdasljdlkasjd");
		
		btnShow1 = new Button(shell, SWT.NONE);
		btnShow1.setForeground(SWTResourceManager.getColor(0, 128, 64));
		btnShow1.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		btnShow1.setText("1");

		lblOdpoved1 = new Label(shell, SWT.CENTER);
		lblOdpoved1.setBackground(SWTResourceManager.getColor(0, 0, 255));
		lblOdpoved1.setForeground(SWTResourceManager.getColor(128, 255, 0));
		lblOdpoved1.setText("11");
		lblOdpoved1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblOdpoved1.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblBody1 = new Label(shell, SWT.CENTER);
		lblBody1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblBody1.setText("11");
		lblBody1.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		
		btnShow2 = new Button(shell, SWT.NONE);
		btnShow2.setText("2");
		btnShow2.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblOdpoved2 = new Label(shell, SWT.CENTER);
		lblOdpoved2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblOdpoved2.setText("22");
		lblOdpoved2.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblBody2 = new Label(shell, SWT.CENTER);
		lblBody2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblBody2.setText("22");
		lblBody2.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		
		btnShow3 = new Button(shell, SWT.NONE);
		btnShow3.setText("3");
		btnShow3.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblOdpoved3 = new Label(shell, SWT.CENTER);
		lblOdpoved3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblOdpoved3.setText("33");
		lblOdpoved3.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblBody3 = new Label(shell, SWT.CENTER);
		lblBody3.setText("33");
		lblBody3.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblBody3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnShow4 = new Button(shell, SWT.NONE);
		btnShow4.setText("4");
		btnShow4.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblOdpoved4 = new Label(shell, SWT.CENTER);
		lblOdpoved4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblOdpoved4.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblOdpoved4.setText("44");

		lblBody4 = new Label(shell, SWT.CENTER);
		lblBody4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblBody4.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblBody4.setText("44");
		
		btnShow5 = new Button(shell, SWT.NONE);
		btnShow5.setText("5");
		btnShow5.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblOdpoved5 = new Label(shell, SWT.CENTER);
		lblOdpoved5.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblOdpoved5.setText("55");
		lblOdpoved5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblBody5 = new Label(shell, SWT.CENTER);
		lblBody5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblBody5.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblBody5.setText("55");
		
		btnShow6 = new Button(shell, SWT.NONE);
		btnShow6.setText("6");
		btnShow6.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblOdpoved6 = new Label(shell, SWT.CENTER);
		lblOdpoved6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblOdpoved6.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblOdpoved6.setText("66");

		lblBody6 = new Label(shell, SWT.CENTER);
		lblBody6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblBody6.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblBody6.setText("66");
		
		btnShow7 = new Button(shell, SWT.NONE);
		btnShow7.setText("7");
		btnShow7.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));

		lblOdpoved7 = new Label(shell, SWT.CENTER);
		lblOdpoved7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblOdpoved7.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblOdpoved7.setText("7");

		lblBody7 = new Label(shell, SWT.CENTER);
		lblBody7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblBody7.setFont(SWTResourceManager.getFont("Segoe UI", 17, SWT.NORMAL));
		lblBody7.setText("77");
		
		for (Label label : getAllOdpovedLabels()) {
			label.setVisible(false);
		}
		
		for (Label label : getAllBodyLabels()) {
			label.setVisible(false);
		}
	}
	
	public List<Label> getAllOdpovedLabels() {
		return Arrays.asList(lblOdpoved1,lblOdpoved2,lblOdpoved3,lblOdpoved4,lblOdpoved5,lblOdpoved6,lblOdpoved7);
	}
	
	public List<Label> getAllBodyLabels() {
		return Arrays.asList(lblBody1,lblBody2,lblBody3,lblBody4,lblBody5,lblBody6,lblBody7);
	}
	
	public List<Button> getAllButtons() {
		return Arrays.asList(btnShow1,btnShow2,btnShow3,btnShow4,btnShow5,btnShow6,btnShow7);
	}
	
	public Shell getShell() {
		return shell;
	}
	
	public Label getLblOtazka()	 {
		return lblOtazka;
	}
	
}
