package one.digital.innovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Design Pattern "Spring API"
 * 
 * @author Manuel Francisco(MaDoF Scott)
 *
 **/
@EnableFeignClients
@SpringBootApplication
public class DesignPatternApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApiApplication.class, args);
	}

}
