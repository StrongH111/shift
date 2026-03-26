package number;

import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        int score =0;
        while(score  >= 0) {
            System.out.println("请输入学生成绩：");
            score = sc.nextInt();
            v.addElement(score);
        }
        Object obj = v.elementAt(0);
        System.out.println(obj);
        System.out.println(v.size());

    }
}
