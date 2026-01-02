package theory;

public class Store {
    Product[] productList;
    static int itr=0;
    public Store(){
        this.productList = new Product[10];
    }
    public void addProduct(String name,int price){
        productList[itr]=new Product(++itr,name,price);
    }

    public Product[] displayProductList(){
        return this.productList;
    }

    public int searchProduct(int id){
        for(int i=0;i<this.productList.length;i++){
            if(this.productList[i] == null) break;
            if(this.productList[i].id==id){
                return i;
            }
        }
        return -1;
    }
}
