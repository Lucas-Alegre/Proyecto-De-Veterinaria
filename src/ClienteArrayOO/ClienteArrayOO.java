package ClienteArrayOO;


public class ClienteArrayOO {

  
    public static void main(String[] args) {
 
    	
        ArrayOO obj = new ArrayOO();
        int[] obj2 = new int[9];
        
            
        obj.add(2);
        obj.add(2);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        obj.add(9);
        obj.add(10);
        obj.add(11);
        
       
        obj2[0]=2;
        obj2[1]=2;
        obj2[2]=4;
        obj2[3]=5;
        obj2[4]=6;
        obj2[5]=7;
        obj2[6]=8;
        obj2[7]=9;    
        obj2[8]=10;   
                
        
        System.out.println("Despues de agregar 10 \n" + obj.toString());
        System.out.println("-------------------------------------------------------------");
        
        System.out.println("Obj.get(5): "+obj.get(5));
        System.out.println("-------------------------------------------------------------");
        
        obj.remove(5); 
        System.out.println("Despues de haber quitaado la posicion 5: ");        
        System.out.println(obj.toString());
        System.out.println("-------------------------------------------------------------");
        
        System.out.println("El promedio es: ");
        System.out.println(obj.promedio());
        System.out.println("-------------------------------------------------------------------------------");
        
        obj.multiplicar(2);
        System.out.println( "Despues de haber multiplicado el array por el numero pasado por parametro \n"+obj.toString());
        System.out.println("-------------------------------------------------------------------------------");
        
        obj.multiplicar2(obj2);
        System.out.println( "Despues de haber multiplicado el array por los valores del array"
        		+ " pasado por parametro \n"+obj.toString());
        System.out.println("-------------------------------------------------------------------------------");
       
        System.out.println("Son todos distintos?:  "+obj.todosDistintos());
        System.out.println("-------------------------------------------------------------------------------");
        
        obj.reverso();
        System.out.println(obj.toString());
        
      
      } 
    }

