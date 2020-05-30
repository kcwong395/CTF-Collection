import java.util.*;

public class breakable
{
    public static void main(String args[]) {
        check();
        System.out.println("rtcp{" + rev() + "}");
    }

    public static boolean check(){
        String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        boolean h = false;
        String flag = "k33p_1t_in_pl41n";
        String theflag = "";
        int i = 0;
        for(i = 0; i < flag.length()-2; i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i+2)));
            System.out.println(" input: " + (i + 2) + " theflag: " + theflag.length() + "i: " + i);
        }
        for(i = 2; i < flag.length(); i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i-2)));

            System.out.println(" input: " + (i - 2) + " theflag: " + theflag.length() + "i: " + i);
        }
        String[] flags = theflag.split("");
        for(; i < (int)((flags.length)/2); i++){
            flags[i] = Character.toString((char)((int)(flags[i].charAt(0)) + 20));
        }
        return theflag.equals("ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã");
    }

    public static String rev() {
        String theflag = "ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã";
        String flag = "k33p_1t_in_pl41n";
        String real = "";

        for(int i = 2; i < 16; i++){
            real += (char)(theflag.charAt(i + 12) - (int)(flag.charAt(i)));
        }
        real += (char)(theflag.charAt(12) - (int)(flag.charAt(12)));
        real += (char)(theflag.charAt(13) - (int)(flag.charAt(13)));


        return real;
    }

}
