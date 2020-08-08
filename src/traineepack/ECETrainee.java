package traineepack;

public class ECETrainee extends Trainee {
	private String deviceUsed;
	public ECETrainee(int id,String name,String deviceUsed) {
		super(id,name);
		this.deviceUsed=deviceUsed;
	}
	public String getDeviceUsed() {
		return deviceUsed;
	}
	public void setDeviceUsed(String deviceUsed) {
		this.deviceUsed = deviceUsed;
	}
	
}
