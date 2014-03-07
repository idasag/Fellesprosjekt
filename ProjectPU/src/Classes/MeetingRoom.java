package Classes;

import java.util.ArrayList;
import java.util.Calendar;

public class MeetingRoom {

	private int ID;
	private int Capasity;
	private ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();

	public MeetingRoom(int ID, int Capasity){
		this.ID = ID;
		this.Capasity = Capasity;
		this.AppointmentList = null;
	}

	public void addAppointment(Appointment Q){
		try{
			if (Q.getStarttime() == null){
				throw new NullPointerException();
			}
			if (AppointmentList.size() == 0){
				AppointmentList.add(Q);
			}
			else{
				for(int i = 0; i < AppointmentList.size(); i++){
					if (Q.getStarttime().compareTo(AppointmentList.get(i).getStarttime()) < 0){
						AppointmentList.add(i, Q);
					}
				}		
				Capasity++; //Hva gj�r denne? Tror capasity skal inneholde st�rrelsen p� rommet
			}
		}
		catch (NullPointerException e){
			System.out.println("The appointment has no startdate.");
		}
	}


	public void removeAppointment(int ID){
		for (int i = 0; i < AppointmentList.size(); i++){
			if (AppointmentList.get(i).getAppointmentID() == ID){
				AppointmentList.remove(i);
			}
		}
		Capasity--;
	}

	public boolean isFree(Calendar start, Calendar end){
		for (int i = 0; i < AppointmentList.size(); i++){
			if ((AppointmentList.get(i).getStarttime().compareTo(start) < 0 && AppointmentList.get(i).getFinishingtime().compareTo(end) > 0)
					|| (AppointmentList.get(i).getStarttime().compareTo(start) > 0 && AppointmentList.get(i).getStarttime().compareTo(end) < 0)
					|| (AppointmentList.get(i).getFinishingtime().compareTo(start) > 0 && AppointmentList.get(i).getFinishingtime().compareTo(end) < 0)
					|| (AppointmentList.get(i).getStarttime().compareTo(start) < 0 && AppointmentList.get(i).getFinishingtime().compareTo(end) < 0)
					|| (AppointmentList.get(i).getStarttime().compareTo(end) > 0 && AppointmentList.get(i).getFinishingtime().compareTo(end) > 0)){
				return false;
			}
		}
		
		return true;
	}

	public int getCapasity(){
		return Capasity;
	}
	
	public int getID(){
		return ID;
	}

}
