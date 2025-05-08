package in.sp.main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@GetMapping("/")
	public String Display() {
<<<<<<< HEAD
		return "welcome to Samosa  ";

=======
		String s1="hello";
		String s2="good Morning";
		String s3="Rajat";
		String s4="Pandey";

		

		return s1+" "+s2+" "+s3+""+s4;
>>>>>>> 987e287d4d50a1a1069bc53b59d0845b1258984e
		
	}
	



}
