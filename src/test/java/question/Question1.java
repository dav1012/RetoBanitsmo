package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import ui.SelectUi;

public class Question1 implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return BrowseTheWeb.as(actor).find(SelectUi.VALIDAR_TOTAL).getText().trim();
	}
	
	public static Question<String> Value(){
		
		return new Question1();
		
	}
	
	

}
