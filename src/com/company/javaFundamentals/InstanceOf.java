package com.company.javaFundamentals;
class Course {

};
class BaseCourse extends Course{

}
class OptionalCourse extends Course{

}
class FreeCourse extends BaseCourse{

}

public class InstanceOf {
    public static void main(String[] args) {
        dologic(new BaseCourse());
        dologic(new OptionalCourse());
        dologic(new FreeCourse());

        }
    public static void dologic(Course c){
        if (c instanceof BaseCourse){
            System.out.println("BaseCourse");
        }
        else if (c instanceof OptionalCourse){
            System.out.println("OptionalCourse");
        }
        else{
            System.out.println("Smth else");
        }
    }
}
