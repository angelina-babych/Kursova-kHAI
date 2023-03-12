package com.babich.sqlite_project;

import org.junit.Test;

import static org.junit.Assert.*;

import com.babich.sqlite_project.Database.*;
import com.babich.sqlite_project.Features.CreateStudent.*;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MyUnitTests {
    @Test
    public void testCreateStudent() throws Exception{
        Student student = new Student(1,
                "Jphn",
                11111,
                "=380665555555",
                "john@mail.com");
        assertEquals(11111, student.getRegistrationNumber());
    }
}