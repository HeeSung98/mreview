package org.zerock.mreview.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {
    private Long reviewnum; //review

    private Long mno; //movie

    private Long mid; //member

    private String nickname; //member

    private String email; //member

    private int grade;

    private String text;

    private LocalDateTime regDate, modDate;
}
