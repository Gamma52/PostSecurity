package ru.spring.SecurityPost.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
//@NoArgsConstructor
@Builder
@Table(name = "Person")
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;	
    private String login;
    private String password;
    private String role;

}
