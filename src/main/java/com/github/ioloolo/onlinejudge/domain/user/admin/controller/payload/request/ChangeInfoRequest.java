package com.github.ioloolo.onlinejudge.domain.user.admin.controller.payload.request;

import com.github.ioloolo.onlinejudge.common.validation.group.LengthGroup;
import com.github.ioloolo.onlinejudge.common.validation.group.MinMaxGroup;
import com.github.ioloolo.onlinejudge.common.validation.group.NotBlankGroup;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChangeInfoRequest {

	@NotBlank(groups = NotBlankGroup.class, message = "아이디는 필수 입력값입니다.")
	private final String username;

	@NotBlank(groups = NotBlankGroup.class, message = "이름은 필수 입력값입니다.")
	@Size(groups = LengthGroup.class, min = 2, max = 4, message = "이름은 2자 이상, 4자 이하로 입력해주세요.")
	private String realName;

	@Min(groups = MinMaxGroup.class, value = 1, message = "학년의 최솟값은 1학년 입니다.")
	@Max(groups = MinMaxGroup.class, value = 3, message = "학년의 최댓값은 3학년 입니다.")
	private int schoolGrade;

	@Min(groups = MinMaxGroup.class, value = 1, message = "반의 최솟값은 1반 입니다.")
	@Max(groups = MinMaxGroup.class, value = 99, message = "반의 최댓값은 99반 입니다.")
	private int schoolClass;

	@Min(groups = MinMaxGroup.class, value = 1, message = "번호의 최솟값은 1번 입니다.")
	@Max(groups = MinMaxGroup.class, value = 99, message = "번호의 최댓값은 99번 입니다.")
	private int schoolId;
}
