public class TypeConversions {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Widening Conversions:");
        System.out.println("byte to short: " + shortValue);
        System.out.println("short to int: " + intValue);
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        double originalDouble = 99.99;
        float floatFromDouble = (float) originalDouble;
        long longFromFloat = (long) floatFromDouble;
        int intFromLong = (int) longFromFloat;
        short shortFromInt = (short) intFromLong;
        byte byteFromShort = (byte) shortFromInt;

        System.out.println("\nNarrowing Conversions:");
        System.out.println("double to float: " + floatFromDouble);
        System.out.println("float to long: " + longFromFloat);
        System.out.println("long to int: " + intFromLong);
        System.out.println("int to short: " + shortFromInt);
        System.out.println("short to byte: " + byteFromShort);

        char charValue = 'A';
        int intFromChar = charValue;
        char charFromInt = (char) intFromChar;

        System.out.println("\nCharacter Conversions:");
        System.out.println("char to int: " + intFromChar);
        System.out.println("int to char: " + charFromInt);
    }
}
