package designPatterns.creational.builder;

/*
* If some fields are not mandatory, we need to create multiple constructor
* So we need builder pattern
* step by step object creation
* doesn't support dynamic object creation ,
* decorator pattern supports it
* */
public class Main {
    public static void main(String[] args) {
        Director directorObj1 = new Director(new EngineeringStudentBuilder());
        Director directorObj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());
    }


}
