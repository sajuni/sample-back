package com.example.privacyback.masking.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Masking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer mkNbr;

    @Builder
    public Masking(Integer mkNbr) {
        this.mkNbr = mkNbr;
    }

}
