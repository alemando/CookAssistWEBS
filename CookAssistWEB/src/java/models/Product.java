package models;

public class Product {
    private int code;
    private String name;
    private String description;
    private String category;
    private String avaliable;
    private  List<OrderDetail> order_detail = new ArrayList<OrderDetail>(){};
    
        public static List<Product> products = new ArrayList<Product>(){
        {
            add(new Product(1,"HP Laptop","asdasd","asdawqe","True"));
        }
    };
    
    public Product(int code, String name, String description, String category, String avaliable){
        this.code = code;
        this.name = name;
        this.description = description;
        this.category = category;
        this.avaliable = avaliable;
    }
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public String getAvaliable(){
        return avaliable;
    }
    
    public void setAvaliable(String avaliable){
        this.avaliable = avaliable; 
    }
    
    public OrderDetail[] getOrderDetail(){
        return order_detail;
    }
    
    public void setOrderDetail(OrderDetail order_detail[]){
        this.order_detail = order_detail;
    }
 
}