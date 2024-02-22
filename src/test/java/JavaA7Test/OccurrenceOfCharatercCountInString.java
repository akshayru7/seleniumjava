package JavaA7Test;

public class OccurrenceOfCharatercCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Team = "Cricket & Football Team";
		
		for (int i = 0; i<Team.length(); i++) {
			
			int count = 0;
			for (int j = 0; j<Team.length(); j++) {
				
			if ( i>j && Team.charAt(i) == Team.charAt(j))
				break;
			if (Team.charAt(i) == Team.charAt(j))
				count++;
			}
			if (count != 0 )
			System.out.print(Team.charAt(i) + ":" + count + ", ");
		}
	}
}
