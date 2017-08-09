package com.pancong.train;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Pan on 2017/8/5.
 */
public class 单链表 {
    public static void main(String[] args) {

        class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        class MyLinkList{
            Node head = null;
            int size = 0;
            public MyLinkList(Node head,int size){
                this.head = head;
                this.size = size;
            }
            public void print(){
                Node tmp = head;
                while (tmp != null){
                    System.out.print(tmp.data+" ");
                    tmp = tmp.next;
                }
            }
            public void delete(int x){

                Node tmp = head;
                Node pre = head;
                while(tmp != null){
                    if(tmp.data == x)
                        break;
                    pre = tmp;
                    tmp = tmp.next;
                }

                if(tmp == head){
                    head = head.next;
                    return;
                }else{
                    pre.next = tmp.next;
                }
            }
            //插入到data为x的节点后面
            public void insert(Node node, int x){


                if(this.head == null)
                    return;
                Node tmp = this.head;

                while(tmp!=null){

                    if(tmp.data == x)
                        break;
                    else
                        tmp = tmp.next;
                }
                if(tmp == null){
                    tmp.next = node;
                    return;
                }else {
                    Node next = tmp.next;
                    tmp.next = node;
                    node.next = next;
                    return;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int hData = scanner.nextInt();
        Node head = new Node(hData);
        MyLinkList list = new MyLinkList(head,size);
        for(int i = 0; i < size-1; i++){
            Node node = new Node(scanner.nextInt());
            list.insert(node,scanner.nextInt());



        }
        list.delete(scanner.nextInt());
        list.print();
    }


}
