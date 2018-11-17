package pl.finsys.boothelloworld;

import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {

    @Override
    public String sayHello() {
        return "hello, world!";
    }
}