package bg.tu_varna.sit.group25.ticketcenter.Application.business.services;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.OrganizerRepository;

import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.OrganizerListViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.stream.Collectors;

public class OrganizerService
{
    private final OrganizerRepository repository = OrganizerRepository.getInstance();

    public static OrganizerService getInstance() {
        return OrganizerService.OrganizerServiceHolder.INSTANCE;
    }

    private static class OrganizerServiceHolder {
        public static final OrganizerService INSTANCE = new OrganizerService();
    }


    public ObservableList<OrganizerListViewModel> getAllOrganizers() {
        List<Organizer>organizers = repository.getAll();

        return FXCollections.observableList(organizers.stream().map(o-> new OrganizerListViewModel(
                o.getOrganizer_ID(),
                o.getName_O(),
                o.getPhone_Number_O,
                o.getFee_O(),
                o.getFee_O(),
                o.getUserName_O,
                o.getPassword_O())).collect(Collectors.toList()));
    }
}
