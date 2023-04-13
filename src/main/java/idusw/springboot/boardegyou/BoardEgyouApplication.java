package idusw.springboot.boardegyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //(exclude = DataSourceAutoConfiguration.class)
public class BoardEgyouApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardEgyouApplication.class, args);
    }

}
