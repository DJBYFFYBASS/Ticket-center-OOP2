package bg.tu_varna.sit.group25.ticketcenter.Application.business.services;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.ShowRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.ShowListViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.stream.Collectors;

public class ShowService {
    private static ShowRepository repository=ShowRepository.getInstance();
    //private final ShowRepository repository= ShowRepository.getInstance();

    public static ShowService getInstance()
    {
        return ShowService. ShowServiceHolder.INSTANCE;
    }

    private static class  ShowServiceHolder {
        public static final ShowService INSTANCE =new ShowService();
    }

    public ObservableList<ShowListViewModel>getAllShows()
    {
        List<Show> shows=repository.getAll();

        return FXCollections.observableList(shows.stream().map(s -> new ShowListViewModel(
                s.getShow_ID(),
                s.getShow_Title(),
                s.getShow_Date(),
                s.getLocation(),
                s.getMaxPlaces(),
                s.getTickets(),
                s.getShow_status(),
                s.getShow_type(),
                s.getOrganizer(),
                s.getDistributor()
        )).collect(Collectors.toList()));
    }
}
