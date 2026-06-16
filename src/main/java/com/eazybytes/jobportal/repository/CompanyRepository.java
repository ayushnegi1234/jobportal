package com.eazybytes.jobportal.repository;



import com.eazybytes.jobportal.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//jpa repo takes two input params 1) entity class 2)data type of primary key
@Repository  //optinal it tells to create a bean/obj during the startup of the application
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
