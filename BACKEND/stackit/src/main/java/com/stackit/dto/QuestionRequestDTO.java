package com.stackit.dto;

import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionRequestDTO {
    private String title;
    private String description;
    private Long userId;
    private List<String> tags;
}
