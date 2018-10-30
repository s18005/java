public class RussianGreeter implements Greeter {
    @Override
    public String login(Account guest) {
        return String.format("Здравствуйте, %s.", guest.getName());
    }

    @Override
    public String logout(Account guest) {
        return "До свидания.";
    }

    @Override
    public String like(Account guest) {
        return "Спасибо.";
    }
}
