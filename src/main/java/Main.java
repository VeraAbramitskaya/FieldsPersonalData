public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Андреевич";
        post.surname = "Крылов";
        post.passport = "1234 № 12345678";
        post.phone = "8 (695) 123-45-67";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = "13";
        post.birthday.month = "февраля";
        post.birthday.year = "1769";

    }
}