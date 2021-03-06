package reviewQuiz;

import java.util.Random;
/*
	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	
	1. 각 학생의 점수는 랜덤으로 설정
	2. 과목은 국/영/수
	3. 30명의 평균 점수를 출력
	4. 30명 중 가장 점수가 높은 학생의 성적을 출력
*/
public class D01_Student implements Comparable<D01_Student> {
	public int snum;	//학생 번호
	public int kor;
	public int eng;
	public int math;
	public double avg;
	
	public static double best_avg = 0;
	public static int best_avg_snum = 0;
	
	final private int MAX_SCORE = 100;
	final private int NUM_OF_SUBJECT = 3;
	
	private static int curr_snum = 1000; 
	private static Random ran = new Random();
	
	
	
	public D01_Student() {
		snum = curr_snum++;
		kor = ran.nextInt(MAX_SCORE + 1);
		eng = ran.nextInt(MAX_SCORE + 1);
		math = ran.nextInt(MAX_SCORE + 1);
		avg = (kor + eng + math) / (double) NUM_OF_SUBJECT;
		
		if(avg > best_avg) {
			best_avg = avg;
			best_avg_snum = snum;
		}
	}
	
	@Override
	public String toString() {
		return String.format("[%d]번 학생의 평균 점수는 %.2f 입니다.\n", snum, avg);
	}
	
	public int compareTo(D01_Student o) {
		return Double.compare(this.avg, o.avg) != 0 ?
				Double.compare(this.avg, o.avg) : Integer.compare(snum, o.snum);
	};
}

