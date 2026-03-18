import java.util.Scanner;
class ScannerTest{
    public static void main(String[] args){
		System.out.println("请输入你的姓名：");
		System.out.println("请输入你的年龄：");
		System.out.println("请输入你的体重：");
		System.out.println("请输入你是否单身：");
		System.out.println("请输入你的性别：");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int age = sc.nextInt();
    double weight = sc.nextDouble();
    boolean  is_Alone = sc.nextBoolean();
    String sex = sc.next();
		System.out.println(name +age+weight+is_Alone+sex);
        sc.close();
//		boolean b1 = sc.nextBoolean();
    //	byte b2 = sc.nextByte();
    //	double d1 = sc.nextDouble();
    //	float f1 = sc.nextFloat();
    //	int i1 = sc.nextInt();

}
}