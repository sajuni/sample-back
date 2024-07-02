package com.example.privacyback.masking.repository;

import com.example.privacyback.masking.entity.Masking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaskingRepository extends JpaRepository<Masking, Long> {
}
