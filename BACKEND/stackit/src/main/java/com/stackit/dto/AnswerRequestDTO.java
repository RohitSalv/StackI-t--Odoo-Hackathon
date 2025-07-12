package com.stackit.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerRequestDTO {
    private String content;
    private Long questionId;
    private Long userId;
}
