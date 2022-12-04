package java_dz_4;

// Написать приложение для ввода ФИО, возраст и пол пользователей. Данные хранить в разных списках. 
// Сортировать пользователей по возрасту. Не вывести в порядке возрастания возрастов а именно сортировать!)

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class dz_4_01 {
    public static void main(String[] args) {
        
        ArrayList<String> list_fname = new ArrayList<>();
        list_fname.add("sa");
        list_fname.add("Df");
        list_fname.add("fd");
        list_fname.add("sef");
        list_fname.add("sfe");
        ArrayList<String> list_lname = new ArrayList<>();
        list_lname.add("lan");
        list_lname.add("jmghn");
        list_lname.add("asd");
        list_lname.add("vsr");
        list_lname.add("xcv");
        ArrayList<String> list_tname = new ArrayList<>();
        list_tname.add("hnbre");
        list_tname.add("han");
        list_tname.add("rsrg");
        list_tname.add("nbg");
        list_tname.add("xdf");
        ArrayList<Integer> list_age = new ArrayList<>();
        list_age.add(12);
        list_age.add(54);
        list_age.add(23);
        list_age.add(13);
        list_age.add(52);
        ArrayList<String> list_sex = new ArrayList<>();
        list_sex.add("M");
        list_sex.add("M");
        list_sex.add("M");
        list_sex.add("M");
        list_sex.add("M");
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(0);
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        

        
        int cnt = list_age.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);

            cnt--;
        }

        int count = linkedlist.size();

        ArrayList<String> list_fname_sort = new ArrayList<>(count);
        ArrayList<String> list_lname_sort = new ArrayList<>(count);
        ArrayList<String> list_tname_sort = new ArrayList<>(count);
        ArrayList<Integer> list_age_sort = new ArrayList<>(count);
        ArrayList<String> list_sex_sort = new ArrayList<>(count);
        

        for (int i : linkedlist){
        list_fname_sort.add(list_fname.get(i));
        list_lname_sort.add(list_lname.get(i));
        list_tname_sort.add(list_tname.get(i));
        list_age_sort.add(list_age.get(i));
        list_sex_sort.add(list_sex.get(i));
    }

    for (int i = 0; i < 5; i++){
    System.out.println(list_fname_sort.get(i)+list_lname_sort.get(i)+list_tname_sort.get(i)+list_age_sort.get(i)+list_sex_sort.get(i));
    }
    System.out.println(list_fname_sort);
    System.out.println(list_lname_sort);
    System.out.println(list_tname_sort);
    System.out.println(list_age_sort);
    System.out.println(list_sex_sort);
    }
    
}
