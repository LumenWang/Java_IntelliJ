package Study.数组;

import java.util.Arrays;

/**
 * @Author: Lumen Wang https://www.zhihu.com/people/dai-li-72-46/activities
 * @Date: 2019-11-26 16:54
 * @Version: 1.0
 */
public class Array {
    public static void main(String[] args){

        /* 1.数组初始化，格式化输出 */
////        int [] array = new int[10];
////        for(int i=0;i<10;i++){
////            array[i] = i;
////        }//数组初始化不用这么麻烦，请看下面的方法：
//        int [] array = {1,2,3,4,5,6,7,8,9,10};
//
////        System.out.println(array.toString());//直接打印数组名.toString()，得到的只是数组的地址
//        System.out.println(Arrays.toString(array));//调用静态类Arrays.toString(array_name) 方法，可格式化打印出数组内容
//        array = new int [] {1,3,5,7,9,2,4,6,8,10};//利用匿名数组，对已有数组进行重新初始化：
//        System.out.println(Arrays.toString(array));//重新初始化数组成功



        /* 2.数组排序 */
        int [] array = new int[] {10,9,8,7,6,5,4,3,2,1,222};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));





    }
}
