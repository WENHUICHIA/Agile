
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mei Huey
 */
public class DeliveryMan implements Serializable{
    public static int nextID = 100;
    public String name;
    public int age;
    public String phoneNo;
    public String address;

    public DeliveryMan(String name, int age, String phoneNo, String address){
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        DeliveryMan.nextID = nextID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
