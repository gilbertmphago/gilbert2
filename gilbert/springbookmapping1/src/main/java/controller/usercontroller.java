package controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")


public class usercontroller {
    @RequestMapping("/users")
    public String getUser(){
        return "success";
    }
}
