/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class TrackingAvailableVehicle {
    private String model;
    private String type;
    private String status;
    private String size ;


public  TrackingAvailableVehicle(String model, String type, String status,String size){
    this.model= model;
    this.type= type;
    this.status= status;
    this.size= size;
}
public String getModel(){
    return model;
}
public String getType(){
    return type;
}
public String getStatus(){
    return status;
}
public String getSize(){
    return size;
}


public  void setModel(String model){
    this.model= model;
}
public void setType(String type){
    this.type= type;
}
public void setStatus(String status){
    this.status= status;
}
public void setSize(String size){
    this.size= size;
}
}

