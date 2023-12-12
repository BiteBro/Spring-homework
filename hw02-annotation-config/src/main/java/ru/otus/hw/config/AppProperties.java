package ru.otus.hw.config;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@PropertySource("application.properties")
@Configuration
@Setter
public class AppProperties implements TestConfig, TestFileNameProvider {

    // внедрить свойство из application.properties

    @Value("${test.rightAnswersCountToPass}")
    private int rightAnswersCountToPass;

    // внедрить свойство из application.properties
    @Value("${test.fileName}")
    private String testFileName;

    @Override
    public int getRightAnswersCountToPass() {
        return rightAnswersCountToPass;
    }

    @Override
    public String getTestFileName() {
        return testFileName;
    }
}
