package be.vdab.spring.cloud.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <pre>
 *     1) De configuration server
 * </pre>
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServer {

    public static void main(final String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }

}