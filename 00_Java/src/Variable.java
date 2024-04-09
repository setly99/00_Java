
public class Variable {

	public static void main(String[] args) {
		//1.정수 2.문자 3.문자열 4.실수 5.논리형
		//1.정수 byte short int long
		// byte : 1byte 가장작은단위
		byte 바이트 = 1;
		System.out.println(바이트);
		System.out.println("바이트");
		
		//파일 저장할 때 ctrl + s 
		byte bt = 2;
		System.out.println(bt);
		
		short 쇼트 = 3;
		System.out.println(쇼트);
		
		int 인트 = 1;
		System.out.println(인트);
		
		// *8bit : 1byte 자료형 선언 , 선언이름 bte, 안에 숫자2넣고 출력
		// *2byte short , shrt , 안에 2
		// *4byte int, nt, 2
		// *8byte long, lng, 2
		byte bte = 2;
		System.out.println(bte);
		
		short shrt = 2;
		System.out.println(shrt);
		
		int nt = 2;
		System.out.println(nt);
		
		long lng = 2;
		System.out.println(lng);
		
		//2. 문자
		//문자에는 char와 String이 있음
		//문자를 나타내는 char은 '' 작은따옴표를 사용해서표현
		//" " 큰따옴표는 String 문자열을 나타내는표현
		char myChar = 'A';
		System.out.println(myChar);

		// char myChar2 = "A"; //큰따옴표:오류
		
		//char에는 하나의 문자만 담을 수 있기 때문에
		//A나 B 둘 중 하나만 작성 가능
		
		/**/ //주석여러줄
		/*
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * 
		 * 모두 문자가 하나가 아니기 때문에 출력할 수 없음
		 * 
		 * */
		
		//String
		String str1 = "와 드디어 문자다~~";
		System.out.println(str1);
		// String 을 사용해서 본인의 이름 출력하기
		//String name = "본인의 이름";
		//sysout 으로 출력
		String name = "김효진";
		System.out.print("당신의 이름은 ");
		System.out.println(name);
		System.out.println("입니다.");
		
		//만약에 여러 글자나 내용을 한줄로 출력하고 싶다면
		// +를 사용해서 이어서 출력할 수 있음
		System.out.println("당신의 이름은" + name + "입니다");
		
		//당신의 이름은 ㅇㅇㅇ 입니다.(띄어쓰기)-큰따옴표안에
		System.out.println("당신의 이름은 " + name + " 입니다");
		
		//정수 + 문자 + 문자열 출력하기
		/*
		 * 안녕하세요. 저는 서울에 사는 ㅇㅇㅇ 입니다.
		 * 제 전화번호는 111-2222-3333 입니다.
		 * 제 주민번호는 비밀입니다.
		 * 제 혈액형은 A형입니다.
		 * 
		 * */
		String greeting = "안녕하세요.";
		String introduction = "저는 서울에 사는 ㅇㅇㅇ 입니다.";
		int number1 = 111;
		int number2 = 2222;
		int number3 = 3333;
		String number = "111-2222-3333";
		
		char dash = '-';
		String secret = "비밀";
		String bloodType ="A형";
		
		System.out.print(greeting);
		System.out.println(introduction);
		System.out.print("제 전화번호는 ");
		
		
		System.out.println(number1 + dash + number2 + dash + number3);
		
		//5756이 왜나왔는지 - char를 정수로 계산해서 연산되었다.
		char dashTest ='-';
		int dashNum = dashTest;
		System.out.println("dash는 "+dashNum+" 번입니다.");
		
		char charA ='A';
		System.out.println("charA : " +charA);
		char charTest = 65;
		System.out.println("charTest: "+charTest);
		
		int numberOfcharA = 'A';
		System.out.println("numberOfcharA : "+ numberOfcharA);
		int numberOfcharA_v2 = charA;
		System.out.println("numberOfcharA_v2 : "+ numberOfcharA_v2);
		
		System.out.print(number);
		
		System.out.println(" 입니다.");
		
		System.out.println("제 주민번호는 " + secret +"입니다.");
		System.out.println("제 혈액형은 "+ bloodType + "입니다");
		
		//4. 실수 5. 논리형
		// 실수는 float 와 double이 있음
		//실수는 기본으로 double형식으로 되어있음 - 실수범위가 크기때문에 크게잡아놓음
		
		/*
		 * float ff1 = 3.14; // 3.14를 ff1에 담는다는 뜻인데
		 * 3.14는 기본 double형이라 작은float에 큰double을 담으려해서 오류
		 * 따라서 뒤에 f붙이기
		 * 
		 * */
		
		
		//float : 4byte, double :8byte 
		//float에 실수를 담기 위해서는 f를 붙여줘야 함.
		// 실수 뒤에 f를붙일 때 대소문자 구분없이 사용가능
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		
		System.out.println("ff1 : " + ff1 + " 이다.");
		System.out.println("ff2 : " + ff2 + " 이다.");
		
		// double은 float보다 크기가 크고 애초에 double을 넣으려 했기 때문에
		//뒤에 다른 수식을 붙이지 않아도 사용할 수 있음
		double dd1 = 3.14;
		double dd2 = 3.14f;
		
		System.out.println("double dd1 : " + dd1);
		System.out.println("double dd2 : " + dd2);
		
		//dd2는 double인 3.14를 float로 바꾸고 (그럼원래float인것도있는가)
		//작은것을 큰범위에 담았기 때문에 남은공간에 쓰레기값?
		
		float floPi= 3.14f;
		double douPi = floPi;
		System.out.println("floPi : " + floPi);
		System.out.println("douPi : " + douPi);
		
		//double을 다시 float라는 작은공간에 옮겨담으려면 형변환필요
		float testDoubleToFloat = (float) (douPi);
		System.out.println("testDoubleToFloat : "+testDoubleToFloat);
		
		//그러면 3.14는 double형, 3.14f는 float형이니까 3.14f를 쓰레기값없이
		//double로 담으려면
		double dd3 = (double) 3.14f;
		System.out.println("dd3 :" + dd3);
		//의미가없다. (double)로 형변환 안써도 작은걸 큰곳에 담을땐 자동으로됨.
		System.out.printf("dd3둘째자리까지 : %.2f \n",dd3);
		//따라서 소수둘째자리까지 자르기위한 printf사용
		
		
		//5. 논리형
		//boolean을 사용해서 true 인지 false인지 표현할 수 있음
		//나중에 알고리즘이나 if for while문을 사용할 때 자주 사용
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("오늘 날씨는 " + isTrue);
		System.out.println("내일 날씨는 " + isFalse + " ?");
		
		//정수 문자 문자열 실수 논리형
		int num = 10;
		System.out.println("정수 num의 값"+num);//문자열과 숫자를 +로 붙임

		char ch = 'Z';
		System.out.println("문자 ch의 값 =" + ch);

		String text = "Hello, World!";
		System.out.println("문자열 text : " + text);
		
		double db1 = 3.14;
		System.out.println(db1);
		
		boolean isTrue2 = true;
		System.out.println("isTrue :" + isTrue2 );
		
		System.out.println(" num = " + num);
		
		//num에 10 대신 20을 넣고 싶다면?
		
		//int num = 20; //위에 int num 이 있어서 오류
		num = 20;
		
		System.out.println("num = " + num);
		
		/*
		 * 철수는 19살이었다.
		 * 그런데 24년이 되면서 20살이 되었다.
		 * 
		 * */
		
		String name1 = "철수";
		String age = "19";
		System.out.println(name1 + "는 " + age + "살이었다.");
		age = "20"; // age를 20으로 변경
		System.out.println("그런데 24년이 되면서 " + age + "살이 되었다.");
		
		
		
		
		
		
	}

}
