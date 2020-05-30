import java.util.*;

public class bendy
{
    public static void main(String args[]) {
        check();
        System.out.println("rtcp{" + rev() + "}");
    }

    public static boolean check(){
        String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        boolean h = false;
        String flag = "r34l_g4m3rs_eXclus1v3";
        String theflag = "";
        int i = 0;

        for(i = 0; i < flag.length()-14; i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i+8)));
            System.out.println(" input: " + (i + 8) + " theflag: " + (theflag.length() - 1) + " flag: " + i);
        }
        for(i = 10; i < flag.length()-6; i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i-8)));
            System.out.println(" input: " + (i - 8) + " theflag: " + (theflag.length() - 1) + " flag: " + i);
        }
        for(; i < flag.length(); i++){
            theflag += (char)((int)(flag.charAt(i-3)) + (int)(input.charAt(i)));
            System.out.println(" input: " + i + " theflag: " + (theflag.length() - 1) + " flag: " + (i - 3));
        }
        //ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã
        String[] flags = theflag.split("");
        for(i=0; i < (int)((flags.length)/2); i++){
            flags[i] = Character.toString((char)((int)(flags[i].charAt(0)) + 20));
        }
        theflag = theflag.substring(flags.length/2);
        for(int k = 0; k < ((flags.length)/2); k++){
            theflag += flags[k];
        }
        return theflag.equals("ÄÑÓ¿ÂÒêáøz§è§ñy÷¦");
    }

    public static String rev() {
        // 7 = 'u'
        String flag = "r34l_g4m3rs_eXclus1v3";
        String fakeflag = "ÄÑÓ¿ÂÒêáøz§è§ñy÷¦";
        String theflag = "";
        for(int i = 0; i < 9; i++){
            theflag += (char)((int)fakeflag.charAt(i + 9) - 20);
        }
        for(int i = 0; i < 9; i++){
            theflag += fakeflag.charAt(i);
        }
        String real = "h0";
        for(int i = 2; i < 7; i++){
            real += (char)(theflag.charAt(i + 5) - (int)(flag.charAt(i + 8)));
        }
        real += 'u';
        for(int i = 8; i < 15; i++){
            real += (char)(theflag.charAt(i - 8) - (int)(flag.charAt(i - 8)));
        }
        for(int i = 15; i < 21; i++){
            real += (char)(theflag.charAt(i - 3) - (int)(flag.charAt(i - 3)));
        }
        return real;
    }
}
