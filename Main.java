package exercice_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x= 5 ;
		Volaille Vol [] = new Volaille [x];
		Volaille cVol[] = new Volaille [x];
		Ferme fer = new Ferme();
		
		System.out.println(" (1)_Ramplissage \n (2) Poid_Abattage \n (3) Prix_Du_Jour \n (4) Remplissage_Partiel \n (5) Quitter ");
		
		Scanner sc = new Scanner (System.in);
		int choix=99;
		
		while(choix !=9){
			System.out.println("Entrez Votre choix ");
		choix = sc.nextInt();
		switch(choix){
		case 1:
			fer.Ramplissage(Vol,x);
			break;
		case 2 :
			fer.PoidAbattage(Vol, x);
			break;
		case 3 :
			fer.Prix(fer.Trier(Vol, cVol, x), x);
			break;
		case 4 :
			fer.Remplissage_Partiel(Vol, x);
			break;
		case 5 :
			System.out.println("Quitter ! ");
			break ;
		default :
			System.out.println("Erreur");
		}
		}
		
		
		
		/*System.out.println("___Remplissage___");

		String X = " ";
		String x ="";
		int i =0 ;

		while(X.equals(" ")){
			Scanner sc = new Scanner (System.in);

			System.out.println("Canard (C) ou Poulet (P) ? ");

			x=sc.nextLine();

			if(x .equals("C")){
				System.out.println("Poid : ");
				int y = sc.nextInt();
				Vol[i]=new Canard(y,(i+1));
				i++;
			}
			else if(x.equals("P")){
				System.out.println("Poid : ");
				int y = sc.nextInt();
				Vol[i]=new Poulet(y,(i+1));
				i++;
			}
			else 
				System.out.println("Pas defenit");

			System.out.println("Un autre Volaille ?");

			Scanner ss = new Scanner (System.in);


			String k = ss.nextLine();

			if(k.equals("")){
				X="";

			}

		}
		//System.out.println("Nombre de Volaille "+Vol[i-1].co);
		System.out.println(Vol[i-1].co);
		
		
		
		System.out.println("Redefinissez le poid dans la ferme ?");
		int j =0 ;

		Scanner sca = new Scanner(System.in);


		while(j<Vol[i].co){
			int t = sca.nextInt();
			Vol[j].setPoid(t);
			j=j+1;
		}
		for(i=0;i<Vol[j-1].co;i++){

		System.out.println(Vol[i].getid());
		System.out.println(Vol[i].getPoix());

		}
		
		System.out.println("Entrez le Prix du Jour Pour :");
		System.out.println("Canard : ");
		float Can =sca.nextFloat();
		float z=0;
		for(i=0;i<Vol[j-1].co;i++){
			 
			if (Vol[i] instanceof Canard ){
				Canard C ;
				C=(Canard)Vol[i];
				C.setprix(Can);
				z=z+(C.getprix()*C.getPoix());
			}
			}
		System.out.println("Entrez le prix du Jour Pour :");
		System.out.println("Poulet : ");
		float P =sca.nextFloat();
		float y=0;
		for(i=0;i<Vol[j-1].co;i++){
			 
			if (Vol[i] instanceof Poulet ){
				Poulet Po; ;
				Po=(Poulet)Vol[i];
				Po.setprix(P);
				y=y+(Po.getprix()*Po.getPoix());
			}
			}
		
		System.out.println("Prix obtenu du jour : "+(y+z));*/
		
		
		
		
		
		
	}
}







