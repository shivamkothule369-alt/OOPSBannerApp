/**
* 00PSBannerApp UC3 - 00PS Banner Application (Use Case 3)
*
* This class extends the functionality of Use Case 2 by improving the way the "00PS" banner
* is constructed and displayed. It focuses on enhancing code readability and efficiency
* by utilizing the String. join() method to create each line of the banner. This approach
* overcomes the drawbacks of using the + operator for string concatenation, which can lead
* to code inefficiency due to the creation of multiple intermediate String objects in memory.
*
* @author Developer
* @version 3.0
*/

public class OOPSBannerApp {
    public static void main(String[] args) {
        // Each column segment is exactly 9 characters wide
        System.out.println(String.join(" ", "  *****  ", "  *****  ", "*********", " ********"));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", " **    **", "**       "));
        System.out.println(String.join(" ", "**     **", "**     **", "**    ** ", "**       "));
        System.out.println(String.join(" ", "**     **", "**     **", "*********", " ********"));
        System.out.println(String.join(" ", "**     **", "**     **", "**       ", "       **"));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", "**       ", "       **"));
        System.out.println(String.join(" ", "  *****  ", "  *****  ", "**       ", " ********"));
    }
}