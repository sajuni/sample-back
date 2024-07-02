package com.example.privacyback.util;

import com.example.privacyback.masking.entity.Masking;
import com.example.privacyback.masking.repository.MaskingRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class ScheduledTasks {

    private static Integer num = 1111;
    private MaskingRepository maskingRepository;

    @Scheduled(fixedRate = 3000)
    public void task() {
        saveMasking(num++);
    }

    void logTest() {
        log.trace("로그테스트 {}", "TRACE");
        log.debug("로그테스트 {}", "DEBUG");
        log.info("로그테스트 {}", "INFO");
        log.warn("로그테스트 {}", "WARN");
        log.error("로그테스트 {}", "ERROR");
    }

    void saveMasking(Integer num) {
        Masking masking = Masking.builder().mkNbr(num).build();
        maskingRepository.save(masking);
    }

}
