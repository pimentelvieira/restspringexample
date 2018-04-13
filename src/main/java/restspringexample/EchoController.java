package restspringexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {

	@GetMapping("/opa")
	public Message getMessage(@RequestParam(value="message", defaultValue="World") String message) {
		return new Message(message);
	}
	
	@GetMapping("/opa/{msg}")
	public Message getCustomMessage(@PathVariable("msg")String msg) {
		return new Message("Custom " + msg);
	}
}
