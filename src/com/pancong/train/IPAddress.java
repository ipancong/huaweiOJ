package com.pancong.train;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

/**
 * Created by Pan on 2017/7/22.
 * 题目描述
 * 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
 * <p>
 * 所有的IP地址划分为 A,B,C,D,E五类
 * <p>
 * A类地址1.0.0.0~126.255.255.255;
 * <p>
 * B类地址128.0.0.0~191.255.255.255;
 * <p>
 * C类地址192.0.0.0~223.255.255.255;
 * <p>
 * D类地址224.0.0.0~239.255.255.255；
 * <p>
 * E类地址240.0.0.0~255.255.255.255
 * <p>
 * <p>
 * <p>
 * 私网IP范围是：
 * <p>
 * 10.0.0.0～10.255.255.255
 * <p>
 * 172.16.0.0～172.31.255.255
 * <p>
 * 192.168.0.0～192.168.255.255
 * <p>
 * <p>
 * <p>
 * 子网掩码为前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
 * 本题暂时默认以0开头的IP地址是合法的，比如0.1.1.2，是合法地址
 * <p>
 * 输入描述:
 * 多行字符串。每行一个IP地址和掩码，用~隔开。
 * 输出描述:
 * 统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。
 */
public class IPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int error = 0;
        int pri = 0;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if(line.equals("#"))
                break;
            String[] IpArr = line.split("~");
            if (isErrorIP(IpArr[0]) && isError(IpArr[1])) {

                if (isPrivate(IpArr[0]))
                    pri++;
                if (isA(IpArr[0]))
                    A++;
                if (isB(IpArr[0]))
                    B++;
                if (isC(IpArr[0]))
                    C++;
                if (isD(IpArr[0]))
                    D++;
                if (isE(IpArr[0]))
                    E++;
            } else
                error++;

        }
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + error + " " + pri);
    }

    //ip是否合法
    private static boolean isErrorIP(String ip) {
        boolean res = true;
        if (ip == null || "".equals(ip))
            return false;
        Pattern pattern = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$");
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            String[] nums = ip.split("\\.");
            for (String num : nums) {
                int n = Integer.valueOf(num);
                if (n < 0 || n > 255) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }

        return res;
    }

    //掩码是否合法
    private static boolean isError(String ip) {
        boolean result = true;
        String[] arr = ip.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(intTo2(arr[i]));
        }

        if (sb.toString().indexOf("01") > -1) {

            result = false; //错误返回false
        }

        return result;
    }

    private static boolean isA(String ip) {
        boolean result = false;
        String[] arr = ip.split("\\.");
        if (stringTOint(arr[0]) >= 1 && stringTOint(arr[1]) >= 0 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[0]) <= 126 && stringTOint(arr[1]) <= 255 && stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        return result;
    }

    private static boolean isB(String ip) {
        boolean result = false;
        String[] arr = ip.split("\\.");
        if (stringTOint(arr[0]) >= 128 && stringTOint(arr[1]) >= 0 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[0]) <= 191 && stringTOint(arr[1]) <= 255 && stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        return result;
    }

    private static boolean isC(String ip) {
        boolean result = false;
        String[] arr = ip.split("\\.");
        if (stringTOint(arr[0]) >= 192 && stringTOint(arr[1]) >= 0 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[0]) <= 223 && stringTOint(arr[1]) <= 255 && stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        return result;
    }

    private static boolean isD(String ip) {
        boolean result = false;
        String[] arr = ip.split("\\.");
        if (stringTOint(arr[0]) >= 224 && stringTOint(arr[1]) >= 0 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[0]) <= 239 && stringTOint(arr[1]) <= 255 && stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        return result;
    }

    private static boolean isE(String ip) {
        boolean result = false;
        String[] arr = ip.split("\\.");
        if (stringTOint(arr[0]) >= 224 && stringTOint(arr[1]) >= 0 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[0]) <= 255 && stringTOint(arr[1]) <= 255 && stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        return result;
    }

    private static boolean isPrivate(String ip) {
        boolean result = false;
        String[] arr = ip.split("\\.");
        if (stringTOint(arr[0]) == 10 && stringTOint(arr[1]) >= 0 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[1]) <= 255 && stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        if (stringTOint(arr[0]) == 172 && stringTOint(arr[1]) >= 16 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[1]) <= 255 && stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        if (stringTOint(arr[0]) == 192 && stringTOint(arr[1]) == 168 && stringTOint(arr[2]) >= 0 && stringTOint(arr[3]) >= 0 &&
                stringTOint(arr[2]) <= 255 && stringTOint(arr[3]) <= 255)
            result = true;
        return result;
    }

    private static int stringTOint(String str) {
        return Integer.parseInt(str);
    }

    private static String intTo2(String val) {
        int code = Integer.valueOf(val);
        StringBuffer sb = new StringBuffer();
        while (code > 0) {
            if (code % 2 == 1)
                sb.append("1");
            else
                sb.append("0");
            code /= 2;
        }
        return sb.reverse().toString();
    }


}
