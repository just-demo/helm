package demo;

import static java.util.Collections.singletonMap;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

  @Autowired
  private Environment environment;

  @GetMapping
  public Map<String, String> index() {
    return singletonMap("demo", environment.getProperty("demo"));
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}
