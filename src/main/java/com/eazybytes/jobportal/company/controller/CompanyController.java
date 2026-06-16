package com.eazybytes.jobportal.company.controller;

import com.eazybytes.jobportal.dto.CompanyDto;
import com.eazybytes.jobportal.company.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:5173")//we are using OPTION-1
public class CompanyController {


    private final ICompanyService companyService;

//    @Autowired //optional cuz there is only one constructor
//    public CompanyController(ICompanyService companyService){
//        this.companyService = companyService;
//    }

//    we will create simple API that will return a string as a response
//    @GetMapping(version = "1.0")
//    public ResponseEntity<List<Company>> getAllCompanies(){
//      we have created a variable named companyList
//        List<Company> companyList = companyService.getAllCompanies();
//      we will rerutn the variable in the body of the response
//        return ResponseEntity.ok().body(companyList);
//    }
@GetMapping(version = "1.0")
public ResponseEntity<List<CompanyDto>> getAllCompanies() {
    List<CompanyDto> companyList = companyService.getAllCompanies();
    return ResponseEntity.ok().body(companyList);
}
}
