package ingjulianvega.ximic.msscasugateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsscAsuGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscAsuGatewayApplication.class, args);
	}

}
