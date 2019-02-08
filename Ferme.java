package exercice_2;

import java.util.Scanner;

public class Ferme {


	public void Ramplissage(Volaille vol [],int n){

		System.out.println("___Remplissage___");

		String X = " ";
		String x ="";
		int i =0 ;

		while(X.equals(" ")){

			Scanner sc = new Scanner (System.in);

			if(i==n){
				System.out.println("Ferme Remplis");
				break;}


			System.out.println("Canard (C) ou Poulet (P) ? ");

			x=sc.nextLine();

			if(x .equals("C")){
				System.out.println("Poid : ");
				int y = sc.nextInt();
				vol[i]=new Canard(y,(i+1));
				i++;
			}
			else if(x.equals("P")){
				System.out.println("Poid : ");
				int y = sc.nextInt();
				vol[i]=new Poulet(y,(i+1));
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
		System.out.println("Nombre de Volaille dans la ferme"+vol[i-1].co);
	}
	public void Remplissage_Partiel(Volaille vol[], int n){
		String X = " ";
		String x ="";
		int i =0 ;
		boolean V ;
		
		while(X.equals(" ")){

			Scanner sc = new Scanner (System.in);
			V = true ;

			if(i==n){
				System.out.println("Ferme Remplis");
				break;}


			System.out.println("Canard (C) ou Poulet (P) ? ");

			x=sc.nextLine();

			if(x .equals("C")){
				System.out.println("Poid : ");
				int y = sc.nextInt();
				while((V==true)&&(i<n)){
					if(vol[i]==null){
						vol[i]=new Canard(y,(i+1));
						System.out.println("Nouveau Canard ajouté a la ferme dans la position "+ (i+1));
						i++;
						V=false ;
					}
					else
						i++;
				}
			}
			else if(x.equals("P")){
				System.out.println("Poid : ");
				int y = sc.nextInt();
				while((V==true)&&(i<n)){
					if(vol[i]==null){
						vol[i]=new Poulet(y,(i+1));
						System.out.println("Nouveau Poulet ajouté a la ferme dans la position "+(i+1));
						i++;
						V=false ;
					}
					else 
						i++;
				}
				
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
		
	}

	
	public void PoidAbattage(Volaille vol[],int n){
		System.out.println("Poid_Abattage");
		System.out.println("Entrez le poid d'abattage pour les Poulets : ");
		Scanner st = new Scanner(System.in);
		float PP = st.nextFloat();
		
		for(int i=0;i<n;i++){
			 
			if (vol[i] instanceof Poulet ){
				Poulet P ; 
				P=(Poulet)vol[i];
				P.setPoixAb(PP);
				break;
			}
			
			}

		System.out.println("Entrez le poid d'abattage pour les Canards :");
		float PC = st.nextFloat();
		for(int i=0;i<n;i++){
			 
			if (vol[i] instanceof Canard ){
				Canard C ;
				C=(Canard)vol[i];
				C.setprixAb(PC);
				break;
			}
			
			}
		
		
	}
	
	public Volaille[] Trier (Volaille vol [] ,Volaille cvol[], int n){ 
		int j =0 ;
		for(int i=0;i<n;i++){
			if(vol[i] instanceof Canard)
			{
				
				Canard C ;
				C=(Canard)vol[i];
				if(C.getPoixAb()<=C.getPoix()){
					cvol[j]=vol[i];
					vol[i]=null;;
					j++;
				}
			}
			else if  (vol[i] instanceof Poulet)
			{
				
				Poulet P ;
				P=(Poulet)vol[i];
				if(P.getPoixAb()<=P.getPoix()){
					cvol[j]=vol[i];
					vol[i]=null;
					j++;
				}
			
		}
	}
		return cvol ;
}
	
	public void Prix(Volaille Vol [] , int n ){
		System.out.println("Prix_Du_Jour");
		Scanner sca = new Scanner(System.in);
		System.out.println("Entrez le Prix du Jour Pour :");
		System.out.println("Canard : ");
		float Can =sca.nextFloat();
		float z=0;
		for(int i=0;i<n;i++){
			 
			if (Vol[i] instanceof Canard ){
				Canard C ;
				C=(Canard)Vol[i];
				C.setprix(Can);
				System.out.println(C.getPoix());
				System.out.println(C.getPoixAb());
				z=z+(C.getprix()*C.getPoix());
			}
			}
		System.out.println("Entrez le prix du Jour Pour :");
		System.out.println("Poulet : ");
		float P =sca.nextFloat();
		float y=0;
		for(int i=0;i<n;i++){
			 
			if (Vol[i] instanceof Poulet ){
				Poulet Po; ;
				Po=(Poulet)Vol[i];
				Po.setprix(P);
				System.out.println(Po.getPoix());
				System.out.println(Po.getPoixAb());
				y=y+(Po.getprix()*Po.getPoix());
			}
			}
		
		System.out.println("Prix obtenu du jour : "+(y+z));
	}
	
	
}