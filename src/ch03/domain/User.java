package ch03.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

// 많은 도메인으로 인한 alias의 충돌 해결법
// alias를 수동으로 부여한다.
// Alias annotation
@Alias("myUser")
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	private Address address;
	// user has an address
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, address);
	}
}
