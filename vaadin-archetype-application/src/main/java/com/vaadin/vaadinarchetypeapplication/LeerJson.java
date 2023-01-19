package com.vaadin.vaadinarchetypeapplication;

import com.google.gson.Gson;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LeerJson {

    public ArrayList<Tweet> leeFicheroJson(){
        try {
            BufferedReader reader= new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("twitter.json")));
            ArrayList<Tweet> listaTweet= new Gson().fromJson(reader,new TypeToken<ArrayList<Tweet>>(){

            }.getType());
            reader.close();

            return listaTweet;

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return new ArrayList<>(); //si no ha leido nada, devuelve un array vacio
        }
    }


}
