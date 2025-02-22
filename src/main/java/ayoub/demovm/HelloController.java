package ayoub.demovm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private static final String template = "Hello, %s" ;
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public String hi(){
        return "Hello world it's ayoub, from the backend" ;
    }

}
