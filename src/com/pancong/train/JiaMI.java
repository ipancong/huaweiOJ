package com.pancong.train;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/29.
 */
public class JiaMI {
    public static void main(String[] args) {
        String nums = "0123456789";
        String lowcase = "abcdefghijklmnopqrstuvwxyz";
        String upcase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String line1 = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            StringBuffer sb1 = new StringBuffer();
            char[] lines = line.toCharArray();
            char[] lines1 = line1.toCharArray();
            char aucResult[] = new char[line.length()];
            char password[] = new char[line1.length()];

            int i = 0;
            for (i = 0; i < lines.length; i++) {
                sb.append(getEncrypt(lines[i],nums, lowcase, upcase));
            }

            for (i = 0; i < lines1.length; i++) {
                sb1.append(getUnEncrypt(lines1[i],nums, lowcase, upcase));
            }

            System.out.println(sb);
            System.out.println(sb1);
        }

    }



    static char getUnEncrypt(char x, String line, String line1, String line2){
        char res=' ';
        int n = 0;
        if( x >= '0' && x <= '9' ){
            n = line.indexOf(x);
            if(n == 0)
                n = line.length();
            res = line.charAt(n-1);
        }else if( x >= 'a' && x <= 'z' ){
            n = line1.indexOf(x);
            if(n == 0)
                n = line1.length();
            res = line2.charAt(n-1);

        }else if( x >= 'A' && x <= 'Z' ){
            n = line2.indexOf(x);
            if(n == 0)
                n = line2.length();
            res = line1.charAt(n-1);
        }
        return res;
    }

    static char getEncrypt(char x,String line, String line1, String line2){
        char res=' ';
        int n = 0;
        if( x >= '0' && x <= '9' ){
            n = line.indexOf(x);
            if(n == line.length() -1)
                n = -1;
            res = line.charAt(n+1);
        }else if( x >= 'a' && x <= 'z' ){
            n = line1.indexOf(x);
            if(n == line1.length() -1)
                n = -1;
            res = line2.charAt(n+1);

        }else if( x >= 'A' && x <= 'Z' ){
            n = line2.indexOf(x);
            if(n == line2.length() -1)
                n = -1;
            res = line1.charAt(n+1);
        }
        return res;
    }
}
