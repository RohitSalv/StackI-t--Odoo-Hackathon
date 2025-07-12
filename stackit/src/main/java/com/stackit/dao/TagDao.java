package com.stackit.dao;

import com.stackit.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagDao extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
