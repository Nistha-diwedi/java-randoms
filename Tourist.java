import java.util.Scanner;
public class Tourist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the city: ");
        String city = scanner.nextLine();
        switch (city) {
            case "delhi":
                System.out.println("Tourist Attractions in Delhi:");
                System.out.println("- India Gate\n- Lal Kila\n- Humayun's Tomb\n- Qutab Minar\n- Red Fort");
                break;
            case "agra":
                System.out.println("Tourist Attractions in Agra:");
                System.out.println("- Taj Mahal\n- Agra Fort\n- Fatehpur Sikri");
                break;
            case "lucknow":
                System.out.println("Tourist Attractions in Lucknow:");
                System.out.println("- Bara Imambara\n- British Residency\n- Rumi Darwaza");
                break;
            case "amritsar":
                System.out.println("Tourist Attractions in Amritsar:");
                System.out.println("- Golden Temple\n- Company Bagh\n- Jallianwala Bagh");
                break;
            default:
                System.out.println("Tourist Attraction : Taj Mahal");
        }
    }
}

