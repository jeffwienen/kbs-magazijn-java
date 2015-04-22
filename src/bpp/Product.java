package bpp;


public class Product extends Depository {
    
    private String name;
    private int idProduct;
    private int box;
    private int size;
    private boolean check;
    
    
    public Product(String n, int id, int s ){
    this.name = n;
    this.idProduct = id;
    this.size = s;
    this.check = false;
    }
    
    public String Getname(){
    return name;
    }
    
    public void Setname(String n){
        this.name = n;
    }
    
    public int GetidProduct(){
    return idProduct;
    }
    
    public void SetidProduct(int id){
        this.idProduct = id;
    }
    
    public int Getsize(){
    return size;
    }
    
    public void Setsize(int s){
    this.size = s;
    }

   public int GetSelf(){
    return box;
    }
    
    public void SetSelf(int s){
        this.box = s;
    }
       
    public String toString(){
     return ("productnaam "+name + " nr " + idProduct + " box " +box);
    }
    
}
