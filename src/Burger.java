import java.util.Scanner;

public class Burger {

    static int burgerPrice = 50;
    static int sousePrice = 10;
    static int cheesePrice = 20;
    static int cutletPrice = 30;

    static void printInformationAboutBurgerPriceList() {
        System.out.println("Привет! Стоимость бургера 50 грн." + "\n" +
                "Выберите дополнительный ингредиент:" + "\n" + "1. соус: 10 грн;" + "\n" + "2. сыр: 20 грн;" +
                "\n" + "3. котлета: 30 грн");
    }

    static String getConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void printOfferToEnterOneMoreIngredient() {
        System.out.println("Хотите добавить еще ингредиент? (Да / Нет)");
    }

    static void printEnterIngredient() {
        System.out.print("Введите желаемый ингредиент: ");
    }

    static int getTotalBurgerPrice() {
        return burgerPrice;
    }

    static void countTotalPriceWithAddedIngredient(String ingredient) {
        String lowerCaseIngredient = ingredient.toLowerCase();

        switch (lowerCaseIngredient) {
            case "соус":
            case "1":
                burgerPrice += sousePrice;
                break;
            case "сыр":
            case "2":
                burgerPrice += cheesePrice;
                break;
            case "котлета":
            case "3":
                burgerPrice += cutletPrice;
                break;
            default:
                System.out.println("Такого ингредиента нету");
                burgerPrice += 0;
                break;
        }
    }
}

