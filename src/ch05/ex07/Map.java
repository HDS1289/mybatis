package ch05.ex07;

import java.util.List;

import ch05.domain.User;

public interface Map {
	// 2개의 메소드
	List<User> selectUsers(int[] userIds);
	List<User> selectUsers2(List<String> userNames);
}
