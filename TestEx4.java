public class TestEx4 {
    public static void main(String[] argv){
        final int NUMAR_TOTAL_CARACTERE = 175;
        final int CARACTERE_PE_LINIE = 25;

        System.out.println("Se vor afisa " + NUMAR_TOTAL_CARACTERE + " de litere mici, cate " + CARACTERE_PE_LINIE + " pe linie:");
        System.out.println("---------------------------------------------------------");

        for(int i=0; i< NUMAR_TOTAL_CARACTERE; i++){
            char litera = CaracterRandom.getRandomLowerCaseLetter();

            System.out.print(litera + " ");

            if((i+1) % CARACTERE_PE_LINIE == 0){
                System.out.println();
            }
        }
    }
}
