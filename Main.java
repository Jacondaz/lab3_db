import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        ConnectionSource connect = StudentDb.connectDb();
        TableUtils.createTableIfNotExists(connect, Student.class);
        Dao<Student, Integer> studentDao = DaoManager.createDao(connect, Student.class);
        Dao<Student2, Integer> studentDao2 = DaoManager.createDao(connect, Student2.class);

//        searchManyStudents(10, 15, studentDao);

//        for (Student student: studentDao){
//            System.out.println("ID: " + student.getId() + " Name: " + student.getName() + " Adress: " + student.getAdress() + " Age: " + student.getAge());
//        }
//
//        for (Student2 student: studentDao2){
//            System.out.println("ID: " + student.getId() + " SecondName: " + student.getSecondname() + " Index: " + student.getIndex());
//        }

//        Student AddStudent = new Student(15, "Ilya", "Skolkovo st.", 20);
//        studentDao.create(AddStudent);
//        System.out.println("Студент добавлен");
//
//        Student DeleteStudent = new Student(15, "Ilya", "Skolkovo st.", 20);
//        studentDao.delete(DeleteStudent);
//        System.out.println("Студент удалён");
//

//	      Student retrievedStudent = studentDao.queryForId(1);
//        if (retrievedStudent != null) {
//            System.out.println("Student ID: " + retrievedStudent.getId());
//            System.out.println("Student Name: " + retrievedStudent.getName());
//            System.out.println("Student Adress: " + retrievedStudent.getAdress());
//            System.out.println("Student Age: " + retrievedStudent.getAge());
//        } else {
//            System.out.println("Student not found with this id ");
//        }
//
//        Student2 retrievedStudent2 = studentDao2.queryForId(1);
//        if (retrievedStudent2 != null) {
//            System.out.println("Student ID: " + retrievedStudent2.getId());
//            System.out.println("Student SecondName: " + retrievedStudent2.getSecondname());
//            System.out.println("Student Index: " + retrievedStudent2.getIndex());
//        } else {
//            System.out.println("Student not found with this id ");
//        }
//
//        List<Student> searchForName = studentDao.queryForEq("name", "Dima");
//        if (searchForName != null) {
//            for (Student student: searchForName){
//            System.out.println("ID: " + student.getId() + " Name: " + student.getName() + " Adress: " + student.getAdress() + " Age: " + student.getAge());
//            }
//        }
//
//        List<Student2> searchForIndex = studentDao2.queryForEq("index", "603011");
//        if (searchForIndex != null) {
//            for (Student2 student2: searchForIndex){
//            System.out.println("ID: " + student2.getId() + " SecondName: " + student2.getSecondname() + " Index: " + student2.getIndex());
//            }
//        }

        connect.close();
    }
    public static void searchManyStudents(int minAge, int maxAge, Dao<Student, Integer> studentDao){
        for(Student student : studentDao) {
            if (student.getAge() >= minAge) {
                if (student.getAge() <= maxAge) {
                    System.out.println("Id: " + student.getName() + " Name: " + student.getName() + " Age: " + student.getAge() + " Adress: " + student.getAdress());
                }
            }
        }
    }
}

