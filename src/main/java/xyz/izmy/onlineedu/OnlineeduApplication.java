package xyz.izmy.onlineedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

/**
 * @author iYmz
 */


@SpringBootApplication
public class OnlineeduApplication {
    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(OnlineeduApplication.class, args);
    }

}
