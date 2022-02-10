package bg.tu_varna.sit.group25.ticketcenter.Application.business.services;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Form;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
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
                (int) f.getSold_Tickets(),
                f.getPrice_Ticket(),
                f.getDistributor().getName_D(),
                f.getCustomer().getCustomer_Name(),
                f.getShow().getShow_Title()
        )).collect(Collectors.toList()));
    }
}
