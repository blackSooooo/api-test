package test.apiserver.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
@Document(value="routings")
public class Routing {
    @Id
    private String id;
    private String path;
    private String method;
    private String domain;
    private int rateLimit;
    private String baseUrl;
    private Map<String, List<Map<String, Object>>> query;
    private Map<String, List<Map<String, Object>>> body;
    private List<Map<String, Object>> pathVariable;
}
