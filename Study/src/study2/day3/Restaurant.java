package study2.day3;

public class Restaurant {
	// 음식점 Table을 받아주는 클래스
	
	String r_name;
	String r_type;
	
	public Restaurant(String r_name, String r_type) {
		super();
		this.r_name = r_name;
		this.r_type = r_type;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public String getR_type() {
		return r_type;
	}

	public void setR_type(String r_type) {
		this.r_type = r_type;
	}

	@Override
	public String toString() {
		return String.format("%s/%s", r_name,r_type);
	}

}
