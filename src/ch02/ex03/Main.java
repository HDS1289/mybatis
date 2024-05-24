package ch02.ex03;

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		// 만약 err ==> mapper pool에 없는 이유?
		// config 문서에 or mapping이 포함되지 않았기 때문이다.
		/*
		if(mapper.insertUser(new User(11, "abel", LocalDate.of(2024,  5, 27))) > 0)
			System.out.println("성공 11");
		
		
		if(mapper.insertUser2(13, "kianu", LocalDate.of(2024, 6, 1)) > 0)
			System.out.println("성공 12");
		*/
		
		if(mapper.insertUser3(14, "neo", LocalDate.of(2024, 8, 2)) > 0)
			System.out.println("성공 14");
	}
}
