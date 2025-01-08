class calculator{
    public int add(int n1,int n2){
      int result =n1+n2;
       return result;
    }

}

public class hello
{
    public static void main(String args[])
    {
    calculator calc=new calculator();
    // int n1=5;
    // int n2=6;
    int sum=calc.add(5,6);
    System.out.println(sum);
    }
}
