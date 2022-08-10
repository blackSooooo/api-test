package test.apiserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BlockController {

    @GetMapping("/block")
    public ResponseEntity<String> block() throws InterruptedException {
        Thread.sleep(1500);
        return ResponseEntity.ok().body("Hello World!");
    }

//    @GetMapping("/test")
//    public ResponseEntity<Object> test () throws InterruptedException {
//
//        Map<String, Object> res = new HashMap<>();
//        res.put("method", "GET");
//        res.put("service", "Naver");
//        res.put("baseUrl", "http://localhost:7777");
//        res.put("path", "/v1/search/blog.json");
//
//        Map<String, Object> parameters = new HashMap<>();
//
//        List<Map<String, Object>> required = new ArrayList<>();
//        Map<String, Object> required_1 = new HashMap<>();
//        required_1.put("type", "string");
//        required_1.put("name", "query");
//
//        List<Map<String, Object>> optional = new ArrayList<>();
//        Map<String, Object> optional_1 = new HashMap<>();
//        optional_1.put("type", "integer");
//        optional_1.put("name", "display");
//        optional_1.put("minVal", 10);
//        optional_1.put("maxVal", 100);
//
//        required.add(required_1);
//        optional.add(optional_1);
//        parameters.put("required", required);
//        parameters.put("optional", optional);
//
//        res.put("parameters", parameters);
//
//        System.out.println("res = " + res);
//
//        return ResponseEntity.ok().body(res);
//    }

    @GetMapping("/v1/search/blog.json")
    public ResponseEntity<Object> backend() {
        Map<String, Object> res = new HashMap<>();
        res.put("method", "GET");
        res.put("service", "Naver");
        res.put("baseUrl", "http://localhost:7777");
        res.put("path", "/v1/search/blog.json");
        return ResponseEntity.ok().body(res);
    }
}
