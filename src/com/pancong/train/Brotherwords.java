package com.pancong.train;

/**
 * Created by Pan on 2017/7/29.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Brotherwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int i = 0;
            String[] words = new String[n];
            List<String> res = new ArrayList<>();
            for(i = 0; i < n ; i++) {
                words[i] = scanner.next();
            }
            //根据输入，将字典排序
            Arrays.sort(words);
            String key = scanner.next();
            int index = scanner.nextInt();
            for(i = 0; i < n ; i++) {
                if(check(words[i],key))
                    res.add(words[i]);
            }
            System.out.println(res.size());

            if(res.size() >= index)
                System.out.println(res.get(index-1));


        }
    }

    public static boolean check(String word1, String word2) {
        boolean res = false;
        if(word1.length() != word2.length())
            res = false;
        else if(word1.equals(word2))
            res = false;
        else {
            char[] wordsArr1 = word1.toCharArray();
            char[] wordsArr2 = word2.toCharArray();
            Arrays.sort(wordsArr1);
            Arrays.sort(wordsArr2);
            int count = 0;
            for(int i = 0 ; i < wordsArr1.length; i++) {
                if(wordsArr1[i] == wordsArr2[i])
                    count++;
            }
            if(count == word1.length()){
                res = true;
            }

        }
        return res;
    }
}
