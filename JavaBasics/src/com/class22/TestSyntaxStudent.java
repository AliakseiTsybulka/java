package com.class22;

public class TestSyntaxStudent {

    public static void main(String[] args) {
        
//        SyntaxStudent student1=new SyntaxStudent();
//        student1.studentName=“Samir”;
//        student1.studentLastName=“Aziz”;
//        
//        student1.getStudentDetails();
//        
//        SyntaxStudent student2=new SyntaxStudent();
//        student2.studentName=“Mohammad”;
//        student2.studentLastName=“Ali”;
//        
//        student2.getStudentDetails();
        
        SyntaxStudent student1=new SyntaxStudent("Asha", "Noman");
        student1.getStudentDetails();
        
        SyntaxStudent student2=new SyntaxStudent("Mustafa", "Ozturk");
        student2.getStudentDetails();
    }
}