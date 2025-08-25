package hamza.course;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {


    @RequestMapping("/course")
    public List <Course> getCourse()
    {
        return Arrays.asList(
                new Course(1,"5ù*ùed","11"),
                new Course(2,"*6","11"),
                new Course(3,"5iyu","11")
        );
    }
}
