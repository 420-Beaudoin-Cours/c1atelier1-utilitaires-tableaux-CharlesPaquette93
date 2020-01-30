/**
 * @author Charles Paquette <3
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(int[] tab){
        int imax;
        for(int i = 0; i < tab.length-1; i++){
            imax = i;
            for(int j=i+1; j<tab.length; j++){
                if (tab[j] > tab[imax])
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void print(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i] + " ");
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(String[] tab){
        int imax;
        for (int i=0; i < tab.length-1; i++){
            imax = i;
            for (int j=i+1; j < tab.length; j++){
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imax]))
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static int maximum(int[] tab){
        int imax = tab[0];
        for (int i=1; i < tab.length; i++){
            if (tab[i] > imax){
                imax = tab[i];
            }
        }
        return imax;
    }

    public static int minimum(int[] tab){
        int imin = tab[0];
        for (int i = 1; i < tab.length; i++){
            if (tab[i] < imin){
                imin = tab[i];
            }
        }
        return imin;
    }

    public static double moyenne(int[] tab){
        int somme = 0;
        int i = 0;
        while(i < tab.length){
            somme += tab[i];
            i++;
        }
        double moyenne = 1.0 * somme / tab.length;
        return moyenne;
    }

    public static int fouilleSeq(int[] tab, int cherche){
        boolean trouve = false;
        int i = 0;
        while(i < tab.length && !trouve){
            if (tab[i] == cherche){
                trouve = true;
            }
            else{
                i++;
            }
        }
        if(trouve){
            return i;
        }
        else{
            return -1;
        }
    }

    public static void print(String[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i] + " ");
        }
    }

    public static String maximum(String[] tab){
        int imax = Integer.parseInt(tab[0]);
        for (int i=1; i < tab.length; i++){
            if (Integer.parseInt(tab[i]) > imax){
                imax = Integer.parseInt(tab[i]);
            }
        }
        return String.valueOf(imax);
    }

    public static String minimum(String[] tab){
        int imin = Integer.parseInt(tab[0]);
        for (int i = 1; i < tab.length; i++){
            if (Integer.parseInt(tab[i]) < imin){
                imin = Integer.parseInt(tab[i]);
            }
        }
        return String.valueOf(imin);
    }

    public static double moyenne(String[] tab){
        int somme = 0;
        int i = 0;
        while(i < tab.length){
            somme += Integer.parseInt(tab[i]);
            i++;
        }
        double moyenne = 1.0 * somme / tab.length;
        return moyenne;
    }

    public static String fouilleSeq(String[] tab, int cherche){
        boolean trouve = false;
        int i = 0;
        while(i < tab.length && !trouve){
            if (Integer.parseInt(tab[i]) == cherche){
                trouve = true;
            }
            else{
                i++;
            }
        }
        if(trouve){
            return String.valueOf(i);
        }
        else{
            return String.valueOf(-1);
        }
    }

}
