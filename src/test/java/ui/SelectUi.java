package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SelectUi {
	
	public static final Target LIBRO_1 = Target.the("escoja libro1").located(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]")) ;
	public static final Target LIBRO_2 = Target.the("escoja libro2").located(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")) ;
	public static final Target CARRITO_DE_COMPRAS = Target.the("ir al carrito de compras").located(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]")) ;

}
