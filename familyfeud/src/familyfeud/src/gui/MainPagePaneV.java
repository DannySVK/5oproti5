package familyfeud.src.gui;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainPagePaneV implements PaneV{

	private Button btnStartGame;
	private Shell shell;
	private Label txtMainText;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void createContents() {
	    shell = new Shell();
	    shell.setSize(450, 300);
	    shell.setText("SWT Application");
	    shell.setLayout(new GridLayout(1, false));
	    
	    txtMainText = new Label(shell, SWT.BORDER | SWT.CENTER);
	    txtMainText.setFont(SWTResourceManager.getFont("Segoe UI", 35, SWT.NORMAL));
	    txtMainText.setText("5 oproti 5");
	    txtMainText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
	    
	    btnStartGame = new Button(shell, SWT.NONE);
	    btnStartGame.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
	    btnStartGame.setText("Zacat hru");
	    
	    Button btnTeamSettings = new Button(shell, SWT.NONE);
	    btnTeamSettings.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
	    btnTeamSettings.setText("Nastavenia timov");
	  }

	public Button getBtnStartGame() {
		return btnStartGame;
	}

	public Shell getShell() {
		return shell;
	}

	public Label getTxtMainText() {
		return txtMainText;
	}
	

}
