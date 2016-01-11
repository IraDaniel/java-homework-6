package com.company;

import com.company.task2.ReadPropertyFile;
import com.company.task3.Doctor;
import com.company.task3.HeadDoctor;
import com.company.task3.MedicalStaff;
import com.company.task3.Nurse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        //Doctor doctor2 = new MedicalStaff();
        Doctor doctor3 = new HeadDoctor();
        Object object1 = new HeadDoctor();
        //HeadDoctor doctor5 = new Object();
       //Doctor doctor6  = new Nurse();
        //Nurse nurse = new Doctor();
        Object object2 = new Nurse();

        List<Doctor> list1= new ArrayList<Doctor>();
        //List<MedicalStaff> list2 = new ArrayList<Nurse>(); // ?
       // List<Doctor> list3 = new ArrayList<MedicalStaff>();
       // List<Object> list4 = new ArrayList<Doctor>();
        List<Object> list5 = new ArrayList<Object>();
      //  List<Number> a = new ArrayList<Integer>();


        // write your code here

       //
        ReadPropertyFile readPropertyFile = new ReadPropertyFile("src/com/company/resources/config.properties");
        readPropertyFile.readConfig();
        readPropertyFile.show();
        readPropertyFile.addToMap("host","aaa");
        readPropertyFile.show();


    }
}

