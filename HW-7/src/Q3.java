public class Q3 {
    /*
    Declare multidimensional array and store 5 countries and their capital and print them in console.
     */
    //Main method
    public static void main(String[] args) {
        String[][] countries = {{"India","New Delhi"},
                                {"UK","London"},
                                {"USA","Washington"},
                                {"Japan","Tokyo"},
                                {"Egypt","Cairo"}};

        int i=0;
        while (i < countries.length){
            int j=0;
            System.out.println();
            while (j<countries[i].length){
                System.out.print(countries[i][j]+"\t\t");
                j++;
            }
            i++;
        }
    }
}
