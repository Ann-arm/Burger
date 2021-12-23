public class MainBurger {

    public static void main(String[] args) {

        Burger burger = new Burger();
        burger.printInformationAboutBurgerPriceList();
        burger.printEnterIngredient();
        String ingredient = burger.getConsoleInput();
        String answerForOffer;
        burger.countTotalPriceWithAddedIngredient(ingredient);

        do {
            burger.printOfferToEnterOneMoreIngredient();
            answerForOffer = burger.getConsoleInput();
            if (answerForOffer.equalsIgnoreCase("Да")) {
                burger.printEnterIngredient();
                String anotherIngredient = burger.getConsoleInput();
                burger.countTotalPriceWithAddedIngredient(anotherIngredient);
            } else if (answerForOffer.equalsIgnoreCase("Нет")) {
                System.out.println("Сума к оплате: " + burger.getTotalBurgerPrice());
            } else {
                System.out.println("Вы ввели неправильный вариант ответа");
                answerForOffer = "Да";
            }
        } while (answerForOffer.equalsIgnoreCase("Да"));
    }
}
