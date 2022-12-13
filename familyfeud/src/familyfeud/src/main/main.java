package familyfeud.src.main;

import java.io.FileNotFoundException;

import familyfeud.src.gui.MainPagePaneC;
import familyfeud.src.gui.MainPagePaneV;
import familyfeud.src.service.LoadQuestionsService;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		LoadQuestionsService.loadQuestions();
		new MainPagePaneC();
	}

}
