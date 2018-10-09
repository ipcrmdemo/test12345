package test12345;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class Test12345Controller {

    @GetMapping(path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping(path = "/")
    public String root() {
        return "Hello, world! Add /hello/there to the URL to get a friendly reply.";
    }

}
