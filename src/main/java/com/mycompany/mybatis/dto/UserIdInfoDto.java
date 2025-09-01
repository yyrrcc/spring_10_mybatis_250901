package com.mycompany.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserIdInfoDto {
	private String userid; // 기본키
	private String username;
	private String useraddress;
	private String userphone;
}
