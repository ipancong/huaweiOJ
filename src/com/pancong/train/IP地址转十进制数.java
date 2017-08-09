package com.pancong.train;

import java.util.Scanner;

/**
 * Created by Pan on 2017/7/31.
 */
public class IP地址转十进制数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String ipline = scanner.nextLine();
            String ipline2 = scanner.nextLine();
            long ipInt = Long.parseLong(ipline2);
            if(!checkIp(ipline))
                return;
            String[] ips = ipline.split("\\.");
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < 4; i++){
                String tmp = Integer.toBinaryString(Integer.parseInt(ips[i]));
                sb.append(("00000000"+tmp).substring(tmp.length(),tmp.length()+8));
//            System.out.println(sb);
            }

            System.out.println(Long.valueOf(sb.toString(),2));

            System.out.println(inToIp(ipInt));


        }

    }

    public static String inToIp(long ip){
        String ipStr = "";

        String valueStr = Long.toBinaryString(ip);
        if(valueStr.length()<32){
            int tmp = 32 -valueStr.length();
            for(int i = 0; i < tmp; i++){
                valueStr = "0"+valueStr;
            }
        }
//        System.out.println(valueStr.length());
        int line1 = Integer.valueOf(valueStr.substring(0,8),2);
        int line2 = Integer.valueOf(valueStr.substring(8,16),2);
        int line3 = Integer.valueOf(valueStr.substring(16,24),2);
        int line4 = Integer.valueOf(valueStr.substring(24,32),2);
        ipStr = line1+"."+line2+"."+line3+"."+line4;
        return ipStr;
    }


    public static boolean checkIp(String ip){
        String[] ips = ip.split("\\.");
        boolean res = true;
        if(ips.length != 4)
            res = false;
        try{
            for(int i = 0; i < 4; i++){
                int x = Integer.parseInt(ips[i]);
                if(!(x>=0 && x<=255)){
                    res = false;
                    break;
                }
            }
        }catch (Exception e){
            res = false;
        }


        return res;

    }
}
