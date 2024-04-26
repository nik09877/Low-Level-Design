package designPatterns.solid.o;

import designPatterns.solid.s.Invoice;

public class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        //save to file
    }
}
