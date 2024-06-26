package com.example.privacyback.sample.repository;

import com.example.privacyback.sample.dto.SampleDto;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

    public SampleDto test() {
        System.out.println("Repository Test");
        return SampleDto.builder().build();
    }

}
