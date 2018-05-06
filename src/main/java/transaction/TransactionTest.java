package transaction;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionTest {
	
	private static List<Transaction> transactions;
	
	@BeforeClass
	public static void init() {
		transactions = new ArrayList<Transaction>();
		Transaction transaction1 = new Transaction();
		transaction1.setPrice(1000);
		Currency c1 = Currency.getInstance("INR");
		transaction1.setCurrency(c1);
		transactions.add(transaction1);
		Transaction transaction2 = new Transaction();
		transaction2.setPrice(1200);
		Currency c2 = Currency.getInstance("INR");
		transaction2.setCurrency(c2);
		transactions.add(transaction2);
	}
	
	@Test
	public void testTransactions() {
		//filtering expensive transactions > 1000 and grouping them by currency
		Map<Currency, List<Transaction>> transactionsGroupedByCurrency = transactions.stream().filter((Transaction t) -> t.getPrice() > 1000).collect(Collectors.groupingBy(Transaction::getCurrency));
		for(List<Transaction> t : transactionsGroupedByCurrency.values()) {
			System.out.println(t.get(0).getPrice()+ " " +t.get(0).getCurrency().getCurrencyCode());
		}
	}

}
