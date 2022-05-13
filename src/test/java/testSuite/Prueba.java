package testSuite;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.BusquedaAnimalesEdge;

public class Prueba {
    EdgeDriver webDriver;
    String url = "https://www.google.cl/";

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.edge.driver", "");
        webDriver = new EdgeDriver();
        webDriver.get(url);
    }

    @AfterTest
    public void closeDriver(){
        webDriver.close();
    }

    @Test
    public void buscarGatoEnEdge(){
        BusquedaAnimalesEdge busquedaAnimalesEdge = new BusquedaAnimalesEdge();
        busquedaAnimalesEdge.busquedaGato(webDriver);
    }
    @Test
    public void buscarPatoEnEdge(){
        BusquedaAnimalesEdge busquedaAnimalesEdge = new BusquedaAnimalesEdge();
        busquedaAnimalesEdge.busquedaPato(webDriver);
    }


}
