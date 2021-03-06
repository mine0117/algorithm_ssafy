package com.ssafy.algo;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class sol_1234_비밀번호 {

	static int N, i;
    static char[] arr;
    static ArrayList<Character> list;
    static StringTokenizer st;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        for (int t = 1; t < 11; t++) {
            list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            arr = st.nextToken().toCharArray();
 
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            i = 0;
            while (i < list.size()-1) {
                if (list.get(i) == list.get(i + 1)) {
                    list.remove(i);
                    list.remove(i);
                    i = 0;
                }
                else i++;
            }
            System.out.print("#"+t+" ");
            for (int i = 0; i <list.size() ; i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}