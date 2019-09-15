class box
{
    void show(int A)
    {
        System.out.println("function with 1 parrameter is called");
    }
    void show(int B,int C)
    {
        System.out.println("function with  2 parrameter is called");
    }
}



class demo
{
    public static void main(String args[])
    {
        box b1=new box();
        b1.show(12,54);

    }


}