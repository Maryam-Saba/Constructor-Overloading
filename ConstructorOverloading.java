class Add
{
int x;
int y;
Add()
{
x=45;
y=87;
}
Add(int a, int b)
{
x=a;
y=b;
}
}
public class ConstructorOverloading
{
public static void main(String args[])
{
Add P= new Add();
Add Q= new Add(765,868);
System.out.println(P.x + P.y);
System.out.println(Q.x + Q.y);
}
}