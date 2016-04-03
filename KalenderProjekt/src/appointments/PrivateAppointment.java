package appointments;

import java.awt.Image;
import java.util.Calendar;

public class PrivateAppointment extends Appointment{

	public PrivateAppointment(Calendar startTime, Calendar endTime, boolean remind, String title, String information,
			Image img) {
		super(startTime, endTime, remind, title, information, img);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean changeStartTime(Calendar newTime) {
		if(newTime==null){
			return false;
		}
		
		if(newTime.before(Calendar.getInstance())){
			return false;
		}
		setStartTime(newTime);
		return true;
	}

	@Override
	public boolean changeStartTime(Calendar newTime, String reason) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeEndTime(Calendar newTime, String reason) {
		if(newTime==null){
			return false;
		}
		if(newTime.before(Calendar.getInstance())){
			return false;
		}
		setEndTime(newTime);
		return true;
	}

	@Override
	public boolean changeRemind() {
		if(this.isRemind()==false){
			setRemind(true);
		}else{
			setRemind(false);
		}
		return true;
	}

	@Override
	public boolean changeTitle(String newTitle) {
		if(newTitle == null){
			return false;
		}
		if(newTitle.length()>30){
			return false;
		}
		return true;
	}

	@Override
	public boolean changeInformation(String newInformation) {
		if(newInformation == null){
			return false;
		}
		if(newInformation.length()>400){
			return false;
		}
		return true;
	}

	@Override
	public boolean changeImg(Image newImg) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
