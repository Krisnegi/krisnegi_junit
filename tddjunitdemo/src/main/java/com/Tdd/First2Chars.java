package com.Tdd;

public class First2Chars {

   public String removeIfA(String string)
   {
       int stringLength = string.length();
       if(stringLength == 0)
           return string;
       if(stringLength == 1)
           return string.charAt(0) == 'A'?"":string;
       String result = "";
       for(int i=0;i<2;i++)
       {
           if(string.charAt(i) != 'A')
               result += string.substring(i,i+1);
       }
       if(stringLength > 2)
           result += string.substring(2);
       return result;
   }
}
