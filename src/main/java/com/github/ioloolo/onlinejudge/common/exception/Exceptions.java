package com.github.ioloolo.onlinejudge.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Exceptions {
	// User Controller
	USERNAME_EXISTS("해당 아이디로 가입된 계정이 존재합니다."),
	USERINFO_EXISTS("해당 학번으로 가입된 계정이 존재합니다."),
	USER_NOT_EXISTS("존재하지 않는 유저입니다."),
	PASSWORD_WRONG("잘못된 비밀번호입니다."),

	// Tag Controller
	TAG_EXISTS("이미 존재하는 태그입니다."),
	TAG_NOT_EXISTS("존재하지 않는 태그입니다."),

	// Problem Controller
	PROBLEM_ID_EXISTS("해당 문제 ID가 사용중입니다.."),
	PROBLEM_NAME_EXISTS("해당 문제 이름이 사용중입니다.."),
	PROBLEM_NOT_EXISTS("존재하지 않는 문제입니다."),
	;

	private final String message;

	public Exception exception() {
		return new Exception(message);
	}
}
