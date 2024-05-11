package SolidPrinciplesOfOops.OpenClosedPrinciple.Solution;


import SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution.Invoice;

public class FileInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}
