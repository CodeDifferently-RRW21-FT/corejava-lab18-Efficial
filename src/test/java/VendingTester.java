
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vending.machine.Card;

public class VendingTester {


        @Test
        public void constructorBalanceTest(){
            Card card = new Card(25);

            Integer expected = 25;
            Integer actual = card.getBalance();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void getBalanceTest(){
            Card card = new Card (25);

            Integer expected = 25;
            Integer actual = card.getBalance();

            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void setBalanceTest(){
            Card card = new Card (25);

            Integer expected = 50;
            card.setBalance(50);
            Integer actual = card.getBalance();

            Assertions.assertEquals(expected, actual);
        }
    }

