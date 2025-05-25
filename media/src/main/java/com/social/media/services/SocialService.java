package com.social.media.services;

import com.social.media.entity.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SocialService {
    @Autowired
    SocialUserRepository socialUserRepository;

    public List<SocialUser> getAllUsers() {
        return  socialUserRepository.findAll();

    }

    public SocialUser saveUser(SocialUser socialUser) {
        return  socialUserRepository.save(socialUser);

    }

    public SocialUser deleteUser(Long id) {
        SocialUser socialUser = socialUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Social user not found"));
        socialUserRepository.delete(socialUser);
        return socialUser;
    }

}
