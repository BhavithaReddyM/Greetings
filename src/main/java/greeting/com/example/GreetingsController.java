package greeting.com.example;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController{
	@Autowired
	public GreetingsService gs;
	
	@GetMapping("/greeting")
	public List<Greetings> getgreetings(){
		return gs.getgreetings();
		
	}
}

