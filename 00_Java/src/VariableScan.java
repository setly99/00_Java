import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		
		
		//����ڿ��� �Է¹��� ������ ����
		//Scanner�� �̿��ؼ� �Է¹��� ������ ��ǻ�Ϳ� ǥ������
		//System.in ����ؼ� Ű���� �Է��� �о�� �� ���
	
		// Scanner �ڷ��� �ڸ��� int�� String�̳� �Ǽ� boolean����
		// Ȯ����� ��Ÿ�� �� ���� ������ �ʱ⿡�� Scanner��� ���
		
		// nextLine(): ���� �Ǵ� ���͸� ġ�� �������� ������ü�� �Է¹޴´�.
		//�Էµ� ���ڸ� ��� �� �����´�. (����, Ư������ �� ���)
		
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("������� �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("������� ��� ���� �Է��ϼ���.");
		String live = sc.nextLine();
		System.out.println(live);
		
		System.out.print("������� �ڵ�����ȣ�� �Է��ϼ���:");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		*/
		
		//Scanner���� String�� ����ؼ�
		//������� Ű, ������� ����, ������� �г����� �Է¹ޱ�
		
		//String height, age, nickName
		
		System.out.print("������� Ű�� �Է��ϼ���: ");
		String height = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
		String age = sc.nextLine();
		System.out.print("�г����� �Է��ϼ���: ");
		String nickName = sc.nextLine();
		
		System.out.print("Ű : " + height 
				+", ����: " + age 
				+ ", �г���: " + nickName);
		
		sc.close();
				
	}

}
