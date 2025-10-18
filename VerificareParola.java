import java.util.Scanner;
public class VerificareParola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rezultatValidare;

        while (true) {
            System.out.print("Introduceti o parola: ");
            String parolaIntrodusa = scanner.nextLine();

            rezultatValidare = getMesajValidareParola(parolaIntrodusa);

            if (rezultatValidare.equals("Parola valida")) {
                System.out.println("Succes! " + rezultatValidare);
                break; // Iesim din bucla
            } else {
                System.out.println(rezultatValidare + " Incercati din nou.");
                System.out.println(); // Linie goala pentru spatiere
            }
        }

        scanner.close();
    }

    public static String getMesajValidareParola(String parola) {
        if (parola.length() < 12) {
            return "Parola invalida: Trebuie sa aiba cel putin 12 caractere.";
        }

        int contorCifre = 0;

        for (int i = 0; i < parola.length(); i++) {
            char caracterCurent = parola.charAt(i);

            if (!Character.isLetterOrDigit(caracterCurent)) {
                return "Parola invalida: Trebuie sa contina doar litere si cifre (caracterul '" + caracterCurent + "' nu este permis).";
            }

            if (Character.isDigit(caracterCurent)) {
                contorCifre++;
            }
        }

        if (contorCifre < 3) {
            return "Parola invalida: Trebuie sa contina cel putin trei cifre.";
        }

        return "Parola valida";
    }
}