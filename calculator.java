class claculator{

    public int add ( int a,int b){
         int result=a+b;
        return result;

    }
    public static void main(String []args)
    {
        int a=10;
        int b=20;
        claculator obj = new claculator();
        int r=obj.add( a,b);
        System.out.println(r);
    }
}