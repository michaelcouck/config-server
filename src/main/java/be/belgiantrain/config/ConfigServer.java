package be.belgiantrain.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

/**
 * <pre>
 *     1) De configuration server
 * </pre>
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootConfiguration
@EnableAutoConfiguration
@EnableConfigServer
@ComponentScan({"be.belgiantrain.config"})
public class ConfigServer {

    public static void main(final String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }

}