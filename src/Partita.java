
public class Partita {
	
	private final short NMAX=100;
	private final short TMAX=7;
	private short numSegreto;
	private short numTentativo;
	private boolean inGame;
	private short tentativi;
	
	public Partita(){
		this.numSegreto=estrazioneNum();
		this.inGame=true;
		this.tentativi=0;
	}
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
	 * @return the inGame
	 */
	public boolean getInGame() {
		return inGame;
	}
	
	/**
	 * @param inGame the inGame to set
	 */
	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}
	
	public short getTentativi(){
		return tentativi;
	}
	
	private short estrazioneNum(){
		return (short) ((Math.random()*NMAX)+1);
	}
	
	public String checkNum(short numGiocatore){
		
		this.numTentativo=numGiocatore;
		this.tentativi++;
		if (this.tentativi<this.TMAX){			
			if (this.numSegreto==this.numTentativo){
				setInGame(false);
				return "numero trovato...HAI VINTO\n";
			}
			else{
				if (this.numSegreto<this.numTentativo){
					return "numero troppo alto\n";
				}
				else{
					return "numero troppo basso\n";
				}
			}
		}
		else {
			setInGame(false);
			return "raggiunto numero massimo dei tentativi..HAI PERSO...il numero segreto è: "+this.numSegreto+"\n";
		}
		
		
	}

}
