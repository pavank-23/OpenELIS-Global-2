package org.openelisglobal.notification.service;

import java.util.List;
import java.util.Optional;

import org.openelisglobal.common.service.BaseObjectService;
import org.openelisglobal.notification.valueholder.TestNotificationConfig;

public interface TestNotificationConfigService extends BaseObjectService<TestNotificationConfig, Integer> {

    Optional<TestNotificationConfig> getTestNotificationConfigForTestId(String testId);

    void saveTestNotificationConfigActiveStatuses(TestNotificationConfig targetTestNotificationConfig,
            String sysUserId);

    void saveTestNotificationConfigsActiveStatuses(List<TestNotificationConfig> targetTestNotificationConfigs, String sysUserId);

    void removeEmptyPayloadTemplates(TestNotificationConfig testNotificationConfig, String sysUserId);

    void updatePayloadTemplatesMessageAndSubject(TestNotificationConfig testNotificationConfig, String sysUserId);

    List<TestNotificationConfig> getTestNotificationConfigForTestId(List<String> testIds);

    TestNotificationConfig getForConfigOption(Integer configOptionId);
}
