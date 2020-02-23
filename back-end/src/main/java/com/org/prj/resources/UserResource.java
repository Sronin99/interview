/**
 * 
 */
package com.org.prj.resources;

import com.org.prj.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class UserResource {

	@GetMapping("/list")
	public List<UserDto> getUsersList() {
		UserDto userDto = new UserDto(1,1,"Title","Body");

		return Arrays.asList(userDto);
	}

}
