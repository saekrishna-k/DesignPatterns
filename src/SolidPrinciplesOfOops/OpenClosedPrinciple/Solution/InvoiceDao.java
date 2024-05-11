package SolidPrinciplesOfOops.OpenClosedPrinciple.Solution;

import CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution.Invoice;

public interface InvoiceDao {
    void save(Invoice invoice);
}