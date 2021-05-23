package org.review.site.reviewsiteexercise;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AddressController {

    @Resource
    private EmployeeRepository employeeRepo;

    @Resource
    private AddressRepository addressRepo;

    @Resource
    private EmployeeProjectRepository employeeProjectRepo;

    @Resource
    private ProjectRepository projectRepo;
}
