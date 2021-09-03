package review;
import java.util.Arrays;

public class C03_Constructor {
	/*
	 	# Ŭ������ ������ (Constructor)
	 	
	 	 - Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
	 	 - �޼������� ���� Ÿ���� �������� �ʴ´�
	 	 - �ν��Ͻ���  ������ �� new�� �Բ� ���ȴ�
	 	 - �ν��Ͻ� ���� �� ���� ���� ȣ��Ǳ� ������ �ַ� �ν��Ͻ� �ʱ�ȭ�� ���ȴ�
	 	 - �����ڸ� �ϳ��� �������� ���� Ŭ�������� �ڵ����� ������ �⺻ �����ڰ� �����Ѵ�.
	 	 	(�ƹ��ϵ� ���� ����)
	 	 - ���� ������ �����ڰ� �����ϴ� Ŭ������ �⺻�����ڸ� �ڵ����� �������� �ʴ´�.
	 	 	(�⺻ �����ڸ� ����ϰ� �ʹٸ� �⺻ �����ڸ� �߰��� �����ؾ� �Ѵ�)
	 */
	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		Orange o1 = new Orange(); // ������ = Orange
		Peach p1 = new Peach("��ȫ��");
		
		Peach peach1 = new Peach("����ȫ��");
		Peach peach2 = new Peach("��������");
		
		String str = String.format("%d:%d:%d", 10,20,30);
		System.out.println(str);
		
		System.out.println("�ν��Ͻ� ������ �迭ó�� �ʱ�ȭ�� �̸� �Ǿ��ִ�");
		System.out.println(a1.color);
		System.out.println(a1.calorie);
		
		System.out.println(o1.sweet);
		System.out.println(o1.address);
		System.out.println(Arrays.toString(o1.color));
		
		
		System.out.println(peach1.color);
		System.out.println(peach1.size);
		
		Peach pe = new Peach("��ȫ��",4);
		System.out.println(pe.color);
	
	}
}

class Peach{
	String color;
	int size;
	
	// this : �� �ν��Ͻ����� �ڱ� �ڽ��� ����Ų��
	Peach(String color){
		this.color = color;
		this.size = 10;
	}
	
	Peach(String color, int size){
		this.color = color;
		this.size = size;
	}
	
	
	Peach(int size) {
		this.size = size;
		this.color = "default color";
	}
	
	// ������ �����ε�
	Peach() {
		this.color = "�⺻��";
		this.size = 10;
	}
}
class Orange {
	
	int[] color;
	double sweet;
	String address;
	
	Orange() {
		color = new int[] {255,255,0};
		sweet = 10.0;
		address = "���ֵ�";
		
		
	}
	
}
