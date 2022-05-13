package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edge {

    @FindBy(className = "gLFyf gsfi")
    WebElement inputBuscador;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    WebElement btnBuscar;

    public Edge(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }
    public void ingresarBusqueda(String busqueda){
        inputBuscador.sendKeys(busqueda);
    }
    public void clickBtnBuscar(){
        btnBuscar.click();
    }
}
