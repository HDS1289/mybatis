package ch05.ex01;

import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
		
		// return type이 user객체 하나뿐이다.
		
		System.out.println(user);
	}
}
