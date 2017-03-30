package io.javabrains.springbootstarter.repository;

import io.javabrains.springbootstarter.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId (String topicId);
}
