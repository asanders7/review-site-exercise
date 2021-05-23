package org.review.site.reviewsiteexercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class EmployeeController {

    @Resource
    private EmployeeRepository employeeRepo;

    @Resource
    private AddressRepository addressRepo;

    @Resource
    private EmployeeProjectRepository employeeProjectRepo;

    @Resource
    private ProjectRepository projectRepo;

    @RequestMapping("/employees")
    public String displayEmployees(Model model) {
        model.addAttribute("employeesModel", employeeRepo.findAll());
        return "employeesView";
    }
}