package collections.arrays;

/**
 * Created by User on 8/24/2019.
 */
public class TestOneChange
{
    public static void main(String args[]){
        TestOneChange obj = new TestOneChange();
        System.out.println(obj.onechange("p","pale"));
    }

    public boolean onechange(String str1, String str2){
        char[] str1char = str1.toCharArray();
        char[] str2char = str2.toCharArray();

        int len1 = str1char.length;
        int len2 = str2char.length;

        if(Math.abs(len1-len2) > 1 ){
            //Length difference exceeds 2
            return false;
        }

        int index1 = 0;
        int index2 = 0;
        boolean onechange = false;

        //index1 will be reference pointer

        while(index1 < len1 && index2 < len2){
            if(str2char[index2] == str1char[index1]){
                //both characters match so move both pointers forward
                index1++;
                index2++;
            }
            else{

                //Checking if a change has already been detected
                if(onechange){
                   //More than one change detected
                    return false;
                }

                //mark the mismatch as one change
                onechange = true;
                //case2 : This change could be because an extra character has been added in the middle of str 2
                if(len1-len2 == -1){
                    index2++;
                }
                else if(len1-len2 == 1){
                    //case 3 : This change could be because an extra character has been removed in the middle of str 2
                    index1++;
                }
                else{
                    //case 4 : Current character is modified in or Str 2
                    index1++;
                    index2++;
                }
            }
        }

        return true;
    }
}
