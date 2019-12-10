package contacts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/")
public class ContactController {
    private ContactReposity contactReposity;
    @Autowired
    public ContactController(ContactReposity contactReposity){
        this.contactReposity=contactReposity;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String home(Map<String,Object> model){
        List<Contact> contacts=contactReposity.findAll();
        model.put("contacts",contacts);
        System.out.println(contacts);
        return "home";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String submit(Contact contact){
        contactReposity.save(contact);
        System.out.println(contact);
        return "redirect:/";
    }
}
