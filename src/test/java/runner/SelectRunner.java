package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		features = "src/test/resources/features/reto.feature",
		tags = "@seleccion",
		glue = "stepdefinitions"
		
			
)

public class SelectRunner {
	
	
	
	
	
	

}
