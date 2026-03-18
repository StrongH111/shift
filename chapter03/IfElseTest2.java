class IfElseTest2{
	public static void main(String[] args){
		int num1 = 42;
		int num2 = 32;
		int num3 = 76;
		if(num1 >num2){
			if(num1 < num3){
				System.out.println(num3 +","+num1 +","+ num2);
			}else if(num2 >num3){
				System.out.println(num1 +","+num2 +","+ num3);				
			}else{
				System.out.println(num1 +","+num3 +","+ num2);				
			}
		}else{
			if(num3 >num2){
				System.out.println(num3 +","+num2 +","+ num1);
			}
			else if(num3 <num1){
				System.out.println(num2 +","+num1 +","+ num3);
			}
			else{
					System.out.println(num2 +","+num3 +","+ num1);
			}
				
		}
	}
}