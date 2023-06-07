package ru.spring.SecurityPost.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.spring.SecurityPost.models.Person;

@Getter
@Setter
@Builder
public class PersonResponseDto {
	private long id;	
    private String login;
    private String role;
}
