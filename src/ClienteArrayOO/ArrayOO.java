package ClienteArrayOO;

public class ArrayOO {
    private int [] array;

   
    public ArrayOO() {
        this.array = new int[0];
    }
    
    
    public int get(int indice){
        return array[indice];
    }
    
 
    public void set(int indice, int valor){
        this.array[indice] = valor;
    }
    
   
    public int size(){
        return this.array.length;
    }
    
    
    public void add(int valor){
        int [] nuevoArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }    
        
        nuevoArray[nuevoArray.length - 1] = valor;             
        this.array = nuevoArray;
    }
   
    
    public void remove(int indice){
        int [] nuevoArray = new int[array.length - 1]; 
        int indiceAux = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i != indice){
                nuevoArray[indiceAux] = array[i];
                indiceAux++;
            }
        }
            
        this.array = nuevoArray;
    }
    
    
    public double promedio() {
    	int sumatoria=0;    	
    	for(int i=0;i<array.length;i++) {
    		sumatoria+=array[i];
    	}    	
    	return (double) sumatoria/array.length; 
    }
    
    
    public void multiplicar(int valorParam) {
    	for(int i=0;i<array.length;i++) {
    		this.array[i]=array[i]*valorParam;
    	}
    }
    
    
    public void multiplicar2(int [] arrayParam) {
    	if(this.array.length==arrayParam.length) {
    		for(int i=0;i<arrayParam.length;i++) {
    			this.array[i]=array[i]*arrayParam[i];
    		}
    		
    	}	
    }
   
    
    public boolean todosDistintos() {
	     for(int i=0;i<this.array.length;i++) {		    	 
		      for(int j=0;j<this.array.length;j++) {			    	  
			      if(i!=j) {						    	  
				      if(this.array[i]==this.array[j]) {
					       return false;
			          }			
		          }	
		      }
	     }
	     return true;
     }

    
	 public void reverso() {
		  int[] y = new int[this.array.length];
	      int p = this.array.length;
	      for(int i=0; i<this.array.length; i++){
	          y[p - 1] = array[i];
	          p = p - 1;
	      }    
	      this.array=y;
	}	

    
    @Override
    public String toString() {
        String resultado = "";
        
        for(int i=0;i<array.length;i++) {
        	resultado+=array[i]+", ";
        }
        
        resultado=resultado.substring(0, resultado.length() -2)+".";
        return resultado;
    }
}
 
