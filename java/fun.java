package Abstract;

/**
 * Created by milan on 9/15/2019.
 */

abstract class f1
{
    void show()

    {
        System.out.println("show function is called");

    }
}

class f2 extends f1
{

}

public class fun {

    public static void main(String atrgs[]) {
        f1 obj = new f2();
        obj.show();
    }
}


