package review;

public class C02_OOP {
	/*
	 	# ��ü���� ���α׷��� (OOP: Object Oriented Programming)
	 	
	  	 - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	  	 - ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
	  	 - ��ü(Object) : ���� �����ϴ� ��� �� (�繰, ����, ..���)
	  	 
	  	 ex: ���
	  	 	- ����� ���� : ũ��, �絵, ����, Į�θ�, �������, ���...
	  	 	- ����� �޼��� (������ ��ȭ��Ű�� �͵�) 
	  	 		: �Դ´� ( ũ�Ⱑ �پ��鼭 Į�θ���ŭ ���� ����� Į�θ� ����)
	  	 		: ���� ���Ѵ�
	  	 		: ��������� �پ���
	  	 		: ������ (ũ�⸸ŭ�� �������� ������)
	  	 		: ������� �����Ѵ� (��������� ������ �����Ѵ�)
	  	 	
	  	 	�� Ŭ������ ���� �ִ� �Լ����� �޼����� �θ��� (JAVA���� �޼���ۿ� ����)
	  	 	
	  	 # Ŭ���� (Class)
	  	 	- ��ü�� ���α׷��� ���� ǥ���� ��
	  	 	- Ŭ������ �ش� ��ü�� ���赵�̴� (������ ���������� ��ü�� ����)
	  	 	- ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	  	 	- Ŭ������ ������ ���� Ÿ���̴�
	 */
	// main�� �ݵ�� public class ���ο� �����ؾ� �Ѵ�
	//(���� �̸��� �Ȱ��� �̸��� Ŭ������ �����ؾ� ã�� �� �ִ�)
	public static void main(String[] args) {
		
		// new�� ���� �ν��Ͻ� ����
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		a1.size = 15;
		a1.color = "������";
		
		a2.size = 13;
		a2.color = "�����";
		
		a3.size = 25;
		a3.calorie = 100;
		
		System.out.println(a1.color);
		System.out.println(a2.color);
		System.out.println("�Ա� �� a3�� ũ�� : " + a3.size);
		System.out.println("�Ա� �� a3�� Į�θ� : " + a3.calorie);
		
		a3.eat();
		System.out.println("���� �� a3�� ũ�� : " + a3.size);
		System.out.println("���� �� a3�� Į�θ� : " + a3.calorie);		
		}
	}
	
	class Apple{
		/*
		  	# �ν��Ͻ� ����
		  	
		  	- Ŭ���� ���ο� ������ ����
		  	 - �ν��Ͻ� ���� ������ ������ ������ �ִ� ������
		  	 - aka. �ʵ�, �Ӽ�, ��� ����, ���, ���� ...
		 */
		
		int size;
		double sweet;
		String color;
		int calorie;
		
		/*
		 	# �ν��Ͻ� �޼���
		 	
		 	 - �ν��Ͻ� ������ ���� �ش� �ν��Ͻ�
		 */
	void eat() {
		size--;
	    calorie = 10;
	    
		}
	}
	

	