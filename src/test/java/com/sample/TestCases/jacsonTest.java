package com.sample.TestCases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.javaObjects.Grades;
import com.javaObjects.Student;
import com.javaObjects.payloadStudent;

import java.util.ArrayList;

public class jacsonTest {

    public  static void test() throws JsonProcessingException {
//        Student st = new Student(0,
//                246,
//                "2020-05-28T00:00:00.000Z",
//                "2020-05-31T00:00:00.000Z",
//                true);
//
//        Grades grade = new Grades(10,20,30);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

    //    Student student = new Student();
      //  grades.setPlayWindow("{");

        Student student = new Student();
        student.setPlayWindowName(0);
        student.setWindowNetwork(246);
        student.setWinStartDate("2020-05-28T00:00:00.000Z");
        student.setWinEndDate("2020-05-31T00:00:00.000Z");
        student.setGrades(new int[] {10,20,30});
        student.setNo_grades(new int[] {});

        payloadStudent p = new payloadStudent(student, true);
        p.setPropogate(true);

       // Grades<Integer>  grade = new Grades<Integer>(10, 20, 30);


       String convert_to_json = mapper.writeValueAsString(p);
       System.out.println(convert_to_json);


    }

    public static void main(String[] args) throws JsonProcessingException {
        test();
    }

    }

