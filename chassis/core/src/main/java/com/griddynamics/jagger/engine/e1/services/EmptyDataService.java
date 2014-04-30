package com.griddynamics.jagger.engine.e1.services;

import com.griddynamics.jagger.engine.e1.services.data.service.MetricEntity;
import com.griddynamics.jagger.engine.e1.services.data.service.MetricPlotPointEntity;
import com.griddynamics.jagger.engine.e1.services.data.service.SessionEntity;
import com.griddynamics.jagger.engine.e1.services.data.service.TestEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class EmptyDataService implements DataService {

    private static Logger log = LoggerFactory.getLogger(EmptyDataService.class);

    private JaggerPlace jaggerPlace;

    public EmptyDataService(JaggerPlace jaggerPlace) {
        this.jaggerPlace = jaggerPlace;
    }


    @Override
    public SessionEntity getSession(String sessionId) {
        log.warn("Can't get session entity for session id {}. DataService is not supported in {}", sessionId, jaggerPlace);
        return null;
    }

    @Override
    public Set<SessionEntity> getSessions(Set<String> sessionIds) {
        log.warn("Can't get session entities for session ids {}. DataService is not supported in {}", sessionIds, jaggerPlace);
        return null;
    }

    @Override
    public Set<TestEntity> getTests(SessionEntity session) {
        log.warn("Can't get test entities for session {}. DataService is not supported in {}", session, jaggerPlace);
        return null;
    }

    @Override
    public Set<TestEntity> getTests(String sessionId) {
        log.warn("Can't get test entities for session id {}. DataService is not supported in {}", sessionId, jaggerPlace);
        return null;
    }

    @Override
    public Map<String, Set<TestEntity>> getTests(Set<String> sessionIds) {
        log.warn("Can't get test entities for session ids {}. DataService is not supported in {}", sessionIds, jaggerPlace);
        return null;
    }

    @Override
    public TestEntity getTestByName(String sessionId, String testName) {
        log.warn("Can't get test entity {} for session id {}. DataService is not supported in {}", new Object[]{testName, sessionId, jaggerPlace});
        return null;
    }

    @Override
    public TestEntity getTestByName(SessionEntity session, String testName) {
        log.warn("Can't get test entity {} for session {}. DataService is not supported in {}", new Object[]{testName, session, jaggerPlace});
        return null;
    }

    @Override
    public Map<String, TestEntity> getTestsByName(Set<String> sessionIds, String testName) {
        log.warn("Can't get test entity {} for sessions {}. DataService is not supported in {}", new Object[]{testName, sessionIds, jaggerPlace});
        return null;
    }

    @Override
    public Set<MetricEntity> getMetrics(Long testId) {
        log.warn("Can't get metric entities for test id {}. DataService is not supported in {}", testId, jaggerPlace);
        return null;
    }

    @Override
    public Set<MetricEntity> getMetrics(TestEntity test) {
        log.warn("Can't get metric entities for test {}. DataService is not supported in {}", test, jaggerPlace);
        return null;
    }

    @Override
    public Map<TestEntity, Set<MetricEntity>> getMetricsByTests(Set<TestEntity> tests) {
        log.warn("Can't get metric entities for tests {}. DataService is not supported in {}", tests, jaggerPlace);
        return null;
    }

    @Override
    public Map<Long, Set<MetricEntity>> getMetricsByTestIds(Set<Long> testIds) {
        log.warn("Can't get metric entities for test ids {}. DataService is not supported in {}", testIds, jaggerPlace);
        return null;
    }

    @Override
    public Double getMetricSummary(MetricEntity metric) {
        log.warn("Can't get summary value for metric {}. DataService is not supported in {}", metric, jaggerPlace);
        return null;
    }

    @Override
    public Map<MetricEntity, Double> getMetricSummary(Set<MetricEntity> metrics) {
        log.warn("Can't get summary values for metrics {}. DataService is not supported in {}", metrics, jaggerPlace);
        return null;
    }

    @Override
    public List<MetricPlotPointEntity> getMetricPlotData(MetricEntity metric) {
        log.warn("Can't get plot data values for metric {}. DataService is not supported in {}", metric, jaggerPlace);
        return null;
    }

    @Override
    public Map<MetricEntity, List<MetricPlotPointEntity>> getMetricPlotData(Set<MetricEntity> metrics) {
        log.warn("Can't get plot data values for metrics {}. DataService is not supported in {}", metrics, jaggerPlace);
        return null;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}