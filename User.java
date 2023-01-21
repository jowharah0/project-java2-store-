/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Sara
 */
abstract class User {

    protected String name;
    protected final int startID=1000;
    protected int ID = 1000;
    protected static int CountID=0; 
    
    protected User(String name) {
        this.name=name;
        ID=startID+CountID++;
    }
    abstract void setName(String name);

    abstract String getName();

    public int getID(){
        return ID;
    }
    public int getCID(){
        return CountID;
    }
    
}