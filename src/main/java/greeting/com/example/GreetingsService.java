package greeting.com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GreetingsService {
	
	public  List<Greetings> getgreetings() {
		List<Greetings> greet = new ArrayList<Greetings>();
		
		
			Greetings greet1 = new Greetings(1,"hello,Good Morning");
			greet.add(greet1);
		
		return greet ;
		
	}
	

}
