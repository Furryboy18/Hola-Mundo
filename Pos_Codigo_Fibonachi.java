import java.util.Scanner;
class Pos_Codigo_Fibonachi{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      long n1=0;
      long n2=1;
      long n3=0;
      long nf=0;
      System.out.println("Ingrese la posicion del codigo fibonachi prro:  ");
      int n=sc.nextInt();
      for(int x=0;x<n;x++){
        nf=0;
        if(n==0){
         nf = n1;
         }
        else if(n==1){
            nf = n2;
            }
        if(n>=1 && x>=1){
         n3 = n1 + n2;
         n1 = n2;
         n2 = n3;
         nf = n3;
        }
      }
      System.out.print(nf);
   }
}
         