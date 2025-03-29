package com.taskService.dtos;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TodoListDTO {
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;

    @Size(max = 300, message = "Description cannot exceed 300 characters")
    private String description;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdByUserId; // Changed from UserResponse to String for user ID
}