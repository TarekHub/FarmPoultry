package exercice_2;

public class Canard extends Volaille {
	static private float prix ;
	static private float Poab;

	public Canard(int p , int pid){
		super(p,pid);
	
	}
	public void setprix(float prix){
		this.prix=prix;
	}
	public float getprix(){
		return prix ;
	}
	public void setprixAb(float Poab){
		this.Poab=Poab;
	}
	public float getPoixAb(){
		return Poab ;
	}
	

}
