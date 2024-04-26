package designPatterns.solid.o;

import designPatterns.solid.s.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
        //save to DB
    }
}
