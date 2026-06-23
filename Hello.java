// class hello {
//     public static void main(String[] args) {
        // System.out.println("hello, world");
        // int num1=10;
        // int num2=20;
        //  num1 +=5;
        // System.out.println( result);
        // int result=num1+=5;
        // Increment
        // num1++;
        // decrement
        // num1--;
        // int x=5;
        // int y=6;
        // Boolean result= x!=y;
        // relational operator
        // ==. >=,=< =! ,>,< ===
        // logical operator
        // AND-&,OR-|,!-not
        // int x=5;
        // int y=6;
        // int a=2;
        // int b=4;
        // Boolean result = x<y || a<b;
        // if statement
        // int x=5;
        // int y=7;
        // if(x >y && x <y)
            //  System.out.println(x);
        // else
            // System.out.println(y);

        
        // System.out.println(result);
    
    // if else if 
    // 
    // ternary operator
    // int n=5;
    // int result=0;
    // result= n%2==0 ? 10 :20;
    // System.out.println(result);
    // switch statement
    // 
    

    // loops in java
    // while loop
    // do while loop
    // for loops
 
    //  int i=1;
    // while(i<=5){
    // System.out.println( "hi"+i);
    // i++;
    // }
    // int i=1;
    // while(i<=5){
    //     System.out.println("hii"+1);
    
    // int j=1;
    // while(j<=5){
    //    System.out.println("hello"+j);
    //    j++;
    // }
    // i++;
    // }

    // for loop increment 

    // for(int i=0; i<=5; i++){
        // System.out.println("hello");
    
    // increment

    // for(int i=0; i<=5; i++){
    //     System.out.println("hello"+i);
    // }
    // for(int j=0; j<=9; j++){
    //     System.out.println(j);
    // }
    //  for(int i=5; i>=1; i--){
    //     System.out.println("hello"+i);
    // }
    // for(int j=9; j>=1; j--){
    //     System.out.println(j);
    // }
    // java is object oriented programing language .
    // class is blue print of object and object is entites of class 


//     public class calc{

//     }
    


//     }
// }
// class  car{
//           String color ="red";
// }
// class hello{


     
//      public static void main(String []args){

//          car= new  car();
//             System.out.println(car.color);
//         }


// class hello{


//     public void playmusic(){

//         System.out.println( "play music");
//     }
//     public String getmepen(int cost ){
//         return "pen";

//     }
//     public  static void  main(String []args)
//     {
//       hello obj=new hello();
//       obj.playmusic();
//       System.out.println(obj.getmepen(10));
//     }
// }



// class hello{

//     public int add ( int a,int b){
//          int result=a+b;
//         return result;

//     }
//     public static void main(String []args){
//         int a=10;
//         int b=20;
//         claculator obj = new claculator();
//         int r=obj.add( a,b);
//         System.out.println(r);
//     }
// }

//   same name method with diff parameter

// class hello{
//     public int add ( double,int a,int b){
//         return ;
//     }

//     public int add ( int a,int b){
//          int result=a+b;
//         return result;

//     }
//     public static void main(String []args){
//         int a=10;
//         int b=20;
//         claculator obj = new claculator();
//         int r=obj.add( a,b);
//         System.out.println(r);
//     }
// }


// stack and heap

// stack-lifo 

// class hello{

//     public int add ( int a,int b){
//          int result=a+b;
//         return result;

//     }
//     public static void main(String []args){
//         int a=10;
//         int b=20;
//         claculator obj = new claculator();
//         int r=obj.add( a,b);
//         System.out.println(r);
//     }
// }

// array
// class hello{

//     public static void main(String[]args){
        
//         //  int num []={1,2,3,4,5};
//         //  num [1]=6;


//         int num[]= new int[4];
//         for(int i=0; i<4; i++){
//         num[0]=3;
//         num[1]=4;
//         num[2]=5;
//         num[3]=8;

         
//          System.out.println(num[i]);
//         }
//     }
// }

// multi dimansional array with math function
// 
// class hello 
// {
//     public static void main(String[]args){
//     int num[]=new int [6];
//     num[0]=2;
//     num[1]=3;
//     num[2]=4;
//     num[3]=5;

//     for(int i=0; inum.lenght; i++)
//     {
//         System.out.println(num[i]);
//     }
//     }
// }


// class students {
//          String name;
//         int age;
//         int marks;
// }

