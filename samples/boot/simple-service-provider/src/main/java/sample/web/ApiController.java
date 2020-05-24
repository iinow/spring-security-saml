package sample.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	private ObjectMapper objectMapper = new ObjectMapper();

	@GetMapping(value = "/test")
	public String getUser() throws JsonProcessingException {
		Object obj = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(obj == null) {
			return "???..";
		} else {
			return objectMapper.writeValueAsString(obj);
		}
	}
}
