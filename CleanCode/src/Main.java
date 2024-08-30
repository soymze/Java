public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Telefon",12000.0);
        Product product2 = new Product(2,"Telefon Kabı",7500.0);

        Customer customer1 = new Customer(1,"Akin Aksoy", false,true);


        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);



        productManager.sell(product1,customer1);

    }
}