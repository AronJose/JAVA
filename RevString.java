
class RevString {
      public static void main(String[] args) {
            String str = "Hi How are you", nstr ="";
            System.out.println("The orginal String:" + str);
            String[] stry = str.split(" ");
             nstr=stry[3] + " " +stry[2] + " " + stry[1] + " " + stry[0];
            System.out.println("Reverse:" + nstr);
            }
      }