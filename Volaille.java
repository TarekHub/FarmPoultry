package exercice_2;

public class Volaille {

	private int poid ;
	private int id;
	static int co ;

	public Volaille(int p , int pid ){
		poid = p ;
		id = pid ;
		co++;
	}
	public int getPoix(){
		return poid;
	}
	public void setPoid(int p ){
		poid = p;
	}
	public int getid(){
		return id ;
	}
	public void setid(int pid){
		id=pid;

	}
	public int getco(){
		return co ;
	}
	public void setco(int pco){
		co=pco;
	}



}
