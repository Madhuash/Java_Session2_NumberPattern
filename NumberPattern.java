
public class NumberPattern {
	public static void main( String arg[]){
        
		for(int i=1;i<=5;i++){
             for(int j=1;j<=i;j++)
             {
                System.out.print(j);
             }
             System.out.println();
        }    
       for(int k=1, m =5;k<=5;k++, m--){
            for(int l=1;l<=m;l++)
            {
                 System.out.print(l);
            }
            System.out.println();        
       }

     }
}
