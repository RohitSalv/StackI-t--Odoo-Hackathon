package com.stackit.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerResponseDTO {
    private Long id;
    private String content;
    private String username;
    private LocalDateTime createdAt;
    private boolean accepted;
}
