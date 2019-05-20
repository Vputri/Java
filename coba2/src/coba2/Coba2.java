package coba2;
public class Coba2 {
    public static void main(String[] args) {
     int n=13;
     int i=1;
     int j=1;
     char simbol = '*';  
     for(i=1; i<n; i++){
     System.out.print(simbol);
     }
     System.out.println();
          for(i=2;i<n;i++){
         for(j=1;j<n;j++){
             if (j==1){
                System.out.print(simbol); 
             }
             else if(j==(n-1))
             System.out.print(simbol);
             else
             System.out.print(" ");
         }
            System.out.println();
      }
 
    for(i=1;i<n;i++){
    System.out.print(simbol);
    }
             
  }
}
     
    
    
