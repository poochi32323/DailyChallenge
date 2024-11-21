package com.mysite.mylogin.service;



import com.mysite.mylogin.dto.JoinRequest;
import com.mysite.mylogin.dto.JoinResponse;
import com.mysite.mylogin.entity.UserEntity;
import com.mysite.mylogin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public JoinResponse joinProcess(JoinRequest request) {
        boolean isUser = userRepository.existsByUsername(request.getUsername());

        if (isUser) {
            return new JoinResponse("이미 가입된 회원입니다.");
        }

        UserEntity data = new UserEntity();
        data.setId(UUID.randomUUID().toString());
        data.setUsername(request.getUsername());
        data.setMobile(request.getMobile());
        data.setEmail(bCryptPasswordEncoder.encode(request.getEmail()));
        data.setPassword(bCryptPasswordEncoder.encode(request.getPassword()));
        userRepository.save(data);

        return new JoinResponse("회원 가입 되었습니다.");
    }
}
