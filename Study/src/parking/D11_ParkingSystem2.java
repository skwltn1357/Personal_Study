package parking;

import java.time.LocalDate;
import java.util.ArrayList;
/*
1. ���� 5���� ���ڸ� ��ȣ üũ (4�ڸ��� ������ ����)
   - ������ : 1, 6
   - ȭ���� : 2, 7
   - ������ : 3, 8
   - ����� : 4, 9
   - �ݿ��� : 5, 0
   - ������ : ����
   
2. ���� ���� : 2018�� 9�� 1��

3. ������(���� ����)
   - (1�� 1��) ����
   - (3�� 1��) ������
   - (5�� 5��) ��̳�
   - (6�� 6��) ������
   - (8�� 15��) ������
   - (10�� 3��) ��õ��
   - (10�� 9��) �ѱ۳�
   - (12�� 25��) ũ��������
   
4. ���� ���� : �����, ���Ƶ���, ����	
*/

public class D11_ParkingSystem2 {
	
	 private static ArrayList<LocalDate> holidays = new ArrayList<LocalDate>() {
		 private static final long serialVersionUID = 1L;	//ArrayList�� ����� ���� �߰��� ��
		 {
			 this.add(LocalDate.of(2000, 1, 1));
			 this.add(LocalDate.of(2000, 3, 1));
			 this.add(LocalDate.of(2000, 5, 5));
			 this.add(LocalDate.of(2000, 6, 6));
			 this.add(LocalDate.of(2000, 8, 15));
			 this.add(LocalDate.of(2000, 10, 3));
			 this.add(LocalDate.of(2000, 10, 9));
			 this.add(LocalDate.of(2000, 12, 25));
		 }
	 };
	 
	 private boolean checkHoliday(Car car) {
		 
		 for (LocalDate holiday : holidays) {
			if (holiday.getDayOfMonth() == car.getPark_date().getDayOfMonth()
					&& holiday.getMonthValue() == car.getPark_date().getMonthValue()) {
				return true;
			}
		 }
		 return false;
	 }
	 
	 public static void main(String[] args) {
		D11_ParkingSystem2 parking = new D11_ParkingSystem2();
		
		for(int i=0; i<100; ++i) {
			Car car = new Car();
			
			if(parking.checkHoliday(car)) {
				System.out.println(car.getPark_date() + "�� ������ �Դϴ�.");
			}else {
				System.out.println(car.getPark_date() + "�� �������� �ƴմϴ�.");
			}
		}
	}
}