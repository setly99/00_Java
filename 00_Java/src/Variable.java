
public class Variable {

	public static void main(String[] args) {
		//1.���� 2.���� 3.���ڿ� 4.�Ǽ� 5.����
		//1.���� byte short int long
		// byte : 1byte ������������
		byte ����Ʈ = 1;
		System.out.println(����Ʈ);
		System.out.println("����Ʈ");
		
		//���� ������ �� ctrl + s 
		byte bt = 2;
		System.out.println(bt);
		
		short ��Ʈ = 3;
		System.out.println(��Ʈ);
		
		int ��Ʈ = 1;
		System.out.println(��Ʈ);
		
		// *8bit : 1byte �ڷ��� ���� , �����̸� bte, �ȿ� ����2�ְ� ���
		// *2byte short , shrt , �ȿ� 2
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
		
		//2. ����
		//���ڿ��� char�� String�� ����
		//���ڸ� ��Ÿ���� char�� '' ��������ǥ�� ����ؼ�ǥ��
		//" " ū����ǥ�� String ���ڿ��� ��Ÿ����ǥ��
		char myChar = 'A';
		System.out.println(myChar);

		// char myChar2 = "A"; //ū����ǥ:����
		
		//char���� �ϳ��� ���ڸ� ���� �� �ֱ� ������
		//A�� B �� �� �ϳ��� �ۼ� ����
		
		/**/ //�ּ�������
		/*
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * 
		 * ��� ���ڰ� �ϳ��� �ƴϱ� ������ ����� �� ����
		 * 
		 * */
		
		//String
		String str1 = "�� ���� ���ڴ�~~";
		System.out.println(str1);
		// String �� ����ؼ� ������ �̸� ����ϱ�
		//String name = "������ �̸�";
		//sysout ���� ���
		String name = "��ȿ��";
		System.out.print("����� �̸��� ");
		System.out.println(name);
		System.out.println("�Դϴ�.");
		
		//���࿡ ���� ���ڳ� ������ ���ٷ� ����ϰ� �ʹٸ�
		// +�� ����ؼ� �̾ ����� �� ����
		System.out.println("����� �̸���" + name + "�Դϴ�");
		
		//����� �̸��� ������ �Դϴ�.(����)-ū����ǥ�ȿ�
		System.out.println("����� �̸��� " + name + " �Դϴ�");
		
		//���� + ���� + ���ڿ� ����ϱ�
		/*
		 * �ȳ��ϼ���. ���� ���￡ ��� ������ �Դϴ�.
		 * �� ��ȭ��ȣ�� 111-2222-3333 �Դϴ�.
		 * �� �ֹι�ȣ�� ����Դϴ�.
		 * �� �������� A���Դϴ�.
		 * 
		 * */
		String greeting = "�ȳ��ϼ���.";
		String introduction = "���� ���￡ ��� ������ �Դϴ�.";
		int number1 = 111;
		int number2 = 2222;
		int number3 = 3333;
		String number = "111-2222-3333";
		
		char dash = '-';
		String secret = "���";
		String bloodType ="A��";
		
		System.out.print(greeting);
		System.out.println(introduction);
		System.out.print("�� ��ȭ��ȣ�� ");
		
		
		System.out.println(number1 + dash + number2 + dash + number3);
		
		//5756�� �ֳ��Դ��� - char�� ������ ����ؼ� ����Ǿ���.
		char dashTest ='-';
		int dashNum = dashTest;
		System.out.println("dash�� "+dashNum+" ���Դϴ�.");
		
		char charA ='A';
		System.out.println("charA : " +charA);
		char charTest = 65;
		System.out.println("charTest: "+charTest);
		
		int numberOfcharA = 'A';
		System.out.println("numberOfcharA : "+ numberOfcharA);
		int numberOfcharA_v2 = charA;
		System.out.println("numberOfcharA_v2 : "+ numberOfcharA_v2);
		
		System.out.print(number);
		
		System.out.println(" �Դϴ�.");
		
		System.out.println("�� �ֹι�ȣ�� " + secret +"�Դϴ�.");
		System.out.println("�� �������� "+ bloodType + "�Դϴ�");
		
		//4. �Ǽ� 5. ����
		// �Ǽ��� float �� double�� ����
		//�Ǽ��� �⺻���� double�������� �Ǿ����� - �Ǽ������� ũ�⶧���� ũ����Ƴ���
		
		/*
		 * float ff1 = 3.14; // 3.14�� ff1�� ��´ٴ� ���ε�
		 * 3.14�� �⺻ double���̶� ����float�� ūdouble�� �������ؼ� ����
		 * ���� �ڿ� f���̱�
		 * 
		 * */
		
		
		//float : 4byte, double :8byte 
		//float�� �Ǽ��� ��� ���ؼ��� f�� �ٿ���� ��.
		// �Ǽ� �ڿ� f������ �� ��ҹ��� ���о��� ��밡��
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		
		System.out.println("ff1 : " + ff1 + " �̴�.");
		System.out.println("ff2 : " + ff2 + " �̴�.");
		
		// double�� float���� ũ�Ⱑ ũ�� ���ʿ� double�� ������ �߱� ������
		//�ڿ� �ٸ� ������ ������ �ʾƵ� ����� �� ����
		double dd1 = 3.14;
		double dd2 = 3.14f;
		
		System.out.println("double dd1 : " + dd1);
		System.out.println("double dd2 : " + dd2);
		
		//dd2�� double�� 3.14�� float�� �ٲٰ� (�׷�����float�ΰ͵��ִ°�)
		//�������� ū������ ��ұ� ������ ���������� �����Ⱚ?
		
		float floPi= 3.14f;
		double douPi = floPi;
		System.out.println("floPi : " + floPi);
		System.out.println("douPi : " + douPi);
		
		//double�� �ٽ� float��� ���������� �Űܴ������� ����ȯ�ʿ�
		float testDoubleToFloat = (float) (douPi);
		System.out.println("testDoubleToFloat : "+testDoubleToFloat);
		
		//�׷��� 3.14�� double��, 3.14f�� float���̴ϱ� 3.14f�� �����Ⱚ����
		//double�� ��������
		double dd3 = (double) 3.14f;
		System.out.println("dd3 :" + dd3);
		//�ǹ̰�����. (double)�� ����ȯ �Ƚᵵ ������ ū���� ������ �ڵ����ε�.
		System.out.printf("dd3��°�ڸ����� : %.2f \n",dd3);
		//���� �Ҽ���°�ڸ����� �ڸ������� printf���
		
		
		//5. ����
		//boolean�� ����ؼ� true ���� false���� ǥ���� �� ����
		//���߿� �˰����̳� if for while���� ����� �� ���� ���
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("���� ������ " + isTrue);
		System.out.println("���� ������ " + isFalse + " ?");
		
		//���� ���� ���ڿ� �Ǽ� ����
		int num = 10;
		System.out.println("���� num�� ��"+num);//���ڿ��� ���ڸ� +�� ����

		char ch = 'Z';
		System.out.println("���� ch�� �� =" + ch);

		String text = "Hello, World!";
		System.out.println("���ڿ� text : " + text);
		
		double db1 = 3.14;
		System.out.println(db1);
		
		boolean isTrue2 = true;
		System.out.println("isTrue :" + isTrue2 );
		
		System.out.println(" num = " + num);
		
		//num�� 10 ��� 20�� �ְ� �ʹٸ�?
		
		//int num = 20; //���� int num �� �־ ����
		num = 20;
		
		System.out.println("num = " + num);
		
		/*
		 * ö���� 19���̾���.
		 * �׷��� 24���� �Ǹ鼭 20���� �Ǿ���.
		 * 
		 * */
		
		String name1 = "ö��";
		String age = "19";
		System.out.println(name1 + "�� " + age + "���̾���.");
		age = "20"; // age�� 20���� ����
		System.out.println("�׷��� 24���� �Ǹ鼭 " + age + "���� �Ǿ���.");
		
		
		
		
		
		
	}

}
