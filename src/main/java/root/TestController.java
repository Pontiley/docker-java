package root;

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
public class TestController {

    @RequestMapping("/")
    public String hello() {
        return "Hell111o 222world!!1121";
    }

    @RequestMapping("/test")
    public String goodbye() {
        return "BYE BYE";
    }
}
