package com.mobigen.msa.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // 1. 모든 사용자 조회 (JSON 형태로 반환)
    @Operation(summary = "모든 사용자 조회", description = "데이터베이스에 저장된 모든 사용자를 조회합니다.")
    @GetMapping
    public List<UserVO> getAllUsers() {
        return userRepository.findAll();
    }

    // 2. 특정 사용자 조회
    @Operation(summary = "특정 사용자 조회", description = "ID를 기준으로 특정 사용자를 조회합니다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "사용자 정보 반환"),
            @ApiResponse(responseCode = "404", description = "사용자 없음")
    })
    @GetMapping("/{id}")
    public UserVO getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // 3. 사용자 추가 (JSON 요청으로 데이터 저장)
    @Operation(summary = "새 사용자 생성", description = "새로운 사용자를 생성합니다.")
    @PostMapping
    public UserVO createUser(@RequestBody UserVO user) {
        return userRepository.save(user);
    }
}