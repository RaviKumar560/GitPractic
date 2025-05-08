package in.sp.main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@GetMapping("/")
	public String Display() {

		return " i am trying to learn project cloning in github ";

		
	}

}
