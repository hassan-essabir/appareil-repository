package app;

import java.util.Date;

public class AppelEmi extends Appel {

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return dueeAppel*2;
	}

	public AppelEmi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelEmi(int numero, Date dateAppel, double dueeAppel) {
		super(numero, dateAppel, dueeAppel);
		// TODO Auto-generated constructor stub
	}
	

}
