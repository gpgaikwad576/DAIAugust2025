package theory;

public class main {
    public static void main(String[] args){
        Store store1 = new Store();
        store1.addProduct("Bucket",100);
        store1.addProduct("Soap",200);

        System.out.println("Product List:");
        for(Product product:store1.displayProductList()){
            if(product == null) break;
            System.out.println(product);
        }
        int productIndex = store1.searchProduct(2);
        if(productIndex == -1){
            System.out.println("Not found");
        }
        else System.out.println("index of product is "+ productIndex);

        store1.searchProduct(3);

    }
}
