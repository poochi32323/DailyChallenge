package com.mysite.mylogin.service;


import com.mysite.mylogin.entity.UserEntity;
import com.mysite.mylogin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.mysite.mylogin.dto.LoginResponse;
import com.mysite.mylogin.dto.LoginRequest;



@Service
@RequiredArgsConstructor
public class LoginService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public LoginResponse loginProcess(LoginRequest request){
        UserEntity userEntity = userRepository.findById(request.getUserid())
                .orElseThrow(() -> new IllegalArgumentException("잘못된 사용자 이름 또는 비밀번호 입니다."));

        if(!bCryptPasswordEncoder.matches(request.getPassword(), userEntity.getPassword())){
            throw new IllegalArgumentException("잘못된 사용자 이름 또는 비밀번호 입니다.");
        }
        return new LoginResponse("로그인 성공");
    }

}
