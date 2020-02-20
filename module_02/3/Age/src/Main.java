import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int vasayAge = 25; // Лет Васе
        int katyAge = 100; // Лет Кате
        int mishaAge = 35; // Лет Мише

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasayAge > katyAge && vasayAge > mishaAge) {
            System.out.println("Самый старший Вася. Ему " + vasayAge + " лет.");
        }
        if (katyAge > vasayAge && katyAge > mishaAge) {
            System.out.println("Самая старшая Катя. Ей " + katyAge + " лет.");
        }
        if (mishaAge > vasayAge && mishaAge > katyAge) {
            System.out.println("Самый старший Миша. Ему " + mishaAge + " лет.");
        }


        if ((vasayAge > mishaAge && vasayAge < katyAge) || (vasayAge < mishaAge && vasayAge > katyAge)) {
            System.out.println("Средний Вася. Ему " + vasayAge + " лет.");
        }
        if ((katyAge > vasayAge && katyAge < mishaAge) || (katyAge < vasayAge && katyAge > mishaAge)) {
            System.out.println("Средняя Катя. Ей " + katyAge + " лет.");
        }
        if ((mishaAge > vasayAge && mishaAge < katyAge) || (mishaAge < vasayAge && mishaAge > katyAge)) {
            System.out.println("Средний Миша. Ему " + mishaAge + " лет.");
        }


        if (vasayAge < katyAge && vasayAge < mishaAge) {
            System.out.println("Самый младший Вася. Ему " + vasayAge + " лет.");
        }
        if (katyAge < vasayAge && katyAge < mishaAge) {
            System.out.println("Самая младшая Катя. Ей " + katyAge + " лет.");
        }
        if (mishaAge < vasayAge && mishaAge < katyAge) {
            System.out.println("Самый младший Миша. Ему " + mishaAge + " лет.");
        }

    }


}