// class hello{
//     public static void main(String[ ]args){
//          students s1= new student();
//             s1.name="amar";
//             s1.age=19;
//             s1.marks=20;
//          students s2=  new student();
//          s2.name="john";
//          s2.age=20;
//          s2.marks=50;
//          students s3=new student();
//          s3.name="amit";
//          s3.age=30;
//          s3.marks=200 ;

//          student students[] =new students[3];

//          students[0]=s1;
//          students[1]=s2;
//          students[20]=s3;
//          System.out.println(s1.name +" : ", s1.marks );
//     }
// }

// class Student {
//     String name;
//     int age;
//     int marks;
// }

// class hello {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "amar";
//         s1.age = 19;
//         s1.marks = 20;

//         Student s2 = new Student();
//         s2.name = "john";
//         s2.age = 20;
//         s2.marks = 50;

//         Student s3 = new Student();
//         s3.name = "amit";
//         s3.age = 30;
//         s3.marks = 200;

//         Student students[] = new Student[3];

//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

        
//         for( int i=0; i<students.length; i++){
//             System.out.println(Students[i].name + " : " + Students[i].marks);

//         }
//     }
// }


// class student {
//     String name;
//     int age;
//     int marks;

// }
// class hello{
//     public static void main( String []args){
//         student s1 =new student()
//         s1.name="amar";

//         System.out.println( s1.name);

//     }
// }


// stringin java


// class hello{
//     public static void main( String[]args){
//         String name= new String();

//         System.out.println(name);
//     }
// }


// mutable string and unmutable string


// class hello{
//     public static void main(String[]args){
//         String name="amar";
//         name=name+"reddy";
//         String s1="navin";
//         String s2="navin";
//         Stringbuffer sb= new String( str:"naveen")
//         System.out.println(s1==s2);


//     }
// }


// StringBuffer and Stringbuilder

// static method and static   
// class mobile {

//     String brand;
//     int price;
//     String network;
//      static String name;

//      static{
//         name="phonenm,,"
//         System.out,println("in static")
//      }

//      public(){
//             brand="smart";
//             price=15000;
//             name="phone";
//      }
 

//  public void show(){
//         System.out.println(brand + " :" ,price + " :" ,  name );
//     }
//     public static void main(){

//     }
// }
// class hello{
    
//     public static void main( String[]args)
//     {

//         // StringBuffer sb = new StringBuffer("navin");
//         // // System.out.println(sb.capacity());
//         // // System.out.println(sb.length());
//         // sb.append("   reddy" );
//         // sb.insert(6, "java");
//         // sb.setLength(30 );
//         // System.out.println(sb);


//         // static variable in java
//         mobile obj1 =new mobile();
//         obj1.name="iphone";
//         obj1.network="jio";
//         obj1.brand="apple";
//         obj1.price=50000;
//         obj1.name="phone";
//         obj1.show();
    
//     }

// }

// class mobile{
//     String brand;
//     int price;
//     String name;

// }
// class hello{

//     public static void main(String args[]){
//         obj mobile=new obj():
//         obj.price=200;
//         obj.name="iphone";
//         obj.brand="smartphone";

//     }
// }
//   statis variable is shared to all object 
//   to access static word we have to use class name 
// class mobile{
//     String brand;
//     int price;
//     static String name;

// public void show()
// {
//   System.out.println(
//     brand +":" +name +":" +price
//   );
// }
// }
// class hello{
// public static void main(String []args){

//      mobile obj =new mobile();

//      obj.brand="smartphone";
//      obj.price=200;
//      obj.name="samsung";

//      mobile obj2 =new mobile();

//      obj2.brand="smartphone";
//      obj2.price=200;
//      obj2.name="samsung";


//    obj2.name="phone";

//      obj.show();
//      obj2.show();
    // System.out.println(obj.name);
    // System.out.println(obj.price);
    // System.out.println(obj.brand);
// }
// }
// class human{
//  String name;
//  int age;
// }
 
//  public class static void main(String args[]){
//     human obj=new human();
//     obj.name="ajay";
//     obj.age=20;

//     System.out.println(obj.name);
//     System.out.println( obj.age);

//  }

// class human{
//      private  String name;
//      private int age;
// }
// public class hello
// {
//  public class static void main( String args[]){

//     human obj= new human();

//     obj.name="prince";
//     obj.age=19; 

//     System.out.println( obj.name);
//  }
//     }

// class Human {
//     private int age;
//     private String name;
//         //  instant variable 


