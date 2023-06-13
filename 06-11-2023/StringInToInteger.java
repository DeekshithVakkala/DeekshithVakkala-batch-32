class StringConversionException extends Exception {
    public StringConversionException(String message) {
        super(message);
    }
}
class StringConversionException extends Exception {
    public StringConversionException(String message) {
        super(message);
    }
}

public class StringToIntConverter {
    public static int convertToInt(String input) throws StringConversionException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new StringConversionException("Failed to convert string to int: " + input);
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int convertedInt = convertToInt(input);
                System.out.println("Conversion successful: " + convertedInt);
            } catch (StringConversionException e) {
                System.out.println("Conversion failed. Exception: " + e.getMessage());
            }
        }
    }
}

public class StringToIntConverter {
    public static int convertToInt(String input) throws StringConversionException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new StringConversionException("Failed to convert string to int: " + input);
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int convertedInt = convertToInt(input);
                System.out.println("Conversion successful: " + convertedInt);
            } catch (StringConversionException e) {
                System.out.println("Conversion failed. Exception: " + e.getMessage());
            }
        }
    }
}
