
public class FindOccurence {

	public static int main(String[] args) {
 
		// TODO Auto-generated method stub
		String s1 = new String();
		String word="java";
		String occ = new String();
		int count =  0;
		for (int i=0; i<occ.length();i++) {
			if (word.equals(occ[i]))
				count++;
			
		}
		return count;
	}

}
public class FindOccurence1
{
	public static int main(String[] args) {

		FindOccurence1 n = new FindOccurence1();
		int result =n.occurenceCharacter("java");
		System.out.println("result"+ result);
}

	private int occurenceCharacter(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	