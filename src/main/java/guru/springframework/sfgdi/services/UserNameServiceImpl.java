package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class UserNameServiceImpl implements UserNameService {
    @Override
    public String getUser() {
        return "Tarun Deshmukh";
    }
}
