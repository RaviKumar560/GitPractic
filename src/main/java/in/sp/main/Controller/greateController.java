package in.sp.main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@GetMapping("/greet")
	public String Display() {


		String s2="good Morning";
		String s3="Mam";
	
		

		return s1+" "+s2+" "+s3;


		
	}
