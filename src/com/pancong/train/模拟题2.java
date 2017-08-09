package com.pancong.train;

/**
 * Created by Pan on 2017/8/8.
 */
public class 模拟题2 {
    public static void main(String[] args) {
        /**
         * 交换数组里n和0的位置
         *
         * @param array
         *            数组
         * @param len
         *            数组长度
         * @param n
         *            和0交换的数
         */
        // 不要修改以下函数内容
        public void swapWithZero(int[] array, int len, int n) {
            Main.SwapWithZero(array, len, n);
        }
        // 不要修改以上函数内容


        /**
         * 通过调用swapWithZero方法来排
         *
         * @param array
         *            存储有[0,n)的数组
         * @param len
         *            数组长度
         */
        public void sort(int[] array, int len) {
            // 完成这个函数
            for(int i = 0; i < array.length; i++){    //因为只能交换0和其他数，所以先把0找出来。
                if(array[i] == 0){
                    swapWithZero(array, len, 0);
                    break;
                }
            }
            for(int i = 1; i < array.length; i++){ //因为是0至N-1的数，所以N就放在第N的位置处。
                if(array[i] != i){ //这个很重要，如果i刚好在i处，就不用交换了，否则会出错
                    for(int j = (i + 1); j < array.length; j++){
                        if(array[j] == i){
                            swapWithZero(array, j, array[0]);        //把0换到j处，此时j处是0
                            swapWithZero(array,j, i );               //把j处的0换到i处，此时i处是0
                            swapWithZero(array,array[i], array[0] ); //把i处的0换到0处
                        }
                    }
                }
            }
        }
    }
}
