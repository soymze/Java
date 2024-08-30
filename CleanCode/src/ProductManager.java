public class ProductManager implements IProductService{
    private IBankService IBankService;
    public ProductManager(IBankService iBankService){

    }
   public void sell(Product product, Customer customer){

       double price = product.Price;

       if(customer.IsStudent){
            price = product.Price * 0.9;
            System.out.println("Öğrenci indirimli fiyatınız: " + price);
        }

       if(customer.IsOfficer){
           price = product.Price * 0.8;
           System.out.println("Memur indirimli fiyatınız: " + price);
       }

       if(!customer.IsOfficer && !customer.IsStudent){
           price = product.Price;
           System.out.println("Fiyatınız: " + price);
       }


    }

}
