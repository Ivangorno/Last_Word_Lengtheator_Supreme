

public class Length_Finder {

       public int lengthOfLastWord(String s) {

        int count = 0;

         boolean endOfLastWord = false;

        for (int i =s.length()-1; i>=0 ; i--){

           if (Character.isLetter(s.charAt(i)))
            {
                endOfLastWord = true;
                count++;
            } else {
               if (endOfLastWord){
                   return count;
               }
           }
        }

        return count;
    }

}
