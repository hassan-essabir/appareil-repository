package app;

import java.util.Date;

public abstract class Appel {

	protected int numero;
	protected Date dateAppel;
	protected double dueeAppel;
	protected Contact contact;
	
	public abstract double cout();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDateAppel() {
		return dateAppel;
	}

	public void setDateAppel(Date dateAppel) {
		this.dateAppel = dateAppel;
	}

	public double getDueeAppel() {
		return dueeAppel;
	}

	public void setDueeAppel(double dueeAppel) {
		this.dueeAppel = dueeAppel;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Appel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appel(int numero, Date dateAppel, double dueeAppel) {
		super();
		this.numero = numero;
		this.dateAppel = dateAppel;
		this.dueeAppel = dueeAppel;
	}
	
	
}
