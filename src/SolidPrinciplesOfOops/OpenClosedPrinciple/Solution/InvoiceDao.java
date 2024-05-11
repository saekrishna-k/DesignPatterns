package SolidPrinciplesOfOops.OpenClosedPrinciple.Solution;

import SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution.Invoice;

public interface InvoiceDao {
    void save(Invoice invoice);
}