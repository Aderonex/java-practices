package practice02;

public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author(
                "Рязанов Андрей Александрович",
                "o31707513@gmail.com",
                'm'
        );

        System.out.println(a1); // вызов toString()

        a1.setEmail("andrey.ryazanov@example.com");

        System.out.println("Имя: " + a1.getName());
        System.out.println("Пол: " + a1.getGender());
        System.out.println("Новый email: " + a1.getEmail());
        System.out.println(a1);
    }
}
