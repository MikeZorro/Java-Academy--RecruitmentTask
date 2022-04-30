package Main;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;


public class Main {
    public static String toLowerCaseAndRemoval(String str){
        String str2 = StringUtils.deleteWhitespace(str.toLowerCase(Locale.ROOT));
        return str2;
    }

    public static long uniqueCharactersCounter (String str) {
        return str.chars().distinct().count();
    }


    public static void letterCounter (String str) {
        String str2 = toLowerCaseAndRemoval(str);
        char[] charArray = str2.toCharArray();
        int counter = 0;
        StringBuilder reading = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    counter++;
                }
            }
            String result = ("" + charArray[i] + counter +" ");
            reading.append(result);
            counter = 0;
        }
            String finalResult = new String (String.valueOf(reading));
        String [] result = finalResult.split(" ");
        String [] uniqueResults = Arrays.stream(result).distinct().toArray(String[]:: new);
        for(String s : uniqueResults) {
            System.out.println(s);
        }


    }


            public static void main (String[]args){
       letterCounter("MyApp JavaAcademy");
            }
        }
