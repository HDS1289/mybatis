package ch05.domain;

public class Post {
	// Post는 제목과 내용으로 구성된다
	private String title;
	private String content;
	
	public Post(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return title + ": " + content;
	}
}
