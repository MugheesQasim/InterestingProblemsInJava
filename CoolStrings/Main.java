import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "abcdfcf";
        System.out.println(numberCoolStrings(s));
    }

    public static boolean checkCool(String s)
    {
        char[] temp = s.toCharArray();

        Arrays.sort(temp);

        for(int i=0;i<temp.length-1;i++)
        {
            if(temp[i]==temp[i+1])
                return false;
        }
        return true;
    }

    public static int numberCoolStrings(String str)
    {
        int numberCool = 0;

        for(int i=0;i<str.length()-4;i++)
        {
            if(checkCool(str.substring(i,i+4)))
                numberCool++;
        }

        return numberCool;
    }
}