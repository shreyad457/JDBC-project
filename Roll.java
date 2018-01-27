import java.util.Comparator;

	class Roll implements Comparator<Visitor>


		{


		public int compare(Visitor e1, Visitor e2) {


		if(e1.getRoll() > e2.getRoll()){


		return 1;


		}
		else {
			return -1;
		}
		}
}