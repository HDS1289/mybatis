package ch07.ex02;

import org.apache.ibatis.annotations.Select;

public interface Map {
	@Select("""
			select user_id userId, user_name userName, reg_date regDate
			from users
			where user_id = #{userId}
			""")
	int selectUser(int userId);
}
