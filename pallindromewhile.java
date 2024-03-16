class pallindromewhile
{
  /* A number that remains same even if its
  digits are reversed, is called a palindromic number.
  */
  public static void main(String[]args)
   {
    int a=121;
    int r=0;
    int a1=a;
    while(a>0)
     {
      
      int rem=a%10;
      r=r*10+rem;
      a=a/10;
     }
     if(a1==r)
      {
       System.out.println("it is pallinedrown");
      }
     else
      {
       System.out.println("it is not pallinedrown");
      }
   }
 }// it is pallindrome num