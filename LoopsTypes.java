
public class LoopsTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i = 0;

		   System.out.println("SSeries of number with for: ");
		   for(i = 1; i <= 10; i++){
		    if(i < 10){
		     System.out.print(i + ",");
		    } else {
		     System.out.print(i); 
		    }
		   }
		   i = 1; 
		   System.out.println("");

		   System.out.println("Series of number with while: ");
		   while(i <= 10){
		    if(i < 10){
		     System.out.print(i + ",");
		    } else {
		     System.out.print(i); 
		    }
		    i++;
		   }
		   i = 1;
		   System.out.println("");

		   System.out.println("Series of number with do-while: ");
		   do{
		    if(i < 10){
		     System.out.print(i + ",");
		    } else {
		     System.out.print(i); 
		    }
		    i++;
		   }while(i <= 10);
		 }
		}
