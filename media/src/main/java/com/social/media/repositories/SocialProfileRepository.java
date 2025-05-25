package com.social.media.repositories;

import com.social.media.entity.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfileRepository extends JpaRepository<SocialProfile, Long> {
}
