import java.util.*;
import java.io.*;
class EnumerationIterator implements Iterator
{
Enumeration enu;
public EnumerationIterator(Enumeration enu)
{
this.enu = enu;
}
public boolean hasNext()
{
return enu.hasMoreElements();
}
public Object next()
{
return enu.nextElement();
}
public void remove()
{
throw new UnsupportedOperationException();
}
}
class EnumerationDemo
{
public static void main(String args[])
{
Enumeration enu;
Vector<String> vector = new Vector<String>();

vector.add("Shubham");

vector.add("Snehankit");
vector.add("Shreyas");
vector.add("Smita&quot");
vector.add("Atul");
EnumerationIterator e=new EnumerationIterator(vector.elements());
//Enumeration&lt;String&gt; enumeration = vector.elements();
//Iterator&lt;String&gt; itr=vector.iterator();
/* while(itr.hasNext())
{
System.out.println(itr.next());
} */
while(e.hasNext())
{
System.out.println(e.next());
}
}
}