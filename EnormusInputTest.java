import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


// Remember that the class name should be "Main" and should be "public".
public class EnormusInputTest {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		InputStream inputStream = System.in;

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

	
}
