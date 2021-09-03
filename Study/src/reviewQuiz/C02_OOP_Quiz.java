package reviewQuiz;

public class C02_OOP_Quiz {
	
	/*
	 	�������� : ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä��ٿ� ����غ�����
	 	�� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
	 */

	public class Window {
		boolean open;
		boolean lock;
		double width;
		double height;
		
		 void open() {
			open = true;
		}
		void close() {
			open = false;
		}
		void lock() {
			lock = true;
		}
		void unlock() {
			lock = false;
		}
		void status() {
			System.out.printf("�� â���� %s. %s.",
					open ? "�����ֽ��ϴ�" : "�����ֽ��ϴ�.",
					lock ? "����ֽ��ϴ�" : "������������Դϴ�.");
		}
		String getStatus() {
			return String.format("�� â���� %s. %s.",
					open ? "�����ֽ��ϴ�" : "�����ֽ��ϴ�.",
					lock ? "����ֽ��ϴ�" : "������������Դϴ�.");
		}
		
		public void main(String[] args) {
			Window window1 = new Window();
			
			window1.open();
			window1.close();
			window1.lock();
			
			window1.getStatus();
			
			String status = window1.getStatus();
			System.out.println("������ ���� ���ڿ��� ��� : " + status);
		}
		
	}

		
	}

	
	
	
	
	
	