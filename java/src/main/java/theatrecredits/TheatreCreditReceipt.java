package theatrecredits;

public class TheatreCreditReceipt {

    public String print(Invoice invoice) {
        var totalCredits = 0;
        var result = String.format("Statement for %s\n", invoice.customer);

        for (var performance : invoice.performances) {
            var credits = Math.max(performance.audience - 30, 0);
            // add extra credit for every ten attendees
            credits += Math.floor(performance.audience / (double) 5); // Bug! It should instead give extra credits for every ten attendees.  
            totalCredits += credits;
        }

        result += String.format("You earned %s credits\n", totalCredits);
        return result;
    }

}