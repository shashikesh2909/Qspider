package java_core_project;

public class BMS_driver {

	public static void main(String[] args) 
	{
		Bms b1 = new Movies() ;
		b1.fullBookings();
		Movies m = (Movies) b1 ;
		m.selectMovies();
		m.selectSeat();
	}
	

}
