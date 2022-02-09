package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SelectUi {
	
	public static final Target LIBRO_1 = Target.the("escoja libro1").located(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]")) ;
	public static final Target LIBRO_2 = Target.the("escoja libro2").located(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")) ;
	public static final Target CARRITO_DE_COMPRAS = Target.the("ir al carrito de compras").located(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]")) ;
	public static final Target X_BORRAR = Target.the("borrar del carrito de compras").located(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a")) ;
	public static final Target VALIDAR_TOTAL = Target.the("validar el total").located(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[3]/td/strong/span")) ;

}
