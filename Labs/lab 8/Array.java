
public class Array<reversedArr> {
    public static void main(String[] args) {
        String[] tokens = args[0].split(",");

        String[] customerName = new String[8];
        // creating the loop to copy
        System.arraycopy(tokens, 0, customerName, 0, tokens.length);
        // method for displaying the array
        displayNames(customerName);

        // part f the swapping

        int begin = 4;
        int end = 6;
        String temp = customerName[begin];
        customerName[begin] = customerName[end];
        customerName[end] = temp;
        //next line
        int before = 5;
        int after = 7;
        String temp2 = customerName[before];
        customerName[before] = customerName[after];
        customerName[after] = temp2;

        customerName[5] = "Jessica";
        customerName[4] = "Rick";
        displayNames(customerName);


        // reversing
        customerName = reverse(customerName);
        displayNames(customerName);

        reverse2(customerName);


       // removing names the ricks (note that the second line p restrict the other rick from getting removed)
        for (int k = 0; k < customerName.length; k++) {
            if (customerName[k] != null && customerName[k].equals("Rick")) {
                customerName[k] = null;

                for(int p =k + 1; p < customerName.length; p++){
                    moveString(customerName,p,p-1);
                }
            }


        }
         displayNames(customerName);
        }


     public static void displayNames (String[] names){
         for (String element : names) {
             System.out.println(element);
         }
         System.out.println(" ");
     }

     public static String[] reverse(String[] names) {
         String[] newNames = new String[names.length];
         int i = names.length - 1;
         for (String a : names) {
             newNames[i] = a;
         i--;
     }
         return newNames;
     }




    public static void moveString(String[] names, int start, int end) {
        String temp = names[start];
        names[start] = names[end];
        names[end] = temp;
    }


     public static void reverse2(String[] arr){
        String[] newArr = arr;
        reverse(newArr);
        String[] reversedArr = newArr;
        for(String element: arr){
            System.out.println(element);
        }
         System.out.println(" ");
    }





}

