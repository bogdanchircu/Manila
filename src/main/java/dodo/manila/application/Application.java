package dodo.manila.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
public class Application {

/*	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}*/

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
