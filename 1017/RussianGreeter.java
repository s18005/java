public class RussianGreeter implements Greeter {
    @Override
    public void login(Account guest) {
        System.out.println(String.format("Здравствуйте, %s.", guest.getName()));
    }

    @Override
    public void logout(Account guest) {
        System.out.println("До свидания.");
    }

    @Override
    public void like(Account guest) {
        System.out.println("Спасибо.");
    }
}
