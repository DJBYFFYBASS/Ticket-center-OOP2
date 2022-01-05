package bg.tu_varna.sit.group25.ticketcenter.Application.business.services;


import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.DistributorRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.DistributorListViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.stream.Collectors;

public class DistributorService {
    private final DistributorRepository repository = DistributorRepository.getInstance();

    public static DistributorService getInstance() {
        return DistributorServiceHolder.INSTANCE;
    }

    private static class DistributorServiceHolder {
        public static final DistributorService INSTANCE = new DistributorService();
    }

    public ObservableList<DistributorListViewModel>getPass()
    {
        List<Distributor>distributors=repository.getAll();

        return FXCollections.observableList(distributors.stream().map(d -> new DistributorListViewModel(
                d.getPassword_D()
        )).collect(Collectors.toList()));
    }

    public ObservableList<DistributorListViewModel>getName()
    {
        List<Distributor>distributors=repository.getAll();

        return FXCollections.observableList(distributors.stream().map(d -> new DistributorListViewModel(
                d.getUserName_D()
        )).collect(Collectors.toList()));
    }

    public ObservableList<DistributorListViewModel> getAllDistributor() {
        List<Distributor> distributors = repository.getAll();

        return FXCollections.observableList(distributors.stream().map(d -> new DistributorListViewModel(d.getDistributor_ID(),
                d.getName_D(),
                d.getPhone_Number_D(),
                d.getFee_D(),
                d.getRating(),
                (int) d.getRating_Count(),
                d.getUserName_D(),
                d.getPassword_D())).collect(Collectors.toList()));


    }
}
