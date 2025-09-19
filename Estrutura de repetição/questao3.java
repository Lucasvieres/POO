
public class questao3 {

    public static void impares(){
        System.out.println("Números impares entre 100 e 200");
        for(int i = 100; i <= 200; i++){
            if(i%2 != 0){
                System.out.print(" " + i);
            }
        }
    }
    public static void main(String[] args) {
        impares();
 
    }
    
}
