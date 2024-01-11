public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println("Resultado: " + romanToInt("III"));
        System.out.println("Resultado: " + romanToInt("LVIII"));
        System.out.println("Resultado: " + romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        final var input = s.toUpperCase().split("");
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (input[i]) {
                case "I":
                    if (((i + 1) < input.length) && (input[i] + input[i + 1]).equals("IV")) {
                        result += 4;
                        i++;
                    } else if (((i + 1) < input.length) && (input[i] + input[i + 1]).equals("IX")) {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;
                case "V":
                    result += 5;
                    break;
                case "X":
                    if (((i + 1) < input.length) && (input[i] + input[i + 1]).equals("XL")) {
                        result += 40;
                        i++;
                    } else if (((i + 1) < input.length) && (input[i] + input[i + 1]).equals("XC")) {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                    break;
                case "L":
                    result += 50;
                    break;
                case "C":
                    if (((i + 1) < input.length) && (input[i] + input[i + 1]).equals("CD")) {
                        result += 400;
                        i++;
                    } else if ((((i + 1) < input.length)) && (input[i] + input[i + 1]).equals("CM")) {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                    break;
                case "D":
                    result += 500;
                    break;
                case "M":
                    result += 1000;
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}
