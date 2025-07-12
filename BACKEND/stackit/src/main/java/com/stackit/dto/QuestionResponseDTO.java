package com.stackit.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionResponseDTO {
    private Long id;
    private String title;
    private String description;
    private String username;
    private LocalDateTime createdAt;
    private List<String> tags;
}
