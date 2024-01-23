import java.util.TreeSet;

public class q3 {
    public static void main(String[] args) 
    {
        TreeSet<String> colors = new TreeSet<>();
        System.out.println("Unsorted :")
        System.out.println("red\nGreen\nBlue\nYellow\nPurple\nOrange")

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");  

        System.out.println("Colors in the TreeSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
