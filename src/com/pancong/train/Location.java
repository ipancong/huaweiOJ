package com.pancong.train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Pan on 2017/7/22.
 */
public class Location {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String order = scanner.nextLine();
            String[] orderArr = order.split(";");
            Map<String,Integer> location = new HashMap<>();
            location.put("x",0);
            location.put("y",0);
            for(int i=0; i<orderArr.length; i++){
                //判断坐标合法性
                //获取方位
                if(orderArr[i].length()>0){
                    String direction = orderArr[i].substring(0,1);
                    String moveLength = orderArr[i].substring(1,orderArr[i].length());
                    if(checkDir(direction) && checkMove(moveLength) != -1){
                        action(location,direction,checkMove(moveLength));
                    }
                }

            }
            System.out.println(location.get("x")+","+location.get("y"));
        }

    }

    public static boolean checkDir(String direction){
        if(direction.equals("A")||direction.equals("S")||
                direction.equals("D")||direction.equals("W"))
            return true;
        else
            return false;
    }
    public static int checkMove(String moveLength){
        int length = 0;
        try{
            length = Integer.parseInt(moveLength);
        }catch (Exception e){
            return -1;
        }
        return length;
    }

    public static void action(Map<String,Integer> location,String order, int length){
        if(order.equals("A")){
            location.put("x",location.get("x")-length);
        }
        if(order.equals("W")){
            location.put("y",location.get("y")+length);
        }
        if(order.equals("S")){
            location.put("y",location.get("y")-length);
        }
        if(order.equals("D")){
            location.put("x",location.get("x")+length);
        }
    }



}
