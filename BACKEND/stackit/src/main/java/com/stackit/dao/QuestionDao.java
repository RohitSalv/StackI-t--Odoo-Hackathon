package com.stackit.dao;

import com.stackit.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface QuestionDao extends JpaRepository<Question, Long> {
    List<Question> findByTitleContaining(String keyword);

    @Query("SELECT q FROM Question q JOIN q.tags t WHERE t.name = ?1")
    List<Question> findByTagName(String tagName);
}
