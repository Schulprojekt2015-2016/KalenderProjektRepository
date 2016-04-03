package appointments;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Calendar;

public class LinkedAppointment extends Appointment{
	public ArrayList<Object> visibleTo;
	
	public LinkedAppointment(Calendar startTime, Calendar endTime, boolean remind, String title, String information,
			Image img) {
		super(startTime, endTime, remind, title, information, img);
		visibleTo = new ArrayList<Object>();
	}
	
	
	public ArrayList<Object> getVisibleTo() {
		return visibleTo;
	}


	public void setVisibleTo(ArrayList<Object> visibleTo) {
		this.visibleTo = visibleTo;
	}


	@Override
	public boolean changeStartTime(Calendar newTime) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean changeStartTime(Calendar newTime, String reason) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean changeEndTime(Calendar newTime, String reason) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean changeRemind() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean changeTitle(String newTitle) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean changeInformation(String newInformation) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean changeImg(Image newImg) {
		// TODO Auto-generated method stub
		return false;
	}

}