//     public Human( int age ,string name ){
//         this.age;
//         this.name;    
//         // constructor 
//     }


//      public int getage(){
//         return age;
//      }
//       public void setage(int a ){
//         age=a;
//       }

// }
//  class hello{

//       public static void main( String[]args){

//         // object
//         Human obj= new Human();
//          obj.setage( 30);

//          System.out.println(obj.getage());

//       }
//  }


//  camel casing 
//  class -  should first letter be capital such as (Calc )
//  variable and method -should first letter be small such as (show(), marks )\
//  constant -PIE BRAND 

// shoMyMaarks()
// MyData

// age Data Human()


// class A{

//     public A(){
//         System.out.println("object created");
//     } 
//     public void show(){
//         System.out.println("in A show");
//     }

// }

//  public class hello{

//     public static void main( String []args){

//     A obj= new A();
//     obj.show();
        

//     }
// }

// inheritance in java

// class Calc{

//     public int add(int n1,int n2 ){
//         return n1 +n2;
//     }
//     public int sub(int n1 ,int n2){
//         return n1-n2;
//     }
// }


// public class hello{
//     public static void main (String[] args)
//     {
//         Calc obj= new Calc();
//         int r1=obj.add(20,30);
//         int r2=obj.sub(30,20);

//         System.out.println(r1+" "+r2);


//     }
// }

// class Calc {

//     public int div(int n1,int n2)
//     {
//         return n1/n2;
//     }
//     public int mult(int n1,int n2){
//         return n1*n2;
//     }
//     public class AdvCalc extends Calc{
//         public int add(int n1,int n2)
//     {
//         return n1+n2;
//     }
//     public int sub(int n1,int n2){
//         return n1-n2;
//     }
//     }
//     public class hello{
//          public static void main (String[]args){
//             Calc obj=new Calc();
//             int rq=obj.div(20,10);
//             int r2=obj.mult(20,30);
//             int r3=obj.add(20,30);
//             int r4=obj.sub(30,20);

//             System.out.println(r3 + " " + r4+" "+ r1 +" "+r2);
    
//          }
//     }
// }
//    multilevel inheritance 
// class A{
//     void show(){
//         System.out.println("class A");
//     }

// }
// class B extends A{
//     void show(){
//         System.out.println("class B ");
//     }

// }
// class C extends B{
//     void show(){
//         System.out.println("class C");
//     }

// }
// public class hello{
     
//      public static void main( String[]args){
//         C obj=new C();
//         obj.showA();
//         obj.showB();
//         obj.showC();


//      }
// }
// .ENCAPSULATION

// class Human {
//     private String name;
//     private int age;

//     // Setter methods
//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     // Getter methods
//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }
// }

// public class hello {
//     public static void main(String[] args) {

//         Human obj = new Human();

//         obj.setName("Ganesh");
//         obj.setAge(20);

//         System.out.println(obj.getName());
//         System.out.println(obj.getAge());
//     }
// }
// method overridding 


// class A {
//     public  void show(){
//         System.out.println("in show");

//     }
//     public void config(){
//         System.out.println("in B");
//     }

// }

// class hello
// {
//     public static void main ( String[] args){
//         A obj= new A();
//         obj.show();
//         obj.config();

//     }
// }


// package tools;

// public class hello{
//     public void show(){
//         System.out.println("welcome to java package ");
//     }
// }

// polymarphism -(many behaviour )


// there are two types of polymorphism 

// 1) run time polymorphism 
// 2)compile time polymorphism  



// class A{
//     public void show(){
//         System.out.println("in class A");
//     }
//     }


// class B extends A{

// }
// class C extends A{
//     public void show (){
//         System.out.println("in c show ");
//     }
// }
// public class hello{
//    public  static void main( String[]args)
//    {
//     A obj= new B();
//     obj.show();

//    }
// }

// final keywords/
// once we created we cannot change 
// public class  hello{

// public static void main(String[]args){
//     final int num=10;
//        num=20;
//      System.out.println(num);

// }
// }
// final class means stop inheritance 

class calc{

    public void show(){
        System.out.println("in clac show");
    }
    public void  add(int a,int b){
        System.out.println(a+b);
    }
}
// stop inheritance 
class advcalc extends calc{


}
class hello{
public static void main( String[]args){
    calc obj=new calc();
    
        obj.show();
        obj.add(10,20);
    }
}

