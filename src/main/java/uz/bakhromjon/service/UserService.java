package uz.bakhromjon.service;


import org.springframework.beans.factory.annotation.Autowired;
import uz.bakhromjon.repository.UserRepository;

public class UserService extends AbstractService<UserRepository>{
    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
    }

    // TODO: 2/13/2022 Some function
}
