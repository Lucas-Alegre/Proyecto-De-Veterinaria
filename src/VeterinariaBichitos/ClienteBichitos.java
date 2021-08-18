package VeterinariaBichitos;

public class ClienteBichitos {

	  private static void imprimir(Mascota [] param) {
			 
			 for(int i=0;i<param.length;i++) {
				 System.out.println(param[i].toString());
			 }
			 
		 }
		
		 
		 private static Mascota [] filtrarGerontes(Mascota [] param) {		
			 int contador=0;
			 
			 for(int i=0;i<param.length;i++) {
				 if(param[i].getAnios()>13) {
					 contador++;
				 }
			 }
			 
			 Mascota[] mascotaGerontes= new Mascota[contador];
			 int sub=0;
			 for(int i=0;i<param.length;i++) {			
				 if(param[i].getAnios()>13) {					 
					 mascotaGerontes[sub]=param[i];
					 sub++;
				 }
			 }
			 return mascotaGerontes;
		 }
		 
		 
		 private static Mascota [] filtrarPorEspecie(Mascota [] param, Especie especieParam) {
			 int contador=0;
			 for(int i=0;i<param.length;i++) {	
				 if(param[i].getRaza().getEspecie().equals(especieParam)) {
					 contador++;
				 }
				 
			 }
			 Mascota[] mascotaPorEspecie= new Mascota[contador];
			 int sub=0;
			 for(int i=0;i<param.length;i++) {	
				 if(param[i].getRaza().getEspecie().equals(especieParam)) {					
					 mascotaPorEspecie[sub]=param[i]; 
					 sub++;
				 }			 
			 }
			 return mascotaPorEspecie;
		 }
		
		 
		 private static Persona maxMascotero(Mascota [] param) {
			 Persona maxMascotas = null;
			 int mayor=0;
			 for(int i=0;i<param.length;i++) {
				 int cantidad=0;
				 Persona compara=param[i].getDuenioAmoResponsable();
				 for(int j=0;j<param.length;j++) {
					 if(i!=j) {
						 if(compara.equals(param[j].getDuenioAmoResponsable())) {
							 cantidad++;
							 if(cantidad>mayor) { 
								 mayor=cantidad;
								 maxMascotas=param[i].getDuenioAmoResponsable();
							 }
							
						 }
					 }
				 }
				 
			 }
			 return maxMascotas;
			 
		 }
		 public static void main(String[] args) {

				
				Especie esp1 = new Especie("Caniche");
				Especie esp2 = new Especie("Rot Wailer");
				Especie esp3 = new Especie("Siames");
				Especie esp4 = new Especie("Laydy");
				
				Raza ra1 = new Raza("Perro",esp1);
				Raza ra2 = new Raza("Perro",esp2);
				Raza ra3 = new Raza("Gato",esp3);
				Raza ra4 = new Raza("Gata",esp4);
				
				Persona per1= new Persona("Lucas","Alegre","42736541");
				Persona per2= new Persona("Damaris","Alegre","31625430");
				Persona per3= new Persona("Emilio","Olivieri","53847652");
				
				Mascota mascota1 = new Mascota(1234,"Mosho",ra1,2015,per1);
				Mascota mascota2 = new Mascota(2345,"tobi",ra2,2017,per1);
				Mascota mascota3 = new Mascota(3456,"Lulu",ra3,2014,per2);
				Mascota mascota4 = new Mascota(4567,"Mato",ra4,2016,per3);
				Mascota mascota5 = new Mascota(5678,"Shasmin",ra4,2018,per3);
				Mascota mascota6 = new Mascota(6789,"Looky",ra3,2005,per3);
				Mascota mascota7 = new Mascota(9876,"Lazy",ra2,2000,per3);
			
				Mascota[] arrayMascota = new Mascota[7];

				arrayMascota[0]=mascota1;
				arrayMascota[1]=mascota2;
				arrayMascota[2]=mascota3;
				arrayMascota[3]=mascota4;
				arrayMascota[4]=mascota5;
				arrayMascota[5]=mascota6;
				arrayMascota[6]=mascota7;
				
				System.out.println("---------------SE IMPRIMEN TODAS LAS MASCOTAS---------------------------------------------------------------------------------------------------");

				System.out.println();
				imprimir(arrayMascota);
				System.out.println("---------------SE IMPRIMEN MASCOTAS > 13 AÑOS---------------------------------------------------------------------------------------------------");
				imprimir(filtrarGerontes(arrayMascota));
				System.out.println("---------------SE FILTRA LAS ESPECIES PASADA POR PARAMETRO--------------------------------------------------------------------------------------");
				imprimir(filtrarPorEspecie(arrayMascota, esp1));
				System.out.println("---------------SE IMPRIME LA PERSONA CON MAS MASCOTAS A SU CARGO--------------------------------------------------------------------------------");
				System.out.println( maxMascotero(arrayMascota));
			
			}
		
		
	}
	

