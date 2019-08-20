public class Main
{
    public static void main(String [] args)
    {
        UnboundedArray2 uba = new UnboundedArray2(10);

        uba.insert(1);
        uba.insert(2);
        uba.insert(3);
        uba.insert(4);
        uba.insert(5);
        uba.insert(6);

        System.out.println(uba.getSize());
        System.out.println(uba.get_array());

       uba.delete();
       System.out.println(uba.get_array());
       
        uba.delete(1,3);
       System.out.println(uba.get_array());
       
       
       

    }
}
