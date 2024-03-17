package movie;

import util.InputScanner;

public class MovieRatings {

	private static final MovieInfo[] MOVIEINFO_ARRAY = new MovieInfo[100];
	int cnt = 0;
	
	//메뉴 보여주는 메소드 만들기
	public boolean showMenu() {
		System.out.println("-----왓챠-----");
		System.out.println("0. 종료하기");
		System.out.println("1. 평점 등록하기");
		System.out.println("2. 등록 영화 조회");
		System.out.println("3. 상세 조회");
		System.out.println("===번호를 입력해주세요===");
		int num = InputScanner.scanInt();
		
		switch(num) {
		case 0 : 
			System.out.println("프로그램을 종료합니다.");
			return true;
		case 1 :
			ratingMovie();
			break;
		case 2 :
			showMovieList();
			break;
		case 3 :
			showMovieDetail();
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
		}
		return false;
	
	}
	
   //영화 평가
	
	private void ratingMovie() {
		System.out.println("-----평점 등록하기-----");
		System.out.println("영화 제목 : ");
		String title = InputScanner.scanString();
		System.out.println("감독 이름 : ");
		String name = InputScanner.scanString();
		System.out.println("한줄 평 : ");
		String content = InputScanner.scanString();
		System.out.println("점수 : ");
		int grade = InputScanner.scanInt();
		
		MovieInfo mi = new MovieInfo();
		mi.setTitle(title);
		mi.setName(name);
		mi.setContent(content);
		mi.setGrade(grade);
		
		MOVIEINFO_ARRAY[cnt] = mi;
		cnt++;
		
		System.out.println("저장 완료 ! ! !");
	}
	
	private void showMovieList() {
		for(int i = 0; i < cnt; i++) {
			System.out.println(i + "번 : " + MOVIEINFO_ARRAY[i].getTitle());
		}
	}
	
	private void showMovieDetail() {
		showMovieList();
		System.out.println("조회할 번호 : ");
		int num = InputScanner.scanInt();
		System.out.println("영화 제목 : " + MOVIEINFO_ARRAY[num].getTitle());
		System.out.println("감독 : " + MOVIEINFO_ARRAY[num].getName());
		System.out.println("한줄 평 : " +  MOVIEINFO_ARRAY[num].getContent());
		System.out.println("점수 : " +  MOVIEINFO_ARRAY[num].getGrade());
	}
	
}
