package PayrollProject;

public class PieceWorker extends Employee {
	
	private double wage;
	private int pieces;
	public PieceWorker(String first, String last, String ssn,double wage,int pieces) {
		super(first, last, ssn);
		setWage(wage);
		setPieces(pieces);
	}
	@Override
	public double earnings() {	
	return getWage()* getPieces();
	}

	public final void setWage(double wage) {
		this.wage = (wage < 0.0) ? 0.0 : wage;
	}
	public final void setPieces(int pieces) {
		this.pieces=pieces;
	}
	public double getWage() {
		return wage;
	}
	public int getPieces() {
		return pieces;
	}
	@Override
	public String toString() {
		return  "Piece Worker Employee: " + super.toString() + "\n" + 
				"wage: "+getWage()+" Number of pieces produced "+ getPieces();
	}
}
