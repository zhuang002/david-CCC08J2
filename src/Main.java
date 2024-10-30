import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Character> playList = new ArrayList<>();
	public static void main(String[] args) {
		initPlaylist();
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		while (b!=4) {
			shuffle(b,n);
			b = sc.nextInt();
			n = sc.nextInt();
		}
		
		for (int i=0;i<playList.size();i++) {
			char song = playList.get(i);
			System.out.print(song+" ");
		}

	}
	private static void shuffle(int b, int n) {
		for (int i=0;i<n;i++) {
			if (b==1) {
				char song = playList.remove(0);
				playList.add(song);
			} else if (b==2) {
				char song = playList.remove(playList.size()-1);
				playList.add(0, song); // insert 
			} else if (b==3) {
				char song = playList.remove(1);
				playList.add(0,song);
			}
		}
	}
	private static void initPlaylist() {
		
		playList.add('A');
		playList.add('B');
		playList.add('C');
		playList.add('D');
		playList.add('E');
	}

}
