package ch05.ex01;

import ch05.domain.Search;
import ch05.domain.User;

public interface Map {
	User selectUser(Search search);
	// return 되는 값의 type으로 User를 지정하였다.
}
