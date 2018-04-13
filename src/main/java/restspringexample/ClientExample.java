package restspringexample;

import org.springframework.web.client.RestTemplate;

public class ClientExample {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8080/echo/opa";
		Message message = template.getForObject(url, Message.class);
		System.out.println(message.getMessage());
	}
}