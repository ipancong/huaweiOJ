package com.pancong.train;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 3 8 0 1 0 2 0 9 5
 0 9 0 0 0 0 0 6 0
 4 0 0 3 0 0 0 1 0
 0 0 0 6 3 0 5 0 0
 9 7 0 5 8 1 0 4 0
 6 0 0 4 2 0 0 7 0
 7 1 9 8 0 6 2 3 4
 0 6 0 0 7 3 9 5 1
 2 3 5 0 1 4 7 8 0
 */
public class Shudu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int[][] data=new int[9][9];
            ArrayList<HashSet<Integer>> row=new ArrayList<HashSet<Integer>>();
            ArrayList<HashSet<Integer>> col=new ArrayList<HashSet<Integer>>();
            ArrayList<HashSet<Integer>> squ=new ArrayList<HashSet<Integer>>();
            for(int i=0;i<9;i++){
                row.add(new HashSet<Integer>());
                col.add(new HashSet<Integer>());
                squ.add(new HashSet<Integer>());
            }
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    data[i][j]=sc.nextInt();
                    if(data[i][j]!=0){//row col squ是数独开始已有的元素，不能为0，也不可能重复
                        row.get(i).add(data[i][j]);//且HashSet集合类不能添加重复元素
                        col.get(j).add(data[i][j]);
                        squ.get(i/3*3+j/3).add(data[i][j]);
                    }
                }
            }
            dfs(data,row,col,squ,0);//调用封装的方法
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(j!=8)
                        System.out.print(data[i][j]+" ");
                    else
                        System.out.println(data[i][j]);
                }
            }
        }
        sc.close();
    }
    public static boolean dfs(int[][] data,ArrayList<HashSet<Integer>> row,ArrayList<HashSet<Integer>> col,ArrayList<HashSet<Integer>> squ,int index){
        if(index==81)
            return true;//即数独的元素是全的，不需要填
        int m=index/9;//代表row数组的第m个元素
        int n=index%9;//代表col数组的第n个元素
        int k=m/3*3+n/3;//代表squ数组的第k个元素
        if(data[m][n]!=0){//数独矩阵里有初始值的，不填，跳过
            return dfs(data,row,col,squ,index+1);
        }else{
            for(int i=1;i<=9;i++){
                if(!row.get(m).contains(i)&&!col.get(n).contains(i)&&!squ.get(k).contains(i)){
                    data[m][n]=i;
                    row.get(m).add(i);
                    col.get(n).add(i);
                    squ.get(k).add(i);
                    if(dfs(data,row,col,squ,index+1))//这里开始递归，如果第一次填入的数导致后面填不了数，
                        return true;                 //说明此时填入的数不对，需要再i++循环
                    data[m][n]=0;                    //就将此步填入的数清空，重填
                    row.get(m).remove(i);
                    col.get(n).remove(i);
                    squ.get(k).remove(i);
                }
            }
            return false;
        }
    }
}