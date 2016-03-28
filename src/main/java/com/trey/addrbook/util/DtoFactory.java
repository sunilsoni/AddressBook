package com.trey.addrbook.util;

import org.springframework.stereotype.Component;

import com.trey.addrbook.domain.Person;
import com.trey.addrbook.dto.PersonDto;

/**
 * Factory methods for creating DTOs.
 * 
 * @author Trey
 */
@Component
public class DtoFactory {

	/**
	 * Converts a domain entity to a dto.
	 * @param domain
	 * @return
	 */
	public PersonDto createPerson(Person domain) {
		System.out.println(" ### Starting DtoFactory. createPerson ### ");
		// TODO convert to dozer
		PersonDto dto = new PersonDto();
		dto.setId(domain.getId());
		dto.setFullname(domain.getFirstName() + " " + domain.getLastName());
		System.out.println(" ### Ending DtoFactory. createPerson ### "+domain.getId());
		return dto;
	}

}
