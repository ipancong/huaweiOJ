package com.pancong.train;




import java.util.*;

/**
 * Created by Pan on 2017/8/2.
 */
public class 名字漂亮度 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();

            String[] names = new String[n];
            int[] count = new int[n];


            for (i = 0; i < n; i++) {
                names[i] = scanner.next();
            }

            for (i = 0; i < n; i++)
                System.out.println(getBeauty(names[i]));
        }



    }

    public static int getBeauty(String name){
        int count = 0;
        char tmp=' ';
        int c = 26;
        char[] array = name.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
             if(map.containsKey(array[i])){
                 map.put(array[i],map.get(array[i])+1);
             }else
                 map.put(array[i],1);
        }

        List<Integer> list = new ArrayList();
        for(Character ch : map.keySet()){
            list.add(map.get(ch));
        }
        Collections.sort(list);
        int first = 26-list.size()+1;
        for(int j = 0; j < list.size(); j++){
            count += (list.get(j)*first);
            first++;
        }
        return count;
    }
}
