
package kartyajatek;


    
    
public class Main {

    static String[] pakli = new String[22];
    

    public static void main(String[] args) {
        kirak();
        for (int i = 0; i < pakli.length; i++) {
            System.out.println(pakli[i]);
        }
    }

    public static void kirak() {
        int db = 1;
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < szinek.length-1; i++) { 
            for (int j = 0; j < ertekek.length; j++) { 
                pakli[db++] = szinek[i] + "_" + ertekek[j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            pakli[db++] = szinek[3] + "_" + ertekek[i];
        }
    }
    
    
    
    public static void osszeallit() {
        
    }
}
