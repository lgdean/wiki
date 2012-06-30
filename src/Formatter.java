public class Formatter {
    public String format(String input) {
        boolean inBold = false;
        StringBuilder result = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            char currChar = input.charAt(i);
            if (currChar == '*') {
                if (inBold) result.append("</b>");
                else result.append("<b>");
                inBold = !inBold;
            } else {
                result.append(currChar);
            }
        }
        return result.toString();
    }
}
