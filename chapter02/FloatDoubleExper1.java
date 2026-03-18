//将华氏温度80度，转换为摄氏度，并显示出来
//。C= （。F - 32）/1.8
//华氏温度Fahrenheit，摄氏度Celsius
class FloatDoubleFxper1{
	public static void main (String[] args){
		//定义一个变量用来存储华氏温度
		double fahrenheit = 80;
		//将华氏温度转换为摄氏温度
		double celsius = (fahrenheit - 32)/1.8;
		//输出结果
		System.out.println(celsius);
		
	}
}