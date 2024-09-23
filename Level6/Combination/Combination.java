public class Combination 
{
    private static void combine(char[] array, int start, StringBuilder current) {
        for (int i = start; i < array.length; i++) {
            current.append(array[i]);
            System.out.println(current.toString());
            combine(array, i + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "112234";
        char[] charArray = str.toCharArray();
        combine(charArray, 0, new StringBuilder());
    }
}
