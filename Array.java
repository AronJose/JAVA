
class Array {
      public static void main(String[] args) {
            int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] odd = new int[a.length];
            int[] even = new int[a.length];
            int i;
            System.out.println("Odd Number");
            for (i = 0; i < a.length; i++) {
                  // System.out.print(a[i]);
                  if (a[i] % 2 != 0) {
                        odd[i] = a[i];
                        System.out.print(odd[i]);
                  }
            }System.out.println();
            System.out.println("Eeven Number");
            for (i = 0; i < a.length; i++) {
                  if (a[i] % 2 == 0) {
                        even[i] = a[i];
                        System.out.print(even[i]);
                  }
            }
      }

}
