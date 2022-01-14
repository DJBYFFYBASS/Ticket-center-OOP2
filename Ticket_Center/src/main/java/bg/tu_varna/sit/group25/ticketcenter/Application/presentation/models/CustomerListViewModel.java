package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

public class CustomerListViewModel {
    private long id;
    private String ime;
    private String nomer;
    private int limit;

    public CustomerListViewModel(long id, String ime, String nomer, int limit) {
        this.id = id;
        this.ime = ime;
        this.nomer = nomer;
        this.limit = limit;
    }


    @Override
    public String toString() {
        return String.format( "%d | %s | %s | %d",id, ime, nomer,limit);
    }
}
