package Main;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;


public class Main {
    public static String toLowerCase(String str){
        String str2 = StringUtils.deleteWhitespace(str.toLowerCase(Locale.ROOT));

        return str2;
    }

    public static void letterCounter (String str) {
        String str2 = toLowerCase(str);
        char[] charArray = str2.toCharArray();
        int counter = 0;

        }


            public static void main (String[]args){
                letterCounter("MyApp JavaAcademy");
            }
        }
