package algebra.String;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import algebra.PandC.Factorial;

public class Word {

	public static void main(String[] args) {
		
		Word w = new Word();
		System.out.println("Result -  " + w.arrange("mississippi"));
		w.arrWord("3");
		
		// System.out.println(w.word("mississippi"));
	}
	
	public String word(String a) {
		Factorial f =  new Factorial();
		
		a = a.toLowerCase();
		char[] chars = a.toCharArray();
		
		int la = 0;
		int lb = 0;
		int lc = 0;
		int ld = 0;
		int le = 0;
		int lf = 0;
		int lg = 0;
		int lh = 0;
		int li = 0;
		int lj = 0;
		int lk = 0;
		int ll = 0;
		int lm = 0;
		int ln = 0;
		int lo = 0;
		int lp = 0;
		int lq = 0;
		int lr = 0;
		int ls = 0;
		int lt = 0;
		int lu = 0;
		int lv = 0;
		int lw = 0;
		int lx = 0;
		int ly = 0;
		int lz = 0;
		
		

		for(int i = 0; i < a.length();i++) {
			
			if(chars[i] == 'a') {
				la++;
			}
			if(chars[i] == 'b') {
				lb++;
			}
			if(chars[i] == 'c') {
				lc++;
			}
			if(chars[i] == 'd') {
				ld++;
			}
			if(chars[i] == 'e') {
				le++;
			}
			if(chars[i] == 'f') {
				lf++;
			}
			if(chars[i] == 'g') {
				lg++;
			}
			if(chars[i] == 'h') {
				lh++;
			}
			if(chars[i] == 'i') {
				li++;
			}
			if(chars[i] == 'j') {
				lj++;
			}
			if(chars[i] == 'k') {
				lk++;
			}
			if(chars[i] == 'l') {
				ll++;
			}
			if(chars[i] == 'm') {
				lm++;
			}
			if(chars[i] == 'n') {
				ln++;
			}
			if(chars[i] == 'o') {
				lo++;
			}
			if(chars[i] == 'p') {
				lp++;
			}
			if(chars[i] == 'q') {
				lq++;
			}
			if(chars[i] == 'r') {
				lr++;
			}
			if(chars[i] == 's') {
				ls++;
			}
			if(chars[i] == 't') {
				lt++;
			}
			if(chars[i] == 'u') {
				lu++;
			}
			if(chars[i] == 'v') {
				lv++;
			}
			if(chars[i] == 'w') {
				lw++;
			}
			if(chars[i] == 'x') {
				lx++;
			}
			if(chars[i] == 'y') {
				ly++;
			}
			if(chars[i] == 'z') {
				lz++;
			}
			;
			
		}
		
		int result = f.fact(a.length())/(f.fact(la)*f.fact(lb)*f.fact(lc)*f.fact(ld)*f.fact(le)*f.fact(lf)*f.fact(lg)*f.fact(lh)*f.fact(li)*f.fact(lj)*f.fact(lk)*f.fact(ll)*f.fact(lm)*f.fact(ln)*f.fact(lo)*f.fact(lp)*f.fact(lq)*f.fact(lr)*f.fact(ls)*f.fact(lt)*f.fact(lu)*f.fact(lv)*f.fact(lw)*f.fact(lx)*f.fact(ly)*f.fact(lz));
		return Integer.toString(result);
	}
	
	
	
	
	public String arrange(String inputStr) {
		Factorial f =  new Factorial();		

		char[] chars = inputStr.toCharArray();

		Map<Character, Integer> dupCharMap = new HashMap<Character, Integer>();


		for(int i = 0; i < inputStr.length(); i++) {

			char curChar =  chars[i];

			Integer mapVal = dupCharMap.get(curChar);
			if(mapVal == null) {
				mapVal = 0;
			}
			dupCharMap.put(curChar, ++mapVal);		

		}
		int result = f.fact(inputStr.length());

		Iterator<Entry<Character, Integer>> iterator = dupCharMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);

			// Example: Remove an entry during iteration (safe operation)
			if(value > 1) {

				result = result/f.fact(value);
			}

		}


		return Integer.toString(result);
	}
	public String arrWord(String n) {
		n = n.toLowerCase();
		char[] chars = n.toCharArray();
		
		HashMap mp = new HashMap();
		
		for(int i = 0; i < n.length();i++) {
			mp.put(chars[i], 1);
		}
		
		
		System.out.println(mp);
		return "";
		

}
}
