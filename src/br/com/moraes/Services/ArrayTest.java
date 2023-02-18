package br.com.moraes.Services;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<>();

        String co = "";
        co = "aaaaaaa";
        String ca = "bbbbbbbb";
        n.add(co);
        co = "bbbbbbbbbbbb";
        n.add(co);

        System.out.println(n.toString());
    }
}
