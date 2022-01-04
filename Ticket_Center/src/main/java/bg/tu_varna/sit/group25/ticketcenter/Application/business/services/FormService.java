package bg.tu_varna.sit.group25.ticketcenter.Application.business.services;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Form;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.CustomerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.CustomerListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormListViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.stream.Collectors;

public class FormService
{
    private final FormRepository repository= FormRepository.getInstance();

    public static  FormService getInstance()
    {
        return FormService. FormServiceHolder.INSTANCE;
    }

    private static class  FormServiceHolder {
        public static final FormService INSTANCE =new FormService();
    }

    public ObservableList<FormListViewModel> getAllForms()
    {
        List<Form> forms=repository.getAll();

        return FXCollections.observableList(forms.stream().map(f->new FormListViewModel(
                f.getSold_Tickets(),
                f.getPrice_Ticket(),
                f.getDistributor().getDistributor_ID(),
                f.getCustomer().getCustomer_ID(),
                f.getShow().getShow_ID()
        )).collect(Collectors.toList()));
    }
}
