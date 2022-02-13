package uz.bakhromjon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.bakhromjon.repository.UserRepository;

@Component
public class UserService extends AbstractService<UserRepository>{
    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
    }

    // TODO: 2/13/2022 Some function
}
