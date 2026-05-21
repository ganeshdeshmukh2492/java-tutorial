// class Hello {
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
class mobile {

    String brand;
    int price;
    String network;
     static String name;
 

 public void show(){
        System.out.println(brand + " :" ,price + " :" ,  name );
    }
}
class hello{
    
    public static void main( String[]args)
    {

        // StringBuffer sb = new StringBuffer("navin");
        // // System.out.println(sb.capacity());
        // // System.out.println(sb.length());
        // sb.append("   reddy" );
        // sb.insert(6, "java");
        // sb.setLength(30 );
        // System.out.println(sb);


        // static variable in java
        mobile obj1 =new mobile();
        obj1.name="iphone";
        obj1.network="jio";
        obj1.brand="apple";
        obj1.price=50000;
        obj1.name="phone";
        obj1.show();
    
    }

}


