package com.mobigen.msa.user;

import com.mobigen.msa.user.TbUserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TbUserRepository extends JpaRepository<TbUserVO, Long> {
    Optional<TbUserVO> findByUserId(String userId);
}
