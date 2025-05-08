package in.sp.main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@GetMapping("/")
	public String Display() {
		String s1="hello";
		String s2="good Morning";
		String s3="Rajat";
		String s4="Pandey";

		

		return s1+" "+s2+" "+s3+""+s4;
		
	}



}
