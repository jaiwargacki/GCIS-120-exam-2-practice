import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("grades.txt"));
        BufferedReader buff = new BufferedReader(fr);
        Map<String, Integer> grades = new TreeMap<>();
        String nextLine = buff.readLine();
        while( nextLine != null) {
            String[] lineArray = nextLine.split(" ");
            String name = lineArray[0];
            int g = Integer.parseInt(lineArray[1]);
            grades.put(name, g); // Add elements to a Map
            nextLine = buff.readLine();
        }

        for(String key : grades.keySet()) { // {"Bobby", "Jai", "Alexs", "AJ"}
            System.out.println(key + ":" + grades.get(key)); // Get element from Map
        }

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>(set);
        list.addAll(set);
        set.addAll(list);
        
        

        System.out.println(grades.containsKey("Zach")); // Check if contains
        

    }
}
