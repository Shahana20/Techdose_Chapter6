class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack <Character> str1 = new Stack<>();
      Stack <Character> str2 = new Stack<>();
      for(Character c1 : s.toCharArray())
      {
          if(!str1.isEmpty() && c1 == '#')
          {
              str1.pop();
          }
          else if(c1 != '#')
          {
              str1.push(c1);
          }
      }
      for(Character c2 : t.toCharArray())
      {
          if(!str2.isEmpty() && c2 == '#')
          {
              str2.pop();
          }
          else if(c2 != '#')
          {
              str2.push(c2);
          }
      }
    //   System.out.print(str1.size()+" "+str2.size());
      if(!(str1.size() == str2.size()))
      {
          return false;
      }
      
      else
      {
          int size = Math.max(str1.size(),str2.size());
          for(int i = 0 ; i < size ; i++)
          {
              System.out.print(str1.peek()+" "+str2.peek());
              if(!str1.isEmpty() && !str2.isEmpty() && !(str1.pop().equals(str2.pop())))
              {
                  return false;
              }
          }
      }
      return true;
    }
}