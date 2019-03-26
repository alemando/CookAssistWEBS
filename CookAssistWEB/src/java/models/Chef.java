package models;
import models.User;

public class Chef extends User {
    private boolean chef_status;
    private Order order;
    private Rating rating;
    public Chef(boolean chef_status){
        this.chef_status = chef_status;
    }
    
    Chef(String type_user, String name, String email,String pass, String born_date, boolean status){
        super(type_user, name, email,pass, born_date, status);
    }
    
    public void setChef_status(boolean chef_status){
        this.chef_status = chef_status;
    }
}
