package kimdonghyeon.report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 1; i <= CARD_NUM; i++)
            if (i == 1 || i == 3 || i == 8) {
                if(i>10)
                    this.cards[i - 1] = new SutdaCard(i-10, true);
                else
                    this.cards[i - 1] = new SutdaCard(i, true);
            }
            else {
                if(i>10)
                    this.cards[i - 1] = new SutdaCard(i-10, false);
                else
                    this.cards[i - 1] = new SutdaCard(i, false);
            }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Report8_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,