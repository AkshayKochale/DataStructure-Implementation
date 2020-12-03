
    package DataStructures;

    public class customHashCodeEqual {

    //implementation

//    student akshay=new student(1,"Akshay");
//    student ajinkya=new student(2,"Akshay");
//    student abhi=new student(1,"Akshay");
//    student rahul=new student(4,"Akshay");
//    student manoj=null;
//    System.out.println(manoj.equals(akshay));
//    System.out.println("hashcode for akshay:"+akshay.hashCode());
//
//    System.out.println("hashcode for abhi:"+abhi.hashCode());





    class student{

    int roll;
    String name;

    public student(int roll, String name) {
    this.roll = roll;
    this.name = name;
    }

    @Override
    public boolean equals(Object obj) {


    // Still not coverd all edge cases
    student obj1=(student) obj;
    if(  obj1==null){ System.out.println("cannot compare null vaules"); return false;}
    if(this.roll==obj1.roll){return true;}
    return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {

    return roll+name.hashCode();//To change body of generated methods, choose Tools | Templates.
    }


    }
    }
