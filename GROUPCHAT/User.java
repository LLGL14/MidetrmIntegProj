package common;

import java.io.*;

public class User implements Serializable {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
}
