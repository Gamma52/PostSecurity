package ru.spring.SecurityPost.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonRequestDto {
		
    private String login;
    private String password;
    private String role;
}
