import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("Manh");
		queue.add("Manh01");
		queue.add("Manh02");
		queue.add("Manh03");
		queue.add("Manh01");
		queue.add("Manh02");
		queue.add("Manh02");
		queue.add("Manh05");
		
		//Show full value:
		for(String s : queue) {
			System.out.println(s);
		}
		
		//Xoa phan tu trong listQueue:
		queue.remove("Manh");
		System.out.println("Sau khi xoa: ");
		for(String s : queue) {
			System.out.println(s);
		}
		
	}
}
