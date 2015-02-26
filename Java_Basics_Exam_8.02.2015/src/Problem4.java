import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 1;
		TreeMap<String, LinkedHashMap<String, Integer>> userLog = new TreeMap<String, LinkedHashMap<String, Integer>>();
		while (true) {
			String[] line = scan.nextLine().split(" ");
			if (line[0].equals("end")) {
				break;
			}

			String subIp = line[0].substring(3);
			String user = line[2].substring(5);

			if (!userLog.containsKey(user)) {

				userLog.put(user, new LinkedHashMap<String, Integer>());
				userLog.get(user).put(subIp, num);
			} else {

				if (!userLog.get(user).containsKey(subIp)) {

					userLog.get(user).put(subIp, num);
				} else {
					int newnum = userLog.get(user).get(subIp);
					userLog.get(user).put(subIp, ++newnum);
				}
			}
		}

		for (String user : userLog.keySet()) {
			System.out.printf("%s:", user);
			System.out.println();
			String output = userLog.get(user).toString().replace("{", "");
			output = output.replace("}", "");
			output = output.replace("=", " => ");
			System.out.println(output + ".");

		}

	}
}
