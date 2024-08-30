public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("falanfilan.jpg");

        //System.out.println(product1.name);


        Product product2 = new Product();
        product1.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(4500);
        product2.setDiscount(8);
        product2.setUnitsInStock(30);
        product2.setImageUrl("falanfilan1.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(5500);
        product3.setDiscount(4);
        product3.setUnitsInStock(13);
        product3.setImageUrl("falanfilan2.jpg");

        Product[] products = {product1,product2,product3};

        for(Product product : products){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("1254");
        individualCustomer.setPhone("569848578485");
        individualCustomer.setFirstName("Emre");
        individualCustomer.setLastName("Söylemez");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Falan Filan");
        corporateCustomer.setPhone("565987946");
        corporateCustomer.setTaxNumber("6987858487");
        corporateCustomer.setCustomerNumber("89658");


    }
}