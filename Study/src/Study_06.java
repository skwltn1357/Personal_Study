
public class Study_06 {
	String snum;
	
	public Study_06(String str) {
		snum = str;
	}
	
	public boolean boo() {
		boolean boo2 = false;
		char ch2;
		int count = 0;
		
		for(int i=0; i<snum.length(); ++i) {
			ch2 = snum.charAt(i);
				if(ch2 == '-') {
					count++;					
			}
		}
		if(count == 1) {
			return true;
		}
		
		return boo2;
	}
	
	public static void main(String[] args) {
		Study_06 st = new Study_06("1234-5678");
		System.out.println(st.boo());
	}
}
