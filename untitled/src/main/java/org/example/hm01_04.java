package untitled.src.main.java.org.example;

public class hm01_04 {
//    1 Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//
//            Пример. (n = 6, c1='a', c2='b') -> "ababab"
//            (n = 8, c1='x', c2='y') -> "xyxyxyxy"
    public static void main (String[] args){
        System.out.println(buildString(8, 'x',  'y'));
    }

    static StringBuilder buildString(int n, char c1, char c2) {
        StringBuilder str = new StringBuilder("");
        Character tem = Character.valueOf(c1);
        for (int i = 0; i < n; i++) {
            str.append(tem);
            if (tem == c1){
                tem = Character.valueOf(c2);
            } else {
                tem = Character.valueOf(c1);
            }
        }
        return str;
    }
}
