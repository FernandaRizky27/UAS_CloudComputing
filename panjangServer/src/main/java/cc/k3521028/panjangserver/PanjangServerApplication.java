package cc.k3521028.panjangserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PanjangServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PanjangServerApplication.class, args);
    }

}
