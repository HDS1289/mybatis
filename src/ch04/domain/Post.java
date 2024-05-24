package ch04.domain;

public class Post {
	private String title;
	private String content;
	// Post라는 객체는 제목과 내용이라는 속성을 가지고 있다.
	
	@Override
	public String toString() {
		return String.format("%s %s", title, content);
	}
}
