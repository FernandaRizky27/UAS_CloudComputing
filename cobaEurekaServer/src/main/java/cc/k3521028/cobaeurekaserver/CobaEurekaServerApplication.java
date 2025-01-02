package cc.k3521028.cobaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CobaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CobaEurekaServerApplication.class, args);
    }

}
