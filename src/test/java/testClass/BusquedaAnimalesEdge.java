package testClass;
import org.openqa.selenium.WebDriver;
import page.Edge;

public class BusquedaAnimalesEdge {
    private Edge edge;

    public void busquedaGato(WebDriver webDriver){
        edge = new Edge(webDriver);
        edge.ingresarBusqueda("Gato");
        edge.clickBtnBuscar();
    }
    public void busquedaPato(WebDriver webDriver){
        edge = new Edge(webDriver);
        edge.ingresarBusqueda("Pato");
        edge.clickBtnBuscar();
    }

}