package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Студенты нескольких групп сдают экзамен по одному предмету, который оценивается по шкале от 1 до 10.
        //Вывести список студентов и их оценок для выбранной группы с сортировкой по фамилиям; по оценкам.
        //После списка группы вывести статистику (количество студентов, получивших 10 баллов, 9 баллов и т.д.;
        //среднюю успеваемость по выбранной группе).

        Students students1 = new Students(1, "petrov");
        Students students2 = new Students(2, "smirnov");
        Students students3 = new Students(3, "lalal");
        Students students4 = new Students(3, "ayb");
        Students students5 = new Students(2, "lyn");
        Students students6 = new Students(2, "zaza");
        Students students7 = new Students(1, "lisitsa");
        HashMap<Students, Integer> exam = new HashMap<>();
        exam.put(students1, 10);
        exam.put(students2, 6);
        exam.put(students3, 8);
        exam.put(students4, 9);
        exam.put(students5, 7);
        exam.put(students6, 9);
        exam.put(students7, 10);
        TreeMap<Students, Integer> sortMap = new TreeMap<>(exam);


        for (Map.Entry m : sortMap.entrySet()) {

            //  System.out.println("**");
            System.out.println( m.getValue());


        }


    }}


