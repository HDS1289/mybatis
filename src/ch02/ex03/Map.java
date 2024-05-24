package ch02.ex03;

import java.time.LocalDate;

import org.apache.ibatis.annotations.Param;

import ch02.domain.User;

public interface Map { // insert가 된 row의 갯수가 return된다.
	// 0을 초과하는 값이 return되어야 insert가 성공했다고 판단된다.
	int insertUser(User user);
	
	int insertUser2(@Param("userId") int userId, 
				@Param("userName") String userName,
				@Param("regDate") LocalDate regDate);
	
	// annotation은 안쓴다.
	// index로 구분??
	int insertUser3(int userId, String userName, LocalDate regDate);
}
