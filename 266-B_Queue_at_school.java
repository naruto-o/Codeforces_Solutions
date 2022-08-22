https://codeforces.com/problemset/problem/266/B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class queue_at_school {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		int t = Integer.parseInt(st.nextToken());
		String initial = br.readLine();
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < initial.length()-1; j++) {
				if(initial.charAt(j) == 'B' && initial.charAt(j+1) == 'G') {
					initial = initial.substring(0,j)+"GB"+initial.substring(j+2);
					j++;
				}
			}
		}
		System.out.println(initial);
	}
}
    
      
