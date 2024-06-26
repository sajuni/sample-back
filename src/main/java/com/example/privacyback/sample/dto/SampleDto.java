package com.example.privacyback.sample.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SampleDto {
    private Long id;
    private String name;
}
