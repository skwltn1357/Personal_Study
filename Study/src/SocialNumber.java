
public class SocialNumber {
	
	String socialNumber;
	
	SocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}
	
	public boolean lenCheck() {
		if(socialNumber.length() == 14) {
			return true;
		}
		return false;
	}
	
	public boolean oneCheck() { 
		if(socialNumber.charAt(6) == '-') {
			return true;
		}
		return false;
	}
	
	
	public boolean monthCheck() {
		if(socialNumber.charAt(2) == '0') {
			return socialNumber.charAt(3) >= '1' || socialNumber.charAt(3) <= '9';
		}else if(socialNumber.charAt(2) == '1') {
			return socialNumber.charAt(3) >= '0' || socialNumber.charAt(3) <= '2';
		}
			return false;
	}
	
	public boolean yearCheck() {
		String str = "19" + socialNumber.charAt(0) + socialNumber.charAt(1);
		int year = Integer.parseInt(str);
		boolean leapYear = (year % 400 == 0) || 
				(year % 4 == 0 && year % 100 != 0);
		
		return leapYear;
		
		
	}
	
	public boolean dayCheck() {
		if((socialNumber.charAt(2) == '0') && (socialNumber.charAt(3) == '1' || socialNumber.charAt(3) == '3'||
				socialNumber.charAt(3) == '5'||socialNumber.charAt(3) == '7'||socialNumber.charAt(3) == '8') ||
				(socialNumber.charAt(2) == '1') && (socialNumber.charAt(3) == '0'  ||
				socialNumber.charAt(3) == '2')) {
			if(socialNumber.charAt(4) == '0') {
				return socialNumber.charAt(5) >= '1' && socialNumber.charAt(5) <= '9';	
			}else if(socialNumber.charAt(4) == '1' || socialNumber.charAt(4) == '2') {
				return socialNumber.charAt(5) >= '0' && socialNumber.charAt(5) <= '9';	
			}else if(socialNumber.charAt(4) == '3') {
				return socialNumber.charAt(5) >= '0' && socialNumber.charAt(5) >= '1';
			}
		}else if((socialNumber.charAt(2) == '0') && (socialNumber.charAt(3) == '4' || socialNumber.charAt(3) == '6'||
				socialNumber.charAt(3) == '9') || (socialNumber.charAt(2) == '1') && (socialNumber.charAt(3) == '1' )) {
			if(socialNumber.charAt(4) == '0') {
				return socialNumber.charAt(5) >= '1' && socialNumber.charAt(5) <= '9';
			}else if(socialNumber.charAt(4) == '1' || socialNumber.charAt(4) == '2') {
				return socialNumber.charAt(5) >= '0' && socialNumber.charAt(5) <= '9';
			}else if(socialNumber.charAt(4) == '3') {
				return socialNumber.charAt(5) == '0';
			}
		}else if((socialNumber.charAt(2) == '0') && (socialNumber.charAt(3) == '2')) {
			if(socialNumber.charAt(4) == '0') {
				return socialNumber.charAt(5) >= '1' && socialNumber.charAt(5) <= '9';
			}else if(socialNumber.charAt(4) == '1') {
				return socialNumber.charAt(5) >= '0' && socialNumber.charAt(5) <= '9';
			}else if(socialNumber.charAt(4) == '2') {
				if(yearCheck()) {
					return socialNumber.charAt(5) >= '0' && socialNumber.charAt(5) <= '8';			
				}else {
					return socialNumber.charAt(5) >= '0' && socialNumber.charAt(5) <= '9';
				}
				
				}
		}
		
		return false;
		
		}
	
	
	public boolean backCheck() {
		for(int i=0; i<socialNumber.length(); ++i) {
			if(socialNumber.charAt(7) >= '1' || socialNumber.charAt(7) <= '4') {
				return true;
			}
		}
		return false;
	}

	
	
	public static void main(String[] args) {
		
		SocialNumber sn = new SocialNumber("950904-2222222");
		
		System.out.println(sn.lenCheck());
		System.out.println(sn.oneCheck());
		System.out.println(sn.monthCheck());
		System.out.println(sn.dayCheck());
		System.out.println(sn.backCheck());
		
	}
	
}
