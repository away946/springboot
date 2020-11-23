package cn.sinven.springbootelasticsearch;

import cn.sinven.springbootelasticsearch.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;

;

@SpringBootTest

class SpringbootElasticsearchApplicationTests {
    @Autowired
    ElasticsearchOperations elasticsearchOperations;
    @Test
    void ElasticsearcTest() {
        Employee employee=new Employee();
        employee.setLastName("版本");
        employee.setEmail("123456@qq.com");
        employee.setGender(1);
        employee.setDId(1);
        employee.setId(1);
        IndexQuery indexQuery=new IndexQueryBuilder()
                .withId(employee.getId().toString())
                .withObject(employee).build();
        String index=elasticsearchOperations.index(indexQuery,null);
    }

}
