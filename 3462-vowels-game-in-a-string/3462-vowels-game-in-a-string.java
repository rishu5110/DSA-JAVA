class Solution {
    public boolean doesAliceWin(String s) 
    {
           int size=s.length();
           int count=0;
      
           for(int i=0;i<size;i++)
           {
            char c=s.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
            {   
                count++;

            }
           } 
           if(count%2==0 && count!=0 || count%2==1)
           {
            return true;
           }
           if(count==0)
          {
            return false;
          }
           return false;
    }

}