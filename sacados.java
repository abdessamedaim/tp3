

class  sacados {
 
    // fonction qui return
    // maximum de deux nombre
    static int max(int a, int b)
    {
      return (a > b) ? a : b;
    }
 
    // Returns la maximum valeur on peut mettre dans le sac
    // on peut mettre dans le sac
    // de la capacity (w)
    static int sacados(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;
 
        // si le poid de n element
        // plus grand que la capacity du sac (w),
        // donc ce element nest pas inclu
        // dans la sol optl
        if (wt[n - 1] > W)
            return sacados(W, wt, val, n - 1);
 
        // Return le maximum pour deux case:
        
        else
            return max(val[n - 1]
                       + sacados(W - wt[n - 1], wt,
                                  val, n - 1),
                       sacados(W, wt, val, n - 1));
    }
 
    // main
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(sacados(W, wt, val, n));
    }
}
