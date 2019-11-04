
public class Partita {
	
	private final short NMAX=100;
	private final short TMAX=7;
	private short numSegreto;
	private short numTentativo;
	/**
	 * @return the nMAX
	 */
	public short getNMAX() {
		return NMAX;
	}
	/**
	 * @return the tMAX
	 */
	public short getTMAX() {
		return TMAX;
	}
	/**
	 * @param numTentativo the numTentativo to set
	 */
	public void setNumTentativo(short numTentativo) {
		this.numTentativo = numTentativo;
	}
	
	private short estrazioneNum(){
		return (short) ((int)Math.random()*NMAX+1);
	}

}
