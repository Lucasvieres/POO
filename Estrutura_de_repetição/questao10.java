public class questao10 {

    public static void contagem(){
        for(int i = 1; i <= 100; i++){
            System.out.println(" " + i);
            if(i%10 == 0){
                System.out.println(i +" é multiplo de 10.");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Contagem dos numeros:");
        contagem();
    }
}
