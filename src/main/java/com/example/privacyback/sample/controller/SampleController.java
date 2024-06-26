package com.example.privacyback.sample.controller;

import com.example.privacyback.util.BaseController;
import com.example.privacyback.sample.dto.SampleDto;
import com.example.privacyback.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sample")
public class SampleController extends BaseController {

    private final SampleService sampleService;

    @GetMapping("/getTest")
    public ResponseEntity<?> getTest() {
        SampleDto test = sampleService.test();
        return ResponseEntity.ok(test);
    }

    @PostMapping("/postTest")
    public ResponseEntity<?> postTest(String test) {
        System.out.println("test = " + test);
        Map<String, String> map = new HashMap<>();
        map.put("sampleData", test);
        return ResponseEntity.ok(map);
    }

}
