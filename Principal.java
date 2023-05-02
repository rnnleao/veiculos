public class Principal {



     public static void main(String [] args){
    
     Bike bike = new Bike("Caloi", "Velox", "Preta", 2020);
    
    
     System.out.println(bike.getMarca());
    
     System.out.println(bike.getModelo());
    
     System.out.println(bike.getCor());
    
     System.out.println(bike.getAno());
    
     System.out.println("\n");
    
    
    
    
     Mobilete mobilete = new Mobilete("Caloi", "Moby 4", "Azul ", 2021);
    
     System.out.println(mobilete.getMarca());
    
     System.out.println(mobilete.getModelo());
    
     System.out.println(mobilete.getCor());
    
     System.out.println(mobilete.getAno());
    
     System.out.println("\n");
    
    
    
    
     Patinete patinete = new Patinete("Titan", "Belfix", "Roxo", 2022);
    
     System.out.println(patinete.getMarca());
    
     System.out.println(patinete.getModelo());
    
    System.out.println(patinete.getCor());
    
    System.out.println(patinete.getAno());
    
    }
    
}