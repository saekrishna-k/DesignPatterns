package SolidPrinciplesOfOops.OpenClosedPrinciple.Solution;

import SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}
