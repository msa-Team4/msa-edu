package com.mobigen.msa.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user") // MySQL user 테이블과 매핑
public class UserVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String created_at;

    @Column(nullable = true)
    private String email;

    @Column(nullable = true)
    private String hostname;

    @Column(nullable = true)
    private String name;
}