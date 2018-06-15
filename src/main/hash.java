package main;

public class hash {



    public static void main(String[] args){

        String[] a = new String[5];
        a[0] = "to ja";
        a[1] = "to ty";
        a[2] = "to my";
        a[3] = "to wa";
        a[4] = "to oni";

        Wpis[] hashTab = new Wpis[50];

        int[] tab = {2, 16, 5, 27, 678, 47, 41, 87, 53};
        for(int it: tab)
        {
            System.out.print(it + " ");
        }
        System.out.println();
        quickSort(0, tab.length - 1, tab);

        for(int it: tab)
        {
            System.out.print(it + " ");
        }


   /*     for(String s: a)
        {
            toHash(s, hashTab);
        }
*/
  /*      for (int i = 0; i < hashTab.length; i++)
        {
            if (hashTab[i] == null)
                System.out.println("hashTab[" + i + "]");
        }
*/
    }

    static void quickSort(int x, int y, int[] tab){

        int i = x;
        int j = y;
        int v = tab[(i + j) / 2];
        int tmp;

        while (i < j) {
            while (tab[i] < v)
                i++;
            while (tab[j] > v)
                j--;

            if (i <= j) {
                tmp = tab[i];
                tab[i] = tab[j];
                tab[j] = tmp;
                i++;
                j--;
            }
        }
        if (x < j)
            quickSort(x, j, tab);
        if (i < y)
            quickSort(i, y, tab);
    }

   /* static void toHash(String s, Wpis[] tab){

        int index = s.hashCode() % tab.length;
        if (index < 0)
            index *= -1;

        if (tab[index] == null)
            tab[index].data = s;
        else
        {
            while(tab[index].next != )
        }

    }*/

}

class Wpis{

    Wpis next;
    String data;

    Wpis(String s){
        next = null;
        data = s;
    }

    Wpis create(String s){
        data = s;
        next = new Wpis(s);
        return next;
    }
}
