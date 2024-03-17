package movie;

public class MovieInfo {
	
	public MovieInfo() {
		
	}
	
	
	public MovieInfo(String title, String name, String content, int grade) {
		
		this.title = title;
		this.name = name;
		this.content = content;
		this.grade = grade;
	}


	private String title; //영화제목
	private String name; //감독 이름
	private String content; //감상평
	private int grade; //평점
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	
	public String toString() {
		return "MovieInfo [title=" + title + ", name=" + name + ", content=" + content + ", grade=" + grade + "]";
	}

	
	
	
}
