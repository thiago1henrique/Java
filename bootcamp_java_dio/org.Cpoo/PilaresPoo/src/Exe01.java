//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exe01 {
    public static void main(String[] args) {
        int value = 0;

        for(int i = 0; i <= 100; i++) {
            if(i%2 == 0) value += i;
            else continue;

        };

        System.out.println(value);
    }
}