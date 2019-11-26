package Study.输入输出;

import DefinedClasses.People;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: Lumen Wang https://www.zhihu.com/people/dai-li-72-46/activities
 * @Date: 2019-11-26 14:53
 * @Version: 1.0
 */
public class InputOutput {
    public static void main(String[] args){
        /* 1.Scanner 读取控制台输入 */
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("请输出姓名:");
//        String name = in.nextLine();    //在输入行中可能包含空格时，用nextLine;如果想以空格为分隔符，则用in.next
//        System.out.println("请输入年龄:");
//        int age = in.nextInt(); //读取下一个整数，用nextInt
//        People people = new People(name, age);
//        System.out.println("姓名:" + people.name + "\n" + "年龄:" + people.age);
//
//        System.out.println("下面检测输入中是否还有其他整数");
//        boolean hasWord = in.hasNextInt();
//        System.out.println(hasWord);





        /* 2.与时间有关的格式化输出问题，可用于控制台或者文件写入 */
//        System.out.printf("%1$s %2$tr %2$tY %2$tR", "当前时间", new Date());    //注意这里使用的是System.out.printf，不能用println
//        System.out.println("\n");
//        System.out.printf("%s %tr %<tY %<tR", "当前时间", new Date());          //可以用小于号，代表前一个格式中的参数将被再次使用






        /* 3. Scanner 文件的读取和打印 */
//        try{
////            Scanner fileIn = new Scanner(Paths.get("D:\\workspace_IntelliJ IDEA\\Java_IntelliJ\\src\\读取文件\\number.txt"), "UTF-8");试试下面一行的相对位置写法
//            Scanner fileIn = new Scanner(Paths.get("src\\读取文件\\number.txt"), "UTF-8");
//            while (fileIn.hasNext()){
//                System.out.println(fileIn.next());
//            }
//
//        }catch (IOException e){ //第一次报错是因为只给出路径忘记了文件名，然后就没有报错了，可见Paths.get路径是可以识别路径中的空格和中文字符的
//            e.printStackTrace();
//        }





        /* 4.文件的写入PrintWriter */
////        try{
////            PrintWriter printWriter = new PrintWriter("D:\\workspace_IntelliJ IDEA\\Java_IntelliJ\\src\\读取文件\\new.txt", "UTF-8");
////            //尝试写入一些内容：注意不能用System.Out，而应该是printWriter.print
////            printWriter.print("第一行内容，接下来是空格 [中括号内容原来也能写入到文件中，只是print在写入后不换行] ");
////            printWriter.println("第二行内容 这里的整行的内容 虽然是用空格作为分隔符 但应该都为可见，且会在末尾换行");
////            printWriter.println("注意，重写会覆盖原有内容");
////            printWriter.printf("%s %tr %<tY %<tR", "存盘时间：", new Date());
////            printWriter.close();
////        }catch (IOException e){ //运行后发现新建了一个new.txt，说明成功了
////            e.printStackTrace();
////        }

//        //上述方法会将源文件覆盖，如果想追加，需要用到下面的方法，FileWriter
//        try{
//            FileWriter fileWriter = new FileWriter("D:\\workspace_IntelliJ IDEA\\Java_IntelliJ\\src\\读取文件\\new.txt", true); //这里true表示追加在末尾
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            printWriter.print("第一行内容，接下来是空格 [中括号内容原来也能写入到文件中，只是print在写入后不换行] ");
//            printWriter.println("第二行内容 这里的整行的内容 虽然是用空格作为分隔符 但应该都为可见，且会在末尾换行");
//            printWriter.println("注意，重写会覆盖原有内容");
//            printWriter.printf("%s %tr %<tY %<tR", "存盘时间：", new Date());
//            printWriter.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }











    }

}
