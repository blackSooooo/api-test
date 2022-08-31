package test.apiserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.apiserver.domain.Routing;
import test.apiserver.repository.TestRepository;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    private final TestRepository testRepository;
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/test")
    public List<String> test() {
        logger.info("traffic test");
        return Arrays.asList("ZZ");
//        return testRepository.findAll();
    }

}

