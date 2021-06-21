package com.example.SpringBoot.controller;

import com.example.SpringBoot.model.Doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorController {
    ArrayList<Doctor> alist= new ArrayList<Doctor>();
    @RequestMapping("/add_doctor")
    public String add(){

        Doctor d1= new Doctor("aman",25,4400);
        Doctor d2= new Doctor("shubham",26,3400);
        alist.add(d1);
        alist.add(d2);
        return "entry is added successfuly" ;

    }
    @RequestMapping("/display_doctor")
    public ArrayList display(){

        return alist;
    }


    @RequestMapping("/update_doctor")
    public String update(){
        alist.get(0).setName("anuj");
        return "name is updated at 1st position"+ alist.get(0).getName();
    }

    @RequestMapping("/delete_doctor")
    public String delete(){

        alist.remove(1);
        return "remove index 1" ;
    }


}
