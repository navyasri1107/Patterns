 public class Patterns {
    public static void main(String[] args){
        int n=4;
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){//j(colums) value is dependent on the i(rows) 
                System.out.print("*");//use print statement for execution , whenre printLn prints the statementd in new line.
            }
            System.out.print("\n");
        } 
        System.out.println("-----------"); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------"); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print("*");
                    }else{
                        System.out.print("#");
                    }
                }else{
                    System.out.print("#");
                }
            }System.out.print("\n");
        }
        System.out.println("-----------"); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1&&(j==3||j==4)){
                    System.out.print("*");
                }else if (i==n&&j==3){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println("-----------"); 
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
            }
            System.out.println();
        }     
        for(int i=n-1;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");   
            } 
            System.out.println();   
        }
        System.out.println("-----------"); 
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==2&&j==3){
                    System.out.print("o");
                }else if (i==3 &&(j==2||j==4)){
                    System.out.print("o");
                }else if (i==4&&j==3){
                    System.out.print("o");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println("-----------");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1&&j==3){
                    System.out.print("*");
                }else if (i==2 &&(j==2||j==4)){
                    System.out.print("*");
                }else if (i==3 &&(j==1||j==5)){
                    System.out.print("*");
                }else if (i==4&&(j==2||j==4)){
                    System.out.print("*");
                }else if (i==5&&j==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("-----------"); 
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==i||j==5-i+1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 
