package org.example.springboot_db.dto;

public record StudentResponse(
        Long id,
        String firstName,
        String lastName,
        String email
) {
}
