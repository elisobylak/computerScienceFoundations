public class Exercise180 {
public static void main(String[] args) {
    Long number = (long) 665;
    int n = 2;
    System.out.println(number);
    for (int i = 0; i < n; i++) {
        number = printline(number);
    }
}

public static Long printline(Long number) {
    String numbertxt = number.toString();
    StringBuilder sbnumbers = new StringBuilder();

    char[] txt = numbertxt.toCharArray();

    int counter = 1;
    for (int i = 0; i < txt.length; i++) {
        try {
            if (txt[i] == txt[i + 1]) {
                counter++;
            } else {
                sbnumbers.append(counter);
                sbnumbers.append(txt[i]);
                counter = 1;
            }
        } catch (Exception e) {
            sbnumbers.append(counter);
            sbnumbers.append(txt[i]);
            counter = 1;
        }
    }

    System.out.println(sbnumbers.toString());
    return Long.valueOf(sbnumbers.toString());
}
}