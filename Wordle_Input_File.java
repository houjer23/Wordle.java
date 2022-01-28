import java.io.*;
import java.util.*;

public class Wordle_Input_File {
	private int N;
	private Set<String> dictionary = new HashSet<>();
	private List<String> dictionary_arr = new ArrayList<>();
	
	public Wordle_Input_File() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("words.in"));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
			String new_word = br.readLine();
			dictionary.add(new_word);
			dictionary_arr.add(new_word);
		}
        System.out.println(dictionary);
        return;
	}
	
	
	public String generate_word() {
		int random_number = (int) (Math.random() * N);
		return dictionary_arr.get(random_number);
	}
	
	public boolean check_word(String guess) {
		return dictionary.contains(guess);
	}
}
