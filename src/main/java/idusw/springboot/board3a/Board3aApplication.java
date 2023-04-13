package idusw.springboot.board3a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //(exclude = DataSourceAutoConfiguration.class)
public class Board3aApplication {

    public static void main(String[] args) {
        SpringApplication.run(Board3aApplication.class, args);
    }

}
