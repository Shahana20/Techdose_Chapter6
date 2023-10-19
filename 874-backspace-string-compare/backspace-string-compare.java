class Solution {

    public Stack insertCharacter(String str)
    {
        Stack<Character> st = new Stack<>();
        for(Character ch : str.toCharArray())
        {
          if(!st.isEmpty() && ch == '#')
          {
              st.pop();
          }
          else if(ch != '#')
          {
              st.push(ch);
          }
        }
        return st;
    }

    public boolean backspaceCompare(String s, String t) {
      Stack <Character> str1 = insertCharacter(s);
      Stack <Character> str2 = insertCharacter(t);
      
    //   System.out.print(str1.size()+" "+str2.size());
      if(!(str1.size() == str2.size()))
      {
          return false;
      }
      
      else
      {
          int size = str1.size();
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