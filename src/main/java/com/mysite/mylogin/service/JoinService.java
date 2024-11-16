package com.mysite.mylogin.service;



import com.mysite.mylogin.dto.JoinDTO;
import com.mysite.mylogin.entity.UserEntity;
import com.mysite.mylogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public void joinProcess(JoinDTO joinDTO) {

        boolean isUser = userRepository.existsByUsername(joinDTO.getUsername());
        if (isUser) {
            return;
        }
        //db에 이미 동일한 username을 가진 회원이 존재하는지?
        UserEntity data = new UserEntity();

        data.setUsername(joinDTO.getUsername());
        data.setEmail(bCryptPasswordEncoder.encode(joinDTO.getEmail()));
        data.setPassword(bCryptPasswordEncoder.encode(joinDTO.getPassword()));
        data.setRole("ROLE_USER");


        userRepository.save(data);
    }
}
