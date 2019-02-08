package exercice_2;

public class Poulet extends Volaille  {
	private static float prix ;
	private static float Poab;
	public Poulet(int  p , int iid){
		super(p,iid);
		

	}
	public float getprix(){
		return prix ;
	}
	public float getPoixAb(){
		return Poab ;
	}
	public void setprix(float ppr){
		prix=ppr;
	}
	public void setPoixAb(float ppoab){
		Poab=ppoab;
	}
	
	
	
}
