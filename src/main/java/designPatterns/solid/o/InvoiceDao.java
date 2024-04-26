package designPatterns.solid.o;

import designPatterns.solid.s.Invoice;

public interface InvoiceDao {
    public void save(Invoice invoice);
}
