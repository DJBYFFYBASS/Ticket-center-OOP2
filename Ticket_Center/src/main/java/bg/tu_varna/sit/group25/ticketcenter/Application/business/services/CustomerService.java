package bg.tu_varna.sit.group25.ticketcenter.Application.business.services;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.CustomerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.CustomerListViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    private final CustomerRepository repository=CustomerRepository.getInstance();

    public static CustomerService getInstance()
    {
        return CustomerServiceHolder.INSTANCE;
    }

    private static class CustomerServiceHolder {
        public static final CustomerService INSTANCE =new CustomerService();
    }

    public ObservableList<CustomerListViewModel>getAllCustomer()
    {
        List<Customer>customers=repository.getAll();

        return FXCollections.observableList(customers.stream().map(c->new CustomerListViewModel(
                c.getCustomer_ID(),c.getCustomer_Name(),c.getPhone_Number(),c.getTicket_Limit())).collect(Collectors.toList()));
    }
}
