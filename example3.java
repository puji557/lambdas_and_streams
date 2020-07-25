import java.util.*;
public class example3 {
  static boolean palindrome(String string)
    {
        int temp1 = 0, temp2 = string.length() - 1;
        while (temp1 < temp2)
        {
            if (string.charAt(temp1) != string.charAt(temp2))
                return false;
            temp1++;
            temp2--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int var;
        List<String> sample=new ArrayList<String>();  
        sample.add("rotor");
        sample.add("civic");
        sample.add("bring");
        sample.add("create");
        sample.add("refer");
        for(var=0;var<5;var++)
        {
        String string=sample.get(var);
        if (palindrome(string))
            System.out.println(string);
        }
} }