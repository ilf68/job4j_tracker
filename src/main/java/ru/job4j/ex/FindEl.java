package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("key not found");
        }
        System.out.println("element key is " + result);
        return result;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"ilf", "fil", "kiril", "stepan"};
        try {
            indexOf(names, "kiril");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}