package com.eazybytes.jobportal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.eazybytes.jobportal.entity.Contact}
 */
public record ContactRequestDto(
        @NotBlank(message = "please fill the details")//these are validation
        @Email(message = "invalid format")
        String email,

        @NotBlank(message = "please fill the details")
        @Size(min = 1, max = 500, message = "careful now")
        String message,

        @NotBlank(message = "please fill the details")
        @Size(min = 1, max = 500, message = "careful now")
        String name,

        @NotBlank(message = "please fill the details")
        @Size(min = 1, max = 500, message = "careful now")
        String subject,

        @NotBlank(message = "please fill the details")
        @Pattern(regexp = "Job Seeker|Employer|Other", message = "choose one")
        String userType) implements Serializable {
}