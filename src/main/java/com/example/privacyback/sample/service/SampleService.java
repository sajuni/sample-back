package com.example.privacyback.sample.service;

import com.example.privacyback.sample.dto.SampleDto;
import com.example.privacyback.sample.repository.SampleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleDto test() {
        System.out.println("Service Test");
        return sampleRepository.test();
    }

}
