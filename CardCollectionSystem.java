class CardCollection {
    private ArrayList<String> cards = new ArrayList<>();

    void addCard(String card) {
        cards.add(card);
    }

    List<String> findCardsBySymbol(String symbol) {
        List<String> result = new ArrayList<>();
        for (String card : cards) {
            if (card.contains(symbol)) {
                result.add(card);
            }
        }
        return result;
    }
}

// Main Execution
public class Main {
    public static void main(String[] args) {
        CardCollection collection = new CardCollection();
        collection.addCard("Heart-5");
        collection.addCard("Diamond-K");
        System.out.println("Cards found: " + collection.findCardsBySymbol("Heart"));
    }
}
