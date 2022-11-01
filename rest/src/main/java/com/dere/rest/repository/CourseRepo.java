package com.dere.rest.repository;

import com.dere.rest.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CourseRepo {

    private static List<Course> courseList = new ArrayList<>();

    private List<Course> getAllCourses(){
        return courseList;
    }

    private Course getOneCourse(String courseId){
        return courseList.stream().filter(course -> course.getId() == courseId).findFirst().orElse(null);
    }

    private void editCourse(String courseId, Course course){
        courseList.add(course);
    }

    private void addCourse(Course course){

    }
}
