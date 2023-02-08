package demo.demo.contoller;

//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    /*@GetMapping("/")
    String hello(@AuthenticationPrincipal OidcUser user) {
        return String.format("Welcome, %s", user.getFullName());
    }*/

    @GetMapping("/api/hello")
    public String anon() {
        return "Anonymous access";
    }

    /*@GetMapping("/api/whoami")
    public String whoami(Authentication authentication) {
        // return information about the token
        //return (Map<String, Object>) authentication.getDetails();
        return authentication.getDetails().toString();
    }*/
}
