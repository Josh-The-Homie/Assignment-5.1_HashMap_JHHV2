import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static Map<String, String> readCSVData(String fileName) {
        // Construct the full path to the dictionary file based on the current working directory
        String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + fileName;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Map<String, String> dataMap = new HashMap<>();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    dataMap.put(key, value);
                }
            }

            return dataMap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
