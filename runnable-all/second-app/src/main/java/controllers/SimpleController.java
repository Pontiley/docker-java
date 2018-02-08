package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 06.02.18
 * Time: 16:07
 *
 * @author Ilya_lagoshnyj@epam.com
 * @version 1.0
 */
@RestController
public class SimpleController {

    @RequestMapping("/second")
    public String hello() {
        return "I'm a second app!";
    }

}
