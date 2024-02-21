import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables need to find the zodiac
        int month, day;

        Scanner scanner = new Scanner(System.in);

        //receiving the user inputs
        System.out.print("Please enter your birth month as a number: ");
        month = scanner.nextInt();

        System.out.print("Please enter the day of the month you were born: ");
        day = scanner.nextInt();

        //determining the zodiac sign
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day >= 22) {
                    System.out.print("Your zodiac sign is Aquarius.");
                } else {
                    System.out.print("Your zodiac sign is Capricorn.");
                }
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day >= 20) {
                    System.out.print("Your zodiac sign is Pisces.");
                } else {
                    System.out.print("Your zodiac sign is Aquarius.");
                }
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day >= 21) {
                    System.out.print("Your zodiac sign is Aries.");
                } else {
                    System.out.print("Your zodiac sign is Pisces.");
                }
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day >= 21) {
                    System.out.print("Your zodiac sign is Taurus.");
                } else {
                    System.out.print("Your zodiac sign is Aries.");
                }
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day >= 22) {
                    System.out.print("Your zodiac sign is Gemini.");
                } else {
                    System.out.print("Your zodiac sign is Taurus.");
                }
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day >= 23) {
                    System.out.print("Your zodiac sign is Cancer.");
                } else {
                    System.out.print("Your zodiac sign is Gemini.");
                }
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day >= 23) {
                    System.out.print("Your zodiac sign is Leo.");
                } else {
                    System.out.print("Your zodiac sign Cancer.");
                }
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day >= 23) {
                    System.out.print("Your zodiac sign is Virgo.");
                } else {
                    System.out.print("Your zodiac sign is Leo.");
                }
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day >= 23) {
                    System.out.print("Your zodiac sign is Libra.");
                } else {
                    System.out.print("Your zodiac sign is Virgo.");
                }
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day >= 23) {
                    System.out.print("Your zodiac sign is Scorpio.");
                } else {
                    System.out.print("Your zodiac sign is Libra.");
                }
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day >= 22) {
                    System.out.print("Your zodiac sign in Sagittarius.");
                } else {
                    System.out.print("Your zodiac sign is Scorpio.");
                }
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day >= 22) {
                    System.out.print("Your zodiac sign is Capricorn.");
                } else {
                    System.out.print("Your zodiac sign is Sagittarius.");
                }
            }
        }

        scanner.close();
    }
}