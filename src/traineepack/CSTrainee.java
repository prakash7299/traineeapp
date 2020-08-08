package traineepack;

public class CSTrainee extends Trainee {
	private int languages;
	public CSTrainee(int id,String name,int languages) {
		super(id,name);
		this.languages=languages;
	}
	public int getLanguages() {
		return languages;
	}
	public void setLanguages(int languages) {
		this.languages = languages;
	}

}
