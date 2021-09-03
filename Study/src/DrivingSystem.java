import java.time.LocalDate;

public class DrivingSystem {

	public static void allCheck(LocalDate searchDay) {
		car c1 = new car();
		int dayNum = searchDay.getDayOfWeek().getValue();
		LocalDate enforcementDay = LocalDate.of(2018,8,31);	//���೯¥
		String day = "" + searchDay;
		
		if(searchDay.isAfter(enforcementDay)) {
			if(holiday(day)) {
				System.out.println("�������� ��� ������ ���� �����մϴ�.");
			}else if(!(c1.type == "�����" || c1.type == "���Ƶ���" || c1.type == "����")) {
				numCheck(dayNum,c1.num);
			}else {
				System.out.println("[�����,���Ƶ���,����] ���� ���� �����Դϴ�.");
			}
		}else {
			System.out.println("������������ ������� ���� ���Դϴ�. ��� ���� ���� �����մϴ�.");
		}
		System.out.println("������ ���� ������ : " + c1.type);
		System.out.println("������ ���� �� ��ȣ�� : " + c1.num);
		
	}
	
	public static boolean holiday(String day) {
		boolean holi = false;
		String[] holiday = {"01-01","03-01","05-05","06-06","08-15","10-03","10-09","12-25"};
		for(int i=0; i<holiday.length; ++i) {
			if(day.contains(holiday[i])) {
				holi = true;
			}
		}
		return holi;
	}
	
	public static void numCheck(int day, int carNum) {	//����, ������ȣ
		if((day == 1 && (carNum == 1 || carNum == 6)) || (day == 2 && (carNum == 2 || carNum == 7)) ||
			(day == 3 && (carNum == 3 || carNum == 8)) || (day == 4 && (carNum == 4 || carNum == 9))||
			(day == 4 && (carNum == 5 || carNum == 0))) {
			System.out.println("���� ���� �����Դϴ�.");
		}else {
			System.out.println("���� ������ �����Դϴ�.");
		}
	}

	
	public static void main(String[] args) {
		LocalDate searchDay = LocalDate.of(2018, 10, 1);
		System.out.println("�˻��Ͻ� ������ " + searchDay.getDayOfWeek());
		System.out.println("���� ���� ����\t: ");
		allCheck(searchDay);
	}
	
}

class car {
	int num;
	String type;
	
	String[] carType = {"�����","���Ƶ���","����","����","����"};
	int ranCarType = (int)(Math.random() * 5);
	int carLastNum = (int)(Math.random() * 10);
	
	car() {
		this.num = carLastNum;
		this.type = carType[ranCarType];
		
	}
}


