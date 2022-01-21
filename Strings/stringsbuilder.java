package Strings;

public class stringsbuilder {
    public static void main(String[] args) {
        //strings in Java immutable
        //variables are stored in stack memory and value is stored in heap memory

        StringBuilder sb = new StringBuilder("Siddhesh");
        System.out.println(sb.charAt(1));

        //set char at index 1
        sb.setCharAt(1, 'P');
        System.out.println(sb);

        //insert cha at index 1
        sb.insert(1,'R');
        System.out.println(sb);


        sb.delete(1,2);
        sb.append('s');

        System.out.println(sb);

    }
}
