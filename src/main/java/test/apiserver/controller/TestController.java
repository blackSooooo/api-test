package test.apiserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.apiserver.domain.Routing;
import test.apiserver.repository.TestRepository;

import java.util.List;

@RestController
public class TestController {

    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/test")
    public List<Routing> test() {
        return testRepository.findAll();
    }

}

