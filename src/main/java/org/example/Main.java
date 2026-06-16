package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        // Negatif sayı gelirse işaretini kaldır
        number = Math.abs(number);

        // Orijinal sayıyı sakla
        int originalNumber = number;
        // Ters çevrilmiş sayıyı tutacak değişken
        int reversedNumber = 0;
        // Sayının rakamlarını tersten oluştur
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        // Orijinal sayı ile ters çevrilmiş sayı eşitse palindromdur
        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {

        // Negatif sayı mükemmel sayı olamaz
        if (number < 0) {
            return false;
        }

        // Bölenlerin toplamını tutacak değişken
        int sum = 0;

        // Sayının kendisi hariç tüm bölenlerini bul
        for (int i = 1; i < number; i++) {

            //i = 1 => 6 % 1 == 0
            // 0 += 1; => sum =1
            //6 % 2 == 0 => sum += 2; => sum = 3;
            //i = 3 => 6 % 3 == 0 => sum += 3; => sum = 6
            //i=4=>6 % 4 == 2 =>Tam bölünmüyor => sum değişmez ......
            if (number % i == 0) {
                sum += i;
            }
        }

        // Bölenlerin toplamı sayıya eşitse mükemmel sayıdır
        return sum == number; // 1 + 2 + 3 = 6
    }

    public static String numberToWords(int number) {

        // Negatif sayı için hata mesajı döndürülür
        if (number < 0) {
            return "Invalid Value";
        }

        // Sayıyı String'e çevir
        String numberString = String.valueOf(number);

        // Sonucu tutacak değişken
        String result = "";

        // Sayının her rakamını tek tek gez
        for (int i = 0; i < numberString.length(); i++) {

            char digit = numberString.charAt(i);

            // Rakamları karşılık gelen kelimeye çevir
            switch (digit) {
                case '0':
                    result += "Zero ";
                    break;
                case '1':
                    result += "One ";
                    break;
                case '2':
                    result += "Two ";
                    break;
                case '3':
                    result += "Three ";
                    break;
                case '4':
                    result += "Four ";
                    break;
                case '5':
                    result += "Five ";
                    break;
                case '6':
                    result += "Six ";
                    break;
                case '7':
                    result += "Seven ";
                    break;
                case '8':
                    result += "Eight ";
                    break;
                case '9':
                    result += "Nine ";
                    break;
            }
        }

        return result.trim();
    }
}