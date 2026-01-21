class Solution {
    public boolean isValid(String s) 
    {

        int size=s.length();
        if(size%2 !=0) return false;
       Stack<Character>st=new Stack<>();

       for(char c:s.toCharArray())
       {
        if(c=='['|| c=='(' || c=='{')
        {
            st.push(c);
        }
        else
        {
            if(!st.isEmpty())
            {
                char ch=st.peek();
                if(c==']' && ch=='[' ||c==')' && ch=='(' || c=='}' && ch=='{' )
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }


        
       }
       return st.isEmpty();
    }
}