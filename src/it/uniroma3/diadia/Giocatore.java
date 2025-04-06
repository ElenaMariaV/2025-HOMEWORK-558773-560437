package it.uniroma3.diadia;

public class Giocatore {
	
	public Borsa borsa;
	static final private int CFU_INIZIALI = 20;
	private int cfu;
	
	public Giocatore() {
		this.cfu=CFU_INIZIALI;
		this.borsa = new Borsa();
		
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}	
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
        this.borsa.addAttrezzo(attrezzo);
        return true;
       
	}
	
	public boolean removeAttrezzo(Attrezzo attrezzo) {
        this.borsa.removeAttrezzo(attrezzo.getNome());
        return true;
       
	}
}
