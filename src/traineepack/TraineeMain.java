package traineepack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TraineeMain {
	Map<Integer, Trainee> map = new HashMap<>();
	Set<CSTrainee> set1 = new HashSet<>();
	Set<ECETrainee> set2 = new HashSet<>();

	public static void main(String[] args) {
		TraineeMain obj1 = new TraineeMain();
		obj1.runapp();
	}

	public void runapp() {
		CSTrainee trainee1 = new CSTrainee(100, "prakash", 4);
		map.put(100, trainee1);
		CSTrainee trainee2 = new CSTrainee(101, "praveen", 2);
		map.put(101, trainee2);
		ECETrainee trainee3 = new ECETrainee(102, "prakash", "Arduino");
		map.put(102, trainee3);
		ECETrainee trainee4 = new ECETrainee(101, "praveen", "Rasperrypie");
		map.put(103, trainee4);
		Set<Integer> keys = map.keySet();
		for (Integer s : keys) {
			Trainee fetched = map.get(s);
			if (fetched instanceof CSTrainee) {
				CSTrainee cs = (CSTrainee) fetched;
				set1.add(cs);
			} else {
				ECETrainee et = (ECETrainee) fetched;
				set2.add(et);
			}
		}
		display();
	}

	private void display() {
		System.out.println("*****CS Trainee*******");
		for (CSTrainee trainee : set1) {
			System.out.println(
					"id : " + trainee.getId() + "name :" + trainee.getName() + "Languages" + trainee.getLanguages());
		}
		System.out.println("******ECE Trainee*****");
		for (ECETrainee trainee : set2) {
			System.out.println(
					"id : " + trainee.getId() + "name :" + trainee.getName() + "Languages" + trainee.getDeviceUsed());
		}

	}
}
