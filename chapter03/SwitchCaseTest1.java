import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCaseTest1 {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch(score/60){
            case 1:
                System.out.println("及格");
                break;
            case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入错误");
        }
/*        switch(score/10){
            case 10,9,8,7,6:
               System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }*/
/*        switch(score/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
        }*/
/*        switch(score){
            case 100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }*/
        sc.close();
    }
}
