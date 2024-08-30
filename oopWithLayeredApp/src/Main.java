import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.coreLogging.DatabaseLogger;
import oopWithNLayeredApp.coreLogging.FileLogger;
import oopWithNLayeredApp.coreLogging.Logger;
import oopWithNLayeredApp.coreLogging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone Xr", 90);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}