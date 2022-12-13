package familyfeud.src.gui;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;

public class MainPagePaneC extends PaneC {

	private MainPagePaneV view;
	
	public MainPagePaneC() {
		getView();
		open();
	}

	public MainPagePaneV getView() {
		if (view == null) {
			view = new MainPagePaneV();
		}
		return view;
	}

	public void open() {
		Display display = Display.getDefault();
		view.createContents();
		initControls();
		view.getShell().open();
		view.getShell().layout();
		while (!view.getShell().isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected void initControls() {
		view.getBtnStartGame().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				new GamePaneC();
			}
		});
	}

}
