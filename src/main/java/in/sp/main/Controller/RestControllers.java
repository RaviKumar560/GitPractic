package in.sp.main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@GetMapping("/")
	public String Display() {

<<<<<<< HEAD
	
=======
	

		String s1="hello";
		String s2="good Morning";
		String s3="Rajat";
		String s4="Pandey";
                String s5="welcome to git hub ";
		

		return s1+" "+s2+" "+s3+""+s4+""+s5;
>>>>>>> cc9e437442423ad98154a4bd446d463d2dc1993d

		
	}
	



}
