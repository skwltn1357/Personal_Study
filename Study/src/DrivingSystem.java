import java.time.LocalDate;

public class DrivingSystem {

	public static void allCheck(LocalDate searchDay) {
		car c1 = new car();
		int dayNum = searchDay.getDayOfWeek().getValue();
		LocalDate enforcementDay = LocalDate.of(2018,8,31);	//시행날짜
		String day = "" + searchDay;
		
		if(searchDay.isAfter(enforcementDay)) {
			if(holiday(day)) {
				System.out.println("공휴일은 모든 차량이 출입 가능합니다.");
			}else if(!(c1.type == "장애인" || c1.type == "유아동승" || c1.type == "경차")) {
				numCheck(dayNum,c1.num);
			}else {
				System.out.println("[장애인,유아동승,경차] 출입 가능 차량입니다.");
			}
		}else {
			System.out.println("차량오부제가 시행되지 않은 날입니다. 모든 차량 출입 가능합니다.");
		}
		System.out.println("귀하의 차량 종류는 : " + c1.type);
		System.out.println("귀하의 차량 끝 번호는 : " + c1.num);
		
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
	
	public static void numCheck(int day, int carNum) {	//요일, 차량번호
		if((day == 1 && (carNum == 1 || carNum == 6)) || (day == 2 && (carNum == 2 || carNum == 7)) ||
			(day == 3 && (carNum == 3 || carNum == 8)) || (day == 4 && (carNum == 4 || carNum == 9))||
			(day == 4 && (carNum == 5 || carNum == 0))) {
			System.out.println("출입 제한 차량입니다.");
		}else {
			System.out.println("출입 가능한 차량입니다.");
		}
	}

	
	public static void main(String[] args) {
		LocalDate searchDay = LocalDate.of(2018, 10, 1);
		System.out.println("검색하신 요일은 " + searchDay.getDayOfWeek());
		System.out.println("출입 가능 여부\t: ");
		allCheck(searchDay);
	}
	
}

class car {
	int num;
	String type;
	
	String[] carType = {"장애인","유아동승","경차","중형","대형"};
	int ranCarType = (int)(Math.random() * 5);
	int carLastNum = (int)(Math.random() * 10);
	
	car() {
		this.num = carLastNum;
		this.type = carType[ranCarType];
		
	}
}


