public class pat2{
	public static void main(String s[]){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				if(i%2==1){
					System.out.print(" * ");
				}
				else{
					if(j==1||j==5){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
			}
			System.out.println();
		}
	}
}