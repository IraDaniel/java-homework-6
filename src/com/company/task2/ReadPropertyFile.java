package com.company.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Ira on 11.01.2016.
 */
public class ReadPropertyFile {

    private Map<String,String> config = new HashMap<>();
    private String fileName;

    public ReadPropertyFile(String fileName) {
        this.fileName = fileName;
    }

    public void readConfig(){

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream(fileName);
            property.load(fis);

            config.put("host",property.getProperty("db.host"));
            config.put("login",property.getProperty("db.login"));
            config.put("password",property.getProperty("db.password"));


        } catch (IOException e) {
            System.err.println("error: file is not found");
        }
    }

    public Map<String, String> getConfig() {
        return config;
    }

    public void show(){
        for(String map: config.keySet()){
            System.out.println(map + ":" + config.get(map));

        }
    }

    public void addToMap(String key, String value){
        config.put(key,value);
    }
}
