package com.pancong.train;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Pan on 2017/8/5.
 */
public class 四则运算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chs = line.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        // [ ‘0’-‘9’],‘+’,‘-’, ‘*’,‘/’ ,‘(’， ‘)’,‘[’, ‘]’,‘{’ ,‘}’
        for(int i = 0; i < chs.length; i++){
            if(chs[i] == '(' || chs[i] == '{' || chs[i] == '['){
                stack.push(chs[i]);
            }
            if(chs[i] == '+' || chs[i] == '-'){
                if(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }else
                    stack.push(chs[i]);
            }
            if(chs[i] == '*' || chs[i] == '/'){
                if(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }else
                    stack.push(chs[i]);
            }

            if(chs[i] >= '0' || chs[i] <= '9'){
                sb.append(chs[i]);
            }
        }
    }
}
