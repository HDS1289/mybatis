package ch05.ex05;

import ch05.domain.User;

public interface Map {
	// return type이 User 클래스 타입이다.
	// 객체 하나밖에 없다.
	User selectUser(String userName);
}
