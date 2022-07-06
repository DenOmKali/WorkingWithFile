import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputFromFile {

        public static void main(String[] args) throws IOException {
            String line;

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\wottt\\Desktop\\JavaBin\\3\\Rand\\src\\input.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            List<String> lines = new ArrayList<String>();

            while ((line = bufferedReader.readLine()) != null) {
                    lines = List.of(line.split("\\s"));
            }

            System.out.println("Кількість слів: "+ lines.size());

            for (int i = 0; i < lines.size(); i++) {
                for (int x = i + 1; x < lines.size(); ++x) {
                    if (lines.get(i).equals(lines.get(x))) {

                        System.out.println("Слова які повторюються: "+lines.get(x));

                        }
                    }
                }
            }
        }