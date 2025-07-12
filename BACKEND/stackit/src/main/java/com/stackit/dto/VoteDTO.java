package com.stackit.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VoteDTO {
    private Long userId;
    private Long answerId;
    private boolean upvote;
}
