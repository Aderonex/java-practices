package practice06;


public interface StringProcessor {

    // a) количество символов в строке
    int countChars(String s);

    // б) символы на нечётных позициях (1, 3, 5, ...)
    String oddPositionChars(String s);

    // в) инвертирование строки
    String reverse(String s);
}
