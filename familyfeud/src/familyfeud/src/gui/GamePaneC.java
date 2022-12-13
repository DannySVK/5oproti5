package familyfeud.src.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import familyfeud.src.service.LoadQuestionsService;
import familyfeud.src.service.LoadQuestionsService.AnswerAndNumbers;

public class GamePaneC extends PaneC {

	private GamePaneV view;
	
	public GamePaneC() {
		getView();
		open();
	}
	
	@Override
	public PaneV getView() {
		if (view == null) {
			view = new GamePaneV();
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
	
	private void loadQuestion(int i) {
		Map<String, List<AnswerAndNumbers>> questionMap = LoadQuestionsService.getQuestionsMap();
		
		Set<Entry<String, List<AnswerAndNumbers>>> entrySet = questionMap.entrySet();
		ArrayList listEntry = new ArrayList<>(entrySet);
		Entry<String, List<AnswerAndNumbers>> entry = (Entry<String, List<AnswerAndNumbers>>) listEntry.get(i);
		
		view.getLblOtazka().setText(entry.getKey());
		int j = 0;
		for (AnswerAndNumbers aan : entry.getValue()) {
			view.getAllBodyLabels().get(j).setText("" + aan.nrOfAnswers);
			view.getAllOdpovedLabels().get(j).setText(aan.answer);
			j++;
		}
	}

	@Override
	protected void initControls() {
		List<org.eclipse.swt.widgets.Button> listButtons = view.getAllButtons();
		List<Label> listOdpoved = view.getAllOdpovedLabels();
		List<Label>	listBody = view.getAllBodyLabels();
		
		listButtons.get(0).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				listOdpoved.get(0).setVisible(true);
				listBody.get(0).setVisible(true);
			}
		});
		
		listButtons.get(1).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				listOdpoved.get(1).setVisible(true);
				listBody.get(1).setVisible(true);
			}
		});
		
		listButtons.get(2).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				listOdpoved.get(2).setVisible(true);
				listBody.get(2).setVisible(true);
			}
		});
		
		listButtons.get(3).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				listOdpoved.get(3).setVisible(true);
				listBody.get(3).setVisible(true);
			}
		});
		
		listButtons.get(4).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				listOdpoved.get(4).setVisible(true);
				listBody.get(4).setVisible(true);
			}
		});
		
		listButtons.get(5).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				listOdpoved.get(5).setVisible(true);
				listBody.get(5).setVisible(true);
			}
		});
		
		listButtons.get(6).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				listOdpoved.get(6).setVisible(true);
				listBody.get(6).setVisible(true);
			}
		});
		loadQuestion(0);
	}
	
	
	
	
}
