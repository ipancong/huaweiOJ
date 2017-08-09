package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/23.
 */
public class QueryOrUpdateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = 0;
            int m = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            //成绩
            int[] array = new int[n];
            //操作
            String[] orders = new String[m];
            for(int i = 0; i < n; i++){
                array[i] = scanner.nextInt();
            }
            //吃掉一个回车
            String emp = scanner.nextLine();
            for(int k = 0; k < m; k++){
                String order = scanner.nextLine();
                orders[k] = order;
            }

            //执行程序,执行一句输出一句
            for(String order : orders){
                String[] params = order.split(" ");
                if(params[0].equals("Q")){//查询
                    int param1 = Integer.parseInt(params[1]);
                    int param2 = Integer.parseInt(params[2]);
                    int start = Math.min(param1,param2);
                    int end = Math.max(param1,param2);
                    //System.out.println("---"+start+" "+end);
                    int max = 0;
                    for(int j = start-1; j < end  ; j++){
                        if(array[j] > max)
                            max = array[j];
                    }

                    System.out.println(max);
                }else if(params[0].equals("U")){//更新
                    int id = Integer.parseInt(params[1]);
                    int val = Integer.parseInt(params[2]);
                    array[id-1] = val;

                }
            }
        }



    }

}
