package com.babich.sqlite_project.Features.UpdateStudentInfo;

import com.babich.sqlite_project.Features.CreateStudent.Student;

public interface StudentUpdateListener {
    void onStudentInfoUpdated(Student student, int position);
}
