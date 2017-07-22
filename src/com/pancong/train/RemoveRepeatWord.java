package com.pancong.train;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Pan on 2017/7/22.
 */
public class RemoveRepeatWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer sb = new StringBuffer();

        for(int i = str.length()-1; i >= 0; i--){
          char s = str.charAt(i);
          if(!(sb.toString().indexOf(String.valueOf(s)) > -1)){
                sb.append(s);
          }
        }
        System.out.println(sb);

    }
}
