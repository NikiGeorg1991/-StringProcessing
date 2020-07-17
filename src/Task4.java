import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two full names with comma between them: ");
        String twoNames = scan.nextLine();
        String[] names = twoNames.split(",");

        String firstPerson;
        String secondPerson;
        firstPerson = names[0];
        secondPerson = names[1];
        short asciiValue;
        int firstNameSum = 0;
        int secondNameSum = 0;
        for (int i = 0; i < firstPerson.length(); i++) {
            if (firstPerson.charAt(i) == ' ') {
                firstNameSum = firstNameSum;
            } else {
                asciiValue = (short) firstPerson.charAt(i);
                firstNameSum = firstNameSum + asciiValue;
            }
        }
        for (int i = 0; i < secondPerson.length(); i++) {
            if (secondPerson.charAt(i) == ' ') {
                secondNameSum = secondNameSum;
            } else {
                asciiValue = (short) secondPerson.charAt(i);
                secondNameSum = secondNameSum + asciiValue;
            }
        }
        System.out.println(firstPerson + " - " + firstNameSum);
        System.out.println(secondPerson + " - " + secondNameSum);

        if (firstNameSum == secondNameSum) {
            System.out.println("Двете имена имат еднаква сума на символите в именета си по ASCII таблица " +
                    firstPerson + " , " + secondPerson);
        }
        if (firstNameSum > secondNameSum) {
            System.out.println(firstPerson + " , има по-голяма сума на символите в името си по ASCII таблица ");
        } else {
            System.out.println(secondPerson + " , има по-голяма сума на символите в името си по ASCII таблица ");
        }
    }
}
