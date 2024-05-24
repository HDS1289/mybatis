package ch02.ex02;

import java.time.LocalDate;

import ch02.domain.User;

// selectUser method
public interface Map { // mapper 객체 ==> 클래스는 mybatis가 만들어줌.
	User selectUser(int userId);
	User selectUser2(String userName);
	User selectUser3(LocalDate regDate);
}
