package refresh.ManageSystem.controller.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

    @GetMapping("/calendar")
    public String get() {
        return "/pages/calendar/calendar";
    }
}