import java.util.HashMap;
import java.util.Map;
/**
 * @author Joshua Henderson
 */
public class Hashmapclass {
    public static HashMap<String, String> createHashMap(Map<String, String> dataMap) {
        return new HashMap<>(dataMap);
    }//end HashMap

    public static void main(String[] args) {
        String filePath = "DictionaryWordValuePairs.csv";
        Map<String, String> dataMap = Dictionary.readCSVData(filePath);

        if (dataMap != null) {
            HashMap<String, String> hashMap = createHashMap(dataMap);

            // 2. Print unsorted dictionary keys and definitions
            System.out.println("Unsorted Dictionary Entries:");
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                System.out.println("Word: " + entry.getKey() + ", Definition: " + entry.getValue());
            }

            // 3. Search for 5 words and print word, definition, and hashkey
            String[] wordsToSearch = {"betimes", "assay", "purfle", "steed", "tithe"};
            System.out.println("\nSearch for 5 Words:");
            for (String word : wordsToSearch) {
                String definition = hashMap.get(word);
                if (definition != null) {
                    System.out.println("Word: " + word + ", Definition: " + definition + ", HashKey: " + word.hashCode());
                } else {
                    System.out.println("Word not found: " + word);
                }//end else
            }//end for
        }//end if
    }//end main
}//end Hashmapclass
