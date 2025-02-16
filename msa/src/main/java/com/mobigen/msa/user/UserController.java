package com.mobigen.msa.user;

import com.mobigen.msa.user.UserVO;
import com.mobigen.msa.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // 1. 모든 사용자 조회 (JSON 형태로 반환)
    @GetMapping
    public List<UserVO> getAllUsers() {
        return userRepository.findAll();
    }

    // 2. 특정 사용자 조회
    @GetMapping("/{id}")
    public UserVO getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // 3. 사용자 추가 (JSON 요청으로 데이터 저장)
    @PostMapping
    public UserVO createUser(@RequestBody UserVO user) {
        return userRepository.save(user);
    }
}